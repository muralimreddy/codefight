package com.codefight.arcade;

import java.util.HashMap;
import java.util.Map;

public class CommonCharacterCount {

	public static void main(String[] args) {
		String s1 = "aabcc";
		String s2 = "adcaa";
		System.out.println(commonCharacterCount(s1, s2));
	}

	static int commonCharacterCount(String inS1, String inS2){
		String[] s1 = inS1.split("");
		String[] s2 = inS2.split("");
		int count = 0;
		
//		if(s1.length >= s2.length){
//			count = compareChars(s1, s2);
//		}else{
//			count = compareChars(s2, s1);
//		}
		
		Map<Integer, Integer> matchMap = new HashMap<>();
		
		for(int i=0; i < s1.length; i++){
			for(int j=0; j < s2.length; j++){
				if(s1[i].equalsIgnoreCase(s2[j]) && !matchMap.containsKey(j)){
					matchMap.put(j, j);
					break;
				}
			}
		}
		
		return matchMap.size();
	}

//	static int compareChars(String[] s1Arr, String[] s2Arr) {
//		Map<Integer, Integer> matchMap = new HashMap<>();
//		
//		for(int i=0; i < s1Arr.length; i++){
//			for(int j=0; j < s2Arr.length; j++){
//				if(s1Arr[i].equalsIgnoreCase(s2Arr[j]) && !matchMap.containsKey(j)){
//					matchMap.put(j, j);
//					break;
//				}
//			}
//		}
//		
//		return matchMap.size();
//	}
	

}
