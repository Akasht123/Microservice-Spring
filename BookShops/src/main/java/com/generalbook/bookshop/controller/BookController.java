package com.generalbook.bookshop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generalbook.bookshop.entity.Book;
import com.generalbook.bookshop.serviceImpl.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	private BookServiceImpl bookserviceimpl;
	@PostMapping
	public ResponseEntity<Book> savebook(@RequestBody Book book){
		
		return new ResponseEntity<Book>(bookserviceimpl.savebook(book), HttpStatus.CREATED);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Book> findbook(@PathVariable("id") String id){
		
		return new ResponseEntity<Book>(bookserviceimpl.findsinglebook(id), HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> findallbook(){
		
		return new ResponseEntity<List<Book>>(bookserviceimpl.findallbook(), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Book> updatebook(@RequestBody Book book ,@PathVariable String  id){
		
		return new ResponseEntity<Book>(bookserviceimpl.updatebook(book, id), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deletebook(@PathVariable String  id){
		bookserviceimpl.deletebook(id);
		return new ResponseEntity<String>("Book deleted",HttpStatus.OK);
	}

}
