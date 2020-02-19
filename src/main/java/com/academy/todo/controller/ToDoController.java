package com.academy.todo.controller;


import com.academy.todo.model.ToDo;
import com.academy.todo.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    /* Como estamos fazendo nosso primeiro Back-end REST. Vamos implementar os 4 parâmetros que são:
    * GET - Receber informação através da API
    * PUT - Atualizar uma informação através da API
    * POST - Inserir uma nova informação através da API
    * DELETE - Deletar uma informação existente através da API
    *  estes são os mais comuns para uma API pois fazem todas as funcionalidades de um CRUD (Create, Retrieve, Update e Delete) */

    @Autowired
    ToDoService toDoService;


    @RequestMapping(path = "/{Id}", method = RequestMethod.GET)
    @ResponseBody
    public ToDo createToDo(@PathVariable(name = "Id") long id)
    {
        return toDoService.getToDoById(id);
    }

}
