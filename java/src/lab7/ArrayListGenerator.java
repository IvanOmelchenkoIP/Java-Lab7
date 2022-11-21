package lab7;

import java.util.ArrayList;
import java.util.function.Function;

public class ArrayListGenerator<T> {

	public ArrayList<T> generate(Function<T, ArrayList<T>> rule, T arg) {
		return rule.apply(arg);
	}
}