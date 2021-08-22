package leetCode;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,1,3,3,4,3,2,4,2};
//		Output: true
		System.out.println(containsDuplicate(nums));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> numSet = new HashSet<Integer>(nums.length);
        
        //Inspect nums for duplicates
        for(int i = 0; i < nums.length; i++)
            if(!numSet.add(nums[i])) //A failure to add signifies a duplicate
                return true;
        
        return false; //No duplicates were found during inspection	
    }

}
