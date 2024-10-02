class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        int uniqueSize = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (i == 0 || temp[i] != temp[i - 1]) {
                temp[uniqueSize++] = temp[i];
            }
        }
        int[] ranks = new int[arr.length];

        // Assign the rank to each element in the original array
        for (int i = 0; i < arr.length; ++i) {
            ranks[i] = Arrays.binarySearch(temp, 0, uniqueSize, arr[i]) + 1;
        }
        return ranks;
    }
}