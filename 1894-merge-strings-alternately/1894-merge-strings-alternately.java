class Solution {
    public String mergeAlternately(String a, String b ) {
        StringBuilder sb = new StringBuilder();
        int max = Math.max(a.length(),b.length());

        for(int i =0 ; i<max ;i++){
            if( i < a.length()) {
                sb.append(a.charAt(i));
            }
            if( i < b.length()) {
                sb.append(b.charAt(i));
            }
        }

        return sb.toString();
    }
}