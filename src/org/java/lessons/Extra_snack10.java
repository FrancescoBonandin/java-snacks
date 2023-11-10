package org.java.lessons;

import java.util.Scanner;

//Dati due numeri interi acquisiti dall'utente (`Scanner`), calcolare la somma di tutti i numeri compresi tra questi due valori (inclusi).

public class Extra_snack10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("dammi un numero:");
		String numStr1 = in.nextLine();
		int num1 = Integer.valueOf(numStr1);
		
		System.out.println("dammi un'altro numero:");
		String numStr2 = in.nextLine();
		int num2 = Integer.valueOf(numStr2);

		in.close();
		
		int min = 0;
		int max = 0;
		int sum = 0;
		
		if(num1==num2) {
			sum=num1;
			System.out.println("i due numeri combaciano");
		}
		
		else if(num1 < num2) {
			
			min=num1;
			max=num2;
			
		}
		
		else  {
			
			min=num2;
			max=num1;
			
		}
		
		for(int x = min; x<=max;x++) {
			sum+=x;
		}
		
		System.out.println("la sommatoria dei numeri da " + min + "-" + max + " è: " + sum);
	}

}
