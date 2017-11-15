package com.visionet.hero.controller;

import com.visionet.hero.entity.HeroStudent;
import com.visionet.hero.service.HeroStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public void saveStudent(HeroStudent heroStudent){

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
