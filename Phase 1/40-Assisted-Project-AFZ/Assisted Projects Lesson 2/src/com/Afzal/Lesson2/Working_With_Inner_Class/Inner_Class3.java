package com.Afzal.Lesson2.Working_With_Inner_Class;
abstract class Anonymous_InnerClass 
{
	 public abstract void display();
	}
public class Inner_Class3 {
	
		public static void main(String[] args)
		{
			
		Anonymous_InnerClass AIC = new Anonymous_InnerClass()
			{
		 public void display()
		 {
		 System.out.println("Anonymous Inner Class Called");
		 	}
		 };
		 AIC.display();
			}
		}
/*OUTPUT
Anonymous Inner Class Called
*/	