package com.example.quiz_let.controller;

import com.example.quiz_let.Exception.ResourceNotFoundException;
import com.example.quiz_let.entity.Question;
import com.example.quiz_let.entity.Student;
import com.example.quiz_let.entity.Subject;
import com.example.quiz_let.repository.SubjectRepository;
import com.example.quiz_let.service.SubjectService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/subjects")
@AllArgsConstructor
public class SubjectController {

    @Autowired
    private SubjectService subjectService;


    @GetMapping()
    public String findAll(Model model){
        List<Subject> subjects = subjectService.findAll();
        model.addAttribute("subjects", subjects);
        return "subjects/index";
    }

    @PostMapping("/save")
    public void save( @RequestBody Subject subject){
        subjectService.save(subject);
    }

//    @GetMapping("/subject-delete/{id}")
//    public String deleteSubject(@PathVariable("id") Integer id) throws ResourceNotFoundException {
//
//            subjectService.deleteById(id);
//        return "redirect:/subjects/get";
//    }

    @GetMapping("/new") // аннотируем аннотацией
    public String newStudent(Model model){
        model.addAttribute("subject" , new Subject());
        return "subjects/new";
    }
    @PostMapping()
    public String create(@ModelAttribute("subject") Subject subject){

        subjectService.save(subject);
        return "redirect:/subjects";
    }
    @GetMapping("{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("subject", subjectService.show(id));
        return "subjects/edit";
    }
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("subject") @Valid Subject subject, BindingResult bindingResult, @PathVariable("id") int id){

        if(bindingResult.hasErrors()) return "subjects/edit";
        subjectService.update(id, subject);
        return "redirect:/subjects";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        subjectService.delete(id);
        return "redirect:/subjects";
    }


}
