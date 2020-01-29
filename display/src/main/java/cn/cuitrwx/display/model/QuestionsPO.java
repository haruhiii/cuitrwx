package cn.cuitrwx.display.model;

public class QuestionsPO {
    private String id;
    private String question;
    private String answer;

    public QuestionsPO(String id,String question,String answer){
        this.answer=answer;
        this.id=id;
        this.question=question;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
