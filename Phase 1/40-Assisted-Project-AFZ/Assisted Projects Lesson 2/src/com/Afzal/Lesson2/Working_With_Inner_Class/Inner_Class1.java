package com.Afzal.Lesson2.Working_With_Inner_Class;

public class Inner_Class1 {

	private String message="Hi Afzal"; 
	class Inner{ 
		String message2 = "how are u ";
	 void hello(){System.out.println(message+ " "+message2+", Let us start learning Inner Classes...");} 
	} 
	
	public static void main(String[] args) {
		Inner_Class1 obj=new Inner_Class1();
		Inner_Class1.Inner in=obj.new Inner();
	    in.hello(); 
	}
}

/*OUTPUT
Hi Afzal how are u , Let us start learning Inner Classes...

*/	