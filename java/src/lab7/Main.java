package lab7;

import java.util.Random;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		int MAX_RANDOM = 100;
		Function<Integer, Integer> getRandom = (n) -> (new Random()).nextInt(n);

	}

}
