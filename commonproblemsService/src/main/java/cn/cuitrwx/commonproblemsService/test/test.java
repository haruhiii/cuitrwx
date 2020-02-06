package cn.cuitrwx.commonproblemsService.test;

import cn.cuitrwx.commonproblemsService.model.DataResponseVO;
import cn.cuitrwx.commonproblemsService.model.problem;
import cn.cuitrwx.commonproblemsService.service.commonProblemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class test {
    @Autowired
    private commonProblemsService commonProblemsService;

    @GetMapping("/getProblem")
    DataResponseVO<problem> getProblem(String id) {
        return commonProblemsService.getProblem(id);
    }
    @GetMapping("/getAllProblem")
    DataResponseVO<List<problem>> getAllProblem() {
        return commonProblemsService.getAllProblem();
    }
}
