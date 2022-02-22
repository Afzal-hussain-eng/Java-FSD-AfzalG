package com.Afzal.Lesson1.AccessSpecifier;
class defAccessSpecifier
{ 
 void display() 
 { 
 System.out.println("You are using defalut access specifier"); 
 } 
}
public class aS_1 {
	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 
		 obj.display(); 
		}
		}
/*OUTPUT
Default Access Specifier
You are using defalut access specifier
*/