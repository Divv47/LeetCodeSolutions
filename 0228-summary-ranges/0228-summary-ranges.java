import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0) {
            return result;
        }
        
        // Start of the current range
        int start = nums[0];
        
        for (int i = 1; i <= nums.length; i++) {
            // Check if we reached the end of the array or there's a gap in the sequence
            if (i == nums.length || nums[i] != nums[i - 1] + 1) {
                // If the range is a single number
                if (start == nums[i - 1]) {
                    result.add(String.valueOf(start));
                } else {
                    // If the range has multiple numbers
                    result.add(start + "->" + nums[i - 1]);
                }
                // Update the start of the next range
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }
        
        return result;
    }
}
