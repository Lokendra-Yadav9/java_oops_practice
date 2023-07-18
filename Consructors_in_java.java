package com.example;

  class persons {
		private  boolean black;
		private String name;
		private int id;
		  persons(boolean x, String y,int z) {
			  this.black=x;
			  this.name=y;
			  this.id=z;
			 System.out.println("person black "+x+" and name is "+y+" and id  "+z);
		 }
		  persons(){
			  System.out.println("empty constructor is working now");
		  }
		  
  }

public class Consructors_in_java {

	public static void main(String[] args) {
	     persons person1=new persons(true,"loki",12);
	     persons person2=new persons();
	     
	}

}
