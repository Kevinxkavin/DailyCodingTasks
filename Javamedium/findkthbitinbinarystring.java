class Solution {
    public char findKthBit(int n, int k) {

        if (n == 1) return '0';

        int length = (1 << n) - 1;
        int mid = (length + 1) / 2;

        if (k == mid) {
            return '1';
        }

        if (k < mid) {
            return findKthBit(n - 1, k);
        }

        char bit = findKthBit(n - 1, length - k + 1);
        return bit == '0' ? '1' : '0';
    }
}

1545. Find Kth Bit in Nth Binary String


  If k is not in left side and not middle,

👉 We go to right side
👉 Mirror the position
👉 Get the bit from smaller string
👉 Flip it
👉 Return it
