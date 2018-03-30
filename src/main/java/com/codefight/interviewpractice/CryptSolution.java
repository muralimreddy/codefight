package com.codefight.interviewpractice;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author muralimanohar
 *
 *A cryptarithm is a mathematical puzzle for which the goal is to find 
 *the correspondence between letters and digits, such that the given 
 *arithmetic equation consisting of letters holds true when the letters 
 *are converted to digits.
 *
 *You have an array of strings crypt, the cryptarithm, and an an array 
 *containing the mapping of letters and digits, solution. The array crypt 
 *will contain three non-empty strings that follow the structure: 
 *[word1, word2, word3], which should be interpreted as the word1 + word2 = word3 cryptarithm.
 *
 *If crypt, when it is decoded by replacing all of the letters in the cryptarithm 
 *with digits using the mapping in solution, becomes a valid arithmetic equation 
 *containing no numbers with leading zeroes, the answer is true. If it does not 
 *become a valid arithmetic solution, the answer is false.
 *
 *Example
 *
 *For crypt = ["SEND", "MORE", "MONEY"] and
 *
 *solution = [['O', '0'],
 *            ['M', '1'],
 *            ['Y', '2'],
 *            ['E', '5'],
 *            ['N', '6'],
 *            ['D', '7'],
 *            ['R', '8'],
 *            ['S', '9']]
 *the output should be
 *isCryptSolution(crypt, solution) = true.
 *
 *When you decrypt "SEND", "MORE", and "MONEY" using the mapping given in crypt, you get 9567 + 1085 = 10652 which is correct and a valid arithmetic equation.
 *
 *For crypt = ["TEN", "TWO", "ONE"] and
 *
 *solution = [['O', '1'],
 *            ['T', '0'],
 *            ['W', '9'],
 *            ['E', '5'],
 *           ['N', '4']]
 *the output should be
 *isCryptSolution(crypt, solution) = false.
 *
 *Even though 054 + 091 = 145, 054 and 091 both contain leading zeroes, 
 *meaning that this is not a valid solution.
 */
public class CryptSolution {

	public static void main(String[] args) {
		String[] crypt =  {"AA", "AA", "BB"};
		char[][] solution = {{'A','1'}, {'B','2'}};
		//Result: true
		
		//String[] crypt =  {"BLACK", "BLUE", "APPLE"};
		//char[][] solution = {{'B','5'},{'L','8'}, {'A','6'},  {'C','7'},  {'K','0'}, {'U','1'},  {'E','9'},  {'P','4'}};
		//Result: true
		
		//String[] crypt =  {"AA", "BB", "AA"};
		//char[][] solution = {{'A','1'}, {'B','0'}};
		//Result: false
		
		//String[] crypt =  {"A", "A", "A"};
		//char[][] solution = {{'A','0'}};
		//Result: true
		
		//String[] crypt =  {"WASD", "IJKL", "AOPAS"};
		//char[][] solution = {{'W','2'}, {'A','0'}, {'S','4'},  {'D','1'},  {'I','5'},  {'J','8'},  {'K','6'},  {'L','3'},  {'O','7'},  {'P','9'}};
		//Result: false
		
		System.out.println(isCryptSolution(crypt, solution));
	}

	static boolean isCryptSolution(String[] crypt, char[][] solution) {
		Map<String, String> soln = new HashMap<>();
		for(int i=0; i < solution.length; i++){
			char[] kv = solution[i];
			soln.put(String.valueOf(kv[0]), String.valueOf(kv[1]));
		}

		String a = crypt[0];
		String b = crypt[1];
		String c = crypt[2];
		
		a = getNumber(a, soln);
		b = getNumber(b, soln);
		c = getNumber(c, soln);
		
		if((a.length() > 1) && ((b.length() > 1) &&(a.substring(0, 1)).equalsIgnoreCase("0") || (b.substring(0, 1)).equalsIgnoreCase("0") ||(c.substring(0, 1)).equalsIgnoreCase("0"))){
			return false;
		}
		
      if(!((new BigInteger(a).add(new BigInteger(b))).equals(new BigInteger(c)))){
			return false;
		}
		
		return true;
	}

	private static String getNumber(String a, Map<String, String> soln) {
		StringBuffer  sb = new StringBuffer();
		for(int i=0; i < a.length(); i++){
			String k = a.substring(i,i+1);
			sb.append(soln.get(k));
		}
		return sb.toString();
	}


	
}
