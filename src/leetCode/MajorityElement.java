package leetCode;

import java.util.HashMap;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = new int[] {2,2,1,1,1,2,2};
		//Output: 2
		System.out.println(majorityElement(nums));

	}
	
	 public static int majorityElement(int[] nums) {
		 HashMap<Integer, Integer> map = new HashMap<>();
		 
		 for(int num: nums) {
			 if(map.containsKey(num)) {
				 int frequency = map.get(num);
				 map.put(num, frequency + 1);
				 if((frequency + 1) > (nums.length /2)) {
					 return num;
				 }
			 }
			 else {
				 map.put(num, 1);
			 }
		 }
		 return nums[0];
	    }

}
