package lab7.convertor;

import java.util.function.Function;

public class ToStringConvertor<T> {

	public String convert(Function<T, String> rule, T arg) {
		return rule.apply(arg);
	}
}
