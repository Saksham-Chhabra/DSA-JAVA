class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String prev = countAndSay(n - 1);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < prev.length(); i++) {
            int count = 1;
            while (i + 1 < prev.length() && prev.charAt(i) == prev.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(count).append(prev.charAt(i));
        }
        return sb.toString();
    }
}
