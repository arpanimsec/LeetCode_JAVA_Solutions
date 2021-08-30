class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = arr.length;
        int[] sortedArray = arr.clone();
        
        Arrays.sort(sortedArray);
        
        // int rank = 1;
        for(int num: sortedArray) {
//            map.putIfAbsent(num, map.size() + 1);
              if(!map.containsKey(num)) {
                
                 map.put(num, rank);  //number, rank
                rank++; 
             }   
        }
        
        for(int i=0; i < length; i++) {
            sortedArray[i] = map.get(arr[i]); 
        }
        return sortedArray;
    }
}