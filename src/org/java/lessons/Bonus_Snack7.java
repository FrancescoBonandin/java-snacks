package org.java.lessons;

import java.util.Scanner;

// Scrivere un programma che dati dei secondi li converta in
// ore, minuti, secondi e mostri a video la stringa generata (secondi → “`hh:mm:ss`”) 

public class Bonus_Snack7 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String inputStrSeconds = in.nextLine();
		int inputSeconds = Integer.valueOf(inputStrSeconds);
		in.close();
		
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		
		seconds = inputSeconds;
		minutes = seconds/60;
		seconds = seconds %60;
		hours = minutes/60;
		minutes = minutes%60;
		
		String strSeconds ="";
		String strMinutes ="";
		String strHours ="";

		if (seconds<9) strSeconds = "0" + String.valueOf(seconds);
		else strSeconds = String.valueOf(seconds);
		
		if (minutes<9) strMinutes = "0" + String.valueOf(minutes);
		else strMinutes = String.valueOf(minutes);
		
		if (hours<9) strHours = "0" + String.valueOf(hours);
		else strHours =  String.valueOf(hours);
		
//		System.out.println("secondi "+seconds+"\nminuti "+minutes+"\nore"+hours);
		
		System.out.println("secondi: " + inputSeconds + "--> " + strHours + ":" + strMinutes + ":" + strSeconds);

	}

}
