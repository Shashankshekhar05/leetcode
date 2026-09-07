class Solution(object):
    def findDisappearedNumbers(self, nums):
        sort_num=sorted(nums)
        ans=[]
        N=len(nums)
        if sort_num[0]>1:
            for missing in range(1,sort_num[0]):
                ans.append(missing)

        for i in range(1,len(sort_num)):
            if sort_num[i]-sort_num[i-1]>1:
                for missing in range(sort_num[i-1]+1,sort_num[i]):
                    ans.append(missing) 



        if sort_num[-1]<N:
            for missing in range(sort_num[-1]+1,N+1):
                ans.append(missing) 

        return ans  
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        