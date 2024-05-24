/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author FPTSHOP
 */
public class Student {
    private int id;
    private String name;
    private Boolean Gender;
    private Date Dob;

    public Student() {
    }

    public Student(int id, String name, Boolean Gender, Date Dob) {
        this.id = id;
        this.name = name;
        this.Gender = Gender;
        this.Dob = Dob;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return Gender;
    }

    public void setGender(Boolean Gender) {
        this.Gender = Gender;
    }

    public Date getDob() {
        return Dob;
    }

    public void setDob(Date Dob) {
        this.Dob = Dob;
    }
    
    
}
