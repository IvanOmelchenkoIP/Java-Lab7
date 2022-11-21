package lab7;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;

import lab7.generator.*;
import lab7.convertor.*;
import lab7.finder.*;

public class Main {

	public static void main(String[] args) {
		int MAX_RANDOM = 100;
		Function<Integer, Integer> getRandom = (n) -> (new Random()).nextInt(n);

		ArrayListGenerator<Integer> generator = new ArrayListGenerator<Integer>();
		ToStringConvertor<ArrayList<Integer>> convertor = new ToStringConvertor<ArrayList<Integer>>();
		ArrayListFinder<Integer> finder = new ArrayListFinder<Integer>();

		ArrayList<Integer> primes = generator.generate(ArrayListGeneratorRules.PRIMES_ERATOSTHENES_SIEVE,
				getRandom.apply(MAX_RANDOM));
		System.out.println("Generated array of primes: "
				+ convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_STRING, primes));
		System.out.println("Binaries from primes: "
				+ convertor.convert(ToStringConvertorRules.INT_ARR_LIST_TO_BINARY_STRING, primes));
		System.out.println(
				"A number with most binary zeroes: " + finder.find(ArrayListFinderRules.MOST_BINARY_NUMBERS, primes));
	}
}
