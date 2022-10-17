import java.util.ArrayList;
import java.util.Scanner;

public class Question5 {

	public static String HasWon(String s)
	{
		int count=0;
		for(char ch:s.toCharArray())	//traversing through each charcter from strings
		{
			if(isVowel(ch))		//checking if it is vowel
			{
				count++;		//count each time
			}
			else
			{
				count=0;		//if the series of vowel break start again
			}
			if(count>3)			//if contigious vowels are greater than 3 break the loop
			{
				break;
			}
		}
		if(count>3)		//return WINNER if count greater than 3
		{
			return "WINNER";
		}
		return "LOOSER";		//else return LOOSER
	}
	private static boolean isVowel(char ch) {		//function to check the vowels
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		//number of strings
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arr.add(sc.next());		//taking input from user
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(HasWon(arr.get(i)));		//Printing the winner
		}
		
	}

}
