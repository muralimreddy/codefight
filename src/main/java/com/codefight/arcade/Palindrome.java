package com.codefight.arcade;

public class Palindrome {

	public static void main(String[] args){
		System.out.println("abac is palindrome: " + checkPalindrome("abac"));
		System.out.println("aabaa is palindrome: " + checkPalindrome("aabaa"));
	}
	
	static boolean checkPalindrome(String inputString){
		return (inputString.equals(reverse(inputString)));
	}
	
	static String reverse(String str){
	    int length = str.length();
	    if(length==1) return str;
	    
	    return str.charAt(length-1) + reverse(str.substring(0,length-1));
	}
	
}
