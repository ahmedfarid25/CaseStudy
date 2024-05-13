/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

// Student.java
public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int departmentId;
    private String email;
    private String phone;

    // Constructors
  public Student(String studentId, String firstName, String lastName, String departmentId, String email, String phone) throws NumberFormatException {
    if (studentId == null || studentId.trim().isEmpty()) {
        throw new NumberFormatException("Student ID cannot be empty");
    }

    this.studentId = Integer.parseInt(studentId);
    this.firstName = firstName;
    this.lastName = lastName;

    if (departmentId == null || departmentId.trim().isEmpty()) {
        throw new NumberFormatException("Department ID cannot be empty");
    }

    this.departmentId = Integer.parseInt(departmentId);
    this.email = email;
    this.phone = phone;
}


    
    
    
    
    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartmentId() {
        return departmentId;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhone() {
        return phone;
    }

    // Other methods can be added based on your requirements
}



