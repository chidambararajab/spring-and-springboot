package com.chid.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.time.LocalDate;

@Controller
@SessionAttributes("todos")
public class TodoController {
    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("list-todo")
    public String gotoTodoPage(ModelMap model) {
        model.addAttribute("todos", todoService.findByName("thechidshow"));
        return "listTodo";
    }

    // GET
    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String gotoAddTodoPageGET(ModelMap model) {
        String name = (String) model.get("name");
        Todo todo = new Todo(0, name, "",
                LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    // POST
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String gotoAddTodoPagePOST(ModelMap model, Todo todo) {
        String name = (String) model.get("name");
        todoService.add(name, todo.getDescription(), LocalDate.now(), false);
        return "redirect:list-todo";
    }
}
