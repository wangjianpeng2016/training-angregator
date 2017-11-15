package com.visionet.hero.service.impl;

import com.visionet.hero.entity.HeroStudent;
import com.visionet.hero.mapper.HeroStudentMapper;
import com.visionet.hero.service.HeroStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("heroStudentService")
public class HeroStudentServiceImpl implements HeroStudentService {

    @Autowired
    private HeroStudentMapper heroStudentMapper;

    /**
     * @Description 添加一名学生
     * @author wangjp
     * @Date: 2017-11-15 11:35
     */
    public void saveStudent(HeroStudent heroStudent){

        heroStudentMapper.insert(heroStudent);
    }

    /**
     * @Description 查询全部的学生信息
     * @author wangjp
     * @Date: 2017-11-15 11:45
     */
    public List<HeroStudent> queryStudentAll(){

        return heroStudentMapper.selectAll();
    }

    /**
     * @Description 查询学生和角色
     * @author wangjp
     * @Date: 2017-11-15 12:58
     */
    public List<HeroStudent> queryStudentAndRoles(Integer studentId){

        return heroStudentMapper.queryStudentAndRoles(studentId);
    }
}
