package com.library.controller;

import com.library.model.Book;
import com.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book) {
        return libraryService.addBook(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return libraryService.getAllBooks();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        return libraryService.deleteBook(id);
    }
}
