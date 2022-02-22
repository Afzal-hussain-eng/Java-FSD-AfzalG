package com.Afzal.Lesson3.Keyword_And_Custom_Exception;

import java.util.Scanner;

public class Using_Throw {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number(Please do not enter second number as zero'0')");
	int a=s.nextInt(),b=s.nextInt(),rs;
	try{
	if(b==0) 
	throw(new ArithmeticException("Can't divide by zero."));
	else{
	rs = a / b;
	System.out.print("\n\tThe result is : " + rs);
		}
	}catch(ArithmeticException Ex)
	{
	System.out.print("\n\tError : " + Ex.getMessage());
			}
	System.out.print("\n\tEnd of program.");
		}
	}

/*OUTPUT
 * 1
//using throw 


Enter two number(Please do not enter second number as zero'0')
10
5

	The result is : 2
	End of program.

*2
Enter two number(Please do not enter second number as zero'0')
10
0

	Error : Can't divide by zero.
	End of program.
*/

