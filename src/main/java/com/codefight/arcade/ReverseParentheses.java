package com.codefight.arcade;

public class ReverseParentheses {

	public static void main(String[] args) {
		String s = "The ((quick (brown) (fox) jumps over the lazy) dog)";
		//String s = "abc(cba)ab(bac)c";
		System.out.println(reverseParentheses(s));
	}

	static String reverseParentheses(String s) {
	    int st = s.lastIndexOf('(');
	    while(st != -1) {
	        int ed = s.indexOf(')', st);
	        String t = s.substring(0, st);
	        t += new StringBuffer(s.substring(st + 1, ed)).reverse().toString();
	        t += s.substring(ed + 1);
	        s = t;
	        System.out.println(s);
	        st = s.lastIndexOf('(');
	    }
	    return s;
	}
}
