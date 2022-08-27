package com.fatih.io;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class Writer {
	
	public static void main(String[] args) throws Exception {
		
		
		
		String path="C:\\Users\\fatbj\\IbtecProjeler\\in.txt";	
		BufferedWriter bw=new BufferedWriter(new FileWriter(path));
		bw.write("Java\r\n");
		bw.write("JDBC\r\n");
		bw.write("JAXP\r\n");
		bw.write("JSON-P\r\n");
		bw.write("JSON\r\n");
		
		bw.close();
		
		
		
	}
	
	

}
