package com.example.quiz_let.controller;

import com.example.quiz_let.entity.Quiz;
import com.example.quiz_let.entity.Student;
import com.example.quiz_let.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("{id}/get")
    public String index(Model model, @PathVariable("id") int id){
        model.addAttribute("quizes", quizService.findBySubjectId(id));
        return "quizes/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model){
        model.addAttribute("quiz", quizService.show(id));
        return "quizes/show";
    }
    @GetMapping("/new") // аннотируем аннотацией
    public String newQuiz(Model model){
        model.addAttribute("quiz" , new Quiz());
        return "quizes/new";
    }
    @PostMapping()
    public String create(@ModelAttribute("quiz") @Valid Quiz quiz, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "quizes/new";
        }
        quizService.save(quiz);
        return "redirect:/quizes";
    }
    @GetMapping("{id}/edit")
    public String edit(Model model, @PathVariable("id") int id){
        model.addAttribute("quiz", quizService.show(id));
        return "quizes/edit";
    }
    @PatchMapping("/{id}")
    public String update(@ModelAttribute("quiz") @Valid Quiz quiz, BindingResult bindingResult, @PathVariable("id") int id){

        if(bindingResult.hasErrors()) return "quizes/edit";
        quizService.update(id, quiz);
        return "redirect:/quizes";
    }
}
