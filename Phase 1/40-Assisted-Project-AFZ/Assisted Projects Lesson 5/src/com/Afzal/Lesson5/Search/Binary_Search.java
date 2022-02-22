package com.Afzal.Lesson5.Search;

import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args){
		System.out.println("The Array list is listed below \n");
		 int arr[] = { 3, 6, 9, 12, 15, 20, 24, 59 };
		 for(int i=0;i<arr.length;i++){
			 System.out.print(arr[i]+" ");
			 }
		 Scanner s = new Scanner(System.in);
		 System.out.println("\n\nEnter the value you want to search ");
		 int key = s.nextInt();
		 int arrlength = arr.length;
		 BinarySearch(arr,0,key,arrlength);
		 	}
	public static void BinarySearch(int[] arr, int start, int key, int length){
		 int midValue = (start+length)/2;
		 	while(start<=length){
		 		if(arr[midValue]<key){
		 			start = midValue + 1;
		 		} else if(arr[midValue]==key){
		 			System.out.println("Element is found at index :"+midValue);
		 			break;
		 		}else {
		 			length=midValue-1;
		 		}
		 		midValue = (start+length)/2;
		 }
		 	if(start>length){
		 		System.out.println("Element is not found");
		 }
	}
}
/*OUTPUT
 * 1
The Array list is listed below 

3 6 9 12 15 20 24 59 

Enter the value you want to search 
15
Element is found at index :4

 *2
The Array list is listed below 

3 6 9 12 15 20 24 59 

Enter the value you want to search 
5
Element is not found

*/