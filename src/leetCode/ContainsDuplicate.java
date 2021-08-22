class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<Integer>(nums.length);
        
        //Inspect nums for duplicates
        for(int i = 0; i < nums.length; i++)
            if(!numSet.add(nums[i])) //A failure to add signifies a duplicate
                return true;
        
        return false; //No duplicates were found during inspection
    }
}