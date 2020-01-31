import java.util.Scanner;

public class Application {
	
	
	
	public static void main(String []args) {
		Scanner in = new Scanner(System.in);
		
		Encrypter encr = new Encrypter();
		Decrypter dncr = new Decrypter();
		
		
		System.out.println("Enter your four-digit number: ");
		
		String s = in.nextLine() ;
		
		
		System.out.println("Encrypted value: " + encr.encrypt(s));
		System.out.println("Decrypted value: " + dncr.decrypt(s)); 
	}

}

