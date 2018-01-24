package com.codefight.interviewpractice;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNotRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println(firstNotRepeatingCharacter("ngrhhqbhnsipkcoqjyviikvxbxyphsnjpdxkhtadltsuxbfbrkof"));
	}

	static char firstNotRepeatingCharacter(String s) {
	    char unique = '_';
	    Map<String, Integer> countMap = new LinkedHashMap<>();
	    String[] sar = s.split("");
	    for(String a: sar){
	        if(countMap.containsKey(a)){
	            Integer count = countMap.get(a);
	            
	            countMap.put(a, ++count);
	        }else{
	            countMap.put(a, new Integer(1));
	        }
	    }
	    Iterator it = countMap.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        if(((Integer)pair.getValue()).intValue() == 1){
	            unique = ((String)pair.getKey()).charAt(0);
	            break;
	        }
	    }
	    return unique;
	}


}
