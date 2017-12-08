package com.recursion;

public class RecursionDriver {
	
	public static void main(String[] args) {

		
		int result_Number ;
		String result_String = "";  
		
		/*CountX obj = new CountX();
		int count =  obj.countx("XXhiXXhiXX");
		System.out.println(" Total count is " + count );*/
		
	   /*PairStar ps = new PairStar();
		String result = ps.buildPairStar("hello my deer hello");
		System.out.println(result);*/
				
		/*
	    SumProblem sp = new SumProblem();
		result_Number = sp.sum(473);
		*/
		
		PowerN powerN = new PowerN();
		result_Number = powerN.powerN(4, 2);
		
		
		System.out.println(result_Number);
		
	}
	
}
