class Solution {
    public void moveZeroes(int[] nums) {
       // int [] B = new int[n];
        int j=0;
        int count =0;
        for(int i =0;i<nums.length;i++){
         if(nums[i] != 0){
            nums[j]=nums[i];
            j++;
         

        }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        

        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i] + " "); // Print the array
        }

        
    }
}