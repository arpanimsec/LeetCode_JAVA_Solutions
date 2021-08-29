package leetCode;

import java.util.HashSet;

public class SumofUniqueElements {

	public static void main(String[] args) {
		//1,2,3,2  
		//Output: 4
		//1,1,1,1,1
		//Output: 0
		//1,2,3,4,5
		//Output: 15
		int[] nums = new int[] {1,2,3,4,5};
		System.out.println(sumOfUnique(nums));
		
	}
	
	 public static int sumOfUnique(int[] nums) {
		 	HashSet<Integer> uniqueSet = new HashSet<>();
		 	HashSet<Integer> nonUniqueSet = new HashSet<>();
		 	int sum = 0;
		 	
		 	for(int num: nums) {
		 		
		 		if(uniqueSet.contains(num)) {
		 			uniqueSet.remove(num);
		 			nonUniqueSet.add(num);
		 		} else {
		 			if(!nonUniqueSet.contains(num))
		 			uniqueSet.add(num);
		 		}
		 		
		 	}
		 	
		 	//calculate sum of unique elements
		 	for(int num: uniqueSet) {
		 		sum = sum + num;
		 	}
		 	
	        return sum;
	    }

}
