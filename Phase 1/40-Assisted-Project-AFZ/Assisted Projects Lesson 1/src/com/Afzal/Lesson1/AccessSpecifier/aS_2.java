package com.Afzal.Lesson1.AccessSpecifier;
class priaccessspecifier 
{ 
 private void display()
 { 
 System.out.println("You are using private access specifier"); 
 } 
}
public class aS_2 {
	public static void main(String[] args) {

		System.out.println("Private Access Specifier");
		priaccessspecifier obj = new priaccessspecifier(); 
		 //trying to access private method of another class 
		 //obj.display();
		}
		}
/*OUTPUT
Private Access Specifier
*/