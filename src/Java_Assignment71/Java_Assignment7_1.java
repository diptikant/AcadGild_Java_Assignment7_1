package Java_Assignment71;
/*
 * This class will help to master the concepts String class and Methods of String class
 * Problem Statement:
 *  Write a program to convert an int variable to String using an inbuilt function of String class
 */

public class Java_Assignment7_1 
{	
	public static void main(String[] args) 
	{
		int i=200;  //initialization of int variable with value 200
		String s=String.valueOf(i);  //converting the value of int i into string
		System.out.println("Value of string S: " + s);//Displaying the value of string s
		System.out.println("Value of i+100 : "+(i+100));//300 because + is binary plus operator		
		System.out.println("Value of s+100 : "+(s+100));//200100 because + is string concatenation operator  

	}

}
