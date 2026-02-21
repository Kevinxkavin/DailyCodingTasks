class Solution {
    public int countPrimeSetBits(int left, int right) {
        int r=0;
        
        for(int i=left;i<=right;i++)
        {
           int b = Integer.bitCount(i);
           if(isprime(b))
           {
            r++;
           }
          
        }
        return r;
    }
        private boolean isprime(int n)
        {
            int k=0;
          if (n <= 1) return false;
            
          for (k = 2; k < n; k++) {
                if (n % k == 0) return false;
          }
          return true;          
        }
}


Learn prime logic
