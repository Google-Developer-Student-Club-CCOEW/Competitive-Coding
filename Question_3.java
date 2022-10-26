/*
Question 3
__________

you are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

Note:

The frequency of a letter x is the number of times it occurs in the string.
You must remove exactly one letter and cannot chose to do nothing.
Input: word = "abcc"
Output: true
Explanation: Select index 3 and delete it: word becomes "abc" and each character has a frequency of 1.

*/

import java.util.*;
public class CheckString {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		for(int i=0;i<sb.length()-1;i++) { //to remove duplicate element
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					sb.deleteCharAt(j);
					i=sb.length();
					break;
				}
			}
		}
		for(int i=0;i<sb.length()-1;i++) { //to check if still duplicate element exists
			for(int j=i+1;j<sb.length();j++) {
				if(sb.charAt(i)==sb.charAt(j)) {
					flag=1;
					i=sb.length();
					break;
				}
			}
		}
		if(flag==1)
			System.out.println("False");
		else
			System.out.println("True");
		sc.close();
	}
}
