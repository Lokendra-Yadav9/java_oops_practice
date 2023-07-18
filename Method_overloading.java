package com.example;
public class Method_overloading {
 

	public static void prints(){
		System.out.println("nothing is in this ");
	}
	public static void prints(String names){
		System.out.println("there is only one argument"+names);
	}
	public static void prints(String names1,String names2){
		System.out.println("there is only two arguments "+names1+" and "+names2);
	}
	public static void prints(String names1,String names2,String names3){
	    System.out.println("there is only two arguments "+names1+" and "+names2+" and "+names3);
	}
	
	
	public static void main(String[] args) {
		prints();
		prints("lucky");
		prints("lucky","singh");
		prints("lucky","singh","yadav");
		
   }

}
