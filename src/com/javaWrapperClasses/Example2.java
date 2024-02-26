package com.javaWrapperClasses;

public class Example2 {

	public static void main(String[] args) {
		
		
		int employeeId = 567898;
		
		//Integer objectTypeValue = employeeId;
		
		//converting primitive value to Object type: auto boxing
		Integer objectTypeValue = Integer.valueOf(employeeId);
		
		System.out.println(objectTypeValue);

	}

}
