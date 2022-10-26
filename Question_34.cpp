/*
Question 34
Problem :
You are given a 0-indexed array nums of length n, consisting of non-negative integers. For each index i from 0 to n - 1, you must determine the size of the minimum sized non-empty subarray of nums starting at i (inclusive) that has the maximum possible bitwise OR.

In other words, let Bij be the bitwise OR of the subarray nums[i...j]. You need to find the smallest subarray starting at i, such that bitwise OR of this subarray is equal to max(Bik) where i <= k <= n - 1.
The bitwise OR of an array is the bitwise OR of all the numbers in it.

Return an integer array answer of size n where answer[i] is the length of the minimum sized subarray starting at i with maximum bitwise OR.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,0,2,1,3]
Output: [3,3,2,2,1]
Explanation:
The maximum possible bitwise OR starting at any index is 3.

Starting at index 0, the shortest subarray that yields it is [1,0,2].
Starting at index 1, the shortest subarray that yields the maximum bitwise OR is [0,2,1].
Starting at index 2, the shortest subarray that yields the maximum bitwise OR is [2,1].
Starting at index 3, the shortest subarray that yields the maximum bitwise OR is [1,3].
Starting at index 4, the shortest subarray that yields the maximum bitwise OR is [3].
Therefore, we return [3,3,2,2,1].


solution:
*/

#include <bits/stdc++.h>
using namespace std;

vector<int> smallestSubarray(vector<int> &nums)
{


    int n = nums.size();
    // for keeping track of last index of every bit till the ith index.
    // total bit in a data type int is 32.
    vector<int> nearest(32, -1);
    vector<int> ans(n);

    for (int i = n - 1; i >= 0; i--)
    {
        for (int j = 0; j < 32; j++)
        {
            // 1<<j -> a number with only set bit at jth position.
            // nums[i]&(1<<j) checks whether jth bit is set or not of nums[i];

            // if jth bit of nums[i] is set then we update nearest[j] to i;
            if (nums[i] & (1 << j))
            {
                nearest[j] = i;
            }
        }


        // initially set lastSetBit to i because we have to start our set with ith element.
        int lastSetBit = i;

        // now we have to find which one is the bit seted most farthest among all 32 bits. we need the index i for this bit.
        for (int j = 0; j < 32; j++)
        {
            // we keep updating lastSetBit if we get any greater "i" of set bit.
            lastSetBit = max(nearest[j], lastSetBit);
        }
        // from last set bit only we can get smallest subarray.
        // after this we get same value but our subarray size will increase.
        ans[i] = lastSetBit - i + 1;
    }

    return ans;
}

int main()
{

    vector<int> nums = {1, 0, 2, 1, 3};

    vector<int> ans = smallestSubarray(nums);
    for (int i = 0; i < ans.size(); i++)
    {
        cout << ans[i] << " ";
    }
}