class Solution {
    public boolean isValid(String s) {
        // ______________________ m2
        int l = s.length();
        char[] a = new char[l];
        int top = -1;  

        for (int i=0; i<l; i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') a[++top] = c;
            else { 
                if (top == -1) return false;

                char open = a[top--]; 

                if ((c == ')' && open != '(') ||
                    (c == '}' && open != '{') ||
                    (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return top == -1;


        // ______________________ m1
        // Stack<Character> st = new Stack<>();
        // for(char ch: s.toCharArray()){
        //     if (ch == '(' || ch == '{' || ch == '[') {
        //         st.push(ch);
        //     } else {
        //         if(st.isEmpty()) return false;
        //         char top = st.peek();
        //         if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) st.pop();
        //         else return false;
        //     }
        // }
        // return st.isEmpty();
    }
}