class Solution {
    public int removeDuplicates(int[] nums) {

        // int cnt=0;
        // for(int i=1; i<nums.length; i++){
        //     if(nums[cnt]<nums[i]){
        //         nums[++cnt] = nums[i];
        //     }
        // }
        // return cnt+1;



        int i=0, j=1;
        while(j<nums.length){
            if(nums[i]<nums[j]) nums[++i] = nums[j];
            j++;
        }
        return i+1;
    }
}