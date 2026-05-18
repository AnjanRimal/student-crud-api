package com.anjan.student_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent (Student student){
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }
    public Student updateStudent(Long id, Student student){
    student.setId(id);
    return studentRepository.save(student);
    }
    public void deleteStudent (Long id){
        studentRepository.deleteById(id);

    }


}
