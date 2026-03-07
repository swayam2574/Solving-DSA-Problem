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
        // int i=0, j=1;
        // while(j<nums.length){
        //     if(nums[i]<nums[j]) nums[++i] = nums[j];
        //     j++;
        // }
        // return i+1;

        // _______________________ m3
        int k=0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[k]=nums[i];
                k++;
            }
        }
        nums[k]=nums[n-1];
        k++;
        return k;
    }
}