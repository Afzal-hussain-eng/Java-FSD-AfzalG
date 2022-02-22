package com.Afzal.Lesson5.Search;
import java.util.Arrays;
import java.util.Scanner;
public class Exponential_Search {
	public static void main(String[] args){
		System.out.println("The Array list is listed below \n");
			int[] arr = {1,4,3,7,8,6,420,786,840,568,895};
			int length= arr.length;
			 for(int i=0;i<arr.length;i++){
				 System.out.print(arr[i]+" ");
				 }
			Scanner s = new Scanner(System.in);
		System.out.println("\n\nEnter the value you want to search ");
			int value =s.nextInt();
			int outcome = ExponentialSearch(arr,length,value);
		if(outcome<0){
			System.out.println( "Element is not present in the array");
		}else{
			System.out.println( "Element is present in the array at index:"+outcome);
		}
	}
		public static int ExponentialSearch(int[] arr ,int length, int value ){
			if(arr[0]==value){
			return 0;
		}
			int i=1;
		while(i<length && arr[i]<=value){
			i=i*2;
		}
		return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
			}
		}
/*OUTPUT
 *1 
The Array list is listed below 

1 4 3 7 8 6 420 786 840 568 895 

Enter the value you want to search 
786
Element is present in the array at index:7
 
 *2
The Array list is listed below 

1 4 3 7 8 6 420 786 840 568 895 

Enter the value you want to search 
9
Element is not present in the array

*/