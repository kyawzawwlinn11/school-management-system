package com.springbootpractice.schoolmanagementsystem.Attendance;

import java.util.Date;

import com.springbootpractice.schoolmanagementsystem.Course.Course;
import com.springbootpractice.schoolmanagementsystem.Student.Student;

import jakarta.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attendance_id", length = 12)
	private int id;
	
	@Column(name = "date", length = 12)
	private Date date;

	private boolean presence;
	
	@ManyToOne
	@JoinColumn(name = "student_id", nullable = false)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private Course course;
	
	public Attendance() {}

	public Attendance(int id, Date date, boolean presence, Student student, Course course) {
		this.id = id;
		this.date = date;
		this.presence = presence;
		this.student = student;
		this.course = course;
	}

	public Attendance(Date date, boolean presence, Student student, Course course) {
		this.date = date;
		this.presence = presence;
		this.student = student;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isPresence() {
		return presence;
	}

	public void setPresence(boolean presence) {
		this.presence = presence;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
}
