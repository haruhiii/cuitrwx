package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.SlideDao;
import cn.cuitrwx.database.model.SlidePO;
import cn.cuitrwx.database.mybatisutil.Mybatisutil;
import cn.cuitrwx.database.service.SlideService;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class SlideServiceImpl implements SlideService{

    SlideDao dao = Mybatisutil.getSqlSession().getMapper(SlideDao.class);

    @Override
    public List<SlidePO> getSlides() {
        return dao.getSlides();
    }
    
    @Override
    public List<SlidePO> getDeletedSlides() {
        return dao.getDeletedSlides();
    }
    @Override
    public Integer putSlide(SlidePO newSlide){
        return dao.putSlide(newSlide);
    }
    @Override
    public Integer postSlide(SlidePO newSlide){
        return dao.postSlide(newSlide);
    }
    @Override
    public Integer deleteSlide(Integer id){
        return dao.deleteSlide(id) ;
    }
    @Override
    public Integer restoreSlide(Integer id){
        return dao.restoreSlide(id) ;
    }
}
