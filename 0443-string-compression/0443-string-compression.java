class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder("");
        // if(chars.length == 1) {
        //     return 1;
        // }
        for(int i =0; i <chars.length;i++) {
            Integer count = 1;
            while(i<chars.length-1 && chars[i]==chars[i+1]) {
                count++;
                i++;
            }
            sb.append(chars[i]);
            if(count>1) {
                sb.append(count.toString());
            }
        }
        for(int i =0; i <sb.length();i++) {
            chars[i]=sb.charAt(i);
        }
        return sb.toString().length();
    }
}