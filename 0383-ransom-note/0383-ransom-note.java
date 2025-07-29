class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] alphabets = new int[26];
       char[] ransomArray = ransomNote.toCharArray();
       char[] magazineArray = magazine.toCharArray();
       for (int i = 0; i < magazineArray.length; i++) {
            alphabets[magazineArray[i]-'a']++;
       }
       for (int i = 0; i < ransomArray.length; i ++) {
        alphabets[ransomArray[i]-'a']--;
        if (alphabets[ransomArray[i]-'a'] < 0) return false;
       }
       return true;
    }
}