/**
 * 
 */
package com.codefight.challanges;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author muralimanohar
 *
 */
public class CaesarCipherDecrypter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String messge = "Arire tbaan tvir lbh hc, arire tbaan yrg lbh qbja, arire tbaan eha nebhaq naq qrfreg lbh.";
		System.out.println(privateEyesOnly(messge));

	}

	static String privateEyesOnly(String message) {
		//' , . ! ? ( )
		String[] spls = {"'", ",", ".", "!", "?", "(", ")", " ","0","1","2","3","4","5","6","7","8","9" };
		Set<String> spl = new TreeSet<>();
		for (String s : spls) {
			spl.add(s);
		}
		int shift = shiftter(message);
		System.out.println("Shiftter: " + shift);
		StringBuffer sb = new StringBuffer();
		for(int i=0; i< message.length(); i++){
			char c = message.charAt(i);
			if(spl.contains(String.valueOf(c))){
				sb.append(c);
				continue;
			}
			sb.append(getChar(c , shift));
		}
		return sb.toString();
    }
	
	static int shiftter(String message){
		String[] ws = {"is", "was", "a", "in", "of", "to", "it", "do", "that", "for", 
				"not", "as", "but", "will", "up", "when", "can", "no", "like", 
				"than", "its", "any", "and", "you", "by", "we", "he", 
				"she", "we", "or", "so", "if", "me",  "him", "into", "good",
				"bad", "the", "up", "down", "order"}; 
		Set<String> cws = new TreeSet<>();
		for (String s : ws) {
			cws.add(s);
		}
		String[] ary = message.split(" ");
		for (String s : ary) {
			s = s.replace("'", "").replace(",", "").replace("", "").replace(".", "")
			 .replace("!", "").replace("?", "").replace("(", "").replace(")", "");
			if(s.length() < 6){
				for(int z = 0; z < 26; z++){
					StringBuffer sb = new StringBuffer();
					for(int i=0; i<s.length();i++){
						sb.append((char)(s.charAt(i) + z));
					}	
					if(cws.contains(sb.toString())) {
						return z;
					}
				}
				for(int z = -25; z < 0; z++){
					StringBuffer sb = new StringBuffer();
					for(int i=0; i<s.length();i++){
						sb.append((char)(s.charAt(i) + z));
					}	
					if(cws.contains(sb.toString())) {
						return z;
					}
				}
			}
		}
		return 0;
	}

	private static char getChar(char c, int s) {
		if(c > 96 && c < 123){ // a - z
			int i = c + s;
			if(i > 122){
				int d = i - 122;
				return (char)(96+d);
			}
			if(i < 97){
				int d = 97 - i;
				return (char)(123 - d);
			}
			return (char)i;
		}
		if(c > 64 && c < 91){ //A - Z
			int i = c + s;
			if(i > 90){
				int d = i - 90;
				return (char) (64 + d);
			}
			if(i < 65){
				int d = 65 - i;
				return (char) (91 - d);
			}
			return (char)i;
		}
		return 0;
	}



}
