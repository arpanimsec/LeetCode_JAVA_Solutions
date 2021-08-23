class Solution {
    public int distributeCandies(int[] candyType) {
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