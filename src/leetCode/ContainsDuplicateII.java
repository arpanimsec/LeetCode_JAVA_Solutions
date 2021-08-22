package leetCode;

import java.util.HashMap;

public class ContainsDuplicateII {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,1,2,3};
		int k = 2;
//		Output: false
		System.out.println(containsNearbyDuplicate(nums, k));
	}
	
	 public static boolean containsNearbyDuplicate(int[] nums, int k) {
		 HashMap<Integer, Integer> map = new HashMap<>();
		 
		 for(int i=0; i < nums.length; i++) {
			if(map.containsKey(nums[i]) && (Math.abs(i - map.get(nums[i])) <= k)) {
				return true;
			}
			else {
				map.put(nums[i], i);
			}
		 }
		 
	     return false;   
	    }

}
