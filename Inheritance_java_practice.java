package com.example;

class Animal{
	String legs;
	int tells;
	int eyes;

}

class Animal_Veg extends Animal{
	String eats;
	void Print_veg(String l,int t,int e,String food){
		this.legs=l;
		this.tells=t;
		this.eyes=t;
		this.eats=food;
	}
	void printDetails() {
		System.out.printf("cow has %s leg, %d tell, %d eye and it eats %s ",legs,tells,eyes,eats);
		System.out.println("");
	}
}

class Animal_nonVeg extends Animal{
	String eats;
	void Print_nonVeg(String l,int t,int e,String food) {
		this.legs=l;
		this.tells=t;
		this.eyes=t;
		this.eats=food;
	}

	void printDetails() {
		System.out.printf("dog has %s leg, %d tell, %d eye and it eats %s ",legs,tells,eyes,eats);
	}
	
}

public class Inheritance_java_practice {

	public static void main(String[] args) {
		Animal_Veg cow=new Animal_Veg();
		cow.Print_veg("four", 1, 2, "veg");
		cow.printDetails();
		Animal_nonVeg dog=new Animal_nonVeg();
		dog.Print_nonVeg("four", 1, 2, "non-veg");
		dog.printDetails();
	
	}

	

}
