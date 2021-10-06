package com.noturaun.myth;

import com.noturaun.myth.entity.Todo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TodoTest {

    @Test
    void testCreateTodoObj() {
        var todo = new Todo();
        todo.setTodo("Check email");
        todo.setCompleted(false);

        assertFalse(todo.isCompleted());
    }


}
