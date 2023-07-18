package com.example;

public class useClass {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        student lokendra=new student(45,"lokindra",45.6);
        System.out.println("name="+lokendra.Name);
        System.out.println("marks="+lokendra.marks);
        System.out.println("roll no.="+lokendra.rollno);
    }
}

class student{
	
	 
	public student(int i, String string, double d) {
		this.Name=string;
		this.rollno=i;
		this.marks=(float) d;
	}
	int rollno;
	 String Name;
	 float marks;
}

