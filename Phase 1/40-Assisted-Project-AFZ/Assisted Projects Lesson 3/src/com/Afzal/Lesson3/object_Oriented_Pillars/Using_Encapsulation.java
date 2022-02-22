package com.Afzal.Lesson3.object_Oriented_Pillars;

public class Using_Encapsulation {
	public static void main(String[] args) {
		Learner theLearner = new Learner("Babu", "Khatar", 420);
			
		Learner secondLearner = new Learner("Shona", "Chinchole", 840);
		
		Learner thirdLearner = new Learner("Dinga", "Mumba", 1260);
		
		System.out.println("Name is: "+theLearner.getName() + ", Id is: " + theLearner.getId() + ", location is : " + theLearner.getLocation());
		System.out.println("Name is: "+secondLearner.getName()+ ", Id is: " + secondLearner.getId() + ", location is : " + secondLearner.getLocation());
		System.out.println("Name is: "+thirdLearner.getName()+ ", Id is: " + thirdLearner.getId() + ", location is : " + thirdLearner.getLocation());

	}

}
//Data Transfer Objects : DTO's
class Learner{
	private String name;
	private int id;
	private String location;
	
	public Learner() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Learner(String name, String location, int id) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
	}
		
}

/*OUTPUT
Name is: Babu, Id is: 420, location is : Khatar
Name is: Shona, Id is: 840, location is : Chinchole
Name is: Dinga, Id is: 1260, location is : Mumba
*/