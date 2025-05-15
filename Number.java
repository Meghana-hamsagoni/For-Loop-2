package com.Loops2;

public class Number {
	 String result ="";
	public String divisibleNumber () {
		for( int i=1; i<=100;i++) {
			if (i%3==0 && i%5==0) {
				System.out.println( i +"" );
			}
			
		}
		return result;
	}
	public static void main (String [] args) {
		Number objRef =new Number();
		objRef.divisibleNumber();
		
		
	}

}
