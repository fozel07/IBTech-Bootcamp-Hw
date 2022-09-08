package com.fatih.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import com.fatih.utils.StreamUtilities;

public class PostClient {
	public static void main(String[] args) throws Exception {
		String address="http:localhost:8080/Project04/post";
		String input = StreamUtilities.post(address);
		System.out.println("Girdi: ");
		System.out.println(input);
	}


	
	

}
