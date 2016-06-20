package chapter5;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class TestHelper {
    public static <X extends Throwable> Throwable assertThrows(
            final Class<X> exceptionClass, final Runnable block) {

        try {
            block.run();
        } catch (Throwable ex) {
            if (exceptionClass.isInstance(ex))
                return ex;
        }
    }
}
