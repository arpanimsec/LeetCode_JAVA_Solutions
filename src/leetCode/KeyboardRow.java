class Solution {
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
		List<Character> firstRow = new ArrayList<>(Arrays.asList('q','w','e','r','t','y','u','i','o','p'));
		List<Character> secondRow = new ArrayList<>(Arrays.asList('a','s','d','f','g','h','j','k','l'));
		List<Character> thirdRow = new ArrayList<>(Arrays.asList('z','x','c','v','b','n','m'));
		
		for(String word: words) {
			int firstRowCount = 0, secondRowCount = 0, thirdRowCount = 0;
			int wordLength = word.length();
			for(int i=0; i< wordLength; i++) {
				if(firstRow.contains(word.toLowerCase().charAt(i))) {
					firstRowCount++;
				}
				else if(secondRow.contains(word.toLowerCase().charAt(i))) {
					secondRowCount++;
				}
				else if(thirdRow.contains(word.toLowerCase().charAt(i))) {
					thirdRowCount++;
				}
			}
			if(firstRowCount==wordLength || secondRowCount==wordLength || thirdRowCount==wordLength) {
				result.add(word);
			}
		}
		
		int i=0;
		String[]resultArray = new String[result.size()];
		for(String word: result) {
			resultArray[i] = word;
			i++;
		}
		return resultArray;
            
    }
}