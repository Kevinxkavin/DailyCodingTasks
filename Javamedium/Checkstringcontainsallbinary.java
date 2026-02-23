class Solution {
    public boolean hasAllCodes(String s, int k) {
        if(s.length()<k) return false;
        int needed = 1<<k;
        Set<String> set = new HashSet<>();
        for(int i=0;i<=s.length()-k;i++)
        {
            String sub = s.substring(i,i+k);
            set.add(sub);
        }
        if(set.size()==needed)
              return true;
        
    return false; }
   
}


i = 1
substring(1, 3) → "01"

Set = { "00", "01" }
Size = 2

  https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/?envType=daily-question&envId=2026-02-23
