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
