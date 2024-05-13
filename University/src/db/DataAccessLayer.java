/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import dto.Course;
import dto.Department;
import dto.Student;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import oracle.jdbc.OracleDriver;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author DELL
 */
public class DataAccessLayer {
    public static void connect() throws SQLException {
        DriverManager.registerDriver(new OracleDriver());
    //connection
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","UNIVERSITY","123");
    }
    
    
    public static int addStudent(Student student) throws SQLException{
     try{   
        int result = -1;
    DriverManager.registerDriver(new OracleDriver());
    //connection
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","UNIVERSITY","123");
    PreparedStatement pst= con.prepareStatement("insert into Students values(?,?,?,?,?,?)");
   
    pst.setInt(1,student.getStudentId());
    pst.setString(2,student.getFirstName());
    pst.setString(3,student.getLastName());
    pst.setInt(4,student.getDepartmentId());
    pst.setString(5,student.getEmail());
    pst.setString(6,student.getPhone());
    
    
    result= pst.executeUpdate();
    return result;
     }catch (SQLIntegrityConstraintViolationException e) {
            // Handle the exception for duplicate primary key (ID)
            

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Duplicate Student ID");
            alert.setContentText("Error: The student with ID " + student.getStudentId() + " already exists.");
            alert.showAndWait();

            // You might want to throw a custom exception or return a specific value indicating the issue
        }
        return 0;
    }
    
    
    public static int updateStudent(Student student) throws SQLException{
        int result = -1;
    DriverManager.registerDriver(new OracleDriver());
    //connection
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","UNIVERSITY","123");
    PreparedStatement pst= con.prepareStatement("update Students set FNAME = ?, LName = ?, DEPARTMENT_ID = ?, EMAIL = ?, PHONE = ? where STUDENT_ID = ?");
   
    
    
    pst.setString(1,student.getFirstName());
    pst.setString(2,student.getLastName());
    pst.setInt(3,student.getDepartmentId());
    pst.setString(4,student.getEmail());
    pst.setString(5,student.getPhone());
    pst.setInt(6,student.getStudentId());
    
    
    result= pst.executeUpdate();
    return result;
    
    }
    
    
   public static int deleteStudent(int studentId) throws SQLException {
    int result = -1;

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        StringBuilder queryBuilder = new StringBuilder("delete from Students where STUDENT_ID = ?");
        try (PreparedStatement pst = con.prepareStatement(queryBuilder.toString())) {
            pst.setInt(1, studentId);
            result = pst.executeUpdate();
        }
    }

    return result;
}

   
  public static ResultSet selectStudent(int studentId) throws SQLException {
    ResultSet resultSet = null;

  try {
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123");
        String query = "SELECT * FROM Students WHERE STUDENT_ID = ?";
        PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, studentId);
            
            resultSet = pst.executeQuery();
            
        } catch (SQLException ex) {
        System.err.println("Error during selectStudent: " + ex.getMessage());
        ex.printStackTrace();
    }

    return resultSet;
}

 public static int addDepartment(Department department) throws SQLException{
     try{   
        int result = -1;
    DriverManager.registerDriver(new OracleDriver());
    //connection
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","UNIVERSITY","123");
    PreparedStatement pst= con.prepareStatement("insert into Departments (DEPARTMENT_ID,DEPARTMENT_NAME) values(?,?)");
   
    pst.setInt(1,department.getDepartmentId());
    pst.setString(2,department.getDepartmentName());
    
    
    
    result= pst.executeUpdate();
    return result;
     }catch (SQLIntegrityConstraintViolationException e) {
            // Handle the exception for duplicate primary key (ID)
            

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Duplicate Department ID");
            alert.setContentText("Error: The department with ID " + department.getDepartmentId() + " already exists.");
            alert.showAndWait();

            // You might want to throw a custom exception or return a specific value indicating the issue
        }
        return 0;
    }
 
 
  public static int deleteDepartment(int departmentId) throws SQLException {
    int result = -1;

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        StringBuilder queryBuilder = new StringBuilder("delete from Departments where DEPARTMENT_ID = ?");
        try (PreparedStatement pst = con.prepareStatement(queryBuilder.toString())) {
            pst.setInt(1, departmentId);
            result = pst.executeUpdate();
        }
    }

    return result;
}
  
  
 public static List<Department> getAllDepartments() throws SQLException {
    List<Department> departments = new ArrayList<>();

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        String query = "SELECT DEPARTMENT_ID, DEPARTMENT_NAME FROM Departments";
        try (PreparedStatement pst = con.prepareStatement(query); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                int departmentId = rs.getInt("DEPARTMENT_ID");
                String departmentName = rs.getString("DEPARTMENT_NAME");
                Department department = new Department(String.valueOf(departmentId), departmentName);
                departments.add(department);
            }
        }
    }

    return departments;
}

 public static List<Course> getAllCourses() throws SQLException {
        List<Course> courses = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
            String query = "SELECT * FROM Courses";
            try (PreparedStatement pst = con.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String courseId = rs.getString("COURSE_ID");
                    String courseName = rs.getString("COURSE_NAME");
                    String departmentId = rs.getString("DEPARTMENT_ID");
                    String courseDegree = rs.getString("COURSE_DEGREE");
                    String semesters = rs.getString("SEMESTERS");

                    Course course = new Course(courseId, courseName, departmentId, courseDegree, semesters);
                    courses.add(course);
                }
            }
        }

        return courses;
    }
 
 public static List<Student> getAllStudents() throws SQLException {
        List<Student> students = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
            String query = "SELECT * FROM Students";
            try (PreparedStatement pst = con.prepareStatement(query);
                 ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String studentid = rs.getString("STUDENT_ID");
                    String firstName = rs.getString("FNAME");
                    String lastName = rs.getString("LNAME");
                    String departmentId = rs.getString("DEPARTMENT_ID");
                    String email = rs.getString("EMAIL");
                    String phone = rs.getString("PHONE");

                    Student student = new Student(studentid, firstName, lastName, departmentId, email, phone);
                    students.add(student);
                }
            }
        }

        return students;
    }
  
 
 public static int addCourse(Course course) throws SQLException{
     try{   
        int result = -1;
    DriverManager.registerDriver(new OracleDriver());
    //connection
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","UNIVERSITY","123");
    PreparedStatement pst= con.prepareStatement("insert into Courses (COURSE_ID, COURSE_NAME, DEPARTMENT_ID, COURSE_DEGREE, SEMESTERS) values(?,?,?,?,?)");
   
    pst.setInt(1,course.getCourseId());
    pst.setString(2,course.getCourseName());
    pst.setInt(3,course.getDepartmentId());
    pst.setString(4,course.getCourseDegree());
    pst.setString(5,course.getSemesters());


    
    
    
    result= pst.executeUpdate();
    return result;
     }catch (SQLIntegrityConstraintViolationException e) {
            // Handle the exception for duplicate primary key (ID)
            

            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Duplicate course ID");
            alert.setContentText("Error: The course with ID " + course.getCourseId() + " already exists.");
            alert.showAndWait();

            // You might want to throw a custom exception or return a specific value indicating the issue
        }
        return 0;
    }
 
 public static int updateCourse(Course course) throws SQLException{
        int result = -1;
    DriverManager.registerDriver(new OracleDriver());
    //connection
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE","UNIVERSITY","123");
    PreparedStatement pst= con.prepareStatement("update Courses set COURSE_NAME = ?, DEPARTMENT_ID = ?, COURSE_DEGREE = ?, SEMESTERS = ? where COURSE_ID = ?");
   
    
    
    pst.setInt(5,course.getCourseId());
    pst.setString(1,course.getCourseName());
    pst.setInt(2,course.getDepartmentId());
    pst.setString(3,course.getCourseDegree());
    pst.setString(4,course.getSemesters());

    
    result= pst.executeUpdate();
    return result;
    
    }
 
  public static int deleteCourse(int courseId) throws SQLException {
    int result = -1;

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        StringBuilder queryBuilder = new StringBuilder("delete from Courses where COURSE_ID = ?");
        try (PreparedStatement pst = con.prepareStatement(queryBuilder.toString())) {
            pst.setInt(1, courseId);
            result = pst.executeUpdate();
        }
    }

    return result;
}
  
  public static double calculateGPA(int studentId) throws SQLException {
        double gpa = -1.0; // Default value indicating failure

        try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
            String query = "{? = call CalculateGPA(?)}"; // Replace CALCULATE_GPA with your actual stored function
            try (CallableStatement cst = con.prepareCall(query)) {
                cst.registerOutParameter(1, Types.DOUBLE);
                cst.setInt(2, studentId);
                cst.execute();
                gpa = cst.getDouble(1);
            }
        }

        return gpa;
    }
  
  public static boolean isStudentExists(int studentId) throws SQLException {
    boolean exists = false;

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        String query = "SELECT COUNT(*) FROM STUDENTS WHERE STUDENT_ID = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, studentId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    exists = (count > 0);
                }
            }
        }
    }

    return exists;
}

  
  
  public static double calculateCourseGPA(int courseId) throws SQLException {
    double courseGPA = -1.0; // Default value indicating failure

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        String query = "{? = call CalculateCourseGPA(?)}"; 
        try (CallableStatement cst = con.prepareCall(query)) {
            cst.registerOutParameter(1, Types.DOUBLE);
            cst.setInt(2, courseId);
            cst.execute();
            courseGPA = cst.getDouble(1);
        }
    }

    return courseGPA;
}

  public static boolean isCourseExists(int courseId) throws SQLException {
    boolean exists = false;

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        String query = "SELECT COUNT(*) FROM COURSES WHERE COURSE_ID = ?";
        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, courseId);
            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    exists = (count > 0);
                }
            }
        }
    }

    return exists;
}

  
  public static int addScore(int studentId, int courseId, double score) throws SQLException {
    int result = -1;

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        String query = "INSERT INTO grades (student_id, course_id, scores) VALUES (?, ?, ?)";

        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setInt(1, studentId);
            pst.setInt(2, courseId);
            pst.setDouble(3, score);

            result = pst.executeUpdate();
        }
    }

    return result;
}

  
  public static int updateScore(int studentId, int courseId, double newScore) throws SQLException {
    int result = -1;

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        String query = "UPDATE grades SET scores = ? WHERE student_id = ? AND course_id = ?";

        try (PreparedStatement pst = con.prepareStatement(query)) {
            pst.setDouble(1, newScore);
            pst.setInt(2, studentId);
            pst.setInt(3, courseId);

            result = pst.executeUpdate();
        }
    }

    return result;
}

public static List<Map<String, Object>> getCourseReport() throws SQLException {
    List<Map<String, Object>> courseReports = new ArrayList<>();

    try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:XE", "UNIVERSITY", "123")) {
        String query = "SELECT C.Course_ID, C.Course_Name, CalculateCourseGPA(C.Course_ID) AS Course_GPA, " +
                       "LISTAGG(S.Student_ID, ', ') WITHIN GROUP (ORDER BY S.Student_ID) AS Students_ID " +
                       "FROM Courses C " +
                       "JOIN Grades G ON C.Course_ID = G.Course_ID " +
                       "JOIN Students S ON G.Student_ID = S.Student_ID " +
                       "GROUP BY C.Course_ID, C.Course_Name";

        try (PreparedStatement pstmt = con.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int courseId = rs.getInt("Course_ID");
                String courseName = rs.getString("Course_Name");
                double courseGPA = rs.getDouble("Course_GPA");
                String studentsId = rs.getString("Students_ID");

                Map<String, Object> courseReport = new HashMap<>();
                courseReport.put("Course_ID", courseId);
                courseReport.put("Course_Name", courseName);
                courseReport.put("Course_GPA", courseGPA);
                courseReport.put("Students_ID", studentsId);

                courseReports.add(courseReport);
            }
        }
    }

    return courseReports;
}


  
 
}
