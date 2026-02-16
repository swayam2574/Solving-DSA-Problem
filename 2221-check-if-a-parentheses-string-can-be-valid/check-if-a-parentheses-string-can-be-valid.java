class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        if ((n & 1) == 1) return false;

        int balance = 0;

        // Left to Right
        for (int i = 0; i < n; i++) {
            if (locked.charAt(i) == '0' || s.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) return false;
        }

        balance = 0;

        // Right to Left
        for (int i = n - 1; i >= 0; i--) {
            if (locked.charAt(i) == '0' || s.charAt(i) == ')') {
                balance++;
            } else {
                balance--;
            }
            if (balance < 0) return false;
        }

        return true;
    }
}
