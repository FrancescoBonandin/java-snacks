package org.java.lessons;

import java.util.Arrays;
import java.util.Scanner;

// Snack4
// Data in input una stringa verificare se è palindroma

public class Bonus_Snack4 {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
		 System.out.println("dimmi una parola:");
		 String inputString = in.nextLine();
		 in.close();
			 
		 int halfLength = inputString.length()/2;
		 char[] arr1 = new char[halfLength];
		 char[] arr2 = new char[halfLength];
		 
		 for(int x=0;x<halfLength;x++) {
			 
			 arr1[x]=inputString.charAt(x);
			 
			 arr2[x]=inputString.charAt(inputString.length()-x-1);

		 }
		 
		 String strFromArr1 = Arrays.toString(arr1);
		 String strFromArr2 = Arrays.toString(arr2);
		 
		 if (strFromArr1.equals(strFromArr2)) {
			 
			 if (inputString.length()%2==0)System.out.println("la parola "+ inputString + " è palindroma, infatti " + strFromArr1 + "=" + strFromArr2);
			 else System.out.println("la parola "+ inputString + " è palindroma, infatti " + strFromArr1 + inputString.charAt(halfLength) + "=" + strFromArr2 + inputString.charAt(halfLength));
		 }
		 
		 else {
			
			 if (inputString.length()%2==0)System.out.println("la parola "+ inputString + " non è palindroma, infatti " + strFromArr1 + "!=" + strFromArr2);
			 else System.out.println("la parola "+ inputString + " è palindroma, infatti " + strFromArr1 + inputString.charAt(halfLength) + "=" + strFromArr2 + inputString.charAt(halfLength));
		 }
		 
	}

}
