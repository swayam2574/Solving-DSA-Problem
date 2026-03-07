class Solution {
    public int removeDuplicates(int[] nums) {
        // _______________________ m1
        // int n = nums.length, idx=0;
        // for(int i: nums){
        //     if(nums[idx]<i){
        //         nums[++idx] = i;
        //     }
        // }
        // return idx+1;


        // _______________________ m2
        int i=0, j=1, n=nums.length;
        while(j<n){
            if(nums[i]<nums[j]) nums[++i] = nums[j];
            j++;
        }
        return i+1;

    }
}