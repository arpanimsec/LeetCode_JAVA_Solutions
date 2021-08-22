class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
	     HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int num: nums1) {
	        	if(map.containsKey(num)) {
	        		int frequency = map.get(num);
	        		map.put(num, frequency + 1);
	        	}
	        	else {
	        		map.put(num, 1);
	        	}
	        }

	        for(int num: nums2) {
	        	if(map.containsKey(num)) {
	        		int frequency = map.get(num);
	        		if (frequency > 0) {
	        			map.put(num, frequency -1);
	        			result.add(num);
	        		}
	        	}
	        }
	        
	        int[] resultArray = new int[result.size()];
	        int i=0;
	        for(int num: result) {
	        	resultArray[i] = num;
	        	i++;
	        }
			return resultArray;
    }
}