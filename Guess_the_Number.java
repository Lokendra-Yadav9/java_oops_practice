package com.example;
import java.util.Random;
import java.util.Scanner;
class game{
	int number;
	int InputNumber;
	int TotalGuesses=0;
	
	game(){
		Random random=new Random();
		this.number=random.nextInt(10);
//		System.out.println(number);
		}
	void getTotalguess() {
		System.out.println("you have try total "+TotalGuesses+" times");
	}
	int setGuess() {
		return TotalGuesses++;
	}
	void takeUserInput() {
		System.out.println("Enter the number");
		try (Scanner sc = new Scanner(System.in)) {
			InputNumber=sc.nextInt();
		}
		}
    boolean IsCorrectNumber() {
		if(number==InputNumber) {
		System.out.println("you win ! your number is correct");
		return true;
		}
		else if(number>InputNumber) {
			System.out.println("your number is Too Low");
		}
		else if(number<InputNumber) {
			System.out.println("your number is Too High");
		}
		else {
			System.out.println("try hard");
		}
		return false;
		
	}
}

public class Guess_the_Number {

	public static void main(String[] args) {
		 boolean b=false;
		game g=new game();
		while(!b) {
        g.takeUserInput();
        b=g.IsCorrectNumber();
        g.setGuess();
		}
		g.getTotalguess();
	}

}
