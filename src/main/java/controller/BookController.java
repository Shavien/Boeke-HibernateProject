package controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import service.BoekService;

import java.awt.print.Book;
import java.util.List;

@Path("book")
public class BookController {
    private final BoekService bookService;

    public BookController(BoekService bookService) {
        this.bookService = bookService;
    }

    @Path("/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> findAll() {
        return bookService.BookList();
    }
}