package cn.cuitrwx.database.dao;

import cn.cuitrwx.database.model.ArticlePO;
import cn.cuitrwx.database.model.ConfigPO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ConfigDao {
    List<ConfigPO> getConfigs();

}
