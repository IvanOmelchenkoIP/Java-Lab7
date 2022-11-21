package lab7.generator;

import java.util.ArrayList;
import java.util.function.Function;

public final class ArrayListGenerator<T> {

	public ArrayList<T> generate(Function<T, ArrayList<T>> rule, T arg) {
		return rule.apply(arg);
	}
}
