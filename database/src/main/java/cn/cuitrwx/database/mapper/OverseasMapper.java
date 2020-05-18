package cn.cuitrwx.database.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import cn.cuitrwx.database.model.PO.Overseas;

import java.util.List;

@Mapper
@Repository
public interface OverseasMapper {


    @Select("select * from overseas where  is_deleted = false order by id  desc limit #{start},#{total}")
    List<Overseas> getOverseass(Integer start,Integer total);

    @Insert("insert into overseas(openid, tel, name,program_id,status) values(#{openid}, #{tel}, #{name},#{program_id},#{status})") 
    Integer postOverseas(Overseas newOverseas);

}
