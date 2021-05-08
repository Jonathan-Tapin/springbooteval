package fr.mds.tapinj.springbooteval.controllers;

import fr.mds.tapinj.springbooteval.entities.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(BookController.BASE_ROUTE)
public class BookController extends BaseCrudController<Book, Book> {
	
	public static final String TEMPLATE_NAME = "books";
    public static final String BASE_ROUTE = "books";
    
    public BookController() {
    	super(TEMPLATE_NAME);
    }

}
