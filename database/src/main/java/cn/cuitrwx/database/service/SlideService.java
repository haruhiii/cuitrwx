package cn.cuitrwx.database.service;


import cn.cuitrwx.database.model.SlidePO;

import java.util.List;

public interface SlideService {


    List<SlidePO> getSlides();
    List<SlidePO> getDeletedSlides();
    Integer putSlide(SlidePO newSlide);
    Integer postSlide(SlidePO newSlide);
    Integer deleteSlide(Integer id);
    Integer restoreSlide(Integer id);
    
}
