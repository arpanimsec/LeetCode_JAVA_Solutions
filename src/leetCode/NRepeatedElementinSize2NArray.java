class Solution {
    public int repeatedNTimes(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>();
        for(int num: nums) {
            if(!set.add(num)) {
                return num;
            }
        }
     return nums[0];   
    }
}