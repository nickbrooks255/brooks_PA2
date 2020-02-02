
public class Encrypter {

	public static String encrypt(String s) {
		
		//variables
		int n = 0;
		int i;
		int t;
				
		char myChar;
		//defines int myArrayay as an array capable of holding 4 ints
		int myArray[] = new int[4];
		
			for (i = 0; i < 4; i++) {
				//set variable myChar to position of variable i
				myChar = s.charAt(i);
				//assigns myArrayay[i] equal to the numerical value of myChar
				myArray[i] = Character.getNumericValue(myChar);
			}
				
				
			//as required per rubric, adding 7 to digit and getting remainder after diving by 10
			for (i = 0; i < 4; i++) {
				t = myArray[i];
				t += 7 % 10;
			
				myArray[i] = t;	
			}
		
			//swapping digits as required per rubric
			t = myArray[0];
			myArray[0] = myArray[1];
			myArray[2] = t;
			t = myArray[1];
			myArray[1] = myArray[3];
			myArray[3] = t;
		
		
		
			//for loop creating encrypted value
			for(i = 0; i < 4; i++) {
				
				n = n * 10 + myArray[i];
			}
				//creates the string displayed to user as encrypted value
				String out = Integer.toString(n);
				
				//returns value "out"
				return out;
		}
	
}
		
		
