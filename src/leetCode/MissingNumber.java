class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
		 int sumOfArray = 0;
		 
		 for(int num: nums) {
			 sumOfArray = sumOfArray + num;
		 }
		 
		 int requiredSum = (((2*1) + (n-1)) * n) / 2;
		 
	     return requiredSum -  sumOfArray;
    }
}