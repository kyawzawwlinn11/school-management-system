package com.springbootpractice.schoolmanagementsystem.Student;

import jakarta.persistence.*;

@Entity
@Table(name = "student_details")
public class StudentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String address;
    private String name;
    private int age;
    private String email;
    private String nrc;
    private String passportNo;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Student student;

    public StudentDetails() {}

    public StudentDetails(int studentId, String address, String name, String email, String nrc, String passportNo) {
        this.id = studentId;
        this.address = address;
        this.name = name;
        this.email = email;
        this.nrc = nrc;
        this.passportNo = passportNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int studentId) {
        this.id = studentId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
