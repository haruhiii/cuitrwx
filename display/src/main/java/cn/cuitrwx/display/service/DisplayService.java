package cn.cuitrwx.display.service;

import cn.cuitrwx.display.model.PostPO;

import java.util.List;

public interface DisplayService {
    List getSlide();
    List getPost(Integer start, Integer end);
    PostPO getPostContent(String id);
    List getQuestions();
}
