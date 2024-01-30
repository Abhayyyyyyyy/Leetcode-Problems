class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n = len(nums)
        prefix = 1 
        suffix = 1
        maxSum = - pow(10,4)
        for i in range(n):
            if(prefix == 0):
                prefix = 1
            if(suffix == 0):
                suffix = 1
            prefix = prefix * nums[i]
            suffix = suffix * nums[n - i - 1]
            maxSum = max(maxSum, prefix, suffix)
        return maxSum