package com.chid.springboot.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/course")
    public List<Course> retriveCourseDatas() {
        return Arrays.asList(
                new Course(1, "Django", "@Chid"),
                new Course(1, "Spring Boot", "@Chidambararaja"),
                new Course(1, "GoLang", "@Chidambararajab")
        );
    }
}
