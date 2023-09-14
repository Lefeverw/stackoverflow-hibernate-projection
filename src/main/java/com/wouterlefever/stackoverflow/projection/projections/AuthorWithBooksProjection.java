package com.wouterlefever.stackoverflow.projection.projections;

import java.util.List;

public interface AuthorWithBooksProjection {
    Long getAuthorId();

    String getAuthorName();

    List<BookProjection> getBooks();
}

