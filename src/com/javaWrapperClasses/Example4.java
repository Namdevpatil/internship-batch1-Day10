package com.javaWrapperClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example4 {

	public static void main(String[] args) {
		
		
		List list = new ArrayList<>();
		
		list.add(new Student(101, "Kiran"));
		list.add(new Student(102, "Raj"));
		list.add(1019);
		list.add(890.67);
		list.add(true);
		list.add("Hello");
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
