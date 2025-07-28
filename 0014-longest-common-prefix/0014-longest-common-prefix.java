class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder sb = new StringBuilder("");
        Arrays.sort(strs);
        int idx = 0;
        while (idx < strs[0].length() && idx < strs[n-1].length() ) {
            if (strs[0].charAt(idx) == strs[n-1].charAt(idx)) {
                sb.append(strs[0].charAt(idx));
                idx ++ ;
            }
            else {       
            break;
            }
        }
        return sb.toString();
 }
}