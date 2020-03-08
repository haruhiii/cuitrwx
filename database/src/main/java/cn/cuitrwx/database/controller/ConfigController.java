package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.ConfigPO;
import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.ErrorCode;
import cn.cuitrwx.database.service.ConfigService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConfigController {
    @Autowired
    private ConfigService configService;


    @GetMapping("/configs")
    DataResponseVO<List<ConfigPO>> getConfigs(){
        try {
            List configs = configService.getConfigs();
            return configs == null||configs.size()==0?
                    new DataResponseVO<>(ErrorCode.EMPTY):new DataResponseVO<>(configs);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponseVO<>(ErrorCode.FAILED);
        }
    }
}
