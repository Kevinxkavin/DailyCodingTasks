class Solution {
    public boolean hasAlternatingBits(int n) {
        String t=Integer.toBinaryString(n);
        for(int i=1;i<t.length();i++)
        {
            if(t.charAt(i)==t.charAt(i-1))
            {
                return false;
            }
        }return true;
    }
}

Bit manipulation 

class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n ^ (n >> 1);
        return (x & (x + 1)) == 0;
    }
}
