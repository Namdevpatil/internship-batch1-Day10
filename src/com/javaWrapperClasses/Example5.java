package com.javaWrapperClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example5 {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1100);
		list.add(2200);
		list.add(1019);
		//list.add(true);
		
		
		Iterator<Integer> iterator = list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
