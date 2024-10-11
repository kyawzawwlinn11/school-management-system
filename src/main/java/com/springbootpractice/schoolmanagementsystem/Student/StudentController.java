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

    @RequestMapping(path = "/saveStudent", method = RequestMethod.POST)
    public Student saveStudent(@RequestBody StudentDetails request) {
        // Create the Student object
        Student student = new Student();
        student.setName(request.getName());
        student.setAge(request.getAge());

        // Create the StudentDetails object and set the student
        StudentDetails studentDetails = new StudentDetails();
        studentDetails.setName(request.getName());
        studentDetails.setAge(request.getAge());
        studentDetails.setAddress(request.getAddress());
        studentDetails.setEmail(request.getEmail());
        studentDetails.setNrc(request.getNrc());
        studentDetails.setPassportNo(request.getPassportNo());

        // Set the bidirectional relationship
        studentDetails.setStudent(student);
        student.setStudentDetails(studentDetails);

        // Save the student (which should also save studentDetails due to cascade)
        return studentService.saveStudent(student);
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
