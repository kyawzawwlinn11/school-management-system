package com.springbootpractice.schoolmanagementsystem.Course;

import jakarta.persistence.*;

@Entity
@Table
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String courseName;
    private String courseCode;
    private String courseDescription;

    //Empty Constructor for JPA
    public Course() {}
    public Course(int id, String courseName, String courseCode, String courseDescription) {
        this.id = id;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseDescription(){
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription){
        this.courseDescription = courseDescription;
    }
}
