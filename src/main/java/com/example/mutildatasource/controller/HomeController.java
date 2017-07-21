package com.example.mutildatasource.controller;

import com.example.mutildatasource.entity.app.Teacher;
import com.example.mutildatasource.entity.wjj.Area;
import com.example.mutildatasource.repository.app.TeacherRepo;
import com.example.mutildatasource.repository.wjj.AreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ido on 2017/7/21.
 */
@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    @Qualifier("teacher")

    private TeacherRepo teacherRepo;

    @Qualifier("area")
    @Autowired
    private AreaRepo areaRepo;


    @GetMapping("teacher")
    public Teacher getTeacher(@RequestParam Long id){
        Teacher result = teacherRepo.findOne(1L);
        System.out.println(result.toString());
        return result;
    }


    @GetMapping("area")
    public Area getArea(@RequestParam Long id){
        Area result = areaRepo.findOne(1L);
        System.out.println(result.toString());
        return result;
    }
}
