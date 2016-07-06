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

    private synchronized Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<Heavy> {
            private final Heavy heavyInstance = new Heavy();

            public Heavy get() { return heavyInstance; }
        }

        if(!HeavyFactory.class.isInstance(heavy)) {
            heavy = new HeavyFactory();
        }

        return heavy.get();
    }

    public static void main(final String[] args) {
        final Holder holder = new Holder();
        System.out.println("deferring heavy creation...");
        System.out.println(holder.getHeavy());
        System.out.println(holder.getHeavy());
    }
}