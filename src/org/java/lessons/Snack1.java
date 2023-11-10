package org.java.lessons;

import java.util.Scanner;

//	Snack1
//	Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("dimmi un numero:");
		
		String strNum = in.nextLine();
		int num = Integer.valueOf(strNum);
		
		if(num %2 == 0) {
			
			System.out.println("il numero " + num + " è pari");
			 
		}
		
		else {
			
			System.out.println("il numero " + num + " è dispari \nil numero pari successivo è :" + (num + 1));
			
		}
		
	}

}
