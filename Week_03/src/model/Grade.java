package model;

public class Grade {
	
	/* stage 1: get the letter grade for 'marks' */
	// calling getLetterGrade1 as a helper method
	String lg = getLetterGrade1(marks);
	
	/* stage 2: determine if the letter grade corresponds to a good performance (C or above) */
	
	//boolean didWell = lg.equals("A+")
	
	
	
	// Version 1
	public static String getLetterGrade1(int marks) {
		String lg = "";
		
		if (marks >= 90) {
			lg = "A+";
		}
		
		else if (marks >= 80) {
			lg = "A";
		}
		
		else if (marks >= 75) {
			lg = "B+";
		}
		
		else if (marks >= 70) {
			lg = "B";
		}
		
		else if (marks >= 65) {
			lg = "C+";
		}
		
		else if (marks >= 60) {
			lg = "C";
		}
		
		else if (marks >= 55) {
			lg = "D+";
		}
		
		else if (marks >= 50) {
			lg = "D+";
		}
		
		else {
			lg = "F";
		}
		
		return lg;
		
	}

	//Version 2
//	public static String getLetterGrade2(int marks) {
//		String lg = "";
//		
//		if (90 <= marks && marks <= 100) {
//			lg = "A+";
//		}
//		
//		if (80 <= marks && marks < 90) {
//			lg = "A";
//		}
//		
//		if (75 <= marks && marks < 80) {
//			lg = "B+";
//		}
//		
//		if (70 <= marks && marks < 75) {
//			lg = "B";
//		}
//		
//		if (65 <= marks && marks < 70) {
//			lg = "C+";
//		}
//		
//		if (60 <= marks && marks < 65) {
//			lg = "C";
//		}
//		
//		if (55 <= marks && marks < 60) {
//			lg = "D+";
//		}
//		
//		if (50 <= marks && marks < 55) {
//			lg = "D";
//		}
//		
//		if (0 <= marks && marks < 50) {
//			lg = "F";
//		}
//		
//		
//		return lg;
//		
//	}
	
	//Version3 - Replace Version && to ||, This version is WRONG
//	public static String getLetterGrade3(int marks) {
//		String lg = "";
//		
//		if (90 <= marks || marks <= 100) {
//			lg = "A+";
//		}
//		
//		if (80 <= marks || marks < 90) {
//			lg = "A";
//		}
//		
//		if (75 <= marks || marks < 80) {
//			lg = "B+";
//		}
//		
//		if (70 <= marks || marks < 75) {
//			lg = "B";
//		}
//		
//		if (65 <= marks || marks < 70) {
//			lg = "C+";
//		}
//		
//		if (60 <= marks || marks < 65) {
//			lg = "C";
//		}
//		
//		if (55 <= marks || marks < 60) {
//			lg = "D+";
//		}
//		
//		if (50 <= marks || marks < 55) {
//			lg = "D";
//		}
//		
//		if (0 <= marks || marks < 50) {
//			lg = "F";
//		}
//		
//		
//		return lg;
//	}
//	
	//Version 4 - Nested if version
	
//	public static String getLetterGrade4(int marks) {
//		String lg = "";
//		
//		if (marks >= 80) {
//			
//			if (marks >= 90) {
//				lg = "A+";
//			}
//			
//			else {
//				lg = "A";
//			}
//		}
//		
//		else if (marks >= 75) {
//			lg = "B+";
//		}
//		
//		else if (marks >= 55) {
//			
//			if(marks >= 70) {
//				lg = "B";
//			}
//			
//			else if (marks >= 65) {
//				lg = "C+";
//				
//			}
//			
//			else if (marks >= 60) {
//				lg = "C";
//			}
//			
//			else {
//				lg = "D+";
//			}
//			
//		}
//		
//		else if (marks >= 50) {
//			lg = "D";
//		}
//		
//		else {
//			lg = "F";
//		}
//		
//		
//		return lg;
//	}

}

