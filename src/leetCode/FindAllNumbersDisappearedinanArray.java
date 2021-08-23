package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	
	public static void main(String args[]) {
		int[] nums = new int[] {4,3,2,7,8,2,3,1};
//		Output: [5,6]
		List<Integer> result = new ArrayList<>(findDisappearedNumbers(nums));
		
		for(int num: result) {
			System.out.println(num);
		}
	}
	
	 public static List<Integer> findDisappearedNumbers(int[] nums)  {
		 List<Integer> list = new ArrayList<>();
	        int[] arr = new int[nums.length+1];
	        for (int n : nums)
	            arr[n] = 1;
	        for (int i = 1; i< arr.length;i++) {
	            if (arr[i] == 0)
	                list.add(i);
	        }
	        return list;
	    }
}
