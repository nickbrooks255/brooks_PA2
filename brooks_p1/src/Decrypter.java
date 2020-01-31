
public class Decrypter {

	public static String decrypt(String s) {
		int n = 0;
		int i;
		int t;
		
		int myArray[] = new int[4];
		
	       for(i = 0; i < 4 ; i++) {
	           char myChar = s.charAt(i);
	           myArray[i] = Character.getNumericValue(myChar);
	       }
	       
	       t = myArray[0];
	       myArray[0]=myArray[2];
	       myArray[2]=t;
	       t = myArray[1];
	       myArray[1]=myArray[3];
	       myArray[3]=t;
	       
	       for(i = 0; i < 4 ; i++) {
	           int num = myArray[i];
	           switch(num) {
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
	       
	       for(i = 0 ; i < 4 ; i++)
	       {
	    	   
	           n = n * 10 + myArray[i];
	           
	       }
	       String out = Integer.toString(n);
	       if (myArray[0] == 0)
	           out = "0"+ out;
	       return out;
	      
	   }
}
