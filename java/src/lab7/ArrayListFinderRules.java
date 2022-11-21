package lab7;

import java.util.ArrayList;
import java.util.function.Function;

public class ArrayListFinderRules {

	public static final Function<ArrayList<Integer>, Integer> MOST_BINARY_NUMBERS = (list) -> {
		if (list.size() == 0) {
			return 0;
		}

		int mostZeroes = 0;
		int largest = 0;
		for (int number : list) {
			String binary = Integer.toBinaryString(number);
			int zeroes = binary.replaceAll("1", "").length();
			if (zeroes > mostZeroes) {
				mostZeroes = zeroes;
				largest = number;
			}
		}
		return largest;
	};
}
