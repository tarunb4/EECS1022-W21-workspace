package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 *  
	 * Refer to you lab instructions for what the method should return.
	 * 
	 * See this short tutorial video illustrating how to compute tax:
	 * https://www.youtube.com/watch?v=q2NT5x77hdg&list=PL5dxAmCmjv_7YgI2LgcwjWTHiNZSR-aQX&index=1 
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";
		
		if (status == 1) {
			if (income >= 0 && income <= 8350) {
				double calculation = income * 0.1;
				String calculations = String.format("%.2f", calculation);
				result = "Single Filing: $" + calculations + " (Part I: $" + calculations + ")";
			}
			
			else if (income > 8350 && income <= 33950) {
				double calculation = (income - 8350) * .15;
				double tax_total = 835.00 + calculation;
				String calculations = String.format("%.2f", calculation);
				String tax_totals = String.format("%.2f", tax_total);
				result = "Single Filing: $" + tax_totals + " (Part I: $835.00, Part II: $" + calculations + ")";
			}
			
			else if (income > 33950) {
				double calculation = (income - 33950) * .25;
				double tax_total = 835.00 + 3840.00 + calculation;
				String calculations = String.format("%.2f", calculation);
				String tax_totals = String.format("%.2f", tax_total);
				result = "Single Filing: $" + tax_totals + " (Part I: $835.00, Part II: $3840.00, Part III: $" + calculations + ")";
			}
		}
		
		else if (status == 2) {
			
			if(income >= 0 && income <= 16700) {
				double calculation = income * 0.1;
				String calculations = String.format("%.2f", calculation);
				result = "Married Filing: $" + calculations + " (Part I: $" + calculations + ")";
			}
			
			else if (income > 16700 && income <= 67900) {
				double calculation = (income - 16700) * .15;
				double tax_total = 1670.00 + calculation;
				String calculations = String.format("%.2f", calculation);
				String tax_totals = String.format("%.2f", tax_total);
				result = "Married Filing: $" + tax_totals + " (Part I: $1670.00, Part II: $" + calculations + ")";
			}
			
			else if (income > 67900) {
				double calculation = (income - 67900) * .25;
				double tax_total = 1670.00 + 7680.00 + calculation;
				String calculations = String.format("%.2f", calculation);
				String tax_totals = String.format("%.2f", tax_total);
				result = "Married Filing: $" + tax_totals + " (Part I: $1670.00, Part II: $7680.00, Part III: $" + calculations + ")";
			}
		}
		
		else {
			result = "Illegal Status: " + status;
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
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 *     
	 * Hints:
	 *  - Compare character values using the relational operator ==.
	 *  - Study the 9 test cases in TestUtilites: they are arranged in a systematic (yet not exhaustive) way.
	 *    Q. In order to exhaustively test this game, considering how two players may play in two rounds,
	 *    	 how many tests do we need? (Optionally, you may write extra test yourself as an exercise.)
	 *    
	 * Refer to you lab instructions for what the method should return.
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		int wins_p1r1 = 0;
		int wins_p2r1 = 0;
		int wins_p1r2 = 0;
		int wins_p2r2 = 0;
		
		if (p1r1 == 'R' && p2r1 == 'S' || p1r1 == 'P' && p2r1 == 'R' || p1r1 == 'S' && p2r1 == 'P') {
			wins_p1r1 += 1;
		}
		
		if (p1r1 == 'S' && p2r1 == 'R' || p1r1 == 'R' && p2r1 == 'P' || p1r1 == 'P' && p2r1 == 'S') {
			wins_p2r1 += 1;
		}
	
		if (p1r1 == 'R' && p2r1 == 'R' || p1r1 == 'P' && p2r1 == 'P' || p1r1 == 'S' && p2r1 == 'S') {
			wins_p1r1 += 1;
			wins_p2r1 += 1;
		}
		
		if (p1r2 == 'R' && p2r2 == 'S' || p1r2 == 'P' && p2r2 == 'R' || p1r2 == 'S' && p2r2 == 'P') {
			wins_p1r2 += 1;
		}
		
		if (p1r2 == 'S' && p2r2 == 'R' || p1r2 == 'R' && p2r2 == 'P' || p1r2 == 'P' && p2r2 == 'S') {
			wins_p2r2 += 1;
		}
		
		if (p1r2 == 'R' && p2r2 == 'R' || p1r2 == 'P' && p2r2 == 'P' || p1r2 == 'S' && p2r2 == 'S') {
			wins_p1r2 += 1;
			wins_p2r2 += 1;
		}
		
		
		if (wins_p1r1 > wins_p2r1 && wins_p1r2 > wins_p2r2) {
			result = "Game over: " + p1 + " wins! [Round 1: " + p1 + " wins (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p1 + " wins (" + p1r2 + " vs. " + p2r2 +")]";

		}
		
		else if (wins_p1r1 < wins_p2r1 && wins_p1r2 < wins_p2r2) {
			result = "Game over: " + p2 + " wins! [Round 1: " + p2 + " wins (" + p2r1 + " vs. " + p1r1 + ") ; Round 2: " + p2 + " wins (" + p2r2 + " vs. " + p1r2 +")]";
		}
		
		else if (wins_p1r1 > wins_p2r1 && wins_p1r2 == wins_p2r2) {
			result = "Game over: " + p1 + " wins! [Round 1: " + p1 + " wins (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: Tie (" + p1r2 + " vs. " + p2r2 +")]";
		}
		
		else if (wins_p1r1 == wins_p2r1 && wins_p1r2 > wins_p2r2) {
			result = "Game over: " + p1 + " wins! [Round 1: Tie (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p1 + " wins (" + p1r2 + " vs. " + p2r2 +")]";
		}
		
		else if (wins_p1r1 < wins_p2r1 && wins_p1r2 == wins_p2r2) {
			result = "Game over: " + p2 + " wins! [Round 1: " + p2 + " wins (" + p2r1 + " vs. " + p1r1 + ") ; Round 2: Tie (" + p1r2+ " vs. " + p2r2 +")]";
		}
		
		else if (wins_p1r1 == wins_p2r1 && wins_p1r2 < wins_p2r2) {
			result = "Game over: " + p2 + " wins! [Round 1: Tie (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p2 + " wins (" + p2r2 + " vs. " + p1r2 +")]";
		}
		
		else if (wins_p1r1 == wins_p2r1 && wins_p1r2 == wins_p2r2) {
			result = "Game over: Tie! [Round 1: Tie (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: Tie (" + p1r2 + " vs. " + p2r2 +")]";
		}
		
		else if (wins_p1r1 > wins_p2r1 && wins_p1r2 < wins_p2r2) {
			result = "Game over: Tie! [Round 1: " + p1 + " wins (" + p1r1 + " vs. " + p2r1 + ") ; Round 2: " + p2 + " wins (" + p2r2 + " vs. " + p1r2 +")]";
		}
		
		else if (wins_p1r1 < wins_p2r1 && wins_p1r2 > wins_p2r2) {
			result = "Game over: Tie! [Round 1: " + p2 + " wins (" + p2r1 + " vs. " + p1r1 + ") ; Round 2: " + p1 + " wins (" + p1r2 + " vs. " + p2r2 +")]";
		}
		
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
