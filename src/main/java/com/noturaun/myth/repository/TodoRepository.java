package com.noturaun.myth.repository;

import com.noturaun.myth.entity.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> {

}
