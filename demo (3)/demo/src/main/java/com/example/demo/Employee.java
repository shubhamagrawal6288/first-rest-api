package com.example.demo;

public class Employee {
    private Integer id;
    private String firstName;

    public Employee(Integer id, String firstName){
        this.id = id;
        this.firstName = firstName;
    }

    //getter and setter


    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Employee [id =" + id + ",First name =" + firstName + "]";
    }
}
