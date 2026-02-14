class Solution {
    public boolean isValid(String s) {
        // ______________________ m2
        char[] str = s.toCharArray();
        if ((str.length & 1) == 1) return false;

        int slow = 0;

        for (int fast = 0; fast < str.length; fast++) {
            char c = str[fast];

            if (c == '(' || c == '[' || c == '{') {
                str[slow++] = c;
            } else {
                if (slow == 0) return false;
                char left = str[--slow];

                if ((left == '(' && c != ')') ||
                    (left == '[' && c != ']') ||
                    (left == '{' && c != '}')) {
                    return false;
                }
            }
        }

        return slow == 0;


        // ______________________ m1
        // Stack<Character> st = new Stack<>();
        // for(char ch: s.toCharArray()){
        //     if (ch == '(' || ch == '{' || ch == '[') {
        //         st.push(ch);
        //     } else {
        //         if(st.isEmpty()) return false;
        //         char top = st.peek();
        //         if ((ch == ')' && top == '(') || (ch == '}' && top == '{') || (ch == ']' && top == '[')) {
        //             st.pop();
        //         } else return false;
        //     }
        // }
        // return st.isEmpty();
    }
}