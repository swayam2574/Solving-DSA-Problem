class Solution {
    public boolean isValid(String s) {
        // ______________________ m2
        // int l = s.length();
        // char[] a = new char[l];
        // int top = -1;

        // if(l==1 || l%2 != 0) return false;

        // for(int i=0; i<l; i++){
        //     char c = s.charAt(i);
        //     if(c == '(' || c == '[' || c == '{') a[++top] = c;
        //     else{
        //         if(top == -1) return false;
        //         char p = a[top--];
        //         if((p != '(' && c == ')') || (p != '[' && c == ']') || (p != '{' && c == '}')) return false;
        //     }
        // }
        // return top == -1;


        // ______________________ m1
        Stack<Character> st = new Stack<>();
        for(char ch: s.toCharArray()){
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.isEmpty()) return false;
                char top = st.pop();
                if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}