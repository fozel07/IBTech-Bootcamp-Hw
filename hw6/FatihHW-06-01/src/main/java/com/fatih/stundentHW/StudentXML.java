package com.fatih.stundentHW;

import static com.fatih.stundentHW.XmlUtilities.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;



public class StudentXML {
	
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
	// JAXP
			String path="C:\\Users\\fatbj\\IbtecProjeler\\Student.xml";
			Document document=XmlUtilities.parse(path);
			
			// DOM
			Element student=document.getDocumentElement();
			Long id=getAttribute(student,"id", 0);
			System.out.println("id "+id);
			
			String name=getSingleElementText(student,"name","");
			System.out.println("Ad: "+name);
			Double mark=getSingleElementText(student,"mark",0);
			System.out.println("Notu :"+mark);
	
	
	
	}	
}
