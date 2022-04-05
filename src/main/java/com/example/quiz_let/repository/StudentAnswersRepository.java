package com.example.quiz_let.repository;

import com.example.quiz_let.entity.StudentAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAnswersRepository extends JpaRepository<StudentAnswers, Long> {
}
