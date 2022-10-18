class Solution(object):
    def longestNiceSubarray(self, nums):
        ans = 1
        n = len(nums)

        for i in range(0, n):
            mask = nums[i]  # mask will represent bitmask of running subarray
            j = i + 1
            while j < n:
                new_mask = mask & nums[j]
                if new_mask > 0:  # when a set bit by two different numbers in a particular bit position
                    ans = max(ans, j - i)
                    break
                mask = mask | nums[j]  # accumulate current number in the subarray mask with a bitwise OR
                j += 1
            if j == n:  # edge case where the whole subarray [i, n-1] was valid
                ans = max(ans, j - i)
                break  # as the problem wants maximum length of subarray, we can break from the outer loop
        return ans


nums = [1, 3, 8, 48, 88]
obj = Solution()
print(obj.longestNiceSubarray(nums))

