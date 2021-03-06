package com.visionet.hero.entity;

import com.visionet.common.entity.IdEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * @Description 英雄学生实体对象
 * @author wangjp
 * @Date: 2017-11-15 11:27
 */
@Table(name="hero_student")
public class HeroStudent extends IdEntity {

    @Column(name="name_")
    private String name;

    @Transient
    private List<HeroRole> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HeroRole> getRoles() {
        return roles;
    }

    public void setRoles(List<HeroRole> roles) {
        this.roles = roles;
    }
}
