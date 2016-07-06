package chapter7;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by user on 2016-07-07.
 */
public class Memoizer {
    public static <T, R> R callMemoized(
            final BiFunction<Function<T,R>, T, R> function, final T input) {
        Function<T, R> memoized = new Function<T, R>() {
            private final Map<T, R> store = new HashMap<>();
            public R apply(final T input) {
                return store.computeIfAbsent(input, key -> function.apply(this, key));
            }
        };
        return memoized.apply(input);
    }
}
