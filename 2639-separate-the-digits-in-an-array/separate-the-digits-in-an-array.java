class Solution {
    public int[] separateDigits(int[] nums) {
        // _______________________m4
        int c=0;
        for(int i: nums){
            while(i>0){
                c++;
                i/=10;
            }
        }

        int[] a = new int[c];
        for(int i=nums.length-1; i>=0; i--){
            int t = nums[i];
            while(t>0){
                a[--c] = t%10;
                t/=10;
            }
        }
        return a;


        // _______________________m3
        // StringBuilder s = new StringBuilder();
        // for(int i: nums) s.append(i);
        // int c = s.length();
        // int[] ans = new int[c];
        // for(char i=0; i<c; i++) ans[i] = s.charAt(i)-'0';
        // return ans;


        // _______________________m2
        // List<Integer> a = new ArrayList<>();
        // for(int i: nums){
        //     String s = ""+i;
        //     for(char c=0; c<s.length(); c++){
        //         a.add(s.charAt(c)-'0');
        //     }
        // }
        // return a.stream().mapToInt(i->i).toArray();



        // _______________________m1 
        // ArrayList<Integer> a = new ArrayList<>();
        // int p=0;
        // for(int i: nums){
        //     if(i<10) a.add(i);
        //     else{
        //         while(i>0){
        //             a.add(p, i%10);
        //             i/=10;
        //         }
        //     }
        //     p=a.size();
        // }
        
        // int[] ans = new int[p];
        // for(int i=0; i<p; i++) ans[i] = a.get(i);
        // return ans;

    }
}