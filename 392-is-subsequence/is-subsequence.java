class Solution {
    public boolean isSubsequence(String s, String t) {
        int ns = s.length(), nt = t.length();
        int i = 0, j = 0;

        while(i < nt && j < ns){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            i++;
        }
        return j == ns;
    }
}