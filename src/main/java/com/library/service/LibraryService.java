package com.library.service;

import com.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {
    private List<Book> books = new ArrayList<>();

    public String addBook(Book book) {
        books.add(book);
        return "Book added successfully!";
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public String deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
        return "Book deleted successfully!";
    }
}
