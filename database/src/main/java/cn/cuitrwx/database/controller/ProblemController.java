package cn.cuitrwx.database.controller;

import cn.cuitrwx.database.model.DataResponseVO;
import cn.cuitrwx.database.model.Problem;
import cn.cuitrwx.database.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProblemController {
    @Autowired
    private ProblemService ProblemsService;

    @GetMapping("/getProblem")
    DataResponseVO<Problem> getProblem(String id) {
        return ProblemsService.getProblem(id);
    }
    @GetMapping("/getAllProblem")
    DataResponseVO<List<Problem>> getAllProblem() {
        return ProblemsService.getAllProblem();
    }
}
