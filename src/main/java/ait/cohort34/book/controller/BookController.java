package ait.cohort34.book.controller;

import ait.cohort34.book.dto.AuthorDto;
import ait.cohort34.book.dto.BookDto;
import ait.cohort34.book.dto.PublisherDto;
import ait.cohort34.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@RequiredArgsConstructor
public class BookController {

    //private final BookService bookService;

    @PostMapping("/book")
    public Boolean eddBook(@RequestBody BookDto bookDto) {
        return null;
    }

    @GetMapping("/book/{isbn}")
    public BookDto findBookByIsbn(@PathVariable String isbn) {
        return null;
    }

    @DeleteMapping("/book/{isbn}")
    public BookDto removeBookByIsbn(@PathVariable String isbn) {
        return null;
    }

    @PutMapping("/book/{isbn}/title/{title}")
    public BookDto updadteBookByTitle(@PathVariable String isbn, @PathVariable String title) {
        return null;
    }

    @GetMapping("/books/author/{author}")
    public BookDto[] findBooksByAuthor(@PathVariable String author) {
        return new BookDto[0];
    }

    @GetMapping("/books/publisher/{publisher}")
    public BookDto findBookByPublisher(@PathVariable PublisherDto publisher) {
        return null;
    }

    @GetMapping("/authors/book/{isbn}")
    public AuthorDto findAuthorByIsbn(@PathVariable String isbn) {
        return null;
    }

    @GetMapping("/publishers/author/{author}")
    public PublisherDto findPublisherByAuthor(String author) {
        return null;
    }

    @DeleteMapping("/author/{author}")
    public AuthorDto deleteAuthor (@RequestBody AuthorDto author) {
        return null;
    }
    //final BookService bookService;
}
