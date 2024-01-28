class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_a = {}
        for i in range(len(nums)):
            diff = target - nums[i]
            if diff in dict_a:
                return [dict_a[diff],i]
            dict_a[nums[i]] = i
        return null