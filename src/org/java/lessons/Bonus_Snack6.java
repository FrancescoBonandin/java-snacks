package org.java.lessons;

//Snack 6
//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
//
//Possibile usare solo :
//- *cicli*
//- `chartAt`
//- `if`/`switch`
//
//#### Esempio
//“25” come stringa deve essere convertito in intero 25.

public class Bonus_Snack6 {

	public static void main(String[] args) {
		
		String numStr = "1458345";
		
		int num = 0;
		
		final int BASE_10 = 10;
		
		Integer.valueOf(num);
		
		for(int x=0; x < numStr.length(); x++) {
			
			int esponent = (numStr.length()-x);
			int multiplier = 1 ;
				for(int y = 1; y<esponent;y++) multiplier *= BASE_10;
			
			if(numStr.charAt(x) == '0') {
				
				int digit = 0;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '1') {
				
				int digit = 1;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '2') {
				
				int digit = 2;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '3') {
				
				int digit = 3;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '4') {
				
				int digit = 4;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '5') {
				
				int digit = 5;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '6') {
				
				int digit = 6;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '7') {
				
				int digit = 7;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '8') {
				
				int digit = 8;
				num+=digit * multiplier;
			}
			
			else if(numStr.charAt(x) == '9') {
				
				int digit = 9;
				num+=digit * multiplier;
			}
				
			
		}
		System.out.println(num);
	}

}
