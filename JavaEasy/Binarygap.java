class Solution {
    public int binaryGap(int n) {
         String b = Integer.toBinaryString(n);
         int len = b.length();
         int result=0;
         int p=-1;
         for(int a=0;a<len;a++)
         {
           if(b.charAt(a)=='1')
           {
            if(p!=-1)
                result=Math.max(result,a-p);
            
            p=a;

           }
         }
        
   return result; }
    
}
