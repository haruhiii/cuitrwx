package cn.cuitrwx.display.service.impl;

import cn.cuitrwx.display.model.PostPO;
import cn.cuitrwx.display.model.QuestionsPO;
import cn.cuitrwx.display.model.SlideDataPO;
import cn.cuitrwx.display.service.DisplayService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Override
    public List getSlide() {
        List slides = new ArrayList<>();
        slides.add(new SlideDataPO("slides1", "slides1"));
        slides.add(new SlideDataPO("slides2", "slides2"));
        return slides;
    }

    @Override
    public List getPost(Integer start, Integer end) {
        List posts = new ArrayList<>();
        posts.add(new PostPO("post1", "post1", "post1"));
        posts.add(new PostPO("post2", "post2", "post2"));
        return posts;
    }

    @Override
    public PostPO getPostContent(String id) {
        PostPO post = new PostPO("post", "post");
        return post;
    }

    @Override
    public List getQuestions() {
        List questions = new ArrayList<>();
        questions.add(new QuestionsPO("question1", "question1", "question1"));
        questions.add(new QuestionsPO("question2", "question2", "question2"));
        return questions;
    }
}
