package cn.cuitrwx.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.cuitrwx.database.mapper.OverseasMapper;
import cn.cuitrwx.database.model.PO.Overseas;
import cn.cuitrwx.database.model.VO.DataResponse;
import cn.cuitrwx.database.model.VO.ErrorCode;

import java.util.List;

@RestController
public class OverseasController {
    @Autowired
    private  OverseasMapper overseasMapper;


    @GetMapping("/overseass")
    DataResponse<List<Overseas>>  getOverseass(@RequestParam("start") Integer start,@RequestParam("total") Integer total){
        try {
            List<Overseas> res = overseasMapper.getOverseass(start,total);
            return res == null || res.size() == 0
                    ? new DataResponse<>(ErrorCode.EMPTY)
                    : new DataResponse<>(res);
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }

    @PostMapping("/overseas")
    DataResponse<Integer> postOversea(@RequestBody Overseas newOverseas){
        try {
            return new DataResponse<>(overseasMapper.postOverseas(newOverseas));
        } catch (Exception e) {
            e.printStackTrace();
            return new DataResponse<>(ErrorCode.FAILED);
        }
    }


}
