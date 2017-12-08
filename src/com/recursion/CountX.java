package com.recursion;

public class CountX {
	
   public int countx(String str){
	   
	   System.out.println(" Input is " + str);
	   
	   if(str.length() == 0) return 0;
	   
	   if(str.startsWith("X")) return 1 + countx(str.substring(1, str.length()));
	   else return 0 + countx(str.substring(1, str.length())) ;
	   
   }
	

}
