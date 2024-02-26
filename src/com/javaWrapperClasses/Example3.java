package com.javaWrapperClasses;

public class Example3 {

	public static void main(String[] args) {
		
		
		//converting Object type to primitive type:  unboxing
		Integer objectTypeValue = Integer.valueOf(5678);
		
		int primitiveValue = objectTypeValue.intValue();
		
		System.out.println(primitiveValue);

	}

}
