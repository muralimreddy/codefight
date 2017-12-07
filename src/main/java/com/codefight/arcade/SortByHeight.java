package com.codefight.arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByHeight {
	public static void main(String[] ar){
		int[] people = {-1, 150, 190, 170, -1, -1, 160, 180};

		sortByHeight(people);
	}
	
	static int[] sortByHeight(int[] a) {
		int result[] = new int[a.length];
		
		List<Integer> baseList = new ArrayList<>();
		List<Integer> peopleList = new ArrayList<>();
		for(int n: a){
			baseList.add(n);
			if(n != -1)
				peopleList.add(n);
		}
		
		peopleList.sort((c1,c2) -> c1.compareTo(c2));
		int k=0;
		for(int i=0; i< baseList.size(); i++){
			Integer e = baseList.get(i);
			if(e.intValue() != -1){
				baseList.set(i, peopleList.get(k));
				k++;
			}
			result[i] = baseList.get(i).intValue();
		}
		
		return result;
	}
}
