package com.first.maven.proj.mavenjunitproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void testMain() {
		String[] args = {"1"};
		SimpleMainClass.main(args);		
	}
	
	@Test
	public void testDefaultArguments(){
		String [] args = {};
		SimpleMainClass.main(args);
	}	
	
	@Test
	public void testForTrueEnteredValueCheck(){
		SimpleMainClass testObj = new SimpleMainClass();
		String retVal = testObj.EnteredValueCheck(1);
		assertEquals("true", retVal);
	}
	
	@Test
	public void testForFalseEnteredValueCheck(){
		SimpleMainClass testObj = new SimpleMainClass();
		String retVal = testObj.EnteredValueCheck(2);
		assertEquals("false", retVal);
	}

}
