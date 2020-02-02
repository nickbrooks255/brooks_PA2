package brooks_p2;
import java.util.Scanner;
public class BMICalculator {
	
	//variables
	int select;
    float setHeight;
    float weight;
    double bmi;

    //main method as given to us
	public static void main(String[] args) {
		
		BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	
	 private int readUserData() {
		 
		 //scans user input
		Scanner in = new Scanner(System.in);
		
		while(true) {
			//prints out lines with corresponding input values
			System.out.println("1. Pounds/Inches");
			System.out.println("2. Kilograms/Meters");
			System.out.println("Please choose your units of measurement");
			
			//setting int select equal to user input
			select = in.nextInt();
			
			//if select first option, user has chosen Pounds/Inches
			if(select == 1)
			{
				System.out.print("Enter Weight in Pounds:");
				weight = in.nextFloat();
				
				System.out.print("Enter Height in Inches:");
				setHeight = in.nextFloat();
				
				break;
			}
			
			//if select second option, user has chosen Kilograms/Meters
			else if (select == 2) {
				System.out.print("Enter Weight in Kilograms:");
				weight = in.nextFloat();
				
				System.out.print("Enter Height in Meters:");
				setHeight = in.nextFloat();
				
				break;
				
			}
			//if input anything besides values 1 or 2, print the following line
			else {
				System.out.println("Please choose another input value.");
				break;
			}
		}
		return 0;
		
		
	}
	 
	 public void calculateBmi() {
		
		 //calculations for bmi
		 if (select == 1) {
			 bmi = (weight * 703) / (setHeight * setHeight);
			 
			 if (select == 2)
				 bmi= weight/ (setHeight * setHeight);
			 
		 }
	 }
	 
	 public void displayBmi() {
		 
		//calculates users rating/category from their input values according to BMI scale 
		 String rating = ""; 
		 if(bmi < 18.5)
			 rating = "Underweight";
		 else if (bmi >= 18.5 && bmi <= 24.9)
			 rating = "Normal";
		 else if (bmi >= 25 && bmi <= 29.9)
			rating = "Overweight";
		 else if (bmi > 30)
			 rating = "Obese";
		 
		 //prints out a string named "rating", telling each user which category they are in on the BMI scale according to their input values
		 System.out.println("Your BMI is:" + bmi);
		 System.out.println("Your category is" + rating);
		 
		 
	 }

}


