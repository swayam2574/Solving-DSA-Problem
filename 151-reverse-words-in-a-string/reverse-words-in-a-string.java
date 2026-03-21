class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i = arr.length - 1;
        StringBuilder sentence = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && arr[i] == ' ') i--;
            int j = i;
            while (i >= 0 && arr[i] != ' ') {
                i--;
            }
            if (j - i != 0) {
                if (sentence.isEmpty()) {
                    sentence.append(arr, i + 1, j - i);
                } else {
                    sentence.append(" ").append(arr, i + 1, j - i);
                }
            }
        }
        return sentence.toString();
    }
}