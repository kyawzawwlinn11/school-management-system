package com.springbootpractice.schoolmanagementsystem.constants;

public class StudentRequestModel {
    private int id;
    private String name;
    private int age;
    private String studentId;
    private String address;
    private String email;
    private String nrc;
    private String passportNo;

    public StudentRequestModel(int age, int id, String name, String studentId, String address, String email, String nrc, String passportNo) {
        this.age = age;
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.address = address;
        this.email = email;
        this.nrc = nrc;
        this.passportNo = passportNo;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }
}
