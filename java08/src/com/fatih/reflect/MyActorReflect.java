package com.fatih.reflect;

import java.lang.reflect.*;

public class MyActorReflect {
	public static void main(String[] args) throws Exception {
		Class<?> clazz=Class.forName("com.fatih.source.MyActor");
	
	Constructor constructor =clazz.getConstructor();
	
	Object object=constructor.newInstance();
	
	for (Method method: clazz.getDeclaredMethods()) {
		System.out.println(method.getReturnType().getName()+" ");
		System.out.println(method.getName()+" ");
		for(Parameter parameter : method.getParameters()) {
			System.out.println(parameter.getType()+" "+parameter.getName()+" ");
		}
		System.out.println();

	}
	Method processMethod=clazz.getMethod("process");
	processMethod.invoke(object);
	
	Class<?>[] parameterTypes= {int.class,String.class,double.class};
	Method transformMethod=clazz.getMethod("transform",parameterTypes);
	Object result =transformMethod.invoke(object,123,"Godoro",98.76);
	System.out.println("Sonuç "+result);
	
	

	}
	

}
