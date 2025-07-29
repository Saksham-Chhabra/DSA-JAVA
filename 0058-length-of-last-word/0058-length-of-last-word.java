class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int lastCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                count ++;
            }
            else if (count > 0) {
                lastCount = count;
                count = 0;
            }
        }
    return count != 0 ? count : lastCount;
    }
}