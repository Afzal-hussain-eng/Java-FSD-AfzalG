package com.Afzal.Lesson2.Working_Regular_Expression;
import java.util.Scanner;
import java.util.regex.*;
public class RegEx {
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your name");
	
	String userName = s.nextLine();
	validateUserName(userName);
	}

static void validateUserName(String userName) {
	String namePattern= "[a-z]{5}";
	if(userName.matches(namePattern)){
		System.out.println("welcome "+userName);
	}else {
		System.out.println("sorry, not the correct name...");
	}
}}
/*OUTPUT
1]
Enter your name
afzal
welcome afzal
2]
Enter your name
Afzal
sorry, not the correct name...
*/	