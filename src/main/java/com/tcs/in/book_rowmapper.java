package com.tcs.in;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class book_rowmapper implements RowMapper{

	@Override
	public book mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		
		book b = new book();
		
		b.setId(rs.getInt(1));
		b.setName(rs.getString(2));
		b.setPrice(rs.getInt(3));
		
		return b;
		
	}

	

	

}
