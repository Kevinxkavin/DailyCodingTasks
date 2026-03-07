class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        List<Integer> res = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++) 
                 if(!set.contains(i)) 
                      res.add(i);

return res;
        
    }
}

We create a HashSet to quickly check whether a number exists in the array or not.

Why HashSet?

HashSet has very fast lookup.

set.contains(x) → O(1) time

So checking if a number exists is very fast.

Example
nums = [4,3,2,7,8,2,3,1]

We store all numbers in a HashSet.
  Set<Integer> set = new HashSet<>();

Now the set becomes:

{1,2,3,4,7,8}

Duplicates are automatically removed.

448. Find All Numbers Disappeared in an Array
