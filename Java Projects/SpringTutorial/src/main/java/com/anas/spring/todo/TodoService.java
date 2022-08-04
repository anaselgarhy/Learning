package com.anas.spring.todo;

import com.anas.spring.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Todo getTodo(final String id) {
        try {
            return todoRepository.findById(id).get();
        } catch (NoSuchElementException e) {
            throw new NotFoundException("Todo not found");
        }
    }

    public Todo addTodo(final String title, final String description) {
        final var todo = new Todo(String.valueOf(todoRepository.findAll().size()), title, description, false);
        todoRepository.save(todo);
        return todo;
    }

    public void deleteTodo(final String id) {
        todoRepository.deleteById(id);
    }

    public Todo addTodo(final Todo todo) {
        return todoRepository.insert(todo);
    }
}
