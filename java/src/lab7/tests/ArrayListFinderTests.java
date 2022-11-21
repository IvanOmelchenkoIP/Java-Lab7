package lab7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import lab7.finder.*;

class ArrayListFinderTests {

	@Test
	void TestFindPrimeEmpty() {
		int expected = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayListFinder<Integer> finder = new ArrayListFinder<Integer>();
		int result = finder.find(ArrayListFinderRules.MOST_BINARY_NUMBERS, list);

		assertEquals(expected, result);
	}

	@Test
	void TestFindPrimeSingle() {
		int expected = 2;

		Integer[] init = { 2 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(init));
		ArrayListFinder<Integer> finder = new ArrayListFinder<Integer>();
		int result = finder.find(ArrayListFinderRules.MOST_BINARY_NUMBERS, list);

		assertEquals(expected, result);
	}
	
	@Test
	void TestFindPrimeMultiple() {
		int expected = 17;

		Integer[] init = { 2, 3, 5, 11, 13, 17, 19 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(init));
		ArrayListFinder<Integer> finder = new ArrayListFinder<Integer>();
		int result = finder.find(ArrayListFinderRules.MOST_BINARY_NUMBERS, list);

		assertEquals(expected, result);
	}
}
