package lab7.finder;

import java.util.ArrayList;
import java.util.function.Function;

public class ArrayListFinder<T> {

	public T find(Function<ArrayList<T>, T> rule, ArrayList<T> list) {
		return rule.apply(list);
	}
}
