package com.tcs.in;

import java.io.FileNotFoundException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itextpdf.text.DocumentException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, DocumentException {
	
	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");

	Book_service b = ctx.getBean(Book_service.class);
	
	b.generate_pdf();
	
	}

}
