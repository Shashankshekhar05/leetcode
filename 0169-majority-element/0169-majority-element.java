class Solution {
    public int majorityElement(int[] nums) {
  /*   int majority_element=-1;
     int count =0;
     for(int i=0;i<nums.length;i++){
        if(count==0){
        majority_element=nums[i];
          count=1;
        }

          else if(nums[i]==majority_element){
            count++;
          }
          else{
          count--;
          }
     }
   int freq=0;
   for(int i=0;i<nums.length;i++){
    if(majority_element==nums[i]){
        freq++;
    }
   }
   if(freq>nums.length/2){
    return majority_element;
   }
        
      return -1;*/
      Arrays.sort(nums);
      return nums[nums.length/2];
    }
    
}