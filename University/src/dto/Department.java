/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

public class Department {
    private int departmentId;
    private String departmentName;

    // Constructors
    public Department(String departmentId, String departmentName)throws NumberFormatException {
        this.departmentId = Integer.parseInt(departmentId);
        this.departmentName = departmentName;
    }

    // Getter methods
    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    // Other methods can be added based on your requirements
}