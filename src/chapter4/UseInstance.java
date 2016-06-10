package chapter4;

/**
 * Created by hadeslee on 2016-06-11.
 */
@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
    void accept(T instance) throws X;
}
