package com.example;
import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_sessior {

	public static void main(String[] args) {
		Random random=new Random();
		System.out.println("select any of them 0:rock 1:paper 2:scissor ");
		Scanner sc=new Scanner(System.in);
		int computer_choice=random.nextInt(3);
		int user_Choice=sc.nextInt();
//		System.out.println(computer_choice);
		
        if(user_Choice==computer_choice) {
        	System.out.println("game draw");
        }
        else if(user_Choice==0 && computer_choice==2 || user_Choice==1 && computer_choice==0 || user_Choice==2 && computer_choice==1   ) {
        	System.out.println("you win!");     	
        }
        else {
        	System.out.println("computer win!");
        }
        System.out.println("computer choice "+computer_choice);
	}

}
