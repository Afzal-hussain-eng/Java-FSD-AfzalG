package com.Afzal.Lesson5.Search;
import java.util.Scanner;
public class Linear_Search {
	 public static void main(String[] args){
		 int[] arr = {10,20,30,40,50,60,70,80,90};
		 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the element to be searched");
		 	int searchValue = sc.nextInt();
		 	int result = (int) linearing(arr,searchValue);
		 if(result==-1){
	 System.out.println("Element not in the array");
		 } else {
	 System.out.println("Element found at "+result+" and the search key is "+arr[result]);
		 	}
		 }
	public static int linearing(int arr[], int x) {
		 int arrlength = arr.length;
	for (int i = 0; i < arrlength - 1; i++) {
		 if (arr[i] == x) {
		 return i;
		 }
	 }
		 return -1;
	 }
}
/*OUTPUT
 * 1
Enter the element to be searched
10
Element found at 0 and the search key is 10

 *2
Enter the element to be searched
35
Element not in the array

*/
