package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumIndexSumOfTwoLists {

	public static void main(String[] args) {
	List<String> list1 = new ArrayList<>(Arrays.asList("Shogun","Tapioca Express","Burger King","KFC"));
	List<String> list2 = new ArrayList<>(Arrays.asList("KFC","Burger King","Tapioca Express","Shogun"));
	String[] restaurants = findRestaurant(list1, list2);
		for(int i=0; i< restaurants.length; i++) {
		System.out.println(restaurants[i]);
		}
	}
	
public static String[] findRestaurant(List<String> list1, List<String> list2) {
	List<String> result = new ArrayList<String>();
	for(String str: list1) {
		if(list2.contains(str)) {
			result.add(str);
		}
	}
	
	String[] resultArray = new String[result.size()];
	int i=0;
	for(String str: result) {
		resultArray[i] = str;
		i++;
	}
	return resultArray;
        
    }

}
