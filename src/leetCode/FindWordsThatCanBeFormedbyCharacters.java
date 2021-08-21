package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindWordsThatCanBeFormedbyCharacters {

	public static void main(String arg[]) {
		String[] words = new String[] {"hello","world","leetcode"};
		String chars = "welldonehoneyr";
//		Expected Output: 10
//		Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
		
		int charCount = countCharacters(words, chars);
		System.out.println(charCount);
		
	}
	
	  public static int countCharacters(String[] words, String chars) {
	      int charCount=0;  
	      HashMap<Character, Integer> charsMap = new HashMap<>();
	      
	      //Build a hashmap with frequency of each character
		  for(int i=0; i< chars.length(); i++) {
			  char ch = chars.charAt(i);
			  if(charsMap.containsKey(ch)) {
				  int frequency = charsMap.get(ch);
				  charsMap.put(ch, frequency + 1);
			  }
			  else {
				  charsMap.put(ch, 1);
			  }
		  }
		  
		  for(String word: words) {
			  HashMap<Character, Integer> map = new HashMap<>();
			  map.putAll(charsMap); //copy original map
			  int count = 0;
			  for(int i=0; i < word.length(); i++) {
				  char ch = word.charAt(i);
				  if(!map.containsKey(ch)) {
					  i = word.length();
				  }
				  else {
					  int frequency = map.get(ch);
					  if(frequency==0) {
						  i = word.length();
					  } else {
						  map.put(ch, frequency -1);
						  count ++;
					  }
				  }
			  }
			  if(count == word.length()) {
				  charCount = charCount + count;
			  }
		  }
		  return charCount;
	    }
}
