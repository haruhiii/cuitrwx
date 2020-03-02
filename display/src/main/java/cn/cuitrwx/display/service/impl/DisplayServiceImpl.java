package cn.cuitrwx.display.service.impl;

import cn.cuitrwx.display.feign.IDatabaseFeign;
import cn.cuitrwx.display.model.DataResponseVO;
import cn.cuitrwx.display.model.ErrorCode;
import cn.cuitrwx.display.model.NoticePO;
import cn.cuitrwx.display.model.ArticalPO;
import cn.cuitrwx.display.model.QuestionsPO;
import cn.cuitrwx.display.model.SlideDataPO;
import cn.cuitrwx.display.model.SlidePO;
import cn.cuitrwx.display.service.DisplayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayServiceImpl implements DisplayService {
    @Autowired
    private IDatabaseFeign databaseFeign;

    @Override
    public List getSlide() throws Exception{
        DataResponseVO<List<SlidePO>>  slidesData = databaseFeign.getSlides();
        List<SlidePO> slides = null;
        switch (slidesData.getErrCode()) {
            case SUCCESS:
                slides = slidesData.getData();
                break;
            case FAILED:
                throw new Exception("数据库错误");
            default:
                break;
        }
        return slides;
    }

    @Override
    public List getPost(final Integer start, final Integer end) {
        final List posts = new ArrayList<>();
        posts.add(new ArticalPO("关于人员进出校园网络申报的通知", "全校师生：在新冠肺炎疫情防控的关键时期，为便于行门岗管理，学校下：", "post1"));
        posts.add(new ArticalPO("中国科学院大气物理研究所曾宁研究员来我校作学术交流", "中国科学院大气物理研究所曾宁研究员来我校作学术交流中国科学院大校作学术交流", "post2"));
        posts.add(new ArticalPO("气物理研究所曾宁研究员来我校作学术交流", "理研究所曾宁研究员来我校作学术交中国科学流中国科学院大校作学术交流", "post2"));
        return posts;
    }

    @Override
    public ArticalPO getPostContent(final String id) {
        final ArticalPO post = new ArticalPO(1, "post");
        return post;
    }

    @Override
    public List getQuestions() {
        final List questions = new ArrayList<>();
        questions.add(new QuestionsPO("question1", "question1", "question1"));
        questions.add(new QuestionsPO("question2", "question2", "question2"));
        return questions;
    }

    @Override
    public NoticePO getNotice() {
        final NoticePO notice = new NoticePO("通知内容，内容内容内容，内容内容内容内容", "");
        return notice;       
    }
}
