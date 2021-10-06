package com.noturaun.myth.controller;

import com.noturaun.myth.entity.Todo;
import com.noturaun.myth.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/noturaun/api/myth/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public Todo add(@RequestBody Todo todo){
        return todoService.save(todo);
    }

    @GetMapping
    public Iterable<Todo> getAll(){
        return todoService.findAll();
    }

    @GetMapping("/{id}")
    public Todo getById(@PathVariable("id") Long id){
        return todoService.findById(id);
    }


    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        todoService.delete(id);
    }


    @PutMapping
    public Todo update(@RequestBody Todo todo){
        return todoService.save(todo);
    }
}
