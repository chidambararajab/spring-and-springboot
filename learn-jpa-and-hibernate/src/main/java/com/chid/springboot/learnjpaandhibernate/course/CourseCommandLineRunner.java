package com.chid.springboot.learnjpaandhibernate.course;

import com.chid.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.chid.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.chid.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository repo; // This is for JDBC

//    @Autowired
//    private CourseJpaRepository repo; // This is for JPA

    @Autowired
    private CourseSpringDataJpa repo; // This is for Spring Data JPA

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Course(1, "Spring Data JPA ABCD", "AAA"));
        repo.save(new Course(2, "Spring Data JPA EFGH", "BBB"));
        repo.save(new Course(3, "Spring Data JPA IJKL", "CCC"));
        repo.save(new Course(4, "Spring Data JPA MNOP", "DDD"));

        repo.deleteById(4l);

        System.out.println(repo.findById(1l));
        System.out.println(repo.findById(2l));
        System.out.println(repo.findById(3l));


        System.out.println(repo.findAll());
        System.out.println(repo.count());

        // Custom Methods using Spring Data JPA
        System.out.println(repo.findByAuthor("BBB"));
        System.out.println(repo.findByName("Spring Data JPA ABCD"));
        System.out.println(repo.findByName("Wrong Name"));
    }
}
