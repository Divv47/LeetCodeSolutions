class Solution {
    // Helper method to reverse an integer
    private int reverseInt(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
    
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        // Add each number and its reversed version to the set
        for (int num : nums) {
            set.add(num);
            set.add(reverseInt(num));
        }
        
        return set.size();
    }
}
