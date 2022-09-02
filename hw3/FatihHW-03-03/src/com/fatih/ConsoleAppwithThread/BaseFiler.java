package com.fatih.ConsoleAppwithThread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract public class BaseFiler<E> {
	protected String filePath;
	public final static String DELIMETER=";";
	
	public BaseFiler(String filePath) {
		this.filePath = filePath;
	}
	public void store(List<E> entityList ) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter(filePath));

		for (E entity : entityList) {
			String line =format(entity);
			bw.write(line);
			bw.write("\r\n");
			
			
		}
		
		bw.close();
	}
	public List<E> load() throws IOException{
		List<E> entityList=new ArrayList<>();
		BufferedReader br=new BufferedReader(new FileReader(filePath));
		String line=null;
		
		while((line=br.readLine())!=null) {
			Supplier supplier = parse(line);
			entityList.add((E) supplier);
			
			
		}
           
		
		
		
		br.close();
		
		return entityList;
	}
	protected abstract Supplier parse(String line);
	protected abstract String format(E entity);
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
	
}
