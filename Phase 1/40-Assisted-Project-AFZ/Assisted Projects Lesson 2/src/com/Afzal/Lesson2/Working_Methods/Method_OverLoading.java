package com.Afzal.Lesson2.Working_Methods;

public class Method_OverLoading {

	public void area(int b,int h)
	 {
	 System.out.println("Area of Triangle : "+(0.5*b*h));
	 }
	public void area(double br,double hi)
	 {
	 System.out.println("Area of Paralleogrm : "+(br*hi));
	 }
	 public void area(int r) 
	 {
	 System.out.println("Area of Circle : "+(3.14*r*r));
	 }
	 public static void main(String args[])
	 {
	 Method_OverLoading obj=new Method_OverLoading();
	 obj.area(10,12);
	 obj.area(5);
	 obj.area(45.5, 23.45);
	 }
	
}
/*OUTPUT

Area of Triangle : 60.0
Area of Circle : 78.5
Area of Paralleogrm : 1066.975

*/	