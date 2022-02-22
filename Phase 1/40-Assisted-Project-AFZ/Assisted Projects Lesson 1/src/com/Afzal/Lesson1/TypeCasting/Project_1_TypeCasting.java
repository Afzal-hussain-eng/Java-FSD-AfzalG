package com.Afzal.Lesson1.TypeCasting;


import java.util.Scanner;

//Write a program which will take a string as input and will convert it into other primitive data types.

public class Project_1_TypeCasting {

	public static void main(String[] args) {
		//Perform implicit Type casting
		System.out.println("Implicit Type Casting\n  ");
		
		//Taking the user input 
		System.out.println("Enter the charactor value");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		System.out.println("The given character is "+ch);
		
		//converting character value into integer
		int i = ch;
		
		System.out.println("The integer value of the given character "+ch+" is "+i);
		
		//converting character value into float
		
		float f = ch;
		
		System.out.println("The float value of the given character "+ch+" is "+f);
		
		//converting character value into long
		
		long l = ch;
		
		System.out.println("The long value of the given character "+ch+" is "+l);
	
		//converting character value into double 
		double d = ch;
		
		System.out.println("The double value of the given character "+ch+" is "+d);
		
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting\n");
		
		//Taking the user input 
		System.out.println("Enter the double value\n");
		
		Scanner sc2 = new Scanner(System.in);
		
		double doubl = sc2.nextDouble();
		
		//converting double into integer
		int in= (int)doubl;
		
		System.out.println("The Integer value of the given double number "+doubl+" is "+in);
		
		//converting double into float
		float fl =(float)doubl;
		
		System.out.println("The float value of the given double number "+doubl+" is "+fl);
		
		//converting double into long
		long lg=(long)doubl;
		
		System.out.println("The float value of the given double number "+doubl+" is "+lg);
		
		//converting double into long
		char cr=(char)doubl;
		
		System.out.println("The float value of the given double number "+doubl+" is "+cr);
	}

}
/*OUTPUT
Implicit Type Casting
  
Enter the charactor value
A//input
The given character is A
The integer value of the given character A is 65
The float value of the given character A is 65.0
The long value of the given character A is 65
The double value of the given character A is 65.0


Explicit Type Casting

Enter the double value

65.9//input
The Integer value of the given double number 65.9 is 65
The float value of the given double number 65.9 is 65.9
The float value of the given double number 65.9 is 65
The float value of the given double number 65.9 is A

*/