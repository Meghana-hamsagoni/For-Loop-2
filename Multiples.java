package com.Loops2;

public class Multiples {
	
	public void multiplesOf7 (int num) {
	
		for(int i=1; i<=10; i++) {
			System.out.println(num * i);
		}

	}
	public static void main (String [] args) {
		Multiples obj = new Multiples();
		obj.multiplesOf7(7) ;
      
	}

}
