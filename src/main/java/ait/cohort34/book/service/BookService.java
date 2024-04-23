package ait.cohort34.book.service;

import ait.cohort34.book.dto.AuthorDto;
import ait.cohort34.book.dto.BookDto;
import ait.cohort34.book.dto.PublisherDto;

public interface BookService {
    Boolean eddBook(BookDto bookDto);
    BookDto findBookByIsbn(String isbn);
    BookDto removeBookByIsbn(String isbn);
    BookDto updadteBookByTitle( String isbn, String title);
    BookDto[] findBooksByAuthor(String author);
    BookDto findBookByPublisher(PublisherDto publisher);
    AuthorDto findAuthorByIsbn(String isbn);
    PublisherDto findPublisherByAuthor(String author);
    AuthorDto deleteAuthor(AuthorDto authorDto);
}
