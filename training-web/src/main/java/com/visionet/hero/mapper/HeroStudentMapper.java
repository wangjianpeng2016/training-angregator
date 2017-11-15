package com.visionet.hero.mapper;

import com.visionet.hero.entity.HeroStudent;
import com.visionet.hero.provider.HeroStudentProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.SelectProvider;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface HeroStudentMapper extends Mapper<HeroStudent> {


    /**
     * @Description 查询学生角色
     * @author wangjp
     * @Date: 2017-11-15 13:20
     */
    @SelectProvider(type = HeroStudentProvider.class, method = "queryStudentAndRoles")
    @ResultMap({"queryStudentAndRolesMap"})
    List<HeroStudent> queryStudentAndRoles(@Param("studentId") Integer studentId);
}
