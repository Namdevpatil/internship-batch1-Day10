package com.javaStringsExercises;

public class Example2 {

	public static void main(String[] args) {
		
		
		/**
		 * Write a java program to print the whitespace characters and numbers count in a given string.
		 * The string is "ramakrisha1990.net@gmail.com".
		 */
		
		String text = "Hello Guys this is my mail id, ramakrisha1990.net@gmail.com";
		
		//System.out.println(Character.isDigit(text.charAt(10)));
		//System.out.println(Character.isWhitespace(text.charAt(5)));
		
		char words[] = text.toCharArray();
		
		int digits=0;
		int whiteSpace=0;
		
		for(int i = 0; i < words.length; i++)
		{
			
			if(Character.isDigit(text.charAt(i)))
			{
				digits++;
			}
			else if(Character.isWhitespace(text.charAt(i)))
			{
				whiteSpace++;
			}
			
		}
		
		System.out.println("digits count in a string: "+digits);
		System.out.println("white space count in a string: "+whiteSpace);

	}

}
