package com.evry.junittestdemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;
public class MathOperationTest {
	
	
	@Test  
    public void testAdd(){  
        assertEquals(5,MathOperation.add(2,3));  
    }  
	
	@Test  
    public void testMultiply(){  
        assertEquals(4,MathOperation.multiply(2,2));  
    } 
	
	@Test  
    public void testDivide(){  
        assertEquals(4,MathOperation.divide(8,2));  
    } 
	
	
	@Test  
    public void testCheckMin(){  
        assertEquals(3,MathOperation.checkMin(new int[] {3,5,7,9}));  
    }  
	
	
	@Test  
    public void testSquareOfANumber(){  
        int[] isExpectedarr = new int[] {4,9};
		int[] squareOfANumber = MathOperation.squareOfANumber(new int[] {2,3});
		assertTrue(Arrays.equals(isExpectedarr, squareOfANumber));
    }
}
