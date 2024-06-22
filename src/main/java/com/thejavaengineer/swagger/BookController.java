package com.thejavaengineer.swagger;

import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.thejavaengineer.swagger.api.BooksApi;
import org.thejavaengineer.swagger.api.model.Book;

import java.util.List;
import java.util.Optional;

public class BookController implements BooksApi {

    @Override
    public ResponseEntity<Book> addBook(Book book) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteBook(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> findAllAvailableBooks() {
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> findAllBooks() {
        return null;
    }

    @Override
    public ResponseEntity<List<Book>> findBookByGenre(String genre) {
        return null;
    }
}
