package lab7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import lab7.generator.*;

class ArrayListGeneratorTests {

	@Test
	void TestGenerateSmallerThanMiniman() {
		ArrayList<Integer> expected = new ArrayList<Integer>();

		ArrayListGenerator<Integer> generator = new ArrayListGenerator<Integer>();
		ArrayList<Integer> list = generator.generate(ArrayListGeneratorRules.PRIMES_ERATOSTHENES_SIEVE, -2);

		assertTrue(expected.equals(list));
	}

	@Test
	void TestGenerateSingle() {
		Integer[] init = {2}; 
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(init));
		
		ArrayListGenerator<Integer> generator = new ArrayListGenerator<Integer>();
		ArrayList<Integer> list = generator.generate(ArrayListGeneratorRules.PRIMES_ERATOSTHENES_SIEVE, 2);
		
		assertTrue(expected.equals(list));
	}

	@Test
	void TestGenerateSeveralMaxPrime() {
		Integer[] init = {2, 3, 5, 7}; 
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(init));

		ArrayListGenerator<Integer> generator = new ArrayListGenerator<Integer>();
		ArrayList<Integer> list = generator.generate(ArrayListGeneratorRules.PRIMES_ERATOSTHENES_SIEVE, 7);

		assertTrue(expected.equals(list));
	}
	
	@Test
	void TestGenerateSeveralMaxNonPrime() {
		Integer[] init = {2, 3, 5, 7, 11}; 
		ArrayList<Integer> expected = new ArrayList<Integer>(Arrays.asList(init));

		ArrayListGenerator<Integer> generator = new ArrayListGenerator<Integer>();
		ArrayList<Integer> list = generator.generate(ArrayListGeneratorRules.PRIMES_ERATOSTHENES_SIEVE, 12);

		assertTrue(expected.equals(list));
	}
}
