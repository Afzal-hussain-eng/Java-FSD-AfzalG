package com.Afzal.Lesson4.Array;
class Rotate_Array 
{ 
public void rotate(int[] nums, int k)
{
 if(k > nums.length) 
 k=k%nums.length;
int[] result = new int[nums.length];
for(int i=0; i < k; i++){
 result[i] = nums[nums.length-k+i];
}
int j=0;
 for(int i=k; i<nums.length; i++)
 {
 result[i] = nums[j];
j++;
 }
System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class Array_Rotation {
	public static void main(String[] args) 
	{
	Rotate_Array r = new Rotate_Array();
	 int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
	 System.out.println("Array values Before Rotating");
	 for(int i=0;i<arr.length;i++){
		 System.out.print(arr[i]+" ");
		 }
	 System.out.println("\nArray values After Rotating");
	 r.rotate(arr, 5); 
	 for(int i=0;i<arr.length;i++){
	 System.out.print(arr[i]+" ");
	 }
   }
}
/*OUTPUT
Array values Before Rotating
1 2 3 4 5 6 7 
Array values After Rotating
3 4 5 6 7 1 2 
*/
