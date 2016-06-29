package chapter7;

/**
 * Created by hadeslee on 2016-06-30.
 */
public class Factorial {
    public static int factorialRec(final int number) {
        if (number == 1)
            return number;
        else
            return number * factorialRec(number - 1);
    }
}
