package com.fatih.reflect;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;


public class MyBeanReflect {
	
	public static void main(String[] args) throws Exception {
		Class<?> clazz=Class.forName("com.fatih.source.MyBean");
		
		Constructor<?> constructor =clazz.getConstructor();
		
		
		
		List<String> propertyNames=new ArrayList<>();
		for(Method method : clazz.getDeclaredMethods()) {
			if(method.getName().startsWith("get") && method.getParameterCount()==0) {
				
				System.out.println(method.getName()+" ");
				String sub=method.getName().substring(3);
				String property=Character.toLowerCase(sub.charAt(0))+sub.substring(1);
				propertyNames.add(property);
			}
			System.out.println();
		}
		
		for(String propertyName : propertyNames) {
			System.out.print(propertyName+" ");
			String get="get"+Character.toUpperCase(propertyName.charAt(0))+propertyName.substring(1);
			
			Method getter=clazz.getMethod(get);
			System.out.print(getter.getName()+" ");
			String set="set"+Character.toUpperCase(propertyName.charAt(0))+propertyName.substring(1);
			System.out.println(set);
			Class<?> parameterTyper[]= {getter.getReturnType()};
			Method setter=clazz.getMethod(set,parameterTyper);
			System.out.print(setter.getName()+" ");
			System.out.println();
		}
		Object object=constructor.newInstance();
		String propertyName="myValue";
		String title=Character.toUpperCase(propertyName.charAt(0))+propertyName.substring(1);
		String get="get"+title;
		Method getter=clazz.getMethod(get);
		String set="set"+title;
		Class<?> parameterTypes[]= {getter.getReturnType()};
		Method setter=clazz.getMethod(set, parameterTypes);
		
		Object arg[]= {98.76};
		setter.invoke(object, args);
		Object result=getter.invoke(object);
		System.out.println("Sonuç "+result);
		
		
		
		
		
		
	}

}
