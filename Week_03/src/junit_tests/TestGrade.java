package junit_tests;

import static org.junit.Assert.*;

import org.junit.Test;

import model.Grade;


public class TestGrade {
	
//	@Test
//	public void test() {
//		String result = Grade.getLetterGrade1(63);
//		assertEquals("C", result);
//	}
//	
//	@Test 
//	public void test2() {
//		String result = Grade.getLetterGrade2(63);
//		assertEquals("C", result);
//	}
//	
//	@Test
//	public void test3() {
//		String result = Grade.getLetterGrade3(91);
//		assertEquals("A+", result);
//	}
	
	@Test
	public void test4() {
		String result = Grade.getLetterGrade4(67);
		assertEquals("C+", result);
	}

}
