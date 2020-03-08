package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.model.QuestionPO;
import cn.cuitrwx.database.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionService questionService;


    @GetMapping("/questions")
    DataResponseVO<List<QuestionPO>> getQuestions(){
        try {
            List questions = questionService.getQuestions();
            return questions == null||questions.size()==0?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(questions);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @PostMapping("/question")
    DataResponseVO<Integer> postQuestion(@RequestBody QuestionPO newQuestion){
        try {
            return  questionService.postQuestion(newQuestion) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

    @PutMapping("/question")
    DataResponseVO<Integer> putQuestion(@RequestBody QuestionPO newQuestion){
        try {
            return  questionService.putQuestion(newQuestion) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
    @DeleteMapping("/question")
    DataResponseVO<Integer> deleteQuestion(@RequestParam Integer id){
        try {
            return  questionService.deleteQuestion(id) == 0?
                    new DataResponseVO<>(ErrorCode.USELESS):new DataResponseVO<>(1);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }

}
