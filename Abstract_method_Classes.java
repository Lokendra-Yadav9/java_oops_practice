package com.example;

abstract class Shapes{
	int radius;
	public float result;
	Shapes(int r){
		this.radius=r;
		System.out.println("the radius is "+r);
		System.out.println("this is shapes !!!");
	}
	
	abstract public void parameter();
	abstract public void area();
}
class circle extends Shapes{
	circle(int r){
		super(r);
		System.out.println("this is circle ");
	}
	
	public void area() {
		System.out.println("this is circle area");
		result=radius*radius*3.14f;
		System.out.println(" circle area is: "+result);
	}
	public void parameter() {
		System.out.println("this is circle parameter");
		result=radius*2*3.14f;
		System.out.println("circle parameter is: "+result);
	}
}
abstract class trigle extends Shapes{
	trigle(int r) {
		super(r);
		System.out.println("the radius is in triale"+r);
	}

	public void area() {
		System.out.println("this is triagle area");
		result=radius*2*3.14f;
		System.out.println("trigle parameter is: "+result);
	}
}

public class Abstract_method_Classes {

	public static void main(String[] args) {
//		Shapes s1=new Shapes();
		circle c1=new circle(4);
		c1.area();
		c1.parameter();
//		trigle t1=new trigle();
		
	}

}
