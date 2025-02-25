class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

      int[] mergedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
          Arrays.sort(mergedArray);
              int totalLength = mergedArray.length;

        if (totalLength % 2 == 1) {
            return mergedArray[totalLength / 2];
        } else {
            // If the length is even, return the average of the two middle elements
            int mid1 = mergedArray[(totalLength / 2) - 1];
            int mid2 = mergedArray[totalLength / 2];
            return (mid1 + mid2) / 2.0;
        }
        
    }
    
}