package chapter6;

import java.util.function.Supplier;

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

    public static void simulateTimeConsumingOp(final int millseconds) {
        try {
            Thread.sleep(2000);
        } catch(Exception ex) { throw new RuntimeException(ex); }
    }

    public static void eagerEvaluator(
            final boolean input1, final boolean input2) {
        System.out.println("eagerEvaluator called...");
        System.out.println("accept?: " + (input1 && input2));
    }

    public static void lazyEvaluator(
            final Supplier<Boolean> input1, final Supplier<Boolean> input2) {
        System.out.println("lazyEvaluator called...");
        System.out.println("accept?: " + (input1.get() && input2.get()));
    }

    public static void main(final String[] args) {

        System.out.println("//" + "START:EAGER_OUTPUT");
        eagerEvaluator(evaluate(1), evaluate(2));
        System.out.println("//" + "END:EAGER_OUTPUT");

        System.out.println("//" + "START:LAZY_OUTPUT");
        lazyEvaluator(() -> evaluate(1), () -> evaluate(2));
        System.out.println("//" + "END:LAZY_OUTPUT");
    }
}
