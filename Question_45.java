/**
 * Alisha likes all the numbers which are divisible by A. Sushmita does not like the numbers 
    which are divisible by B and likes all the remaining numbers. Determine the smallest number 
    greater than or equal to N which is liked by both. Output −1 if no such number exists.

 * Constraints
     1≤T≤1000
     1≤A,B,N≤10^9

 * Sample 1:
 * Input
     3
     5 2 11
     4 3 24
     7 7 100
 * Output
     15
     28
     -1
 * Explanation:
    Test case 1: 15 is the smallest number ≥11 which is divisible by 5 and is not divisible by 2.

    Test case 2: 28 is the smallest number ≥24 which is divisible by 4 and is not divisible by 3.

    Test case 3: There does not exist any number which is divisible by A=7 and is not divisible by B= 7.
 */

import java.util.*;

public class Question_45{
	public static void main(String[] args){
		Scanner scan  = new Scanner(System.in);

		int x = scan.nextInt();

		for (int i=0; i<x; i++) {
			int a = scan.nextInt();
		    int b = scan.nextInt();
		    int n = scan.nextInt();

		    System.out.println( sol(a, b, n));
		}	
	}

	public static int sol(int a, int b, int n){
		
		if(a == b){
			return -1;
		}

		/**
		 * nearest but greater number then n which is divisible by a 
		 */
		int i =  (a - n%a)+n;
		
		while(true){
			if( i%b != 0){
				return i;
			}
			i+=a;//next number which is divisible by a
		}
		
	}
}