package com.stack;

public class TowerOfHanoi {

	public static void main(String []args){
		
		BuildTower(4,'a','b','c',"main");
		
	}
	
	public static void BuildTower(int n , char start, char aux , char end,String fromwhere ){
		System.out.println("start\t"+start+"\taux\t"+aux+"\tend\t"+end + "\t value of n\t"+n + "\t"+fromwhere);
		if(n ==1){
			System.out.println("From   " +start+"\t To   "+end);
		}else{
			BuildTower(n-1, start, end, aux,"from 1");
			BuildTower(1, start, aux, end,"from 2");
			BuildTower(n-1,aux , start, end,"from 3");
		}
	}
	// output 
	/*
	 start	a	aux	b	end	c	 value of n	4	main
start	a	aux	c	end	b	 value of n	3	from 1
start	a	aux	b	end	c	 value of n	2	from 1
start	a	aux	c	end	b	 value of n	1	from 1
From   a	 To   b
start	a	aux	b	end	c	 value of n	1	from 2
From   a	 To   c
start	b	aux	a	end	c	 value of n	1	from 3
From   b	 To   c
start	a	aux	c	end	b	 value of n	1	from 2
From   a	 To   b
start	c	aux	a	end	b	 value of n	2	from 3
start	c	aux	b	end	a	 value of n	1	from 1
From   c	 To   a
start	c	aux	a	end	b	 value of n	1	from 2
From   c	 To   b
start	a	aux	c	end	b	 value of n	1	from 3
From   a	 To   b
start	a	aux	b	end	c	 value of n	1	from 2
From   a	 To   c
start	b	aux	a	end	c	 value of n	3	from 3
start	b	aux	c	end	a	 value of n	2	from 1
start	b	aux	a	end	c	 value of n	1	from 1
From   b	 To   c
start	b	aux	c	end	a	 value of n	1	from 2
From   b	 To   a
start	c	aux	b	end	a	 value of n	1	from 3
From   c	 To   a
start	b	aux	a	end	c	 value of n	1	from 2
From   b	 To   c
start	a	aux	b	end	c	 value of n	2	from 3
start	a	aux	c	end	b	 value of n	1	from 1
From   a	 To   b
start	a	aux	b	end	c	 value of n	1	from 2
From   a	 To   c
start	b	aux	a	end	c	 value of n	1	from 3
From   b	 To   c

	 */
	
	
	
}
