package com.springbootpractice.schoolmanagementsystem.Student;

import com.springbootpractice.schoolmanagementsystem.constants.DummyRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("API/students")
public class StudentController {
    private final StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getAllStudent() {
       return this.studentService.getAllStudents();
    }

    @RequestMapping(path = "/studentById", method = RequestMethod.POST)
    public Student getStudentById(@RequestBody int id) {
        return this.studentService.getStudentByID(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Student addStudent(@RequestBody Student student) {
        return this.studentService.addStudent(student);
    }

    @RequestMapping(path = "/deleteById", method = RequestMethod.DELETE)
    public void deleteStudentById(@RequestBody DummyRequest request) {
       this.studentService.deleteStudent(request);
    }
}
