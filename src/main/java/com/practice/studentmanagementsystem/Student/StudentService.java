package com.practice.studentmanagementsystem.Student;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();


    public List<Student> getAllStudents() {
        students.add(new Student("James", "Shaw", 23));
        return students;
    }

    public void addStudent(Student student) throws Exception {
      try {
          if (student != null){
              students.add(student);
          }

      } catch (Exception e) {
          throw e;
      }
    }
}
