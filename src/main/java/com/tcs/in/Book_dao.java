package com.tcs.in;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Book_dao implements Book_dao_I {
	
	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public List<book> get_book_data()
	{
		String sql = "select * from book_data.book;";
		
		List<book> book = template.query(sql, new book_rowmapper());
		
		return book;
	}

}
