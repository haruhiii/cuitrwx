package cn.cuitrwx.studyabroaddataService.test;


import cn.cuitrwx.studyabroaddataService.model.DataResponseVO;
import cn.cuitrwx.studyabroaddataService.model.Student;
import cn.cuitrwx.studyabroaddataService.service.StudybroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class test {
    @Autowired
    private StudybroadService StudentDataService;

    @GetMapping("/studyabroad")
    DataResponseVO<Student> getStudent(String studentid) {
        return StudentDataService.getStudent(studentid);
    }

    @PostMapping("/studyabroad")
    DataResponseVO PostStudent(Student student) {
        return StudentDataService.postStudent(student);
    }

    @DeleteMapping("/studyabroad")
    DataResponseVO deleteStudent(String studentid) {
        return StudentDataService.deleteStudent(studentid);
    }

    @PutMapping("/studyabroad")
    DataResponseVO putStudent(Student student) {
        return StudentDataService.putStudent(student);
    }

}
