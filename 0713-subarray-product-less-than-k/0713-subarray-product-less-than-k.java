class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if (k <= 1) return 0;
        int n = arr.length;
        int i = 0, pro = 1, count = 0;

        for (int j = 0; j < n; j++) {
            pro *= arr[j];
            while (pro >= k && i <= j) {
                pro /= arr[i++];
            }
            count += j - i + 1;
        }

        return count;
    }
}