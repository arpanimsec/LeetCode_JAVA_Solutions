package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumOfTwoLists {

	public static void main(String[] args) {
	String[] list1 = new String[] {"Shogun","Tapioca Express","Burger King","KFC"};
	String[] list2 = new String[] {"KFC","Shogun","Burger King"}; //Expected Output "Shogun"
	String[] restaurants = findRestaurant(list1, list2);
		for(int i=0; i< restaurants.length; i++) {
		System.out.println(restaurants[i]);
		}
	}
	
public static String[] findRestaurant(String[] list1, String[] list2) {
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
