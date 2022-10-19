import java.util.Scanner;

class Dictionary
{	char chrs[]= new char[26];
	
	Dictionary() 
	{
		//generating array of characters
		for(int i=0;i<26;i++) {
			chrs[i]=(char)((int)'a'+i);
		}
	}


	boolean check(String s,int[] distance)
	{
		int comp;
		
		//Initialize flag true here which will be changed to false only when the the number of characters between the two letter is not specified in distance
		boolean flag=true;
		
		//Traversing through alphabets.
		for(int i=0;i<26;i++) {
			
			//Checking if the alphabet exists in the string
			if(s.indexOf(chrs[i])!=-1) {
				
				//getting the number of characters between two occurrences of the letters
				comp=s.lastIndexOf(chrs[i])-s.indexOf(chrs[i])-1;
				
				//checking if the number of characters between the two letter is does not match the value specified in distance
				if(comp!=distance[i]) {
					flag=false;
				}
			}
		}
		return flag;
	}
}


public class Question15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Dictionary ab=new Dictionary();
		int distance[]=new int[26];
		//Accepting the String from the user
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		
		//Converting to string lowercase to make the code less case sensitive
		s=s.toLowerCase();

		//Accepting the distance values
		System.out.println("Enter the distances:");
		for(int i=0;i<26;i++) {
			distance[i]=sc.nextInt();
		}
		
		//Checking if the string is well spaced or not
		//the .check method in dictionary will determine if the string is well-spaced or not
		if(ab.check(s,distance)) {
			System.out.println("It is a well spaced string");
		}
		else {
			System.out.println("It is not a well spaced string");
		}
		sc.close();
	}
}
