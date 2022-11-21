package lab7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import lab7.convertor.ToStringConvertor;
import lab7.convertor.ToStringConvertorRules;

class ToStringConvertorTests {

	@Test
	void TestToStringEmpty() {
		String expected = "[]";

		ArrayList<Integer> list = new ArrayList<Integer>();
		ToStringConvertor<ArrayList<Integer>> convertor = new ToStringConvertor<ArrayList<Integer>>();
		String result = convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_STRING, list);

		assertEquals(expected, result);
	}

	@Test
	void TestToStringSingle() {
		String expected = "[2]";

		Integer[] init = { 2 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(init));
		ToStringConvertor<ArrayList<Integer>> convertor = new ToStringConvertor<ArrayList<Integer>>();
		String result = convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_STRING, list);

		assertEquals(expected, result);
	}

	@Test
	void TestToStringMultiple() {
		String expected = "[2, 3, 5, 7, 11]";

		Integer[] init = { 2, 3, 5, 7, 11 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(init));
		ToStringConvertor<ArrayList<Integer>> convertor = new ToStringConvertor<ArrayList<Integer>>();
		String result = convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_STRING, list);

		assertEquals(expected, result);
	}

	@Test
	void TestToBinaryStringEmpty() {
		String expected = "[]";

		ArrayList<Integer> list = new ArrayList<Integer>();
		ToStringConvertor<ArrayList<Integer>> convertor = new ToStringConvertor<ArrayList<Integer>>();
		String result = convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_BINARY_STRING, list);

		assertEquals(expected, result);
	}

	@Test
	void TestToBinaryStringSingle() {
		String expected = "[10]";

		Integer[] init = { 2 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(init));
		ToStringConvertor<ArrayList<Integer>> convertor = new ToStringConvertor<ArrayList<Integer>>();
		String result = convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_BINARY_STRING, list);

		assertEquals(expected, result);
	}

	@Test
	void TestToBinaryStringMultiple() {
		String expected = "[10, 11, 101, 111, 1011]";

		Integer[] init = { 2, 3, 5, 7, 11 };
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(init));
		ToStringConvertor<ArrayList<Integer>> convertor = new ToStringConvertor<ArrayList<Integer>>();
		String result = convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_BINARY_STRING, list);

		assertEquals(expected, result);
	}
}
