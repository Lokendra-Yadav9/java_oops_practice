package com.example;
import java.util.Scanner;
public class varArguments {
        static int sum(int x,int ...arr) {
        	int result=0;
        	for(int el:arr) {
        		result +=el;
        		System.out.println(x);
        	}
        	return result;
        }
	public static void main(String[] args) {
		System.out.print("sum is: ");
       System.out.print(sum(0,55,45,554 ,56, 45));
	}

}
