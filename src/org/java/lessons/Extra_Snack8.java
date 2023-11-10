package org.java.lessons;

//Dato un input stringa, il programma deve sostituire tutti i caratteri 'a' con 'o' e viceversa, quindi stampare la nuova stringa.

public class Extra_Snack8 {

	public static void main(String[] args) {
		
		 String word = "giacomo";
		 
		 char[] alteredWord = new char[word.length()];
		 
		 for(int x=0; x<word.length();x++) {
			 
			 if( word.charAt(x)=='a') {
				 alteredWord[x] = 'o';
			 }
			 
			 else if( word.charAt(x)=='o') {
				 alteredWord[x]= 'a';
			 }
			 
			 else alteredWord[x]=word.charAt(x);
			 
		 }
		 
		 System.out.println(String.valueOf(alteredWord));
		

	}

}
