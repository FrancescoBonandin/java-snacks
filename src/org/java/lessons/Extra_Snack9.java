package org.java.lessons;

import java.util.Arrays;

//### Snack 9
//Dato un array di numeri interi, dividere i numeri in due nuovi array: uno contenente solo numeri pari e l'altro solo numeri dispari.

public class Extra_Snack9 {

	public static void main(String[] args) {
		
		// alternativa: funzionale per array non ordinati? ciclo l' array, per ogni numero pari incremento un contatore numpari, numdispari=input.length-numpari;
		// la parte successiva resta uguale
		
		int[] input= {1, 2, 3, 4, 5};
		
		if(input.length %2 == 0) {
			int[] arrEven = new int[input.length/2];
			int[] arrOdd = new int[input.length/2];
			int y=0;
			int z=0;
			
			for(int x = 0; x<input.length;x++) {
				
				if (input[x]%2==0) {
					
					arrEven[y]=input[x];
					y++;
				}
				
				else {
					
					arrOdd[z]=input[x];
					z++;
					
				}
				
			}

		}
		
		else if(input.length %2 != 0) {
			int[] arrEven = new int[input.length/2];
			int[] arrOdd = new int[(input.length/2)+1];
			int y=0;
			int z=0;
			
			for(int x = 0; x<input.length;x++) {
	
				if (input[x]%2==0) {
					
					arrEven[y]=input[x];
					y++;
					
				}
				
				else {
					arrOdd[z]=input[x];
					z++;
				}
				
			}
			
			System.out.println("array di partenza"+ Arrays.toString(input) + "\narray pari" + Arrays.toString(arrEven)+"\narray dispari" + Arrays.toString(arrOdd));

		}
	
	
		
	}

}
