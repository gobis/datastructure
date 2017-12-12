package com.general;

public class RatMazePathCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maze[][] = { 
				{ 1, 0, 0, 0 },
				{ 1, 1, 1, 1 }, 
				{ 0, 1, 1, 0 }, 
				{ 1, 1, 1, 1 } 
				};

		int paths = countNumPath(maze, 4, 4);
		System.out.println(
				paths == -1 ? " There is no way to reach dest" : "there are " + paths + " paths to reach dest");

	}

	public static int countNumPath(int[][] maze, int row, int col) {

		// init row and col , when there is block and
		// next element should be blocker though it is open

		for (int k = 1; k < row; k++) {
			if(maze[k-1][0] == 0){
				maze[k][0] = 0 ;
			}

		}

		for (int k = 1; k < row; k++) {
			if(maze[0][k-1] == 0){
				maze[0][k] = 0 ;
			}
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {

				if (maze[i][j] > 0) {
					maze[i][j] = maze[i - 1][j] + maze[i][j - 1];
				}
			}
		}

		return maze[row - 1][col - 1];

	}

}
