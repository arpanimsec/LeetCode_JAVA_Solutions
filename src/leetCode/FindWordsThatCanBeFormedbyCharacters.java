class Solution {
    public int countCharacters(String[] words, String chars) {
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