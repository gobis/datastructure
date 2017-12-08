package com.recursion;

public class SumProblem {

	
	public int sum(int number){
		
		if(number < 10) return number;
		
		int last_digit = number%10 ;
		int loop_digit = number/10 ;
		
		return last_digit+sum(loop_digit);
		   
	   }
	
}
