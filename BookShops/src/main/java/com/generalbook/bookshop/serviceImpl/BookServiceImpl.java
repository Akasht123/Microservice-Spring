package com.generalbook.bookshop.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generalbook.bookshop.entity.Book;
import com.generalbook.bookshop.exception.ResourceNotFound;
import com.generalbook.bookshop.repository.BookRepository;
import com.generalbook.bookshop.service.BookService;
@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookrepository;
	
	@Override
	public Book savebook(Book book) {
		// TODO Auto-generated method stub
		return bookrepository.save(book);
		
		
	}

	@Override
	public Book findsinglebook(String id) {
		// TODO Auto-generated method stub
		return bookrepository.findById(id).orElseThrow(()-> new ResourceNotFound("book", "Id", id));
	}

	@Override
	public List<Book> findallbook() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}

	@Override
	public void deletebook(String id) {
		// TODO Auto-generated method stub
	 bookrepository.deleteById(id);
	}

	@Override
	public Book updatebook(Book book, String id) {
		// TODO Auto-generated method stub
		Book oldbook=bookrepository.findById(id).orElseThrow(()-> new ResourceNotFound("book", "Id", id));
		
		oldbook.setAuther(book.getAuther());
		oldbook.setName(book.getName());
		oldbook.setPrice(book.getPrice());
		return oldbook;
	}

	
	
}
