public class Solution {
    // Make sure the method name matches what you're calling
    public String convertDateToBinary(String date) {
        // Split the date string into year, month, and day
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        // Convert each part to binary
        String yearBinary = Integer.toBinaryString(year);
        String monthBinary = Integer.toBinaryString(month);
        String dayBinary = Integer.toBinaryString(day);
        
        // Concatenate the binary values into a single string
        return yearBinary + "-" + monthBinary + "-" + dayBinary;
    }
}
