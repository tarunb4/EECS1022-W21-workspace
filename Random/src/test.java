import java.util.Scanner;

import console_apps.BMI;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String user = input.nextLine();
		
		System.out.println("Enter your unit of weight");
		String unitOfWeight = input.nextLine();
		System.out.println("Enter value of weight");
		double valueOfWeight = input.nextDouble();
		
		System.out.println("Enter your unit of height");
		String unitOfHeight = input.nextLine();
		
		System.out.println("Enter value of Height");
		double valueOfHeight = input.nextDouble();
		
		/* Stage 2: Invoke the relevant utility method with the user input(s) */
		String result = BMI.getBMIReport(unitOfWeight, valueOfWeight, unitOfHeight, valueOfHeight);
		
		/* Stage 3: Output the returned value back to the user over the console. */
		System.out.println(user + ", your BMI is: " + result);
		
		input.close();

	}

}
