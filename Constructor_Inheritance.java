package com.example;

 class parents{
	parents(){
		System.out.println("this is parents constructor ");
	}
	parents(int x){
		System.out.println("this is parents cons. with value of x "+x);
	}
}
 class child extends parents{
	 child(){
		 System.out.println("this is child constructor");
	 }
	 child(int x, int y){
		 super(x);
		 System.out.println("this is child constr. with value x:"+x+" and y:"+y);
	 }
 }
 class grandChild extends child{
	 grandChild(){
		 System.out.println("this is grandChild constructor");
	 }
	 grandChild(int x, int y, int z){
		 super(x,y);
		 System.out.println("this is grand child const. with values x:"+x+" and y:"+y+" and z:"+z);
	 }
 }

public class Constructor_Inheritance {

	public static void main(String[] args) {
//		grandChild gc1=new grandChild(12,52,65);
//		child c1=new child(15,65);
//		parents p1=new parents();
//		parents p1=new parents(120);

	}

}
