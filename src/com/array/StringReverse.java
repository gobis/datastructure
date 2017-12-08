package com.array;

public class StringReverse {

	
	public static void main(String []args){
		
	  String data = "Good Morning";
	  System.out.print("Actual data : "+data);
	  String data2 = ReverseString(data);
	  System.out.print("\nReverse data : "+data2);
    }
	
	
	private static String ReverseString(String data){
		
		int i = 0, j=data.length()-1;
		
		char[] actdata = data.toCharArray();
		
		
		while(i<=j){
			
			char temp = actdata[i];
			actdata[i] = actdata[j];
			actdata[j] = temp;
			
			i++; j--;
					
		}
		
		return String.copyValueOf(actdata);
	}

	
	
}
