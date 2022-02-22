package com.Afzal.Lesson3.Keyword_And_Custom_Exception;

import java.util.Scanner;

public class Using_Throws {

	void Division() throws ArithmeticException
	{
		System.out.println("Using throws ");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number(Please do not enter second number as zero'0')");
	int a=s.nextInt(),b=s.nextInt(),rs;
	rs = a / b;
	System.out.print("\n\tThe result is : " + rs);
		}
	public static void main(String[] args)
	{
		Using_Throws T = new Using_Throws();
	try
	{
	T.Division();
		}
	catch(ArithmeticException Ex)
	{
	System.out.print("\n\tError : " + Ex.getMessage());
		}
	System.out.print("\n\tEnd of program.");
		}
	}
/*OUTPUT
*1
Using throws 
Enter two number(Please do not enter second number as zero'0')
12
4

	The result is : 3
	End of program.
	
*2
Using throws 
Enter two number(Please do not enter second number as zero'0')
12
0

	Error : / by zero
	End of program.

*/