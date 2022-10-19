/**Question 30:-
 * 
 * You are given an integer array nums and an integer k.

Find the longest subsequence of nums that meets the following requirements:

The subsequence is strictly increasing and
The difference between adjacent elements in the subsequence is at most k.
Return the length of the longest subsequence that meets the requirements.

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

Example 1:

Input: nums = [4,2,1,4,3,4,5,8,15], k = 3
Output: 5
Explanation:
The longest subsequence that meets the requirements is [1,3,4,5,8].
The subsequence has a length of 5, so we return 5.
Note that the subsequence [1,3,4,5,8,15] does not meet the requirements because 15 - 8 = 7 is larger than 3.
 */


import java.util.*;

public class Question_30{
	public static void main(String[] args){
		Scanner scan  = new Scanner(System.in);

		int arrLength = scan.nextInt();
		int nums[] = new int[arrLength];
		int k ;

		for (int i=0; i<arrLength; i++) {
			nums[i] = scan.nextInt();
		}
		k = scan.nextInt();

		System.out.println( max_subseq(k, nums));
	}


	public static int max_subseq(int k, int nums[]){
		int max = 0;
		int temp = 1;

		for(int i=0; i<nums.length-1; i++){
			/**
			 * condition for strictly increasing and The difference between adjacent elements in the subsequence is at most k.
			 */
			if(nums[i+1]-nums[i] <= k && nums[i+1]-nums[i] > 0){
				temp++;
				// if temp value if more then one only then program will change the value
				if(max < temp){
					if(temp > 1){
						max = temp;
					}
				}
			}else{
				temp = 1;
			}
		}
		return max;
	}
}