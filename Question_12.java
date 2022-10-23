/*
Question 12
___________

Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
Take the set of integers
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
First, delete every second number, we get following reduced set.
1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
Now, delete every third number, we get
1, 3, 7, 9, 13, 15, 19,….….
Continue this process indefinitely……
Any number that does NOT get deleted due to above process is called “lucky”.

Example 1:

Input:
N = 5
Output: 0
Explanation: 5 is not a lucky number
as it gets deleted in the second
iteration.
*/

import java.io.*;
import java.util.Scanner;

class lucky_number {
	public static int count = 2;
	static boolean isLucky(int n)
	{
		if (count > n)
			return true;
		if (n % count == 0)
			return false;
		int next_pos = n - (n / count);
    count++;
		return isLucky(next_pos);
	}

	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number");
		int x =sc.nextInt();
		if (isLucky(x))
			System.out.println(x + " is a lucky number");
		else
			System.out.println(x + " is not a lucky number");
	}
}
