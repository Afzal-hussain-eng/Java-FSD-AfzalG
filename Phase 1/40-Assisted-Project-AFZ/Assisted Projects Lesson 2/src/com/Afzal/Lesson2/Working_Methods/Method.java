package com.Afzal.Lesson2.Working_Methods;

import java.util.Scanner;

public class Method {
	public int AdditionOfTwoNumber(int a,int b) {
	int z=a+b;
	return z;
	}
	public static void main(String[] args) {
	Method b=new Method();
	Scanner se = new Scanner(System.in);
	System.out.println("Enter Two number ");
	int ans= b.AdditionOfTwoNumber(se.nextInt(),se.nextInt());
	System.out.println("Addition of two Number is :"+ans);
	}
}
/*OUTPUT

Enter Two number 
2
5
Addition of two Number is :7


*/	