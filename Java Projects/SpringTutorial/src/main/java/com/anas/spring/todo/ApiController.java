package com.anas.spring.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/todos")
public class ApiController {

    @Autowired
    private TodoService todoService;

    @GetMapping(value = {"", "/"})
    public List<Todo> getTodoList() {
        return todoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Todo> getTodo(@PathVariable final String id) {
        final var todo = todoService.getTodo(id);
        if (todo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }

    @GetMapping(value = "add/{title}/{description}")
    public ResponseEntity<Todo> addTodo(@PathVariable final String title,
                                  @PathVariable final String description) {
        return new ResponseEntity<>( todoService.addTodo(title, description), HttpStatus.CREATED);
    }

    @PostMapping(value = "add")
    public ResponseEntity<Todo> addTodo(@Validated @RequestBody final Todo todo) {
        return new ResponseEntity<>(todoService.addTodo(todo), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable final String id) {
        todoService.deleteTodo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
