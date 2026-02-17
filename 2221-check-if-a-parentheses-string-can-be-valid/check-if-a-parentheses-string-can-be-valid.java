class Solution {
    public boolean canBeValid(String s, String lck) {

        // _________________________ m3 - using Array as Stack - 
        int n = s.length();
        if (n%2 != 0 || 
        (s.charAt(0) == ')' && lck.charAt(0) == '1') || 
        (s.charAt(n-1) == '(' && lck.charAt(n-1) == '1')
        ) return false;

        int[] o = new int[n]; int ot = -1;
        int[] oc = new int[n]; int oct = -1;
        
        for(int i=0; i<n; i++){
            if(lck.charAt(i)=='0') oc[++oct] = i;
            else if(s.charAt(i)=='(') o[++ot] = i;
            else {
                if(ot != -1) ot--;
                else if(oct != -1) oct--;
                else return false; 
            }
        }

        while((ot != -1) && (oct != -1) && o[ot]<oc[oct]){
            ot--;
            oct--;
        }

        return ot == -1;



        // ________________________ m2 - using Stack
        // int n = s.length();
        // if (n%2 != 0 || 
        // (s.charAt(0) == ')' && lck.charAt(0) == '1') || 
        // (s.charAt(n-1) == '(' && lck.charAt(n-1) == '1')
        // ) return false;

        // Stack<Integer> o = new Stack<>();
        // Stack<Integer> oc = new Stack<>();
        
        // for(int i=0; i<n; i++){
        //     if(lck.charAt(i)=='0') oc.push(i);
        //     else if(s.charAt(i)=='(') o.push(i);
        //     else {
        //         if(!o.empty()) o.pop();
        //         else if(!oc.empty()) oc.pop();
        //         else return false; 
        //     }
        // }

        // while(!o.empty() && !oc.empty() && o.peek()<oc.peek()){
        //     o.pop();
        //     oc.pop();
        // }

        // return o.empty();



        // ________________________ m1 - Greedy Approach - memory efficent 
        // int n = s.length();
        // if (n%2 != 0 || 
        // (s.charAt(0) == ')' && lck.charAt(0) == '1') || 
        // (s.charAt(n-1) == '(' && lck.charAt(n-1) == '1')
        // ) return false;

        // int b = 0;

        // // Left to Right
        // for (int i = 0; i < n; i++) {
        //     if (lck.charAt(i) == '0' || s.charAt(i) == '(') {
        //         b++;
        //     } else {
        //         b--;
        //     }
        //     if (b < 0) return false;
        // }

        // b = 0;

        // // Right to Left
        // for (int i = n - 1; i >= 0; i--) {
        //     if (lck.charAt(i) == '0' || s.charAt(i) == ')') {
        //         b++;
        //     } else {
        //         b--;
        //     }
        //     if (b < 0) return false;
        // }

        // return true;


        // ____________________ testing 
    //     int n = s.length();
    //     if(
    //     (n % 2 != 0) 
    //     || (s.charAt(0) == ')' && lck.charAt(0) == '1') 
    //     || (s.charAt(n-1) == '(' && lck.charAt(n-1) == '1')
    //     ) return false;

    //     int minOpen = 0;
    //     int maxOpen = 0; 

    //     for (int i = 0; i < n; i++) {
    //         char ch = s.charAt(i);
    //         char lock = lck.charAt(i);
    //         if (lock == '1') {
    //             if (ch == '(') {
    //                 minOpen++;
    //                 maxOpen++;
    //             } else { // ')'
    //                 minOpen--;
    //                 maxOpen--;
    //             }
    //         } else {
    //             minOpen--;
    //             maxOpen++;
    //         } 

    //         if (maxOpen < 0) return false;

    //         if (minOpen < 0) {
    //             minOpen = 0;
    //         }
    //     }

    //     return minOpen == 0;
    }
}
