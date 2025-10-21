class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]ans=new int[nums.length];
        int  k = nums.length-1;
        /*int i=0;
        int j=nums.length-1;
        for(int k=nums.length-1;k>=0;k--){
        int comp1=nums[i]*nums[i];
        int comp2=nums[j]*nums[j];
            if(comp1>comp2){
            ans[k]=comp1;
            i++;

             }else{
            ans[k]=comp2;
            j--;
           }
        }
        return ans;*/

        int start =0;
        int end =nums.length-1;
        while(start<=end){
            if(nums[start]*nums[start]>nums[end]*nums[end]){
                      ans[k]=nums[start]*nums[start];
                       k--;
                       start++;
            }
            else{
              ans[k]=nums[end]*nums[end];
              k--;
            end--;
            }
        }
        return ans;
    }   
    
}