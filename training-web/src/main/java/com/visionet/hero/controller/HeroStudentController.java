package com.visionet.hero.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    /**
     * @Description 查询全部的用户信息
     * @author wangjp
     * @Date: 2017-11-15 11:24
     */
    @ResponseBody
    @RequestMapping(value="/queryStudentAll", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void queryStudentAll(){

    }
}
