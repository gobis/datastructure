package com.recursion;

public class PowerN {

	 public int powerN(int base , int power){
		 
		 if(power == 0 ) return 1;
		 
		 if(power == 1 ) return base * power ;
		 
		 return base * powerN(base , power -1 );
		 
	 }
		
}
