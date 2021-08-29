class Solution {
    public int sumOfUnique(int[] nums) {
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