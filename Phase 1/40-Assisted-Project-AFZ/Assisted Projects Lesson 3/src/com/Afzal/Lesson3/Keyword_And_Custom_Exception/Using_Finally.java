package com.Afzal.Lesson3.Keyword_And_Custom_Exception;

import java.util.Scanner;

public class Using_Finally {
	public static void main(String[] args)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number(Please do not enter second number as zero'0')");
	int a=s.nextInt(),b=s.nextInt(),rs=0;
	try
	{
	rs = a / b;
		}
	catch(ArithmeticException Ex)
	{
	System.out.print("\n\tError : " + Ex.getMessage());
		}
	finally
	{
		//finally always run
	System.out.print("\n\tThe result is : " + rs);
			}
		}
	}


/*out put
 Enter two number(Please do not enter second number as zero'0')
 
15
14

	The result is : 1//finally always runs
Enter two number(Please do not enter second number as zero'0')
10
0

	Error : / by zero
	The result is : 0//finally always runs
	*/


