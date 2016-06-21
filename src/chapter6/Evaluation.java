package chapter6;

/**
 * Created by user on 2016-06-22.
 */
public class Evaluation {
    public static boolean evaluate(final int value) {
        System.out.println("evaluating ..." + value);
        simulateTimeConsumingOp(2000);
        return value > 100;
    }
//...
}
