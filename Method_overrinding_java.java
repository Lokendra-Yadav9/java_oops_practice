package com.example;

class A{
	int a ,b;
	public void prints() {
		System.out.println("its priting from class A");
	}
	public void prints(int x, int y) {
		
		
	}
}
class B extends A{
//	public void
//	int x;
	@Override
	public void prints(int x,int y) {
		this.a=x;
		this.b=y;
		System.out.println("its from class B a: "+x+" and b: "+y);
	}
}

public class Method_overrinding_java {

	public static void main(String[] args) {
		A a1=new A();
		a1.prints();
		B b1=new B();
		b1.prints(56,25);

	}

}
