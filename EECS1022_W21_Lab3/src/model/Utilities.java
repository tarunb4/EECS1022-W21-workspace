package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `lower` is the lower bound
	 *  - `upper` is the upper bound
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.   
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getNumbers(int lower, int upper) {
		String result = "";
		
		if (upper > 0 && lower < 0 || upper < 0 && lower < 0 || lower > 0 && upper < 0) {
			result = "Error: both bounds must be non-negative";
		}
		
		else if (lower > upper ) {
			result = "Error: lower bound " + lower + " is not less than or equal to upper bound " + upper;
			
		}
		
		else{
			for(int i = lower; i <= upper; i++ ) {
				
					
				if (i % 3 == 0 ) {
					
					String parentheses = "(" + i + ")";
					result += parentheses;
					
				}
				
				else if (i % 3 == 1) {
					String square_brackets = "[" + i + "]";
					result += square_brackets;
				}
				
				else if (i % 3 == 2) {
					String curly = "{" + i + "}";
					result += curly;
				}
				
				if (i != upper) {
						result += ", ";
					}
				}	
			
			if (lower == upper) {
				result = "1 number between " + lower + " and " + upper + ": <" + result + ">";
			}
			
			else {
				int difference = upper - lower + 1;
				result = difference + " numbers between " + lower + " and " + upper + ": <" + result + ">";
			}
			
		}	
		
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `ft`, `d`, `n` are the first term, common difference, and size of an arithmetic sequence.
	 * 
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only. 
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getIntermediateStats(int ft, int d, int n) {
		String result = "{";
		
		if(n == 1) {
			result += String.format("[sum of <%d>: %d ; avg of <%d>: %.2f]", ft,ft,ft,(double)ft);
		}
		
		else if (n > 1) {
			result += String.format("[sum of <%d>: %d ; avg of <%d>: %.2f]", ft,ft,ft,(double)ft);
			int sum = ft;
			int term = ft;
			
			double average = term * 1.0;
			String nums = "" + ft + "";
			
			for (int i = 2; i <= n; i ++) {
			
			term += d;
			sum += term;
			
			
			average = (sum * 1.0) / (i* 1.0);
			String averages = String.format("%.2f", average);
			
			nums += ", " + term;
			
			
			
			result += ", [sum of <" + nums + ">: " + sum + " ; avg of <" + nums + ">: " + averages + "]";
			}
			
			
		}
				
			
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		return result + "}";
	}
	
	/*
	 * Input parameters:
	 * 	- `ft1`, `d1`, `n1` are the first term, common difference, and size of the first arithmetic sequence.
	 *  - `ft2`, `d2`, `n2` are the second term, common difference, and size of the second arithmetic sequence.
	 *  
	 * Use of arrays or any Java library class (e.g., ArrayList) is strictly forbidden.
	 * Violation of this will result in a 50% penalty on your marks.
	 * Try to solve this problem using loops only.  
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String getInterlevaings(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String result = "";
		
		result += "<";
		
		int count1 = 0;
		int count2 = 0;
		int max_size = n1 + n2;
		
		while (count1 < n1 || count2 < n2) {
			if (count1 < n1) {
				result += String.format("(%d)",ft1);
				if(count1 + count2 != max_size - 1) {
					result += ", ";
				}
				
				ft1 += d1;
				count1 += 1;
			}
			
			if (count2 < n2) {
				result += String.format("[%d]",ft2);
				if(count2 + count1 != max_size - 1) {
					result += ", ";
				}
				
				ft2 += d2;
				count2 += 1;
			}
			
		}
			
		
		result += ">"; 
		
		/* Your implementation of this method starts here. 
		 * Recall from Week 1's tutorial videos:
		 * 1. No System.out.println statements should appear here.
		 * 	  Instead, an explicit, final `return` statement is placed for you.
		 * 2. No Scanner operations should appear here (e.g., input.nextInt()).
		 *    Instead, refer to the input parameters of this method.   
		 */
		
		
		
		/* Your implementation ends here. */
		return result;
	}

	private static int max(int n1, int n2) {
		// TODO Auto-generated method stub
		return 0;
	}	
}
