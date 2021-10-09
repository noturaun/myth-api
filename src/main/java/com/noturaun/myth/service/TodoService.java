package com.noturaun.myth.service;


import com.noturaun.myth.entity.Todo;
import com.noturaun.myth.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import javax.transaction.Transactional;
import javax.validation.Valid;

@Service
@Transactional
public class TodoService {

    @Autowired
    public TodoRepository todoRepository;

    public Todo save(@Valid Todo todo){
        return todoRepository.save(todo);
    }

    public Todo findById(Long id){
        return todoRepository.findById(id).get();
    }

    public Iterable<Todo> findAll(){
        return todoRepository.findAll();
    }

    public void delete(Long id){
        todoRepository.deleteById(id);
    }
}
