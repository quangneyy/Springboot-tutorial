package com.tutorial.apidemo.Springboot.tutorial.controllers;

import com.tutorial.apidemo.Springboot.tutorial.models.Book;
import com.tutorial.apidemo.Springboot.tutorial.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping(path = "/api/v1/Products")
//public class BookController {
//    private
//    @GetMapping("")
//        // this request is: http://localhost:8080/api/v1/Books
//    List<Book> getAllProducts() {
//        return List.of(
//
//        );
//        // You can also send request using Postman
//    }
//}
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAll() {
        return bookService.getAll();
    }
    @GetMapping("/books/{id}")
    public Book get(@PathVariable int id) {
        return bookService.get(id);
    }
    @PostMapping("/books")
    public Book create(@RequestBody Book book) {
        bookService.add(book);
        return book;
    }
    @DeleteMapping("/books/{id}")
    public void delete(@PathVariable int id) {
        bookService.remove(id);
    }

    public class SearchController{
        @Autowired
        private BookService bookService;
        @GetMapping("/search")
        public List<Book>
        search(@RequestParam String key){
            return bookService.search(key);
        }
    }
}
