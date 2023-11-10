package org.java.lessons;

import java.util.Random;
import java.util.Scanner;

// Snack3
// Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari

public class Snack3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		
		
		System.out.println("dimmi un numero intero?");
		String strNum = in.nextLine();
		int num = Integer.valueOf(strNum);
		
		int[] numArr = new int[num];
		
		for(int x = 0; x < numArr.length; x++) {
			
			int rndInt = rnd.nextInt(10);
			
			numArr[x]=rndInt;
			
			
		}
		
		int sum = 0;
		
		for(int x=0;x<numArr.length;x++) {
			
			if(x%2 != 0) {
				
				System.out.println("l'elemento in posizione " + x + " è " + numArr[x]);
				sum += numArr[x];
				
			}
			
		}
		System.out.println("la somma degli elementi in posizione dispari è: " + sum);
	}

}
