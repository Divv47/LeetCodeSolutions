class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] remainder = new int[k];
        
        // Calculate the remainder of each element when divided by k
        for (int num : arr) {
            int rem = ((num % k) + k) % k;  // Handle negative numbers
            remainder[rem]++;
        }
        
        // Special case: check pairs of numbers divisible by k (remainder 0)
        if (remainder[0] % 2 != 0) {
            return false;  // Pairs divisible by k must be even
        }
        
        // Check the pairs of remainders
        for (int i = 1; i <= k / 2; i++) {
            if (remainder[i] != remainder[k - i]) {
                return false;
            }
        }
        
        return true;
    }
}
