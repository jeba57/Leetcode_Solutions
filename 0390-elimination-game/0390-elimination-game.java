class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        int remaining = n;
        boolean left = true;

        while (remaining > 1) {

            // Head changes when eliminating from left
            // or when eliminating from right with odd count
            if (left || remaining % 2 == 1) {
                head += step;
            }

            // After one round, gap doubles
            step *= 2;

            // Half of the elements are removed
            remaining /= 2;

            // Change direction
            left = !left;
        }

        return head;
    }
}