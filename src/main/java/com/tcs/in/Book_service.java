package com.tcs.in;

import java.io.FileNotFoundException;
import java.util.List;

import com.itextpdf.text.DocumentException;

public class Book_service {
	
	private Book_dao_I book_dao;

	public void setBook_dao(Book_dao_I book_dao) 
	
	{
		this.book_dao = book_dao;
	}
	
     public void generate_pdf() throws FileNotFoundException, DocumentException
     {
    	 List<book> data = book_dao.get_book_data();
    	 
    	 
    	 
    	 Pdf_write p = new Pdf_write();
    	 
    	 p.create_pdf(data);
     }
            
}
