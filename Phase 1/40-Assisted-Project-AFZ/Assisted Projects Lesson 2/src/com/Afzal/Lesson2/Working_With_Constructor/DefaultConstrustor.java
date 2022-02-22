package com.Afzal.Lesson2.Working_With_Constructor;
class Learner
{
	int id;
	String name;
	void display() 
	{
	System.out.println(id+" "+name);
    }
}
public class DefaultConstrustor {
	public static void main(String[] args) 
	{
	Learner Learner1=new Learner();
	Learner Learner2=new Learner();
	Learner Learner3=new Learner();
	Learner1.display();
	Learner2.display();
	Learner2.display();
	}
	
}
/*OUTPUT
0 null
0 null
0 null

*/	