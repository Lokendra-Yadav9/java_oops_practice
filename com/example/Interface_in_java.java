package com.example;

interface cars{
	 void gate();
	 void wheel();
}
class suzuki implements cars{
	private int gates;
	private int wheels;
	suzuki(int g, int w) {
		this.gates=g;
		this.wheels=w;
	}
	 public void gate() {
		System.out.println("the total gate is "+gates);
	}
	public void wheel() {
		System.out.println("total wheels is "+wheels);
	};
}

public class Interface_in_java {

	public static void main(String[] args) {
		suzuki s1=new suzuki(5,4);
		s1.gate();
		s1.wheel();
	}

}
