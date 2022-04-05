package com.example.quiz_let.service;

import com.example.quiz_let.entity.Question;
import com.example.quiz_let.entity.Student;
import com.example.quiz_let.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<Question> findByQuizId(int id){
        return questionRepository.findAllByQuizId(id);
    }
    public List<Question> index(){
        return questionRepository.findAll();
    }
}
