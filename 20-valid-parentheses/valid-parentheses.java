class Solution {
    public boolean isValid(String s) {
        // ______________________ m2
        if ((s.length() & 1) == 1) return false;

        Deque<Character> dq = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                dq.push(c);
            } else {
                if (dq.isEmpty()) return false;
                char top = dq.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return dq.isEmpty();


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