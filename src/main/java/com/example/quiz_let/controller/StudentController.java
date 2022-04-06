package com.example.quiz_let.controller;

import com.example.quiz_let.entity.Student;
import com.example.quiz_let.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.number.PercentStyleFormatter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping()
    public String index(Model model){
    model.addAttribute("students", studentService.index());
    return "students/index";

    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
    model.addAttribute("student", studentService.show(id));
    return "students/show";
    }

    @GetMapping("/new") // аннотируем аннотацией
    public String newStudent(Model model){
        model.addAttribute("student" , new Student());
        return "students/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "students/new";
        }
        studentService.save(student);
        return "redirect:/students";
    }

    @GetMapping("{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("student", studentService.show(id));
        return "students/edit";
    }

    @PatchMapping("/{id}")
    public String update(@ModelAttribute("student") @Valid Student student, BindingResult bindingResult, @PathVariable("id") int id){

        if(bindingResult.hasErrors()) return "students/edit";
        studentService.update(id, student);
    return "redirect:/students";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id){
        studentService.delete(id);
        return "redirect:/students";
    }

//
//
}
