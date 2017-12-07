package com.codefight.arcade;

import org.junit.BeforeClass;
import org.junit.Test;

import com.codefight.arcade.CommonCharacterCount;

import static org.junit.Assert.assertEquals;


public class CommonCharacterCountTest {
	private static CommonCharacterCount commonCount;
	
	@BeforeClass
	public static void init(){
		commonCount = new CommonCharacterCount();
	}
	
	@Test
	public void test1(){
		String s1="aabcc";
		String s2="adcaa";
		
		assertEquals(3,commonCount.commonCharacterCount(s1, s2));
	}
	
	@Test
	public void test2(){
		String s1="zzzz";
		String s2="zzzzzz";
		
		assertEquals(4,commonCount.commonCharacterCount(s1, s2));
	}

	@Test
	public void test3(){
		String s1="abca";
		String s2="xyzbac";
		
		assertEquals(3,commonCount.commonCharacterCount(s1, s2));
	}
	
	@Test
	public void test4(){
		String s1="a";
		String s2="b";
		
		assertEquals(0,commonCount.commonCharacterCount(s1, s2));
	}
	
	@Test
	public void test5(){
		String s1="a";
		String s2="aaa";
		
		assertEquals(1,commonCount.commonCharacterCount(s1, s2));
	}
}
