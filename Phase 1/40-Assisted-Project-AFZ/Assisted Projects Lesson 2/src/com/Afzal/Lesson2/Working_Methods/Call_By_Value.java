package com.Afzal.Lesson2.Working_Methods;

public class Call_By_Value {
	int val=150;
	int operation(int val) {
	val =val*10/100;
	System.out.println(val);
	return(val);
	}
	public static void main(String args[]) {
	Call_By_Value de = new Call_By_Value();
	System.out.println("Before operation value of data is "+de.val);
	de.operation(100);
	System.out.println("After operation value of data is "+de.val);
	}

}
/*OUTPUT

Before operation value of data is 150
10
After operation value of data is 150

*/	