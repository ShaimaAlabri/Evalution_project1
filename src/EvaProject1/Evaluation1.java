package EvaProject1;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;



public class Evaluation1 {

	public static void main(String[] args) {
		try {

			Document document = new Document();

			PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\EvalutinProject1\\Evalution.pdf"));
			document.open();
			document.add(new Paragraph("Hello"));
			document.close();

		
		}catch(Exception e) {
			System.out.println(e);	
			
	}System.out.println("itest PDF program executed");
		

	}
}



	

