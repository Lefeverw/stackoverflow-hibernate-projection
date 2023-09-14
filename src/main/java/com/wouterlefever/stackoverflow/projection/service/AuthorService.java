package com.wouterlefever.stackoverflow.projection.service;

import com.wouterlefever.stackoverflow.projection.entities.Author;
import com.wouterlefever.stackoverflow.projection.projections.AuthorWithBooksProjection;
import com.wouterlefever.stackoverflow.projection.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<AuthorWithBooksProjection> getAuthorsWithBooks(Long idUser) {
        return authorRepository.findAuthorsWithBooks(idUser);
    }

}