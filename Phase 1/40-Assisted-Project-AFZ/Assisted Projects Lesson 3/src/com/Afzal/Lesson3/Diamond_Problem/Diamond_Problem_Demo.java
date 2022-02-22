package com.Afzal.Lesson3.Diamond_Problem;
interface First 
{ 
 default void show() 
 { 
 System.out.println("Default First..."); 
 } 
} 
interface Second 
{ 
 default void show() 
 { 
 System.out.println("Default Second...."); 
 } 
} 
public class Diamond_Problem_Demo implements First, Second {
	 
		 public void show() 
		 { 
		 First.super.show(); 
		 Second.super.show(); 
		 } 
		 public static void main(String args[]) 
		 { 
		 Diamond_Problem_Demo ob = new Diamond_Problem_Demo(); 
		 ob.show(); 
		 } 
		}
/*OUTPUT
Default First...
Default Second....
*/	