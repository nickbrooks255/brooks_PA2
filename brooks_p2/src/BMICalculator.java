package brooks_PA2_p2;
import java.util.Scanner;
public class BMICalculator {
	
	int select;
    float height;
    float weight;
    double bmi;

	public static void main(String[] args) {
		BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	    
	    

	}
	
	 private int readUserData() {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. Pounds/Inches");
			System.out.println("2. Kilograms/Meters");
			System.out.println("Please enter your choice");
			
			select = in.nextInt();
			
			if(select == 1)
			{
				System.out.print("Enter Weight in Pounds:");
				weight = in.nextFloat();
				
				System.out.print("Enter Height in Inches:");
				height = in.nextFloat();
				
				break;
			}
			
			else if (select == 2) {
				System.out.print("Enter Weight in Kilograms:");
				weight = in.nextFloat();
				
				System.out.print("Enter Height in Meters:");
				height = in.nextFloat();
				
				break;
				
			}
			else {
				System.out.println("Please choose another input value.");
				break;
			}
		}
		return 0;
		
		
	}
	 
	 public void calculateBmi() {
		
		 if (select == 1) {
			 bmi = (weight * 703) / (height * height);
			 
			 if (select == 2)
				 bmi= weight/ (height * height);
			 
		 }
	 }
	 
	 public void displayBmi() {
		 
		 String rating = ""; 
		 if(bmi < 18.5)
			 rating = "Underweight";
		 else if (bmi >= 18.5 && bmi <= 24.9)
			 rating = "Normal";
		 else if (bmi >= 25 && bmi <= 29.9)
			rating = "Overweight";
		 else if (bmi > 30)
			 rating = "Obese";
		 
		 System.out.println("Your BMI is:" + bmi);
		 System.out.println("Your category is" + rating);
		 
		 
	 }

}
