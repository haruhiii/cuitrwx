package cn.cuitrwx.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.database.mapper.QuestionMapper;
import cn.cuitrwx.database.model.PO.Question;
import cn.cuitrwx.database.model.VO.DataResponse;
import cn.cuitrwx.database.model.VO.ErrorCode;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionMapper questionMapper;

    @GetMapping("/questions")
    DataResponse<List<Question>> getQuestions(){
        try {
            List<Question> res = questionMapper.getQuestions();
            return res == null || res.size() == 0
                    ? new DataResponse<>(ErrorCode.EMPTY)
                    : new DataResponse<>(res);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PostMapping("/question")
    DataResponse<Integer> postQuestion(@RequestBody Question newQuestion){
        try {
            return new DataResponse<>(questionMapper.postQuestion(newQuestion));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PutMapping("/question")
    DataResponse<Integer> putQuestion(@RequestBody Question newQuestion){
        try {
            return new DataResponse<>(questionMapper.putQuestion(newQuestion));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }
    
    @DeleteMapping("/question")
    DataResponse<Integer> deleteQuestion(@RequestParam Integer id){
        try {
            return new DataResponse<>(questionMapper.deleteQuestion(id));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

}
