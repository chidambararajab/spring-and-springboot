package com.chid.springboot.learnjpaandhibernate.course;

import com.chid.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.chid.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repo;

    @Autowired
    private CourseJpaRepository repo;


    @Override
    public void run(String... args) throws Exception {
        repo.insert(new Course(1, "JPA ABCD", "AAA"));
        repo.insert(new Course(2, "JPA EFGH", "BBB"));
        repo.insert(new Course(3, "JPA IJKL", "CCC"));
        repo.insert(new Course(4, "JPA MNOP", "DDD"));

        repo.deleteById(4);

        System.out.println(repo.selectById(1));
        System.out.println(repo.selectById(2));
        System.out.println(repo.selectById(3));
    }
}
