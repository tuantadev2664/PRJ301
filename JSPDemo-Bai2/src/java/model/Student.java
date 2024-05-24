package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FPTSHOP
 */
public class Student {
    private int id;
    private String name;
    private String dbo;
    private boolean gender;

    public Student() {
    }

    public Student(int id, String name, String dbo, boolean gender) {
        this.id = id;
        this.name = name;
        this.dbo = dbo;
        this.gender = gender;
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

    public String getDbo() {
        return dbo;
    }

    public void setDbo(String dbo) {
        this.dbo = dbo;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    
}
