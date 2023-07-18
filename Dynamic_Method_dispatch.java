package com.example;

class car{
	 void horn() {
		 System.out.println("the car is horning ");
	 }
	 void Start() {
		 System.out.println("car is start");
	 }
}
class el_car extends car{
	void horn() {
		System.out.println("the electric car is horning");
	}
	void electricStart() {
		System.out.println("electric car is start ");
	}
}

public class Dynamic_Method_dispatch {

	public static void main(String[] args) {
		car scorpio=new el_car(); //dynamic method dis.
         scorpio.horn(); //dynamic method dis.
         scorpio.Start(); //dynamic method dis.
//         scorpio.electricStart();
         car maruti=new car();
         maruti.Start();
         el_car farari=new el_car();
         farari.electricStart();
	}

}
