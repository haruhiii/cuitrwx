package cn.cuitrwx.database.dao;

import cn.cuitrwx.database.model.SlidePO;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SlideDao {

    List<SlidePO> getSlides();
    List<SlidePO> getDeletedSlides();
    Integer putSlide(SlidePO newSlide);
    Integer postSlide(SlidePO newSlide);
    Integer deleteSlide(Integer id);
    Integer restoreSlide(Integer id);
    

}
