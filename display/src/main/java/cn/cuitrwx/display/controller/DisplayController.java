package cn.cuitrwx.display.controller;

import cn.cuitrwx.display.model.NoticePO;
import cn.cuitrwx.display.model.PostPO;
import cn.cuitrwx.display.model.ResponseVO;
import cn.cuitrwx.display.service.DisplayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DisplayController {
    @Autowired
    DisplayService displayService;

    /** 获取轮播图数据
     *
     * @return
     */
    @GetMapping("/slide")
    public  ResponseVO getSlideData(){
        List slideData = displayService.getSlide();
        return new ResponseVO(slideData);
    }

    /** 获取轮播图数据
     *
     * @return
     */
    @GetMapping("/notice")
    public  ResponseVO getNotice(){
        NoticePO notice = displayService.getNotice();
        return new ResponseVO(notice);
    }

    /** 获取第 start 至 end 的文章数据
     *
     * @param start 文章开始下标
     * @param end   文章结束下标
     * @return
     */
    @GetMapping("/posts")
    public  ResponseVO getPostData(Integer start,Integer end){
        List postData = displayService.getPost(start,end);
        return new ResponseVO(postData);
    }

    @GetMapping("/posts1")

    public  ResponseVO getPostData1(Integer start,Integer end){


        List posts = new ArrayList<>();
        posts.add(new PostPO("关于人员进出校园网络申报的通知", "全校师生：在新冠肺炎疫情防控的关键时期，为便于行门岗管理，学校下：", "post1"));
        posts.add(new PostPO("中国科学院大气物理研究所曾宁研究员来我校作学术交流", "中国科学院大气物理研究所曾宁研究员来我校作学术交流中国科学院大校作学术交流", "post2"));
        posts.add(new PostPO("气物理研究所曾宁研究员来我校作学术交流", "理研究所曾宁研究员来我校作学术交中国科学流中国科学院大校作学术交流", "post2"));
        posts.add(new PostPO("中123院大气物理研究所曾宁研究员来我校作学术交流", "中国科学院123研究所曾宁研究员来我校作学术交流中国科学院大校作学术交流", "post2"));

        posts.add(new PostPO("中123院大气物理研究所曾宁研究员来我校作学术交流", "中国科学院123研究所曾宁研究员来我校作学术交流中国科学院大校作学术交流", "post2"));

        return new ResponseVO(posts);
    }
    /** 获取指定文章内容
     *
     * @param id 文章号
     * @return
     */
    @GetMapping("/post")
    public  ResponseVO getPostContent(String id){
        PostPO postContent = displayService.getPostContent(id);
        return new ResponseVO(postContent);
    }

    /** 获取常见问题
     *
     * @return
     */
    @GetMapping("/questions")
    public  ResponseVO getQuestions(){
        List questions = displayService.getQuestions();
        return new ResponseVO(questions);
    }

}
