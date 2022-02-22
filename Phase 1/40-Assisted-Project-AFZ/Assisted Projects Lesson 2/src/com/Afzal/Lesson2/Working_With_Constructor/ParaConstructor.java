package com.Afzal.Lesson2.Working_With_Constructor;

import java.util.Scanner;

class Student_details
{
	int id;
	String name;
	String course;
	Student_details(int id,String name,String  course)
	{
	this.id=id;
	this.name=name;
	this.course=course;
	}
	void display() 
	{
	System.out.println("Student id is : "+id+", name is : "+name+", and the course opted is : "+course);
	}
	}
public class ParaConstructor {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter first student details Id, name, course");
	Student_details std1=new Student_details(sc.nextInt(),sc.next(),sc.next());
	System.out.println("Enter second student details Id, name, course");
	Student_details std2=new Student_details(sc.nextInt(),sc.next(),sc.next());
	System.out.println("Enter third student details Id, name, course");
	Student_details std3=new Student_details(sc.nextInt(),sc.next(),sc.next());
	
	std1.display();
	std2.display();
	std3.display();
	}
	}
/*OUTPUT
Enter first student details Id, name, course
1
Afzal
EEE
Enter second student details Id, name, course
2
Umme
IS
Enter third student details Id, name, course
3
Anu
ECE
Student id is : 1, name is : Afzal, and the course opted is : EEE
Student id is : 2, name is : Umme, and the course opted is : IS
Student id is : 3, name is : Anu, and the course opted is : ECE

*/	