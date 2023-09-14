package com.wouterlefever.stackoverflow.projection.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int pages;

    @ManyToOne
    @JoinColumn(name ="author_id")
    private Author author;

    public Book(String title1, int i) {
        this.title=title1;
        this.pages=i;
    }
}