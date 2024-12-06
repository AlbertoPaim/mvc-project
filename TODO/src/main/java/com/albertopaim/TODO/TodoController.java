package com.albertopaim.TODO;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private TodoService service;

    public TodoController(TodoService service) {
        this.service = service;
    }

    @PostMapping
    public TodoEntity create(@RequestBody TodoEntity todoEntityNew) {
        return service.save(todoEntityNew);
    }

    @PutMapping("{id}")
    public TodoEntity update(@PathVariable Integer id, @RequestBody TodoEntity todoEntity) {
        todoEntity.setId(id);
        return service.update(todoEntity);
    }

    @GetMapping("{id}")
    public TodoEntity getById(@PathVariable Integer id){
    return service.getByid(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
