package Recursion;

public class Labirinte {
	public static int count=0;
	
	public static char[][] lab = {
		    {' ', ' ', ' ', ' ', ' ', ' ', ' '},
		    {'*', '*', ' ', '*', '*', '*', ' '},
		    {' ', ' ', ' ', ' ', ' ', ' ', ' '},
		    {' ', '*', '*', '*', '*', '*', ' '},
		    {' ', ' ', ' ', ' ', ' ', ' ', 'e'},
		};
	
	public static void main(String[] args){
		solve(0,0,0);
		System.out.printf("Founded %s ways",count);
	}
	
	private static void solve(int row, int col,int steps) {
		//bottom
		if(row<0 || row>=lab.length || col<0 || col>=lab[0].length){ //outside labyrinth
			return;
		}
		
		if(lab[row][col]=='*'){
			return;
		}
		
		if(lab[row][col]=='e'){
			count++;
			//printing steps
			System.out.printf("%s- Found way with %s steps \n",count,steps);
			//set steps after print default value (0)
			steps=0;
			return;
		}
		
		if(lab[row][col]!=' '){
			//The current cell is not free-> can't find a path
			return;
		}
		
		//mark spot
		lab[row][col]='x';
		steps++;
		
		//go left
		solve(row,col-1,steps);
		
		//go up
		solve(row-1,col,steps);
		
		//go right
		solve(row,col+1,steps);
		
		//go bottom
		solve(row+1,col,steps);
		
		//unmark spot
		lab[row][col]=' ';
		
		
	}
}
