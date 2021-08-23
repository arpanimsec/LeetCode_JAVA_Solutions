package leetCode;

import java.util.HashSet;

public class DistributeCandies {

	public static void main(String args[]) {
		int[] candyType = new int[] {1,1,2,2,3,3};
//		Output: 3
//		Explanation: Alice can only eat 6 / 2 = 3 candies. 
//		Since there are only 3 types, she can eat one of each type.
		System.out.println(distributeCandies(candyType));
	}
	
	public static int distributeCandies(int[] candyType) {
		int maxCandiesAllowed = (candyType.length)/2;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i: candyType) {
			if(set.size() < maxCandiesAllowed) {
				set.add(i);
			}
			
		}
		
		return set.size();
    }
}
