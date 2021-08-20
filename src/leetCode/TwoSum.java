package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = new int[]{3,3};
		int target = 6;
		int[] result = new int[] {100,100};
		result = twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println("Hi");
	}
	 public static int[] twoSum(int[] nums, int target) {
	        int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i < nums.length; i++) {
			int delta = target - nums[i];
				if(map.containsKey(target - nums[i])) {
					result[0] = map.get(delta);
					result[1] = i;
				}
				else {
					map.put(nums[i], i);
				}
			}
			
		return result;   
	    }

}
