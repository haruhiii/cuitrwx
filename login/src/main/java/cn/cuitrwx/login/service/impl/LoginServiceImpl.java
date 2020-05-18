package cn.cuitrwx.login.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import cn.cuitrwx.login.feign.IDatabaseFeign;
import cn.cuitrwx.login.model.ConfigPO;
import cn.cuitrwx.login.model.DataResponseVO;
import cn.cuitrwx.login.model.ErrorCode;
import cn.cuitrwx.login.model.StudentPO;
import cn.cuitrwx.login.service.LoginService;
import springfox.documentation.spring.web.json.Json;

@Service
public class LoginServiceImpl implements LoginService {
   

    @Autowired
    private IDatabaseFeign databaseFeign;

    @Override
    public StudentPO getStudentInfo(String code) throws Exception{
        Map<String,String> sessionAndOpenid = getSessionAndOpenid(code);
        DataResponseVO<StudentPO> studentData = databaseFeign.getStudent(sessionAndOpenid.get("openid"));

        switch(studentData.getErrCode()){
            case SUCCESS:
                return studentData.getData();
            case FAILED:
                throw new Exception("数据库错误");
            default:
                break;
        }
        // TODO 
        StudentPO newStudent = new StudentPO();
        newStudent.setOpenid(sessionAndOpenid.get("openid"));
        newStudent.setSessionKey(sessionAndOpenid.get("session_key"));
        DataResponseVO<Integer> result = databaseFeign.postStudent(newStudent);
        if(result.getErrCode()==ErrorCode.FAILED){
            throw new Exception("数据库错误");
        }
        return newStudent;
    }
    Map<String,String> getSessionAndOpenid(String code) throws Exception{
        RestTemplate restTemplate=new RestTemplate();
        // DataResponseVO<List<ConfigPO>>  configs = databaseFeign.getConfigs();
        String appid = "wxf328cb70e3f35438";
        String secret = "531931ef6fa4b6cc348f721dd9b8ba46";
        // if(configs.getErrCode()==ErrorCode.SUCCESS) {
        //     for(ConfigPO config : configs.getData()){
        //         if(config.getProperty().equals("AppSecret")){
        //             secret = config.getValue();
        //         }else if(config.getProperty().equals("APPID")){
        //             appid = config.getValue();
        //         }
        //     }
        // }else{
        //     throw new Exception("配置信息获取失败");
        // }
        String url="https://api.weixin.qq.com/sns/jscode2session";
        Map<String, String> map = new HashMap<String, String>();
        map.put("APPID",appid);
        map.put("SECRET",secret);
        map.put("JSCODE",code);
        String response= restTemplate.getForObject(url+ "?appid={APPID}&secret={SECRET}&js_code={JSCODE}&grant_type=authorization_code", String.class,map);
        JSONObject jsonObject = JSON.parseObject(response);
        if(jsonObject.get("errcode")!=null){
            throw new Exception("登陆失败:errcode:"+jsonObject.get("errcode")+",errmsg:"+jsonObject.get("errmsg"));
        }
        Map res = new HashMap<String,String>();
        res.put("session_key", jsonObject.get("session_key"));
        res.put("openid", jsonObject.get("openid"));
        return res;
    }

    @Override
    public Integer updateStudentBaseInfo(StudentPO newStudent) throws Exception {

        DataResponseVO<Integer> res = databaseFeign.updateStudentBaseInfo(newStudent);
        switch(res.getErrCode()){
            case SUCCESS:
                return res.getData();
            case FAILED:
                throw new Exception("数据库错误");
            default:
                break;
        }
        return 0;
    }

    @Override
    public Integer putStudent(StudentPO newStudent) throws Exception {

        DataResponseVO<Integer> res = databaseFeign.putStudent(newStudent);
        switch(res.getErrCode()){
            case SUCCESS:
                return res.getData();
            case FAILED:
                throw new Exception("数据库错误");
            default:
                break;
        }
        return 0;
    }
}
