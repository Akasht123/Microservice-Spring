package com.generalbook.bookshop.service;

import java.util.List;
import java.util.Optional;

import com.generalbook.bookshop.entity.Book;

public interface BookService {
	
	Book savebook(Book book);
	
	Book findsinglebook(String id);
	
	List<Book> findallbook();
	
	void deletebook(String id);
	
	Book updatebook(Book book , String id);

}
