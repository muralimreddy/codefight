package com.codefight.arcade;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordLadder {
	public int wordLadder(String beginWord, String endWord, String[] wordList) {
		
		Map<String, Object> fResultMap = parseLadder(beginWord, endWord,wordList);
		String fLastWord = (String) fResultMap.get("lastWord");
		int fCount = ((Integer) fResultMap.get("count")).intValue();
		
		wordList = reverseArray(wordList);
		Map<String, Object> rResultMap = parseLadder(beginWord, endWord,wordList);
		String rLastWord = (String) rResultMap.get("lastWord");
		int rCount = ((Integer) rResultMap.get("count")).intValue();
		
		if(fCount < rCount){
			if(fLastWord.equals(endWord)){
				return fCount;
			}
		}else{
			if(rLastWord.equals(endWord)){
				return rCount;
			}else{
				return fCount;
			}
		}
		
		
//		if(count > 1 && lastWord.equals(endWord)){
//			return count;
//		}else{
//			
//			resultMap = parseLadder(beginWord,endWord, wordList);
//			lastWord = (String) resultMap.get("lastWord");
//			count = ((Integer) resultMap.get("count")).intValue();
//			
//			if(lastWord.equals(endWord)){
//				return count;
//			}
//		}
		
		return 0;
	}
	
	public Map<String, Object> parseLadder(String beginWord, String endWord,  String[] wordList){
		String currentWord =  beginWord;
		Map<String, Object> resultMap= new HashMap<>();
		int count = 0;
		
		for(int k=0; k < wordList.length; k++){
			String word = wordList[k];
			if(k==0 && word.equals(beginWord)) continue;
			
			
			if(word.equals(endWord)) {
				currentWord = endWord;
				break;
			}
			boolean matchFound = checkNextWord(currentWord, word);
			if(matchFound){
				count++;
				currentWord = word;
			}
		}
		
		resultMap.put("count", Integer.valueOf(count));
		resultMap.put("lastWord", currentWord);
		return resultMap;
	}
	
	private boolean checkNextWord(String currentWord, String nextWord) {
		int diff = 0;
		for (int i = 0; i < currentWord.length(); i++) {
			if (currentWord.charAt(i) != nextWord.charAt(i)) {
				diff++;
			}
		}
		if ((currentWord.length() == 1 && diff == 0) || (currentWord.length() > 1 && diff > 1)) {
			return false;
		}
		return true;
	}
	
	private String[] reverseArray(String[] strArr){
		List<String> listArr = Arrays.asList(strArr);
		Collections.reverse(listArr);

		return (String[]) listArr.toArray();
	}
	
	
}
