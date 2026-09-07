class Solution(object):
    def twoSum(self, nums, target):
        seen_map={}
        for i in range(len(nums)):
            required_num=target-nums[i]
            if required_num in seen_map:
                return[seen_map[required_num],i]

            seen_map[nums[i]]=  i     
        

                
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        