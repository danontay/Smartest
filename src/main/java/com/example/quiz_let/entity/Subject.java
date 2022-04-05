package com.example.quiz_let.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subjects")
@RequiredArgsConstructor
@Data
public class Subject {

    @Id
    @Column(name = "subject_id")
    private Integer id;

    @Column(name = "subject_name")
    private String name;

    @Column(name = "description")
    private String desc;

}
