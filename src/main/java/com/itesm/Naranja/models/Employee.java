package com.itesm.Naranja.models;

public class Employee {
    private String id;
    private String role;
    private String name;
    private String email;
    private String password;
    private int employee_num;

    public Employee(String id, String role, String name, String email, String password, int employee_num) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.email = email;
        this.password = password;
        this.employee_num = employee_num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmployee_num() {
        return employee_num;
    }

    public void setEmployee_num(int employee_num) {
        this.employee_num = employee_num;
    }
}
