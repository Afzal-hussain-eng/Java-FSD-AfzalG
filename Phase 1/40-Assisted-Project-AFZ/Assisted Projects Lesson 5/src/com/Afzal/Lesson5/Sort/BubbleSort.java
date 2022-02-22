package com.Afzal.Lesson5.Sort;

public class BubbleSort {
	 static void bubbleSort(int[] arr) {  
	     int n = arr.length;  
	     int temp = 0;  
	  for(int i=0; i < n; i++){  
	      for(int j=1; j < (n-i); j++){  
	         if(arr[j-1] > arr[j]){  
                 //swap elements  
	               temp = arr[j-1];  
	               arr[j-1] = arr[j];  
	             arr[j] = temp;  
	             }  
	                          
	      }  
	   }  
  }  
	 public static void main(String[] args){
		 int arr[] ={9,70,45,1,95,420,44};  
         
         System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         bubbleSort(arr);//sorting array elements using bubble sort  
          
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  

 }  
}  
/*OUTPUT
Array Before Bubble Sort
9 70 45 1 95 420 44 
Array After Bubble Sort
1 9 44 45 70 95 420 
*/