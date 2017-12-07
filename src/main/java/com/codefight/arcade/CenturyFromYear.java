package com.codefight.arcade;

public class CenturyFromYear {

	public static void main(String[] args) {
		
		int year = 1720;
		int mod = year % 100;
		
		if(mod == 0 ){
			System.out.println( year / 100);
		}else{
			System.out.println((year/100) + 1);
		}
	}

}
