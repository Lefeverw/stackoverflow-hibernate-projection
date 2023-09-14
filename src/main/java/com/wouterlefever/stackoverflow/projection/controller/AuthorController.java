package com.wouterlefever.stackoverflow.projection.controller;

import com.wouterlefever.stackoverflow.projection.entities.Author;
import com.wouterlefever.stackoverflow.projection.projections.AuthorWithBooksProjection;
import com.wouterlefever.stackoverflow.projection.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/withBooks/{id}")
    public List<AuthorWithBooksProjection> getAuthorsWithBooks(@PathVariable(name = "id") Long idUser) {
        return authorService.getAuthorsWithBooks(idUser);
    }
}