class Solution {
    void swap(StringBuilder sb, int a, int b) {
        char temp = sb.charAt(a);
        sb.setCharAt(a, sb.charAt(b));
        sb.setCharAt(b, temp);
    }

    boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            while (i < j && !isVowel(sb.charAt(i))) i++;
            while (i < j && !isVowel(sb.charAt(j))) j--;

            if (i < j) {
                swap(sb, i, j);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}
