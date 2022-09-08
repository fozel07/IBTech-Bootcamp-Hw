package com.fatih.generatedHW;

import static com.fatih.generatedHW.XmlUtilities.*;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Generated {
	
	public static void main(String[] args) throws ParserConfigurationException, IOException, TransformerException {
		
		
		Document document = create("student");
		Element student = document.getDocumentElement();
		student.setAttribute("id", "601");

		addSingleElementText(document, student, "name", "Yıldırım Gürses");
		addSingleElementText(document, student, "mark", 2.7);

		
		String path = "C:\\Users\\fatbj\\IbtecProjeler\\Generated.xml";
		dump(document,path);
	}

}
