package com.example;

class employee{
	  int id;
	  int salary;
	  String name;
	 public void printDetails(int sal){
		 
	  }
	 void getSalary(int sal){
		 System.out.println("the salary is "+sal);
	 }
	 void getName() {
		 System.out.println("my name is "+name);
	 }
	  void setName(String names) {
		  this.name=names;
	  }
	  
}

public class Object_classs_pratice {
     
	public static void main(String[] args) {
        employee loki=new employee();
        loki.id=1;
        loki.name="lokendra";
        loki.salary=75;
//        loki.printDetails(loki.salary);
        loki.getSalary(25);
        loki.setName("lucky");
        loki.getName();
        
        employee shubh=new employee();
        shubh.id=2;
        shubh.name="shubham";
        shubh.salary=75;
//        shubh.printDetails(shubh.salary);
        shubh.getSalary(85);
        shubh.setName("shubhi");
        shubh.getName();
	}
		
	}

