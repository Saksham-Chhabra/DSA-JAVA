class Solution {
    public int strStr(String haystack, String needle) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) 
            {
                for (int j = 0; j<needle.length(); j++) {
                    if (needle.charAt(j) == haystack.charAt(i+j)) {
                        index = i;
                        count++;
                        if (count == needle.length()) return index;
                        }
                }
            }
                        count = 0;
        }
        return -1;
    }
}