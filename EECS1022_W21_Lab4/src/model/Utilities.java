package model;
import java.util.Arrays;

/*
 * Requirements:
 * - Any use of Java library classes or methods (e.g., ArrayList) is forbidden.
 * 	 (That is, there must not be an import statement in the beginning of this class.)
 * Violation of this requirement will result in a 50% penalty of your marks.
 *  
 * - Use only if-statements and/or loops to manipulate primitive arrays (e.g., int[], String[]).
 */

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getMultiplesOf3(int[] numbers) {
		int[] result = null;
		
		int multiof3 = 0;
		int num = 0;
		
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] % 3 == 0) {
				multiof3 ++;
			}
		}
		
		result = new int[multiof3];
		
		for(int x = 0; x < numbers.length; x ++) {
			if (numbers[x] % 3 == 0) {
				result[num] = numbers[x];
				num ++;
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
	 * 	- `numbers` : an array of integers
	 * 	- `n`		: an integer (which may or may not exist in `numbers`)
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getFilteredSeq(int[] numbers, int n) {
		int[] result = null;
		
		int x = 0;
		int num_of_filteredseq = 0;
		
		
		for (int i = 0; i < numbers.length; i ++) {
			if(numbers[i] != n) {
				num_of_filteredseq ++;
			}
		}
		
		result = new int[num_of_filteredseq];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] != n) {
				result[x] = numbers[i];
				x ++;
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
	 * 	- `numbers` : an array of integers
	 * 
	 * Assumptions:
	 * 	- numbers.length >= 1
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static String[] getAllPrefixes(int[] numbers) {
		String[] result = null;
		
		int size = numbers.length;
		
		result = new String[size];
		
		for(int i = 0; i < size; i++) {
			int count = i + 1;
			String [] elements = new String[count];
			
			for(int x = 0; x < elements.length; x++) {
				elements[x] = String.valueOf(numbers[x]);
			}
			
			result[i] = Arrays.toString(elements);
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
	 * 	- `numbers` : an array of integers
	 *  
	 * Refer to you lab instructions for what the method should return. 
	 */
	public static int[] getGroupedNumbers(int[] numbers) {
		int[] result = null;
		
		int size = numbers.length;
		int x = 0;
		result = new int[size];
		
		for(int i = 0; i < size; i ++) {
			if(numbers[i] % 3 == 0) {
				result[x] = numbers[i];
				x ++;
			}
		}
		
		for(int i = 0; i < size; i ++) {
			if(numbers[i] % 3 == 1 || numbers[i] % 3 == 3) {
				result[x] = numbers[i];
				x ++;
			}
		}
		
		for(int i = 0; i < size; i ++) {
			if(numbers[i] % 3 == 2) {
				result[x] = numbers[i];
				x ++;
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
}
