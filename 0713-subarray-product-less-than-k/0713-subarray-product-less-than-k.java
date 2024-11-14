class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
       if (k <= 1) return 0;  // No valid subarray if k is 1 or less

        int n = arr.length;
        int i = 0, pro = 1, count = 0;

        for (int j = 0; j < n; j++) {
            pro *= arr[j];

            // Shrink the window from the left if the product is >= k
            while (pro >= k && i <= j) {
                pro /= arr[i++];
            }

            // Add all subarrays ending at `j` with a product less than `k`
            count += j - i + 1;
        }

        return count;
    }
}