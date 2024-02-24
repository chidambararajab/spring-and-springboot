package com.chid.springboot.learnjpaandhibernate.course.jdbc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;


    private static String INSERT_QUERY =
            """                
                    insert into course(id, name, author)
                    values(1, 'thechidshow', '@chid')
            """;

    public void insert() {
        jdbcTemplate.update(INSERT_QUERY);
    }
}
