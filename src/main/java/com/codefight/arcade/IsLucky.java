package com.codefight.arcade;

public class IsLucky {

	public static void main(String[] args) {
		System.out.println(isLucky(1230));
	}
	static boolean isLucky(int n) {
		String s[] = String.valueOf(n).split("");
		int s1 = 0,s2 = 0;
		for(int i=0; i<s.length;i++){
			if(i < s.length/2){
				s1 += Integer.parseInt(s[i]);
			}else{
				s2 += Integer.parseInt(s[i]);
			}
		}
		if(s1==s2) return true;
		return false;
	}


}
