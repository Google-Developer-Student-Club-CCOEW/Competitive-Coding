/*
Question 7
__________

Problem
For the human eye, primary colours are red, green, and blue.

Combining 1 drop each of any two primary colours produces a new type of secondary colour. For example, mixing red and green gives yellow, mixing green and blue gives cyan, and, mixing red and blue gives magenta.

You have X, Y, and Z drops of red, green, and blue colours respectively. Find the maximum total number of distinct colours (both primary and secondary) you can have at any particular moment.

Note: You cannot mix a secondary colour with a primary or another secondary colour to get a new type of colour.
Input Format-The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of three space separated integers X, Y, and Z, the number of drops of red, green, and blue colours respectively.
Output Format-For each test case, output on a new line the maximum total number of colours (both primary and secondary) you can have using the given primary colours.Constraints
1≤T≤10 ^5

1<X,Y,Z≤100
Input
4
1 0 1
1 1 1
0 0 0
Output 2
3
0
*/

import java.util.*;
public class MaxColour {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();//accept no of test cases
		int color=0;
		while(testcase>0) {
			color=0;
			int x=sc.nextInt(); //no of red drops
		    int y=sc.nextInt(); //no of green drops
		    int z=sc.nextInt(); //no of blue drops
		    if(x>=1) color++; //with 1 drop 1 color is possible
		    if(y>=1) color++;
		    if(z>=1) color++;
		    int a[]=new int[3];
		    a[0]=x;
		    a[1]=y;
		    a[2]=z;
		    Arrays.sort(a);
		    int maxcolor=color;
		    if(a[1]>1 && a[2]>1){ //check if cyan color is possible
		        a[1]--;
		        a[2]--;
		        maxcolor=maxcolor+1;
		    }
		    if(a[0]>1 && a[2]>1){ //check if  magenta color is possible
		        a[0]--;
		        a[2]--;
		        maxcolor=maxcolor+1;
		    }
		    if(a[0]>1 && a[1]>1){ //check if yellow color is possible
		        a[0]--;
		        a[1]--;
		        maxcolor=maxcolor+1;
		    }
		    testcase--;
		    System.out.println(maxcolor);
		}
		sc.close();
	}
}
