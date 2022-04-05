package com.example.quiz_let.controller;

import com.example.quiz_let.entity.Question;
import com.example.quiz_let.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    //    @GetMapping()
//    public String index(Model model){
//        model.addAttribute("questions", questionService.findByQuizId(id));
//        return "questions/index";
//    }
    @GetMapping("/{id}/get")
    public String show(Model model, @PathVariable("id") int id) {
        model.addAttribute("questions", questionService.findByQuizId(id));
        return "questions/index";
    }


//
//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("questions", questionService.index());
//        return "students/index";
//    }

//    private final IQuestionService iquestionService;
//
//    @Autowired
//    public QuestionController(IQuestionService iquestionService) {
//       this.iquestionService = iquestionService;
//    }
//    @GetMapping("/get")
//    public String getAll(Model model){
//        List<Question> questions = iquestionService.getAll();
//        model.addAttribute("questions", questions);
//        return "questions/question-list";
//    }
//
//    @PostMapping("/save")
//    public Question save( @RequestBody Question question){
//        return iquestionService.save(question);
//    }
//
//    @GetMapping("/question-delete/{id}")
//    public String deleteQuestion(@PathVariable("id") Integer id){
//        iquestionService.deleteById(id);
//        return "redirect:/questions/get";
//    }
////    @GetMapping("/question-delete/{id}")
////    public String deleteQuestionSubjectId(@PathVariable("id") Integer id){
////        iquestionService.deleteById(id);
////        return "redirect:/questions/get";
//    }
}
