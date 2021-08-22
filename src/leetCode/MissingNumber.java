package leetCode;

public class MissingNumber {
	
	public static void main(String args[]) {
		int[] nums = new int[] {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}
	
	 public static int missingNumber(int[] nums) {
		 int n = nums.length;
		 int sumOfArray = 0;
		 
		 for(int num: nums) {
			 sumOfArray = sumOfArray + num;
		 }
		 
		 int requiredSum = (((2*1) + (n-1)) * n) / 2;
		 
	     return requiredSum -  sumOfArray;
	    }

}
