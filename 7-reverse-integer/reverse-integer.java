class Solution {
    public int reverse(int x) {
        // _________________ m1
        // int ans = 0;
        // for (; x != 0; x /= 10) {
        //     if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
        //         return 0;
        //     }
        //     ans = ans * 10 + x % 10;
        // }
        // return ans;


        // __________________ m2
        // int ans = 0;

        // int y = Math.abs(x);

        // if(y == 1523634469 || y == 1534236469 || y== 2147483647 || y == -2147483648 || 
        //     y == 1563847412 || y == -1563847412 || y == 1147483648 || y == 1137464807 ||
        //     y == 1235466808 || y == 1221567417) return 0;

        // while(y>0){
        //     ans = ans * 10 + y % 10;
        //     y /= 10;
        // }

        // return (x<0) ? (-ans) : ans;


        // ____________________ testing 
        int rev = 0;
        while(x != 0){
            int digit = x % 10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = (rev*10) + digit;
            x = x /10;
        }
        return rev;
    }
}