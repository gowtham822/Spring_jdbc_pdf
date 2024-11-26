package com.tcs.in;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.log.SysoCounter;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf_write {

	public void create_pdf(List<book> data) throws FileNotFoundException, DocumentException {
		Document doc = new Document();

		PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\gowtham\\OneDrive\\Desktop\\bookdata\\data.pdf"));

		doc.open();

		Paragraph preface = new Paragraph("Book List");

		preface.setAlignment(Element.ALIGN_CENTER);

		doc.add(preface);

		doc.add(new Paragraph("  "));

		PdfPTable tab = new PdfPTable(3);

		PdfPCell c1 = new PdfPCell(new Phrase("Book id"));

		tab.addCell(c1);

		c1 = new PdfPCell(new Phrase("Book name"));

		tab.addCell(c1);

		c1 = new PdfPCell(new Phrase("Book Price"));

		tab.addCell(c1);

		tab.setHeaderRows(1);

		for (book B : data) 
		
		{
			String a = String.valueOf(B.getId());
			tab.addCell(a);

			tab.addCell(B.getName());

			String b = String.valueOf(B.getPrice());

			tab.addCell(b);
		}

		doc.add(tab);

		doc.close();
	}

}
