package com.chid.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "chid", "Learn Spring", LocalDate.now().plusDays(3), true));
        todos.add(new Todo(2, "chid", "Learn Spring Boot", LocalDate.now().plusDays(10), false));
        todos.add(new Todo(3, "chid", "Learn Spring JPA", LocalDate.now().plusDays(20), false));
        todos.add(new Todo(4, "chidambararajab", "Learn Spring Cloud", LocalDate.now().plusDays(30), false));
    }

    public List<Todo> findByName(String name) {
        return todos;
    }
}
