package com.Afzal.Lesson4.Stack_Queue;

public class Stack {
	 static final int MAX = 1000; 
	 	int top; 
	 	int a[] = new int[MAX]; 
		boolean isEmpty(){ 
	 return (top < 0); 
	 } 
	 Stack(){ 
		 top = -1; 
	 } 
	 	boolean push(int x) 
	 	{ 
	 		if (top >= (MAX-1)){ 
	 System.out.println("Stack Overflow"); 
	 return false; 
	 		}else{ 
	 			a[++top] = x; 
		System.out.println(x + " pushed into stack"); 
	 return true; 
	 		} 
	} 
	int pop(){ 
		if (top < 0){ 
	 System.out.println("Stack Underflow"); 
	 return 0; 
	 }else{ 
		 int x = a[top--]; 
		 return x; 
	 	} 
	 } 
	 public static void main(String args[])
	   {
	 Stack s = new Stack(); 
	 	s.push(10); 
	 	s.push(20); 
	 	s.push(30); 
	 	s.push(40); 
	 	s.push(50); 
	 	s.push(60); 
	 	s.push(70); 
	 System.out.println(s.pop() + " Popped from stack"); 
  }
} 

/*OUTPUT
10 pushed into stack
20 pushed into stack
30 pushed into stack
40 pushed into stack
50 pushed into stack
60 pushed into stack
70 pushed into stack
70 Popped from stack
*/
