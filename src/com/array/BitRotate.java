package com.array;

public class BitRotate {

	private static int INT_MAX_LENGTH = 32 ; // int has 32 bits 
	// Similar logic you 
	
	public static void main(String[] args) {

		int value = 6;
		int rotate = 3;

		int val1 = bitleftRotate(value, rotate);
		int val2 = bitRightRotate(value, rotate);

		System.out.println("Value 1 :  " + val1);
		System.out.println("Value 2 :  " + val2);
	}
	
	
	public static int bitleftRotate(int value, int rotation){
	
		return ( value << rotation); // | value >> INT_MAX_LENGTH -rotation);
		
	}
	
    public static int bitRightRotate(int value, int rotation){
    	return ( value >> rotation | value << INT_MAX_LENGTH -rotation);
	}
	
	
}
