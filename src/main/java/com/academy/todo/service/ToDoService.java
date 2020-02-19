package com.academy.todo.service;

import com.academy.todo.model.Person;
import com.academy.todo.model.ToDo;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    public ToDo getToDoById(long id){
        ToDo toDo = new ToDo();
        toDo.setId(id);
        toDo.setDescription("Meu primeiro a fazer!");

        Person p = new Person();
        p.setId(1);
        p.setName("Hatos");

        toDo.setPerson(p);
        return toDo;
    }

}
