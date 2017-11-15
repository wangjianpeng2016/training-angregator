package com.visionet.hero.service;

import com.visionet.hero.entity.HeroStudent;

import java.util.List;

public interface HeroStudentService {

    /**
     * @Description 添加一名学生
     * @author wangjp
     * @Date: 2017-11-15 11:35
     */
    void saveStudent(HeroStudent heroStudent);

    /**
     * @Description 查询全部的学生信息
     * @author wangjp
     * @Date: 2017-11-15 11:45
     */
    List<HeroStudent> queryStudentAll();

    /**
     * @Description 查询学生和角色
     * @author wangjp
     * @Date: 2017-11-15 12:58
     */
    List<HeroStudent> queryStudentAndRoles(Integer studentId);
}
