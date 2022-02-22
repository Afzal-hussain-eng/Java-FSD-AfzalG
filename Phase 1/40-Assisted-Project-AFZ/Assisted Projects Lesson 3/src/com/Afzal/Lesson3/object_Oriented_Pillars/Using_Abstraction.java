package com.Afzal.Lesson3.object_Oriented_Pillars;

public class Using_Abstraction {
public static void main(String[] args) {
		
//		Human human = new Human();//Can't do it now : abstract
		
		Afzal afzal = new Afzal();
		
		afzal.eat();
		afzal.run();
		afzal.breathe();
		
		Umme umme = new Umme();
		umme.eat();
		umme.run();
		
	}

}

abstract class Human{
	abstract void eat();
	abstract void run();
	
	void breathe() {
		System.out.println("Generic breathe...");
	}
}

class Afzal extends Human{
	@Override
	void eat() {
		System.out.println("Afzal's own way of eating...");
		
	}
	
	@Override
	void run() {
		System.out.println("Afzal's distinguished style of running....");
		
	}
}

class Umme extends Human{
	@Override
	void eat() {
		System.out.println("Umme's eat...");
		
	}
	
	@Override
	void run() {
		System.out.println("Umme runs fast...");
		
	}
}
/*
OUTPUT
Afzal's own way of eating...
Afzal's distinguished style of running....
Generic breathe...
Umme's eat...
Umme runs fast...
*/