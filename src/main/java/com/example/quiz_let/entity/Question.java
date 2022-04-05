package com.example.quiz_let.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "questions")
@Data
public class Question {

    @Id
    @Column(name = "question_id")
    private Integer id;

    @Column(name = "question_text")
    private String text;

    @Column(name = "quiz_id")
    private Integer quizId;

//    @ManyToOne
//    @JoinColumn(name = "subject", insertable=false, updatable=false)
//    @JsonIgnore
//    private Subject subject;
//
//    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
//    List<Answer> listOfAnswers;
}
