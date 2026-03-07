import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        // _________________________ m1 
        // for(int i=digits.length-1; i>=0; i--){
        //     if(digits[i]<9){
        //         digits[i]++;
        //         return digits;
        //     }
        //     digits[i]=0;
        // }

        // int[] res = new int[digits.length+1];
        // res[0] = 1;
        // return res;


        // _________________________ m2 
        // // fine only for smaller number
        // long n = 0;
        // int p = digits.length-1;
        // for(int i: digits){
        //     n+=i*Math.pow(10, p--); 
        // } 

        StringBuilder num = new StringBuilder();

        for(int i : digits){
            num.append(i);
        }

        BigInteger n = new BigInteger(num.toString());
        n = n.add(BigInteger.ONE);

        String s = n.toString();

        int[] res = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            res[i] = s.charAt(i) - '0';
        }

        return res;
    }
}