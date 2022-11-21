package lab7.convertor;

import java.util.function.Function;

public final class ToStringConvertor<T> {

	public String convert(Function<T, String> rule, T arg) {
		return rule.apply(arg);
	}
}
