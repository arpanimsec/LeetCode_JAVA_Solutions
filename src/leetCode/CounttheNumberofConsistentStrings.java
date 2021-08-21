class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentStringCount = 0;
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0; i< allowed.length(); i++) {
        	set.add(allowed.charAt(i));
        }
        
        for(String word: words) {
        	int count=0;
        	for(int i=0; i< word.length(); i++) {
        		char ch = word.charAt(i);
        		if(!set.contains(ch)) {
        			i = word.length();
        		}
        		else {
        			count++;
        		}
        	}
        	if(count == word.length()) {
        		consistentStringCount++;
        	}
        }
        
        return consistentStringCount;
    }
}
