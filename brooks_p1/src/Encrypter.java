
public class Encrypter {

	public static String encrypt(String s) {
		
		
		int t;
		int n = 0;
		int i;
		
		char to_ch;
		
		
		int arr[] = new int[4];
		for (i = 0; i < 4; i++) {
			to_ch = s.charAt(i);
			arr[i] = Character.getNumericValue(to_ch);
		}
				
				
		for (i = 0; i < 4; i++) {
			t = arr[i];
			t += 7 % 10;
			
			arr[i] = t;	
		}
		
		t = arr[0];
		arr[0] = arr[1];
		arr[2] = t;
		t = arr[1];
		arr[1] = arr[3];
		arr[3] = t;
		
		
		
		
		for(i = 0; i < 4; i++) {
			
			n = n * 10 + arr[i];
		}
			String out = Integer.toString(n);
			
			if (arr[0] == 0) {
				out = "0" + out;
				
				return out;
			}
			
			return out;
	}
	
}
		
		
