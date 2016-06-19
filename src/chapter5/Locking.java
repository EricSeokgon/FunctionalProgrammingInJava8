package chapter5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static chapter5.Locker.runLocked;

/**
 * Created by hadeslee on 2016-06-14.
 */
public class Locking {
    Lock lock = new ReentrantLock(); //or mock
    protected void setLock(final Lock mock) {
        lock = mock;
    }
    public void doOp1() {
        lock.lock();
        try {
//...critical code...
        } finally {
            lock.unlock();
        }
    }
    public void doOp2() {
        runLocked(lock, () -> {/*...critical code ... */});
    }
    public void doOp3() {
        runLocked(lock, () -> {/*...critical code ... */});
    }
    public void doOp4() {
        runLocked(lock, () -> {/*...critical code ... */});
    }
}
