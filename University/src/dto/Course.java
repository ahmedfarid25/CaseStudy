package dto;

public class Course {
    private int courseId;
    private String courseName;
    private int departmentId;
    private String courseDegree;
    private String semesters;

    public Course(String courseId, String courseName, String departmentId, String courseDegree, String semesters)
            throws NumberFormatException {
         if (courseId == null || courseId.trim().isEmpty()) {
        throw new NumberFormatException("Course ID cannot be empty");
    }
        this.courseId = Integer.parseInt(courseId);
        this.courseName = courseName;
        this.departmentId = Integer.parseInt(departmentId);
        this.courseDegree = courseDegree;
        this.semesters = semesters;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getCourseDegree() {
        return courseDegree;
    }

    public String getSemesters() {
        return semesters;
    }
}
