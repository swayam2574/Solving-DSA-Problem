class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length(), max = 0, top = 0;
        int[] st = new int[n+1];
        st[top] = -1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(') st[++top]=i;
            else{
                top--;
                if(top==-1) st[++top] = i;
                else{
                    int diff = i-st[top];
                    if(diff>max) max = diff;
                }
            }
        }
        return max;
    }
}
