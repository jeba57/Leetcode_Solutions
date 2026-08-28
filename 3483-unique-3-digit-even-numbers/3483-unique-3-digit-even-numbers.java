class Solution {
    public int totalNumbers(int[] digits) {

        int[] map = new int[10];

        // Count how many times each digit occurs
        for (int d : digits) {
            map[d]++;
        }

        int count = 0;

        // First digit: 1-9 (can't be 0)
        for (int i = 1; i <= 9; i++) {

            if (map[i] == 0)
                continue;

            map[i]--;

            // Second digit: 0-9
            for (int j = 0; j <= 9; j++) {

                if (map[j] == 0)
                    continue;

                map[j]--;

                // Third digit: even digits only
                for (int k = 0; k <= 8; k += 2) {

                    if (map[k] == 0)
                        continue;

                    count++;
                }

                map[j]++;
            }

            map[i]++;
        }

        return count;
    }
}