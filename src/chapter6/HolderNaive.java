package chapter6;

/**
 * Created by hadeslee on 2016-06-20.
 */
public class HolderNaive {
    private Heavy heavy;

    public HolderNaive() {
        System.out.println("Holder created");

    }

    public Heavy getHeavy() {
        if (heavy == null) {
            heavy = new Heavy();
        }
        return heavy;
    }

    public static void main(String[] args) {
        final HolderNaive holder = new HolderNaive();
        System.out.println("deferring heavy creation...");
        System.out.println(holder.getHeavy());
        System.out.println(holder.getHeavy());
    }

}
