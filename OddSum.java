package com.Loops2;

public class OddSum {
	public void printOddSum() {
		int count = 0;
		for (int i=1;i<=30;i++) {
			if(i%2!=0) {
		    count += i;
			
		}
		}
			System.out.println(count);
		
		
	}
	public static void main (String [] args) {
		OddSum obj= new OddSum();
		obj.printOddSum();
		
	}

}
