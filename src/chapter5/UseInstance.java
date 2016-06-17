package chapter5;

/**
 * Created by hadeslee on 2016-06-17.
 */
@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
    void accept(T instance) throws X;
}
