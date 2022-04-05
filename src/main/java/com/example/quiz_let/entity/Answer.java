package com.example.quiz_let.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="answers")
@Data

public class Answer {
    @Id
    @Column(name = "answer_id")
    private Integer id;

    @Column(name = "answer_name")
    private String answerName;

    @Column(name = "is_right")
    private boolean isRight;

    @Column(name = "question_id")
    private Integer questionId;
//
//    @ManyToOne
//    @JoinColumn(name = "question", insertable=false, updatable=false)
//    @JsonIgnore
//    private Question question;
}
