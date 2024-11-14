class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int minlen = Integer.MAX_VALUE;
        int i=0,j=0,sum=0;
        while(j<n&& sum <target){
            sum += arr[j++];
        }
        j--;

        while(i<n && j<n){
            int len = j-i+1;
            if( sum>=target) minlen = Math.min(len,minlen);
            sum -= arr[i];
            i++;j++;
            while(j<n && sum<target){
                sum += arr[j++];
            }
            j--;
        }
        if(minlen == Integer.MAX_VALUE) return 0;
        return minlen;
    }
}