package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {

	public static void main(String[] args) {
		int[] nums1 = new int[] {4,9,5};
		int[] nums2 = new int[] {9,4,9,8,4};
//		Output: [2,2]
		int[] result = intersect(nums1, nums2);
		for(int num: result) {
			System.out.println(num);
		}
	}
	
	 public static int[] intersect(int[] nums1, int[] nums2) {
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
