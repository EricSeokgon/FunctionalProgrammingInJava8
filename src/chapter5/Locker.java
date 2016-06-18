package chapter5;

import java.util.concurrent.locks.Lock;

/**
 * Created by hadeslee on 2016-06-19.
 */
public class Locker {
    public static void runLocked(Lock lock, Runnable block) {
        lock.lock();
        try {
            block.run();
        } finally {
            lock.unlock();
        }
    }
}
