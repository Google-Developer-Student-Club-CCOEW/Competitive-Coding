/*
Question 60
___________

You are given an integer array nums and two integers minK and maxK.

A fixed-bound subarray of nums is a subarray that satisfies the following conditions:

The minimum value in the subarray is equal to minK.
The maximum value in the subarray is equal to maxK.
Return the number of fixed-bound subarrays.

A subarray is a contiguous part of an array.

Example 1:

Input: nums = [1,3,5,2,7,5], minK = 1, maxK = 5
Output: 2
Explanation: The fixed-bound subarrays are [1,3,5] and [1,3,5,2].

*/

public class CompetitiveCodingSubArray {
        public long subArrays(int[] nums, int minK, int maxK) {
            long ans = 0;
            int n = nums.length;
            int lastMin = -1;
            int lastMax = -1;
            int start = 0;
            for(int i=0;i<n;i++){
                if(nums[i]<minK || nums[i]>maxK){
                    lastMin = lastMax = -1;
                    start = i+1;
                }
                if(nums[i] == minK){
                    lastMin = i;
                }
                if(nums[i] == maxK){
                    lastMax = i;
                }
                ans = ans + Math.max(0L, Math.min(lastMin, lastMax)-start+1);
            }
            return ans;
        }

    public static void main(String[] args) {
            CompetitiveCodingSubArray obj = new CompetitiveCodingSubArray();
        int nums[] = {1,3,5,2,7,5};
        int minK = 1;
        int maxK = 5;
        long ans1 = obj.subArrays(nums,minK,maxK);
        System.out.println(ans1);
    }
}
