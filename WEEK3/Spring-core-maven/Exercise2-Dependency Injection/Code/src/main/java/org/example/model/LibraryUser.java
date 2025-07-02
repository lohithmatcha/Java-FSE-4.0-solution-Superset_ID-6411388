package org.example.model;

import org.example.service.BookService;

public class LibraryUser {
    private BookService bookService;

    // Constructor-based injection
    public LibraryUser(BookService bookService) {
        this.bookService = bookService;
    }

    public void showRecommendation() {
        System.out.println("User's recommended book: " + bookService.getRecommendedBook());
    }
}
