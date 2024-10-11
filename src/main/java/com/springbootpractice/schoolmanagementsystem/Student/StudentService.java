package com.springbootpractice.schoolmanagementsystem.Student;

import com.springbootpractice.schoolmanagementsystem.constants.DummyRequest;
import com.springbootpractice.schoolmanagementsystem.constants.StudentRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentByID(int id) {
      return studentRepository.findById(id).orElse(null);
    }

    public Student addStudent(Student student) {
     return studentRepository.save(student);
    }

    public Student saveStudent(Student student) {
      return studentRepository.save(student);
    }
    public void deleteStudent(DummyRequest request) {
        studentRepository.deleteById(request.getId());
    }
}
