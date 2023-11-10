package org.java.lessons;

import java.util.Arrays;

//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi,
//e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.

public class Snack2 {

	public static void main(String[] args) {
		
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		String[] guests = new String[10];
		
		for(int x=0; x < nomi.length && x < cognomi.length; x++) {
			
			guests[x] = nomi[x] + " " + cognomi[x];
			
		}
		
		String guestsList = Arrays.toString(guests);
		System.out.println("gli invitati sono : " + guestsList);
	}

}
