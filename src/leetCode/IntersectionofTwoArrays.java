package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = new int[] {1,2,2,1};
		int[] nums2 = new int[] {2,2};
		
		int[] result = intersection(nums1, nums2);
		for(int num: result) {
			System.out.println(num);
		}
 	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> result = new HashSet<>();
        
		HashSet<Integer> set = new HashSet<>();
        
        for(int num: nums1) {
        	set.add(num);
        }
        
        for(int num: nums2) {
        	if(set.contains(num)) {
        		result.add(num);
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
