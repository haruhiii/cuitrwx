package cn.cuitrwx.display.service;

import cn.cuitrwx.display.model.ArticalPO;
import cn.cuitrwx.display.model.NoticePO;

import java.util.List;

public interface DisplayService {
    List getSlide() throws Exception;
    List getPost(Integer start, Integer end);
    ArticalPO getPostContent(String id);
    NoticePO getNotice();
    List getQuestions();
}
