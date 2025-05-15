package com.Loops2;

public class EvenNumbers {
	public void printEven() {
		 for (int i=1; i<=50;i++) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
		 }
		
	}
	public static void main (String [] args) {
		EvenNumbers obj = new EvenNumbers();
		obj.printEven();
		
	}

}
