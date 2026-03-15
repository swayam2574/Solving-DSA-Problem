class Solution {
    public boolean isPalindrome(String s) {
        // _________________________ m1
        // s = strToCharTS(s);
        // int l=0; 
        // int r=s.length()-1;

        // if(s.length()==0) return true; 

        // while(l<r){
        //     if(s.charAt(l)!=s.charAt(r)) return false;
        //     l++;
        //     r--;
        // }
        // return true;

        // _________________________ m2 
        int l=0, r=s.length()-1;
        while(l<r){
            char lc = s.charAt(l);
            char rc = s.charAt(r);

            if(!Character.isLetterOrDigit(lc)) {l++; continue;}
            if(!Character.isLetterOrDigit(rc)) {r--; continue;}

            if(Character.toLowerCase(lc) != Character.toLowerCase(rc)) return false; 

            l++;
            r--;
        }
        return true;



        // _________________________ m3
        // int left = 0, right = s.length() - 1;

        // while (left < right) {
        //     char a = s.charAt(left);
        //     char b = s.charAt(right);

        //     // Convert uppercase to lowercase
        //     if (a >= 'A' && a <= 'Z') a = (char)(a + 32);
        //     if (b >= 'A' && b <= 'Z') b = (char)(b + 32);

        //     // Skip non-alphanumeric
        //     if (!((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9'))) {
        //         left++;
        //         continue;
        //     }
        //     if (!((b >= 'a' && b <= 'z') || (b >= '0' && b <= '9'))) {
        //         right--;
        //         continue;
        //     }

        //     // Compare
        //     if (a != b) return false;

        //     left++;
        //     right--;
        // }

        // return true;



    }


    private static String strToCharTS(String s){
        StringBuilder str = new StringBuilder();
        for(char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }
        return str.toString();
    }
}