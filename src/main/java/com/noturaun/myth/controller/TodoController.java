package com.noturaun.myth.controller;

import com.noturaun.myth.dto.ResponseData;
import com.noturaun.myth.entity.Todo;
import com.noturaun.myth.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/noturaun/api/myth/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity<ResponseData<Todo>> add(@Valid @RequestBody Todo todo, Errors errors){
        ResponseData<Todo> responseData = new ResponseData<>();

        if (errors.hasErrors() || todo.getTodo() == null){
            for (var error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(todoService.save(todo));
        return ResponseEntity.ok(responseData);
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
    public ResponseEntity<ResponseData<Todo>> update(@Valid @RequestBody Todo todo, Errors errors){
        ResponseData<Todo> responseData = new ResponseData<>();

        if (errors.hasErrors() || todo.getTodo() == null){
            for (var error : errors.getAllErrors()) {
                responseData.getMessages().add(error.getDefaultMessage());
            }
            responseData.setStatus(false);
            responseData.setPayload(null);
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseData);
        }
        responseData.setStatus(true);
        responseData.setPayload(todoService.save(todo));
        return ResponseEntity.ok(responseData);
    }

}
