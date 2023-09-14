package com.wouterlefever.stackoverflow.projection.repository;

import com.wouterlefever.stackoverflow.projection.entities.Author;
import com.wouterlefever.stackoverflow.projection.projections.AuthorWithBooksProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    @Query("SELECT a.id AS authorId, a.name AS authorName, a.books AS books " +
            "FROM Author a WHERE a.id=:idUser")
    List<AuthorWithBooksProjection> findAuthorsWithBooks(@Param("idUser") Long id);
}