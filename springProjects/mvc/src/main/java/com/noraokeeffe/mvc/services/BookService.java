package com.noraokeeffe.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.noraokeeffe.mvc.models.Book;
import com.noraokeeffe.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	// returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    public Book updateBook(Long id,String title, String desc, String lang, int pages) {
    	Book book = findBook(id);
    	book.setTitle(title);
    	book.setDescription(desc);
    	book.setLanguage(lang);
    	book.setNumberOfPages(pages);
    	bookRepository.save(book);
    	return book;
    }
    public void deleteBook(Long id) {
    	Book book = findBook(id);
    	bookRepository.delete(book);
    }
	
};

