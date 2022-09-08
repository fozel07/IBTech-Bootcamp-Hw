package com.fatih.xml;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import static com.fatih.xml.XmlUtilities.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlBuild {
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		// JAXP
		String path="C:\\Users\\fatbj\\IbtecProjeler\\Product.xml";
		Document document=XmlUtilities.parse(path);
		
		// DOM
		Element product=document.getDocumentElement();
		Long id=getAttribute(product,"id", 0);
		System.out.println(id);
		
		String name=getSingleElementText(product,"name","");
		System.out.println("Ad:"+name);
		Double price=getSingleElementText(product,"price",0);
		System.out.println("Eder :"+price);
		
		
		
		
	}

}
