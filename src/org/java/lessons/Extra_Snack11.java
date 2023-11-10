package org.java.lessons;

import java.util.Random;

//Snack 11
//Dato un array di numeri interi casuali compresi tra 0 e 100,
//scrivi un programma che trovi e stampi il numero massimo, minimo e il valore medio.

public class Extra_Snack11 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] numArr = new int[100];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		int avg = 0; 

		for(int x=0; x<numArr.length; x++) {
			
			numArr[x]=rnd.nextInt(100);
			
		}
		
		for(int x=0; x<numArr.length; x++) {
						
			if(numArr[x]<min) min=numArr[x];
			
			if(numArr[x]>max) max=numArr[x];
			
			sum+= numArr[x];
			
		}
		
		avg=sum/numArr.length;
		
		System.out.println("nell' array dato,\nil Max: " + max + "\nil Min: " + min + "\nla Media: " + avg);

	}

}
