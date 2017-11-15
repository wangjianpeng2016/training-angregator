package com.visionet.hero.controller;

import com.visionet.hero.entity.HeroStudent;
import com.visionet.hero.service.HeroStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 学生控制器
 * @author wangjp
 * @Date: 2017-11-15 11:24
 */
@Controller
@RequestMapping("/heroStudentController")
public class HeroStudentController {

    private Logger logger = LoggerFactory.getLogger(HeroStudentController.class);

    @Autowired
    private HeroStudentService heroStudentService;

    /**
     * @Description 添加一名学生
     * @author wangjp
     * @Date: 2017-11-15 11:34
     */
    @ResponseBody
    @RequestMapping(value="/saveStudent", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void saveStudent(@RequestBody HeroStudent heroStudent){

        logger.debug("执行保存操作...");

        heroStudentService.saveStudent(heroStudent);
    }

    /**
     * @Description 查询全部的用户信息
     * @author wangjp
     * @Date: 2017-11-15 11:24
     */
    @ResponseBody
    @RequestMapping(value="/queryStudentAll", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void queryStudentAll(){

        logger.debug("执行查询全部....");
        heroStudentService.queryStudentAll();
    }

    /**
     * @Description 查询学生Id小于某值的数据
     * @author wangjp
     * @Date: 2017-11-15 13:08
     */
    @ResponseBody
    @RequestMapping(value="/queryStudentAndRoles", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<HeroStudent>> queryStudentAndRoles(@RequestBody HeroStudent student){

        List<HeroStudent> studentList = new ArrayList<HeroStudent>();
        try {

            studentList = heroStudentService.queryStudentAndRoles(student.getId());
        } catch (Exception e){
            e.printStackTrace();
        }

        return new ResponseEntity<List<HeroStudent>>(studentList, HttpStatus.OK);
    }

    /**
     * @Description 跳转页面
     * @author wangjp
     * @Date: 2017-11-15 11:32
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){

        return "hero/index";
    }
}
