package com.general;

public class MaxConcecutiverepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaccderrr";
		System.out.println(MaxRepeating(str));
		
	}
	
	
	public static char MaxRepeating(String input){
		
		int len = input.length();
		
		char currentChar = input.charAt(0);
		int maxRepeating = 0 ;
		int maxSofar =0 ;
		char maxRepeatChar = 0;
		
		for(int i = 1 ; i<len ;i++){
			char nextChar = input.charAt(i);
			
			if(currentChar == nextChar){
				maxRepeating++ ;
				
				if(maxRepeating > maxSofar){
					maxSofar = maxRepeating;
					maxRepeatChar = nextChar;
				}
				
			}else{
				currentChar = nextChar ;
				maxRepeating = 0 ;
			}
		}
		
		return maxRepeatChar;
	}

}
