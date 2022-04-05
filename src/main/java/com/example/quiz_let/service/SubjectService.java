package com.example.quiz_let.service;

import com.example.quiz_let.entity.Student;
import com.example.quiz_let.entity.Subject;
import com.example.quiz_let.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject show(Integer id){
        return subjectRepository.findAll().stream().filter(subject -> subject.getId() == id).findAny().orElse(null);
    }
    public void save(Subject subject) {
        subjectRepository.save(subject);
    }
    public List<Subject> findAll(){
       return subjectRepository.findAll();
    }

    public void deleteById(Integer id) {
        subjectRepository.deleteById(id);
    }

    public void update(int id, Subject updatedSubject) {
        Subject subjectToBeUpdated = show(id);

        subjectToBeUpdated.setId(id);
        subjectToBeUpdated.setName(updatedSubject.getName());
        subjectToBeUpdated.setDesc(updatedSubject.getDesc());

        subjectRepository.save(subjectToBeUpdated);
    }

    public void delete(int id) {
        subjectRepository.deleteById(id);
    }
}
