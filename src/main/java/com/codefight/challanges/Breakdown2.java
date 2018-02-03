package com.codefight.challanges;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Breakdown2 {

	public static void main(String[] args) {
		//String[] ary = {"2**11", "5**7", "13**19"};
		String[][] ary = {
				{"2,3", "1,8", "3,11"}, //[2, 1, 3, 264, 88, 33, 24]
				{"5=8", "4=9", "1=11"}, //5, 4, 1, 792, 99, 88, 72
				{"3=5", "1=7", "2=7"},   //[3, 1, 2, 245, 49, 35, 35]
				{"1+5", "2+3",  "4+7"}, //[1, 2, 4, 105, 21, 35, 15]
				{"4*5", "5*6", "6*7"},//[4, 5, 6, 210, 42, 35, 30]
				{"1-2", "1-3",  "1-5"},//[1, 1, 1, 30, 15, 10, 6]
				{"2**11", "5**7", "13**19"},//[2, 5, 13, 1463, 133, 209, 77]
				{"7/9", "4/5", "10/13"}//[7, 4, 10, 585, 65, 117, 45]
				
		};
		String[] expected = {
				"[2, 1, 3, 264, 88, 33, 24]",
				"[5, 4, 1, 792, 99, 88, 72]",
				"[3, 1, 2, 245, 49, 35, 35]",
				"[1, 2, 4, 105, 21, 35, 15]",
				"[4, 5, 6, 210, 42, 35, 30]",
				"[1, 1, 1, 30, 15, 10, 6]",
				"[2, 5, 13, 1463, 133, 209, 77]",
				"[7, 4, 10, 585, 65, 117, 45]"
		};
		int e=0;
		for (String[] s : ary) {
			long[] result = breakDown2(s);
			System.out.println("Input   :" + Arrays.toString(s));
			System.out.println("Expected:" + expected[e++]);
			System.out.println("Output  :"+ Arrays.toString(result));
			System.out.println("-------------------------");
		}
	}
	
	static long[] breakDown2(String[] strings) {
		long b[] = new long [3];
		long c[] = new long [7];
		int i=0;
		long med =1;
		for (String s : strings) {
			String sp[] = s.split("[^\\p{L}0-9']+");
			c[i] = Long.parseLong(sp[0]);
			b[i] = Long.parseLong(sp[1]);
			med *= b[i];
			i++;
		}
		c[i++] = med;
		for(int m = b.length-1; m >=0; m--){
			for(int n = m-1; n >=0; n--){
				c[i++] = b[m] * b[n];
			}
		}
		return c;
	}

}
