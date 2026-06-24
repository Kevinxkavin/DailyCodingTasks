class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        int up = 0;

        for(int i = 0; i < len; i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                up++;
            }
        }

        if(up == len) return true; // USA
        if(up == 0) return true;   // leetcode
        if(up == 1 && Character.isUpperCase(word.charAt(0)))
            return true;           // Google

        return false;
    }
}
