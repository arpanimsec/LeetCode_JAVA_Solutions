class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        for(int num: nums) {
           if(map.containsKey(num)) {
               int frequency = map.get(num);
               if((!result.contains(num)) && ((frequency + 1) > (nums.length/3))) {
                   result.add(num);
               }
               else {
                   map.put(num, frequency + 1);
               }
           }
            else {
                map.put(num, 1);
                if((!result.contains(num)) && (1 > (nums.length/3))) {
                   result.add(num); 
                }
            }
        }
        return result;
    }
}