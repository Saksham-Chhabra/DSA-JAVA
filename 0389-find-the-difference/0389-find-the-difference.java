class Solution {
    public char findTheDifference(String s, String t) {
        int[] alphabets =new int[26];
        for(int i = 0; i < s.length();i++){
        alphabets[s.charAt(i) - 'a']++;
        }
        for(int i= 0; i< t.length();i++) {
        alphabets[t.charAt(i) - 'a']--;
        if(alphabets[t.charAt(i) - 'a']< 0) return t.charAt(i);
        }
        return ' ';
    }
}