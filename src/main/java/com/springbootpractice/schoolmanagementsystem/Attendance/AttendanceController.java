package com.springbootpractice.schoolmanagementsystem.Attendance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/API/attendance")
public class AttendanceController {

	@Autowired
	private AttendanceService attendanceService;
	
	public AttendanceController(AttendanceService attendanceService) {
		this.attendanceService = attendanceService;
	}
	
	@PostMapping(path = "/add")
	public Attendance addAttendance(Attendance attendance) {
		return this.attendanceService.addAttendance(attendance);
	}
	
	@GetMapping
	public List<Attendance> getAllAttendances() {
		return this.attendanceService.getAllAttendances();
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public void deleteAttendance(@PathVariable(value = "id") int id) {
		this.attendanceService.deleteAttendance(id);
	}

}
