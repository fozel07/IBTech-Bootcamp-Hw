package com.fatih.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class StreamUtilities {
	
	public static String read(InputStream in) throws IOException
    {
		BufferedReader reader=new BufferedReader(new InputStreamReader(in,"UTF-8"));
		String line;
		StringBuilder builder=new StringBuilder();
		while((line=reader.readLine())!=null) {
			builder.append(line).append("\r\n");
		}
		reader.close();
		String text =builder.toString();
		
		return text;				
	}
	public static String get(String address) throws Exception{
		URL url=new  URL(address);
		URLConnection connection=url.openConnection();
		InputStream in=connection.getInputStream();
        String str=read(in);
		return str;
		
	}
	public static String post(String address)
			throws MalformedURLException, IOException, UnsupportedEncodingException, Exception {
		URL url=new URL(address);
		
		URLConnection connection=url.openConnection();
		connection.setDoInput(true);
		connection.setDoOutput(true);
		

		StreamUtilities.write(connection.getOutputStream());
		
		String input=StreamUtilities.read(connection.getInputStream());
		return input;
	}
	public static void write(OutputStream out) throws UnsupportedEncodingException, IOException{
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(out));
		writer.write("Oldu");
		writer.flush();
		writer.close();
		out.flush();
		out.close();
	}
	
	

}
