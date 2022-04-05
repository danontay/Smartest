package com.example.quiz_let.service;

import com.example.quiz_let.entity.Quiz;
import com.example.quiz_let.entity.Student;
import com.example.quiz_let.repository.QuestionRepository;
import com.example.quiz_let.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> findBySubjectId(int id){
        return quizRepository.findAllBySubjectId(id);
    }
    public Quiz show(int id){
        return quizRepository.findAll().stream().filter(quiz -> quiz.getId() == id).findAny().orElse(null);
    }

    public List<Quiz> index(){
        return quizRepository.findAll();
    }

    public void save(Quiz quiz) {
        quizRepository.save(quiz);
    }

    public void update(int id, Quiz updatedQuiz) {
        Quiz quizToBeUpdated = show(id);

        quizToBeUpdated.setId(id);
        quizToBeUpdated.setQuizName(updatedQuiz.getQuizName());
        quizToBeUpdated.setSubjectId(updatedQuiz.getSubjectId());

        quizRepository.save(quizToBeUpdated);
    }

    public void delete(int id) {
        quizRepository.deleteById(id);
    }

}
