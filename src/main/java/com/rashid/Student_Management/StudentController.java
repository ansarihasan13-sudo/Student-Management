package com.rashid.Student_Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    private StudentRepository studentRepository;

    // Add Student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // Get All Students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Get Student By ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    // Update Student
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new RuntimeException("Student not found"));


        student.setName(updatedStudent.getName());
        student.setEmail(updatedStudent.getEmail());
        student.setCourse(updatedStudent.getCourse());

        return studentRepository.save(student);
    }

    // Delete Student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
    @GetMapping("/add")
    public Student addStudent() {
        Student s = new Student();
        s.setName("Rashid");
        s.setEmail("rashid@gmail.com");
        s.setCourse("Java Backend");
        return studentRepository.save(s);
    }

}
