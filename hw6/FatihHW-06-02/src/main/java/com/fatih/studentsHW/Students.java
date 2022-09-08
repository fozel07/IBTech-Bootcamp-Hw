package com.fatih.studentsHW;



import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import static com.fatih.studentsHW.XmlUtilities.*;

public class Students {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String path="C:\\Users\\fatbj\\IbtecProjeler\\Students.xml";
		Document document=XmlUtilities.parse(path);
		
		Element exam=document.getDocumentElement();
	

	    NodeList students =exam.getElementsByTagName("student");
	    for (int i = 0; i < students.getLength(); i++) {
	    	Element student=(Element) students.item(i);
	    	
	    	String id= getAttribute(student, "id", "0");
	    	String name=getSingleElementText(student, "name", "");
	    	String mark=getSingleElementText(student, "mark", "0");
	    	System.out.println("Öğrenci id'si: "+id+"\n"+"Öğrenci adı: "+name+"\n"+"Öğrenci notu: "+mark);
	    	
	    	
	    	
			
		}
		
		
	}

}
