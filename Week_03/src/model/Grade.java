package model;

public class Grade {
	
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

}

