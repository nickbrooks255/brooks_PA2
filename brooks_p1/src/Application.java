import java.util.Scanner;

public class Application {
	
	
	
	public static void main(String []args) {
		//scans input
		Scanner in = new Scanner(System.in);
		
		//accesses classes Encrypter and Decrypter
		Encrypter encr = new Encrypter();
		Decrypter dncr = new Decrypter();
		
		//prints line telling user to enter digit to be encrypted
		System.out.println("Enter your four-digit number: ");
		
		//setting string s equal to users input
		String s = in.nextLine() ;
		
		//prints encrypted and decrypted values
		System.out.println("Encrypted value: " + encr.encrypt(s));
		System.out.println("Decrypted value: " + dncr.decrypt(s)); 
	}

}

