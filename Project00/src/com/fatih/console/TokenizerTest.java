package com.fatih.console;

import java.util.StringTokenizer;

public class TokenizerTest {
	
	public static void main(String[] args) {
		String string="java, JDBC, JAXB, JSON-p, JAX-WS";
		for (String token : string.split(", ")) {
			System.out.println("* "+token);		
		}
		StringTokenizer tokenizer=new StringTokenizer(string," ,:;.",true);
		while(tokenizer.hasMoreTokens()) {
		String token=tokenizer.nextToken();
		System.out.println("# "+token);
		
		}
		
		
		
	}

}
