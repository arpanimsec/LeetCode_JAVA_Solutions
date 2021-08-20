class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
      List<String> arrayList2 = Arrays.asList(list2);
	List<String> result = new ArrayList<String>();
	int sum = Integer.MAX_VALUE;
	for(String str: list1) {
		if(arrayList2.contains(str)) {
			int list1index = Arrays.asList(list1).indexOf(str);
			int list2index = arrayList2.indexOf(str);
			if(sum == list1index+list2index) {
				result.add(str);
			} else if(sum > list1index+list2index) {
				result.clear();
				result.add(str);
				sum = list1index+list2index;
			}
			
		}
	}
	return result.toArray(new String[0]);
    }
}