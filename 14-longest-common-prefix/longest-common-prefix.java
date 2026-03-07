class Solution {
    public String longestCommonPrefix(String[] strs) {

        // ________________________ method 1
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();

        String f = strs[0];
        String l = strs[strs.length-1];

        int fl = f.length();
        for(int i=0; i<fl; i++){
            if(f.charAt(i)!=l.charAt(i)) break; 
            sb.append(f.charAt(i));
        }

        return sb.toString();





        // ________________________ method 2
        // if (strs == null || strs.length == 0) return "";

        // String prefix = strs[0];

        // for (int i = 1; i < strs.length; i++) {
        //     while (strs[i].indexOf(prefix) != 0) {
        //         prefix = prefix.substring(0, prefix.length() - 1);
        //         if (prefix.isEmpty()) return "";
        //     }
        // }

        // return prefix;

    }
}