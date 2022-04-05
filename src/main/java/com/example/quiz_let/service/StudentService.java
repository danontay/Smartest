package com.example.quiz_let.service;

import com.example.quiz_let.entity.Question;
import com.example.quiz_let.entity.Student;
import com.example.quiz_let.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student show(int id){
        return studentRepository.findAll().stream().filter(student -> student.getId() == id).findAny().orElse(null);
    }

    public List<Student> index(){
        return studentRepository.findAll();
    }

    public void save(Student student) {
        studentRepository.save(student);
    }

    public void update(int id, Student updatedStudent) {
//        updatedStudent.setid(id);
        studentRepository.save(updatedStudent);
    }

    public void delete(int id) {
        studentRepository.deleteById(id);
    }

}
