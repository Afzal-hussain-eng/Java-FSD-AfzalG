package com.Afzal.Lesson2.Working_With_Inner_Class;
public class Inner_Class2 {

	private String msg="Inner Classes Exicuted";
	void display(){ 
	class Inner{ 
	void msg(){
	System.out.println(msg);
	} 
 } 
	 
	 Inner Inner=new Inner(); 
	 Inner.msg(); 
} 
	public static void main(String[] args) {
	Inner_Class2 obj=new Inner_Class2 (); 
	obj.display(); 
	}

	
	
}
/*OUTPUT
Inner Classes Exicuted

*/	
