package org.example.service;

import org.example.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter-based dependency injection
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    public void showBook() {
//        System.out.println("Book title: " + bookRepository.getBookTitle());
//    }
    //we already used above example in exercise-1 so we are using different scenario here for exercise-2 Dependency Injection

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public String getRecommendedBook() {
        return bookRepository.findBook();
    }
}
