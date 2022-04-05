package com.example.quiz_let.repository;

import com.example.quiz_let.entity.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    List<Answer> getAllByQuestionId(Integer id);
}
