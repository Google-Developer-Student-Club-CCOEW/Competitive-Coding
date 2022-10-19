
public class Question_1 {
    private static int solve(int[][] grid, int m, int n, int i, int j, int xor){
        if(i >= m || j >= n || i <0 || j<0){	//terminating condition
            return 0;
        }
        xor = xor ^ grid[i][j];		//xor of the sum and the grid cell value
        if(i == m-1 && j == n-1 && (xor) == 0){		//if at end of grid xor of path is 0 then return 1
            return 1;
        }
        if(i == m-1 && j == n-1){	//if at end of grid and sum is not 0 then return 0
            return 0;
        }

        return (solve(grid,m,n,i+1,j,xor) + solve(grid,m,n,i,j+1,xor)); //summing the total number of path obtained
    }
	public static void main(String[] args) {
		int [][] grid= {{5,2,0},{2,0,2},{0,7,5}}; 	//input
		int m=grid.length;			//row
		int n=grid[0].length;		//col
		int res=solve(grid,m,n,0,0,0);		//function calling
		System.out.println(res);
	}

}
/*
input:
[[3,0,7],[7,0,3],[3,7,0]];
output:
2

input:
[[5,2,0],[2,0,2],[0,7,5]]
output:
3
*/