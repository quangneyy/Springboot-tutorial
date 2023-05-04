package com.tutorial.apidemo.Springboot.tutorial.service;

import com.tutorial.apidemo.Springboot.tutorial.models.Book;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    private List<Book> listBook = new ArrayList<>(Arrays.asList(
            new Book(1, "Lap trinh ne", "Nguyen van A", 44324L),
            new Book(2, "Lap trinh C", "Nguyen Van B", 44324L),
            new Book(3, "Lap trinh Js", "Nguyen Van c", 44324L)));

    public List<Book> getAll(){
        return listBook;
    }
    public Book get(int id) {
        var findBook = listBook.stream().filter(p->p.getId()==id).findFirst().orElse(null);
        if(findBook == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return findBook;
    }
    public void add(Book newbook) {
        var maxId = listBook
                .stream()
                .mapToInt(v->v.getId())
                .max().orElse(0);
        newbook.setId(maxId + 1);
        listBook.add(newbook);
    }
    public void remove(int id) {
        var findBook = listBook.stream().filter(p->p.getId()==id).findFirst().orElseThrow();
        listBook.remove(findBook);
    }
    public List<Book> search(String key) {
        return listBook.stream().filter(p->p.getAuthor().toLowerCase().contains(key)||p.getTitle().toLowerCase().contains(key)).toList();
    }
}
