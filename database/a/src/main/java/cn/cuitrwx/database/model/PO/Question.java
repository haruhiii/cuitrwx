package cn.cuitrwx.database.model.PO;

import io.swagger.annotations.ApiModel;
import org.springframework.stereotype.Component;

@Component
@ApiModel(description = "常见问题")

public class Question {

    private Integer id; //编号
    private String question; //详情
    private String answer;  //回答

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
