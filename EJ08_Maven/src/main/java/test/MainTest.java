package test;

import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import modelo.entidad.Coche;

public class MainTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		Coche coche1 = new Coche("5631ABC","Renault","Scenic",100000);
		Coche coche2 = new Coche("3356CHJ","Ssan Yong","Rodius",300000);
		Coche coche3 = new Coche("5631ABC","Seat","Ibiza",200000);
		Coche coche4 = new Coche("1456ADF","Peugeot","306",200000);
		
		
		System.out.println("¿Que deseas hacer?");
		System.out.println("--1 dar un coche de alta");
		System.out.println("--2 dar un coche de baja");
		System.out.println("--3 modificar un coche");
		System.out.println("--4 listar los coches");
		System.out.println("--5 exportar a BBDD");
		
		int opcion = teclado.nextInt();;
		
		
		switch (opcion) {
		case 1: {
			coche4.addCoche(coche4);
			break;
		}
		case 2: {
			coche1.delCoche(coche1);	
			break;
		}
		case 3: {
			coche1.modCoche(coche3);	
			break;
		}
		case 4: {
			coche1.listCoches(coche1);	
			break;
		}
		case 5: {
			PDDocument documento = new PDDocument();
			PDPage pagina = new PDPage(PDRectangle.A6);			
			documento.addPage(pagina);
			PDPageContentStream contenido = new PDPageContentStream(documento, pagina);
			
			contenido.beginText();
			contenido.setFont(PDType1Font.COURIER, 10);
			contenido.newLineAtOffset(20, pagina.getMediaBox().getHeight()-52);
			contenido.showText(coche1.listCoches(coche1));
			contenido.endText();
			contenido.close();
			documento.save("maven-java-example.pdf");
			
			
			break;
		}
		default:
			break;
		}
		

	
	}

}
