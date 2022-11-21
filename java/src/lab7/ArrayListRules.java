package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class ArrayListRules {

	public static final Function<Integer, ArrayList<Integer>> PRIMES_ERATOSTHENES_SIEVE = (n) -> {
		if (n < 2) {
			return new ArrayList<Integer>();
		}

		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		for (int i = 2; i * i <= n; i++) {
			if (primes[i]) {
				for (int j = i * i; j <= n; j += i) {
					primes[j] = false;
				}
			}
		}
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int i = 2; i <= n; i++) {
			if (primes[i]) {
				numberList.add(i);
			}
		}
		return numberList;
	};
}
