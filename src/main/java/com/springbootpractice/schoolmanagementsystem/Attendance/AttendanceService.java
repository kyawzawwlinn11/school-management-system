package com.springbootpractice.schoolmanagementsystem.Attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttendanceService {
	
	@Autowired
	private final AttendanceRepository attendanceRepository;

	public AttendanceService(AttendanceRepository attendanceRepository) {
		super();
		this.attendanceRepository = attendanceRepository;
	}

	public Attendance addAttendance(Attendance attendance) {
		return this.attendanceRepository.save(attendance);
	}

	public List<Attendance> getAllAttendances() {
		return this.attendanceRepository.findAll();
	}

	public void deleteAttendance(int id) {
		this.attendanceRepository.deleteById(id);
	}

}
