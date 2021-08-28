package leetCode;

import java.util.HashSet;

public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = new int[] {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
	public static int findDuplicate(int[] nums) {
		int result = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i < nums.length; i++) {
			if(!set.add(nums[i])) {
				result= nums[i]; 
				i = nums.length;
			}
		}
		return result;
    }
}
