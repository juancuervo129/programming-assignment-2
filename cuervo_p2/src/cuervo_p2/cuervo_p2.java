package cuervo_p2;
import java.util.Scanner;

public class cuervo_p2 {

	
	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
		
		
		System.out.println("For standard BMI formula enter 1, for metric BMI formula enter 2.");
			
		int formula = in.nextInt();
		
		
		if(formula == 1)
		{
			System.out.println("Enter weight in pounds: ");
			int weight = in.nextInt();
			
			System.out.println("Enter height in inches: ");
			double height = in.nextInt();
			
			double bmi1 = (double)(703*weight)/(height*height);	
			System.out.println(bmi1);
		}
		
		
		else if(formula == 2)
		{
			System.out.println("Enter weight in kilograms: ");
			int weight = in.nextInt();
			
			System.out.println("Enter height in meters: ");
			double height = in.nextInt();
			
			double bmi2 = (double)(weight)/(height*height);
			System.out.println(bmi2);
		}
		
		
	System.out.println("\nBMI Categories");
	System.out.println("Underweight = <18.5");
	System.out.println("Normal weight = 18.5-24.9");
	System.out.println("Overweight = 25-29.9");
	System.out.println("Obesity = BMI of 30 or greater");
	
	in.close();
	
	}
}
