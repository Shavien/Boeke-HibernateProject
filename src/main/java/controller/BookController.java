package controller;

import entities.Boek;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import service.BoekService;

import java.util.List;

@Path("book")
public class BookController {
    private final BoekService bookService = new BoekService();

   /* public BookController(BoekService bookService) {
        this.bookService = bookService;
    }*/

    @GET
    @Produces("text/plain")
    public String hello(){
        return "Hello World!";
    }

    @Path("/get")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Boek> findAll() {
        return bookService.bookList();
    }
}