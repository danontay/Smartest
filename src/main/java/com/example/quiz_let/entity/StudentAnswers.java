package com.example.quiz_let.entity;

import javax.persistence.*;

@Entity
@Table(name = "student_answers")
public class StudentAnswers {
    @Id
    @GeneratedValue
    @Column(name = "student_answers_id")
    private Integer studentAnswerId;

    @Column(name = "student_id")
    private Integer studentId;

    @Column(name = "question_id")
    private Integer questionId;

    @Column(name = "answer_id")
    private Integer answerId;
}
