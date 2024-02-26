package com.chid.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class TodoController {
    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("todo")
    public String gotoTodoPage(ModelMap model) {
        model.addAttribute("todos", todoService.findByName("thechidshow"));
        return "todo";
    }
}
