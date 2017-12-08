package com.recursion;

public class PairStar {
	
	
	public String buildPairStar(String str){
		
		  
		   if(str.length() == 1) return str;
		   
           String first = Character.toString(str.charAt(0));	
           String second = Character.toString(str.charAt(1));	
           
           System.out.println("First "+first+ "   second " + second);
		  
           if(first.equals(second)){
        	   return first+"*"+second+buildPairStar(str.substring(2, str.length()));
           }else{
        	   return first+buildPairStar(str.substring(1, str.length()));
           }
		   
	}

}
