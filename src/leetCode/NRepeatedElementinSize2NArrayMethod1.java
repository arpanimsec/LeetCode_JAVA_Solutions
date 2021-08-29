class Solution {
    public int repeatedNTimes(int[] nums) {
        int length = nums.length;
        int n = length/2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            if(map.containsKey(num)) {
                int frequency = map.get(num);
                if((frequency + 1) == n) {
                    return num;
                }
                map.put(num, frequency + 1);
            }
            else {
                map.put(num, 1);
            }
        }
     return nums[0];   
    }
}