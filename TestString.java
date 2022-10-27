//Solution for Question 24

import java.util.Scanner;

public class TestString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		int flag=0;
		int n=sc.nextInt();
		sc.nextLine();
		for(int t=0;t<n;t++) {
			String I=sc.nextLine();
			String P=sc.nextLine();
			StringBuilder si=new StringBuilder(I);
			StringBuilder sp=new StringBuilder(P);
			if(si.length()==sp.length()) { //length of String I and P are equal
				if(si.compareTo(sp)==0) //if I and P are equal
					continue;
				else
					System.out.println("Impossible"); 
			}
			else if(si.length()>sp.length()) //if String I is greater than String P
				System.out.println("Impossible");
			else {

				for(int i=0;i<sp.length() && si.length()!=i;i++) { //Check for characters in String P that are different from String I
					if(si.charAt(i)!= sp.charAt(i)) {
						sp.deleteCharAt(i); //remove different characters from P
						count++;
						flag=1;
						i--;
					}
				}
				if(flag==0 || sp.length()>si.length()) {
					int k=si.length();
					while(sp.length()!=si.length()) {
						sp.deleteCharAt(k); //Delete extra repeating characters in P
						count++;
					}
				}

				if(si.compareTo(sp)==0) { //if after all the removals both Strings are equal
					System.out.println(count);
				}
				else 
					System.out.println("Impossible");
			}
			count=0;
		}
		sc.close();
	}
}
