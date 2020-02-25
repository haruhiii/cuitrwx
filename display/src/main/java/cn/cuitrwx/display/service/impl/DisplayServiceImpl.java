package cn.cuitrwx.display.service.impl;

import cn.cuitrwx.display.feign.IDisplayFeign;
import cn.cuitrwx.display.model.NoticePO;
import cn.cuitrwx.display.model.PostPO;
import cn.cuitrwx.display.model.QuestionsPO;
import cn.cuitrwx.display.model.SlideDataPO;
import cn.cuitrwx.display.service.DisplayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Autowired
    private IDisplayFeign displayFeign;

    @Override
    public List getSlide() {
        List slides = new ArrayList<>();
        slides.add(new SlideDataPO(
                "https://i0.hdslb.com/bfs/sycp/creative_img/202002/e5b02e4fcb532f365d43b453e50df33b.png@1100w_484h_1c_100q.png",
                "slides1"));
        slides.add(new SlideDataPO(
                "https://i0.hdslb.com/bfs/archive/defac02a8576ce801aaf274f3a2828f4a05c4f9f.jpg@1100w_484h_1c_100q.jpg",
                "slides2"));
        slides.add(new SlideDataPO(
                "https://i0.hdslb.com/bfs/archive/4b257fc41e0bd35e93c6a74a95c1ab67278c60e8.jpg@1100w_484h_1c_100q.jpg",
                "slides3"));
        return slides;
    }

    @Override
    public List getPost(Integer start, Integer end) {
        List posts = new ArrayList<>();
        posts.add(new PostPO("关于人员进出校园网络申报的通知", "全校师生：在新冠肺炎疫情防控的关键时期，为便于行门岗管理，学校下：", "post1"));
        posts.add(new PostPO("中国科学院大气物理研究所曾宁研究员来我校作学术交流", "中国科学院大气物理研究所曾宁研究员来我校作学术交流中国科学院大校作学术交流", "post2"));
        posts.add(new PostPO("气物理研究所曾宁研究员来我校作学术交流", "理研究所曾宁研究员来我校作学术交中国科学流中国科学院大校作学术交流", "post2"));
        return posts;
    }

    @Override
    public PostPO getPostContent(String id) {
        PostPO post = new PostPO(1, "post");
        return post;
    }

    @Override
    public List getQuestions() {
        List questions = new ArrayList<>();
        questions.add(new QuestionsPO("question1", "question1", "question1"));
        questions.add(new QuestionsPO("question2", "question2", "question2"));
        return questions;
    }

    @Override
    public NoticePO getNotice() {
        NoticePO notice = new NoticePO("通知内容，内容内容内容，内容内容内容内容",""); 
        return notice;       
    }
}
