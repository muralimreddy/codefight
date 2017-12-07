package com.codefight.arcade;

import org.junit.BeforeClass;
import org.junit.Test;

import com.codefight.arcade.AlmostIncreasingSequence;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AlmostIncreasingSequenceTest {
	private static AlmostIncreasingSequence sequencer;

	@BeforeClass
	public static void init() {
		sequencer = new AlmostIncreasingSequence();
	}

	@Test
	public void test1() {
		int[] sequence = { 1, 3, 2, 1 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test2() {
		int[] sequence = { 1, 3, 2 };
		assertTrue(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test3() {
		int[] sequence = { 1, 2, 1, 2 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test4() {
		int[] sequence = { 1, 4, 10, 4, 2 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test5() {
		int[] sequence = { 10, 1, 2, 3, 4, 5 };
		assertTrue(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test6() {
		int[] sequence = { 1, 1, 1, 2, 3 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test7() {
		int[] sequence = { 0, -2, 5, 6 };
		assertTrue(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test8() {
		int[] sequence = { 1, 2, 3, 4, 5, 3, 5, 6 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test9() {
		int[] sequence = { 40, 50, 60, 10, 20, 30 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test10() {
		int[] sequence = { 1, 1 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test11() {
		int[] sequence = { 10, 1, 2, 3, 4, 5, 6, 1 };
		assertFalse(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test12() {
		int[] sequence = { 1, 2, 3, 4, 3, 6 };
		assertTrue(sequencer.almostIncreasingSequence(sequence));
	}

	@Test
	public void test13() {
		int[] sequence = { 1, 2, 3, 4, 99, 5, 6 };
		assertTrue(sequencer.almostIncreasingSequence(sequence));
	}
}
