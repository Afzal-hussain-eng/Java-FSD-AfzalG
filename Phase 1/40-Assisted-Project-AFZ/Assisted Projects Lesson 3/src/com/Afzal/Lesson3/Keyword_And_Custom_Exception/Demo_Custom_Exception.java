package com.Afzal.Lesson3.Keyword_And_Custom_Exception;
class MyException extends Exception 
	{ 
 public MyException(String s) 
 	{ 
 super(s); 
		} 
	} 
public class Demo_Custom_Exception {
	
		 public static void main(String args[]) 
		 	{ 
		 try
		 { 
		 throw new MyException("throw"); 
		 	} 
		 catch (MyException ex) 
		 { 
		 System.out.println("Caught"); 
		 System.out.println(ex.getMessage()); 
		 		} 
		 	} 
		}
/*OUTPUT
Caught
throw
*/