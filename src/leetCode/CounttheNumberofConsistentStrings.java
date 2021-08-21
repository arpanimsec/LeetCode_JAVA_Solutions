package leetCode;

import java.util.HashSet;

public class CounttheNumberofConsistentStrings {

	public static void main(String[] args) {
		String[] words = new String[] {"ad","bd","aaab","baa","badab"};
		String allowed = "ab";
//		Output: 2
//		Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
		System.out.println(countConsistentStrings(allowed,words));
	}
	
	public static int countConsistentStrings(String allowed, String[] words) {
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
