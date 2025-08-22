class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) return 1;
        StringBuilder sb = new StringBuilder("");
        StringBuilder result = new StringBuilder("");
        for (int i = 0; i < s.length()-1; i++) {
            sb.append(s.charAt(i));
            for (int j = i+1; j < s.length(); j++) {
              // check if sb already contains this char
                if (sb.toString().indexOf(s.charAt(j)) != -1) {
                    break; // duplicate found, stop
                }
                sb.append(s.charAt(j));
            }
            if(sb.length() > result.length()) {
                result.setLength(0);
                result.append(sb);
            }
            sb.setLength(0);
        }
        return result.length();
    }
}