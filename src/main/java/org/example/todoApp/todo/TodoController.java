package org.example.todoApp.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    private final TodoRepository repository;

    public TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    // CREATE
    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return repository.save(todo);
    }

    // READ ALL
    @GetMapping
    public List<Todo> findAll() {
        return repository.findAll();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Todo findById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));
    }

    // UPDATE
    @PutMapping("/{id}")
    public Todo update(@PathVariable Long id, @RequestBody Todo updated) {
        Todo todo = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Todo not found"));

        todo.setTitle(updated.getTitle());
        todo.setCompleted(updated.isCompleted());
        todo.setDeadline(updated.getDeadline());

        return repository.save(todo);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
