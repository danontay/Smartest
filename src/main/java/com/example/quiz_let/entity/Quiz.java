package com.example.quiz_let.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "quizes")
@Data
public class Quiz {
    @Id
    @Column(name = "quiz_id")
    private Integer id;

    @Column(name = "quiz_name")
    private String quizName;

    @Column(name = "subject_id")
    private Integer subjectId;

}
