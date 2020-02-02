
public class Decrypter {

	public static String decrypt(String s) {
		//variables
		int n = 0;
		int i;
		int t;
		int myNum;
		
		char myChar;
		//defines int myArray as an array capable of holding 4 ints
		int myArray[] = new int[4];
		
			//for loop
	       for(i = 0; i < 4 ; i++) {
	    	   //returns variable myChar to position of variable i
	           myChar = s.charAt(i);
	           //assigns myArray[i] equal to the numerical value of myChar
	           myArray[i] = Character.getNumericValue(myChar);
	       }
	       
	       for (i = 0; i < 4; i++) {
				t = myArray[i];
				t += 3 % 10;
			
				myArray[i] = t;	
			}
	       
	       //swapping digits as required per rubric
	       t = myArray[2];
	       myArray[2] = myArray[0];
	       myArray[0] = t;
	       t = myArray[3];
	       myArray[3] = myArray[3];
	       myArray[3] = t;
	       
	       for(i = 0; i < 4 ; i++) {
	           myNum = myArray[i];
	           //switch statement that returns specific value based on the value of variable myNum
	           switch(myNum) {
	               case 0:
	                   myArray[i] = 3;
	                   break;
	               case 1:
	                   myArray[i] = 4;
	                   break;
	               case 2:
	                   myArray[i] = 5;
	                   break;
	               case 3:
	                   myArray[i] = 6;
	                   break;
	               case 4:
	                   myArray[i] = 7;
	                   break;
	               case 5:
	                   myArray[i] = 8;
	                   break;
	               case 6:
	                   myArray[i] = 9;
	                   break;
	               case 7:
	                   myArray[i] = 0;
	                   break;
	               case 8:
	                   myArray[i] = 1;
	                   break;
	               case 9:
	                   myArray[i] = 2;
	                   break;
	           }
	       }
	       
	       //for loop creating decrypted value
	       for(i = 0 ; i < 4 ; i++)
	       {
	    	   
	           n = n * 10 + myArray[i];
	           
	       }
	       
	       //creates the string displayed to user as decrypted value
	       String out = Integer.toString(n);
	       
	       //returns value "out"
	       return out;
	      
	   }
} 
