package com.dxc.desafio.service;

import javax.jws.WebService;

import in.benchresources.entities.book.BookNameRequestType;
import in.benchresources.entities.book.BookRequestType;
import in.benchresources.entities.book.BookResponseType;
import in.benchresources.services.bookservice.IBookService;

@WebService(serviceName="BookService", endpointInterface="in.benchresources.services.bookservice.IBookService",
targetNamespace="http://benchresources.in/services/BookService/", portName="BookServicePort", name="BookServiceImpl")
public class BookServiceImpl implements IBookService {

	@Override
	public BookResponseType getBookByISDNRequestNumber(BookRequestType parameters) {

		BookResponseType bookResponseType = new BookResponseType();
		bookResponseType.setBookISBN(parameters.getIsbnNumber());
		bookResponseType.setBookName("Livro ABC");
		bookResponseType.setAuthor("Autor ABC");
		bookResponseType.setCategory("Categoria ABC");
		return bookResponseType;
	}

	@Override
	public BookResponseType getBookDetailsByBookName(BookNameRequestType parameters) {
		BookResponseType bookResponseType = new BookResponseType();
		bookResponseType.setBookName(parameters.getBookName());
		bookResponseType.setBookISBN("1");
		bookResponseType.setAuthor("Autor ABC");
		bookResponseType.setCategory("Categoria ABC");
		return bookResponseType;
	}


}