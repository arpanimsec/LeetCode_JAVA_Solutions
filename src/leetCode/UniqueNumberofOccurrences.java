class Solution {
    public boolean uniqueOccurrences(int[] arr) {
	    // Map will store the frequency of the intergers
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();        
        for(int i:arr){
            if(map.containsKey(i))
                map.replace(i,map.get(i)+1);            
            else
                map.put(i,1);            
        }
        
		// List will check if the frequency is unique using list.contains()
        List<Integer> list = new ArrayList<>();
        for(Map.Entry m:map.entrySet()){
            if(list.contains(m.getValue())) 
                return false;
            else 
                list.add((int)m.getValue());
        }
        return true;
    }
}