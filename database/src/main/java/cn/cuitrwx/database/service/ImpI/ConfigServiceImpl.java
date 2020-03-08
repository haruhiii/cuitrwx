package cn.cuitrwx.database.service.ImpI;

import cn.cuitrwx.database.dao.ConfigDao;
import cn.cuitrwx.database.model.ConfigPO;
import cn.cuitrwx.database.mybatisutil.Mybatisutil;
import cn.cuitrwx.database.service.ConfigService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigServiceImpl implements ConfigService {
    ConfigDao dao = Mybatisutil.getSqlSession().getMapper(ConfigDao.class);

    @Override
    public List<ConfigPO> getConfigs() {
        return dao.getConfigs();
    }

}
