import java.util.Scanner;


public class BMICalculator 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		Scanner scnr = new Scanner(System.in);
		
		String command = "quit";
		System.out.print("Enter weight in pounds: ");
		int numWeight = scnr.nextInt();
		numWeight *= 703;
		
		System.out.print("Enter height in feet: ");
		int numFeet =  scnr.nextInt();
		
		System.out.print("             in inches: ");
		int numInches =  scnr.nextInt();

		int numHeight = (numFeet * 12) + numInches;
		double bodyMassIndex = numWeight / (Math.pow(numHeight, 2));
		System.out.print("Press Enter if you would to continue or type QUIT to exit: ");
		command = input.nextLine();
		while (!command.equalsIgnoreCase ("quit")) {
		if (bodyMassIndex < 18.5) {
			System.out.println(bodyMassIndex);
			System.out.println("You are underweight.");
		}
		else if (bodyMassIndex >= 18.5 && bodyMassIndex <= 25.9) {
			System.out.println(bodyMassIndex);
			System.out.println("You are normal weight");
		}
		else if (bodyMassIndex >= 25 && bodyMassIndex <= 29.9) {
			System.out.println(bodyMassIndex);
			System.out.println("You are overweight");
		}
		else {
			System.out.println(bodyMassIndex);
			System.out.println("You are obese");
		}
	System.out.print("Press Enter if you would to continue or type QUIT to exit: ");
	command = input.nextLine();
		}
	}
}
		