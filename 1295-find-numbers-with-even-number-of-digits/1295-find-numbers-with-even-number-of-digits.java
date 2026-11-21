class Solution {
    public int findNumbers(int[] nums) {
        int i = 0;
        int count = 0;

        while (i < nums.length) {
            int n = nums[i];
            int digits = 0;

            while (n > 0) {
                digits++;
                n = n / 10;
            }

            if (digits % 2 == 0) {
                count++;
            }

            i++;
        }

        return count;
    }
}