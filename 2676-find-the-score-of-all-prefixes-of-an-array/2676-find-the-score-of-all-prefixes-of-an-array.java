class Solution {
    public long[] findPrefixScore(int[] arr) {
        int []  arr2 = new int[arr.length];
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max, arr[i]);
            arr2[i] = arr[i] + max;
        }
        long [] arr3 = new long[arr.length];
        arr3[0] = arr2[0];
        for(int i=1;i<arr.length;i++){
            arr3[i] = arr2[i] + arr3[i-1];
        }
        return arr3;
    }
}