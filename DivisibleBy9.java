package com.Loops2;

public class DivisibleBy9 {
	public void printNumber() {
		for(int i=1; i<=100; i++) {
			if(i%9==0) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main (String [] args) {
		DivisibleBy9 obj = new DivisibleBy9();
		obj.printNumber();
		
	}

}
