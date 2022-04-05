package com.example.quiz_let.DAO;

import com.example.quiz_let.entity.Student;
import com.example.quiz_let.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
//
//public class StudentDAO {
//    private static int studentCount;
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    private List<Student> students = studentRepository.findAll();
//
//    public List<Student> index(){
//        return students;
//    }
//    public Student show(int id){
//        return students.stream().filter(student -> student.getId() == id).findAny().orElse(null);
//    }
//
//    @Override
//    public String toString() {
//        return "StudentDAO{" +
//                "students=" + students +
//                '}';
//    }
//}
