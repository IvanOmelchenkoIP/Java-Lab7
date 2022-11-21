package lab7;

import java.util.ArrayList;
import java.util.function.Function;

public class ToStringConvertorRules {

	public static final Function<ArrayList<Integer>, String> INT_ARR_LIST_TO_STRING = (list) -> {
		return list.toString();
	};

	public static final Function<ArrayList<Integer>, String> INT_ARR_LIST_TO_BINARY_STRING = (list) -> {
		ArrayList<String> binaries = new ArrayList<String>();
		for (int number : list) {
			binaries.add(Integer.toBinaryString(number));
		}
		return binaries.toString();
	};
}
