package com.evry.junittestdemo;

public class MathOperation {
	 	private final int num1;
	    private final int num2; 

	    public MathOperation(int num1, int num2) {
	        this.num1 = num1;
	        this.num2 = num2;

	    }

	    public static int add(int num1, int num2){  
	        int sum=0;  
	        sum = num1 + num2;
	        return sum;  
	    }  
	    
	    public static int multiply(int num1, int num2){  
	        int mul=0;  
	        mul = num1 * num2;
	        return mul;  
	    } 
	    
	    public static int divide(int num1, int num2){  
	        int rem=0;  
	        rem = num1 / num2;
	        return rem;  
	    } 
	    
	    public static int checkMin(int arr[]){  
	        int min = arr[0];  
	        for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
	        return min;  
	    } 
	    
	    
	    public static int[] squareOfANumber(int arr[]){  
	        
	        int[] a = new int[] {0,0};
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					arr[i] = (int) Math.pow(arr[i], 2);
					a [i] = arr[i];
				}
			}
	        return a;  
	    } 
	    
	    
}
