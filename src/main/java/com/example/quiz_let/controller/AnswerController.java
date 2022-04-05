package com.example.quiz_let.controller;

import com.example.quiz_let.entity.Answer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/answers")
public class AnswerController {
//    private final IAnswerService iAnswerService;
//
//    public AnswerController(IAnswerService iAnswerService) {
//        this.iAnswerService = iAnswerService;
//    }
//    @GetMapping("/get")
//    public String getAll(Model model){
//        List<Answer> answers = iAnswerService.getAll();
//        model.addAttribute("answers", answers);
//        return "answers/answer-list";
//    }
//
//    @PostMapping("/save")
//    public Answer save(@RequestBody Answer answer){
//    return iAnswerService.save(answer);
//    }
//    @GetMapping("/delete/{id}")
//    public void deleteAnswer(@PathVariable("id") Integer id){
//        iAnswerService.deleteById(id);
//    }

}
