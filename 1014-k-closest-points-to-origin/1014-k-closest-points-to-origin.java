class Solution {
        public int[][] kClosest(int[][] points, int k) {
            int len = points.length, l = 0, r = len - 1;
            while (l <= r) {
                int mid = helper(points, l, r);
                if (mid < k) {
                    l = mid + 1;
                } else if (k < mid) {
                    r = mid - 1;
                } else {
                    break;
                }
            }
            return Arrays.copyOfRange(points, 0, k);
        }

        private int helper(int[][] nums, int left, int right) {
            int i = left;
            int j = right + 1;

            swap(nums, left, (left + right) >>> 1);
            int[] pivot = nums[left];

            while (i < j) {
                do {
                    i++;
                } while (i < right && compare(nums[i], pivot) < 0);
                do {
                    j--;
                } while (compare(pivot, nums[j]) < 0);

                if (i < j)
                    swap(nums, i, j);
            }
            swap(nums, left, j);
            return j;
        }

        private void swap(int[][] nums, int i, int j) {
            int[] tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        private int compare(int[] p1, int[] p2) {
            return p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1];
        }
    }