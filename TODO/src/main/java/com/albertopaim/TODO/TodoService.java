package com.albertopaim.TODO;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService (TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public TodoEntity save(TodoEntity novoTodo){
        return todoRepository.save(novoTodo);
    }

    public TodoEntity update(TodoEntity novoTodo){
        return todoRepository.save(novoTodo);
    }

    public TodoEntity getByid(Integer id){
        return todoRepository.findById(id).orElse(null);
    }

    public void delete(Integer id){
        todoRepository.deleteById(id);
    }
}
