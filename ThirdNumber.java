package com.Loops2;

public class ThirdNumber {
	public void printNumber() {
		for( int i=5;i<=50; i+=3) {
			System.out.print(i + " ");
		}
	}
	public static void main (String [] args) {
		ThirdNumber obj= new ThirdNumber();
		obj.printNumber();
		
	}

}
