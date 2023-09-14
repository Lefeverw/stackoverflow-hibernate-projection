package com.wouterlefever.stackoverflow.projection;

import com.wouterlefever.stackoverflow.projection.entities.Author;
import com.wouterlefever.stackoverflow.projection.entities.Book;
import com.wouterlefever.stackoverflow.projection.repository.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {
    private final AuthorRepository authorRepository;

    public Application(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        List<Book> books = List.of(new Book("title1",1), new Book("title2",2));
        Author author = new Author();
        author.setName( "Ahmaha");
        books.forEach(author::addBook);
        authorRepository.save(author);
    }
}
