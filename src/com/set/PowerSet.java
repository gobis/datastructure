package com.set;

public class PowerSet {

	public static void main(String[] args) {
		 char set[] = {'a', 'b', 'c'};
	     printSubsets(set);
	}

		
	/**
	 *    2^n is Number of subset , make it numeric and find all 
	 *    0 0 0   {}
	 *    0 0 1   {a}
	 *    0 1 0   {b}
	 *    1 0 0   {c}
	 *    0 1 1   {a,b}
	 *    1 0 1   {a,c}
	 *    1 1 0   {b,c}
	 *    1 1 1   {a,b,c} 
	 *   @param set
	 */
	
	  // Print all subsets of given set[]
    static void printSubsets(char set[])
    {
        int n = set.length;
 
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0 )
                    System.out.print(set[j] + " ");
 
            System.out.println("}");
        }
    }
}
