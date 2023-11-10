package org.java.lessons;

import java.util.Scanner;

// Snack5
// Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
//
//     Continuare a chiedere una nuova stringa finché non si inserisce lo `0`.

public class Bonus_Snack5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in) ;
		
		boolean flag = true;
		
		int letters = 0;
		int numbers = 0;
		int symbols = 0;
		
		//** alternativa1: array di caratteri lettere da a-z sia Lcase che Ucase + array numeri da 0-9 + array simboli compreso lo spazio;
		// -ciclo i valori della stringa e confronto con i valori nei singoli array incremento se c'è;
		
		//** alternativa2: forse si può usare un range di valori in riferimento alla tabella ascii?
		
		do {
			
			System.out.println("dammi una stringa");
			String inputStr = in.nextLine();
			
			if(inputStr.equals("0")) flag = false;
			
			else {
				
				for(int x=0; x < inputStr.length();x++) {
					
					if(Character.isLetter(inputStr.charAt(x))) {
						letters++;
					}
					
					else if(Character.isDigit(inputStr.charAt(x))) {
						numbers ++;
					}
					
					else symbols ++;
				}
				
				System.out.println("la tua stringa contiene: \n" +letters+" lettere\n" + numbers + " numeri\n" + symbols + " simboli");
			}
			
		}while(flag == true);
		
		in.close();
		
		System.out.println("fine");
	}

}
