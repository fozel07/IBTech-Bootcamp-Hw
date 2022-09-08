package com.fatih.xml;

import static com.fatih.xml.XmlUtilities.*;

import java.io.File;
import java.io.FileWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlCreate {
	public static void main(String[] args) throws Exception {
		Document document = create("employee");
		Element employee = document.getDocumentElement();
		employee.setAttribute("id", "401");

		addSingleElementText(document, employee, "name", "Neşet Ertaş");
		addSingleElementText(document, employee, "salary", 9845);

		long id = getAttribute(employee, "id", 0);
		String name = getSingleElementText(employee, "name", "");
		System.out.println("Ad:" + name);
		Double salary = getSingleElementText(employee, "salary", 0);
		System.out.println("Eder :" + salary);
		System.out.println(+id + " " + name + " " + salary);

		String path = "C:\\Users\\fatbj\\IbtecProjeler\\Dump.xml";
		dump(document,path);
		

	}

}
