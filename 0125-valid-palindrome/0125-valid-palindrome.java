class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder string = new StringBuilder("");
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i ++) {
        if (Character.isLetterOrDigit(s.charAt(i)) && s.charAt(i) != ' ') {
                string.append(s.charAt(i));
            }
        }
        for (int i = 0; i < string.length()/2; i ++) {
            if (string.charAt(i)!=string.charAt(string.length()-1-i)) return false;
        }
        return true;
    } 
}