package com.visionet.hero.provider;

public class HeroStudentProvider {

    public String queryStudentAndRoles(){

        StringBuilder sql = new StringBuilder(" SELECT * ");
        sql.append(" FROM hero_student_role sr ")
           .append(" INNER JOIN hero_student s ON sr.student_id = s.id_ ")
           .append(" INNER JOIN hero_role r ON sr.role_id = r.id_ ")
           .append(" WHERE s.id_ < #{studentId}")
           .append(" ORDER BY s.id_ ");

        return sql.toString();
    }
}
