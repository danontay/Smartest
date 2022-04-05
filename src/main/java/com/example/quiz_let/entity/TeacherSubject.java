package com.example.quiz_let.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher_subject")
public class TeacherSubject {

    @Id
    @Column(name = "teacher_subject_id")
    private Integer teacher_subject_id;

    @Column(name = "teacher_id")
    private Integer teacherId;

    @Column(name = "subject_id")
    private Integer subjectId;

}
