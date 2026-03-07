class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();

        // for(int i: nums) {
        //     map.put(i, map.getOrDefault(i, 0)+1);
        //     if(map.get(i)>n/2) return i;
        // }

        // return -1;


        // method.......................2
        int n = nums.length;
        int me = nums[0], cnt = 1;
        for(int i=1; i<n; i++){
            if(nums[i]==me) cnt++;
            else cnt--;
            if(cnt==0){
                me = nums[i];
                cnt = 1;
            }
        }
        return me;
    }
}