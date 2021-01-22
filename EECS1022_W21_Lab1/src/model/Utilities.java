package model;

public class Utilities {
	
	/*
	 * Assumption: the return geometric sequence is of a fixed size 5. 
	 * Therefore, it is not necessary to solve this problem using a loop,
	 * or to use methods from a library class (e.g., Math).\
	 * 
	 * Input parameters:
	 * 	- `ft` is the first term in the sequence
	 *  - `ratio` is the common rations among terms in the sequence
	 *  
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getGeometricSequence(int ft, int r) {
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		int term1 = ft;
		int term2 = term1 * r;
		int term3 = term2 * r;
		int term4 = term3 * r;
		int term5 = term4 * r;
		
		int sum = term1 + term2 + term3 + term4 + term5;
		
		double average = sum/5.0;
		
		String averages = String.format("%.1f", average);
		
		
		String result = "[" + term1 + "]" + "[" + term2 + "]" + "[" + term3 + "]" + "[" + term4 + "]" + "[" + term5 + "] has average " + averages;
		
		return result;
		
		/* Your implementation ends here. */
		
		
	}
	
	/*
	 * Input parameters:
	 *   - `weight` is the user's weight in pounds
	 *   - `height` is the user's height in inches
	 *   
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static double getBMI(double weight, double height) {
		double result = 0.0;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		double convert_weight = weight * 0.4536;
		double convert_height = height * 0.0254;
		
		result = convert_weight / (convert_height * convert_height);
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Assumption: input value `seconds` is non-negative (i.e., >= 0).
	 * 
	 * Input parameters:
	 *   - `seconds` is the number of seconds to be converted
	 *   
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getTimeConversion(int seconds) {
		String result = "";
		
		int days = seconds / 86400;
		int remaining_daysseconds = seconds % 86400;
		
		int hours = remaining_daysseconds / 3600;
		int remaining_hourseconds = remaining_daysseconds % 3600;
		
		
		int minutes = remaining_hourseconds / 60;
		int remaining_seconds = remaining_hourseconds % 60;
		
		result = days + " days " + hours + " hours " + minutes + " minutes " + remaining_seconds + " seconds"; 
		
		return result;
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		
		
	}
}
