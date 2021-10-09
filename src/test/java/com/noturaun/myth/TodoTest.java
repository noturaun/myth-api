package com.noturaun.myth;

import com.noturaun.myth.controller.TodoController;
import com.noturaun.myth.entity.Todo;
import com.noturaun.myth.repository.TodoRepository;
import com.noturaun.myth.service.TodoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TodoTest {

    @Autowired
    private TodoController controller;

    @Autowired
    private TodoRepository todoRepository;

    private TodoService todoService = new TodoService();

    @Test
    void testCreateTodoObj() {
        var todo = new Todo();
        todo.setTodo("Check email");
        todo.setCompleted(false);

        assertFalse(todo.isCompleted());
    }

    @Test
    void testAddTodo() {

    }
}
