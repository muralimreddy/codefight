package com.codefight.interviewpractice;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class PressingButtonsTest {
	private static PressingButtons pressingButtons;
	
	@BeforeClass
	public static void init(){
		pressingButtons = new PressingButtons();
	}
	
	@Test
	public void test1(){
		String[] result = pressingButtons.pressingButtons("42");
		String[] expectedResult = {"ga", 
		                           "gb", 
		                           "gc", 
		                           "ha", 
		                           "hb", 
		                           "hc", 
		                           "ia", 
		                           "ib", 
		                           "ic"};
		assertArrayEquals(expectedResult, result);
	}

	@Test
	public void test2(){
		String[] result = pressingButtons.pressingButtons("2");
		String[] expectedResult = {"a", 
				 "b", 
				 "c"};
		assertArrayEquals(expectedResult, result);
	}	

	@Test
	public void test3(){
		String[] result = pressingButtons.pressingButtons("3");
		String[] expectedResult = {"d",  "e", "f"};
		assertArrayEquals(expectedResult, result);
	}			

	@Test
	public void test4(){
		String[] result = pressingButtons.pressingButtons("6");
		String[] expectedResult = {"m", "n", "o"};
		assertArrayEquals(expectedResult, result);
	}				
	
	@Test
	public void test5(){
		String[] result = pressingButtons.pressingButtons("");
		String[] expectedResult = {};
		assertArrayEquals(expectedResult, result);
	}		

	@Test
	public void test6(){
		String[] result = pressingButtons.pressingButtons("22");
		String[] expectedResult = {"aa", 
				 "ab", 
				 "ac", 
				 "ba", 
				 "bb", 
				 "bc", 
				 "ca", 
				 "cb", 
				 "cc"};
		assertArrayEquals(expectedResult, result);
	}					

	@Test
	public void test7(){
		String[] result = pressingButtons.pressingButtons("234");
		String[] expectedResult = {"adg", 
				 "adh", 
				 "adi", 
				 "aeg", 
				 "aeh", 
				 "aei", 
				 "afg", 
				 "afh", 
				 "afi", 
				 "bdg", 
				 "bdh", 
				 "bdi", 
				 "beg", 
				 "beh", 
				 "bei", 
				 "bfg", 
				 "bfh", 
				 "bfi", 
				 "cdg", 
				 "cdh", 
				 "cdi", 
				 "ceg", 
				 "ceh", 
				 "cei", 
				 "cfg", 
				 "cfh", 
				 "cfi"};
		assertArrayEquals(expectedResult, result);
	}							

	@Test
	public void test8(){
		String[] result = pressingButtons.pressingButtons("8888");
		String[] expectedResult = {"tttt", 
				 "tttu", 
				 "tttv", 
				 "ttut", 
				 "ttuu", 
				 "ttuv", 
				 "ttvt", 
				 "ttvu", 
				 "ttvv", 
				 "tutt", 
				 "tutu", 
				 "tutv", 
				 "tuut", 
				 "tuuu", 
				 "tuuv", 
				 "tuvt", 
				 "tuvu", 
				 "tuvv", 
				 "tvtt", 
				 "tvtu", 
				 "tvtv", 
				 "tvut", 
				 "tvuu", 
				 "tvuv", 
				 "tvvt", 
				 "tvvu", 
				 "tvvv", 
				 "uttt", 
				 "uttu", 
				 "uttv", 
				 "utut", 
				 "utuu", 
				 "utuv", 
				 "utvt", 
				 "utvu", 
				 "utvv", 
				 "uutt", 
				 "uutu", 
				 "uutv", 
				 "uuut", 
				 "uuuu", 
				 "uuuv", 
				 "uuvt", 
				 "uuvu", 
				 "uuvv", 
				 "uvtt", 
				 "uvtu", 
				 "uvtv", 
				 "uvut", 
				 "uvuu", 
				 "uvuv", 
				 "uvvt", 
				 "uvvu", 
				 "uvvv", 
				 "vttt", 
				 "vttu", 
				 "vttv", 
				 "vtut", 
				 "vtuu", 
				 "vtuv", 
				 "vtvt", 
				 "vtvu", 
				 "vtvv", 
				 "vutt", 
				 "vutu", 
				 "vutv", 
				 "vuut", 
				 "vuuu", 
				 "vuuv", 
				 "vuvt", 
				 "vuvu", 
				 "vuvv", 
				 "vvtt", 
				 "vvtu", 
				 "vvtv", 
				 "vvut", 
				 "vvuu", 
				 "vvuv", 
				 "vvvt", 
				 "vvvu", 
				 "vvvv"};
		assertArrayEquals(expectedResult, result);
	}								

	@Test
	public void test9(){
		String[] result = pressingButtons.pressingButtons("4");
		String[] expectedResult = {"g","h", "i"};
		assertArrayEquals(expectedResult, result);
	}																
}
