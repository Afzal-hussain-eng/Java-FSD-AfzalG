package com.Afzal.Lesson3.Try_Catch;

public class Try_Catch_Demo {
	 public static void main(String args[]) {
		 int[] array = new int[3];
	try {
		 array[8] = 9;
		 }catch (ArrayIndexOutOfBoundsException e){
			 System.out.println("Array index is out of bounds!"); 
		 }finally{
			 System.out.println("The array is of size " + array.length);
		 	}
	 	}
	}
/*OUTPUT
Array index is out of bounds!
The array is of size 3
*/