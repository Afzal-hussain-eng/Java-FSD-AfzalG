package com.Afzal.Lesson2.Arrays;
//Writing a program in Java to verify implementation of arrays

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		//single-dimensional array
		
		int array1[]= {1,2,3,4,5,6,7,8,9};
		for(int index=0;index<9;index++) {
		System.out.println("Elements of array1 : "+array1[index]);
		}
		//multidimensional array
		int[][] array2 = {
		 {6, 4, 2, 0, 5}, 
		 {1, 3, 5 ,7 ,9, 8} };
		 System.out.println("\nLength of row 1 : " + array2[0].length);
	}
		 }
	
/*OUTPUT
Elements of array1 : 1
Elements of array1 : 2
Elements of array1 : 3
Elements of array1 : 4
Elements of array1 : 5
Elements of array1 : 6
Elements of array1 : 7
Elements of array1 : 8
Elements of array1 : 9

Length of row 1 : 5
*/	
