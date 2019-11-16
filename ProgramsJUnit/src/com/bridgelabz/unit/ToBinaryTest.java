package com.bridgelabz.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class ToBinaryTest {
	private int inputNum;
	private String expected;
	private ToBinary toBinary;
	
	@Before
	public void initialize()
	{
		toBinary = new ToBinary();
	}

	 
	
	public ToBinaryTest(Integer inputNum, String expected) {
	
		this.inputNum = inputNum;
		this.expected = expected;
	}
	  @Parameterized.Parameters
	   public static Collection toBinaryTest() {
	      return Arrays.asList(new Object[][] {
	    	  { 106, "1101010" }
	      });
	      }
   
	@Test
	void testToBinary() {
		 System.out.println("Parameterized Number is : " + inputNum);
		assertEquals(expected,toBinary.decToBinary(inputNum));
	}

}
