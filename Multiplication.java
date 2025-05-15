package com.Loops2;

public class Multiplication {
	public void printMultiplication(int num) {
		 int count=1; 
		 for (int i=10; i>=1; i--) {
			 count= num*i;
			 System.out.println("6 x"+" "+ i + " " +"="+ " " +count);
			 
		 }
	}
	public static void main (String [] args) {
		Multiplication obj = new Multiplication();
		obj.printMultiplication(6);
		
	}

}
