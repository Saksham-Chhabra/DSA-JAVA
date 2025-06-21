class Solution {
        public static void swap(int a, int b, char s[]) {
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
        }
    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;

        while (first<last) {
            swap(first,last,s);
            first++;
            last--;
        }
    }
}