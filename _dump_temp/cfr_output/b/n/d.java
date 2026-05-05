/*
 * Decompiled with CFR 0.152.
 */
package b.n;

import b.o.d.tc;
import b.o.e.h;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d {
    private static final Object o00000(Lock lock, h object) {
        lock.lock();
        try {
            object = object.newreturn();
            return object;
        }
        finally {
            tc.Object(1);
            lock.unlock();
            tc.o00000(1);
        }
    }

    private static final Object o00000(ReentrantReadWriteLock serializable, h object) {
        serializable = ((ReentrantReadWriteLock)serializable).readLock();
        ((ReentrantReadWriteLock.ReadLock)serializable).lock();
        try {
            object = object.newreturn();
            return object;
        }
        finally {
            tc.Object(1);
            ((ReentrantReadWriteLock.ReadLock)serializable).unlock();
            tc.o00000(1);
        }
    }

    private static final Object new(ReentrantReadWriteLock object, h h2) {
        ReentrantReadWriteLock.ReadLock readLock = ((ReentrantReadWriteLock)object).readLock();
        int n2 = ((ReentrantReadWriteLock)object).getWriteHoldCount() == 0 ? ((ReentrantReadWriteLock)object).getReadHoldCount() : 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = ((ReentrantReadWriteLock)object).writeLock();
        writeLock.lock();
        try {
            object = h2.newreturn();
            return object;
        }
        finally {
            tc.Object(1);
            for (int i3 = 0; i3 < n2; ++i3) {
                readLock.lock();
            }
            writeLock.unlock();
            tc.o00000(1);
        }
    }
}

