package leetCode;

import java.util.HashSet;

public class SetMismatch {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,2,4};
//		Output: [2,3]
		int[] result = findErrorNums(nums);
		
		for(int num: result) {
			System.out.println(num);
		}
	}
	
	public static int[] findErrorNums(int[] nums) {
		int n = nums.length;
        int[] result = new int[2];
        HashSet<Integer> set = new HashSet<>();
        
        int arraySum = 0;
        for(int num: nums) {
        	if(!set.add(num)) { //only unique values are added in hashset
        		result[0] = num;
        	}
        	else {
        		arraySum = arraySum + num;
        	}
        }
        
        int expectedSum = (((2*1) + (n-1)) * n) / 2;
        
        result[1] = expectedSum - arraySum;
        
        return result;
    }

}
