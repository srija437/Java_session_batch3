class Solution {
    public int removeDuplicates(int[] nums) {

     int uIdx = 0;

     for(int i = 1; i < nums.length; i++) {
        if(nums[i] != nums[uIdx]) {
            nums[uIdx+1] = nums[i];
            uIdx++;
        }
     }   
     return uIdx+1;
    }
}