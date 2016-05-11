package chapter2;

import static chapter2.Folks.friends;

/**
 * Created by hadeslee on 2016-05-11.
 */
public class PrintList {
    public static void main(String[] args) {
        for(String name : friends) {
            System.out.print(name + ", ");
        }
        System.out.println();
    }
}
