package chapter6;

import java.util.function.Supplier;

/**
 * Created by user on 2016-06-21.
 */
public class Holder {
    private Supplier<Heavy> heavy = () -> createAndCacheHeavy();
    public Holder() {
        System.out.println("Holder created");
    }
    public Heavy getHeavy() {
        return heavy.get();
    }
//...
}
