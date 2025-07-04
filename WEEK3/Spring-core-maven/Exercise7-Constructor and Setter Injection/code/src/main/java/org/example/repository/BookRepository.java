package org.example.repository;

import org.example.model.Book;

public class BookRepository {
    public Book getBook() {
        return new Book("The Great Gatsby");
    }
}
