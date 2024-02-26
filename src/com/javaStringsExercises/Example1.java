package com.javaStringsExercises;

public class Example1 {

	public static void main(String[] args) {
		
		
		/**
		 * Write a java program to print the upper case and lower case letters count in a given string.
		 * The string is "Java StringS ExercIses".
		 */
		
		String text = "Java StringS ExercIses";
		
		//System.out.println(Character.isUpperCase(text.charAt(0)));
		
		//System.out.println(Character.isLowerCase(text.charAt(1)));
		
		char words[] = text.toCharArray();
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		
		for(int i = 0; i < words.length; i++)
		{
			if(Character.isUpperCase(text.charAt(i)))
			{
				upperCaseCount++;
			}
			else if(Character.isLowerCase(text.charAt(i)))
			{
				lowerCaseCount++;
			}
		}
		
		System.out.println("Upper Case words count: "+upperCaseCount);
	
		System.out.println("Lower Case words count: "+lowerCaseCount);

	}

}
