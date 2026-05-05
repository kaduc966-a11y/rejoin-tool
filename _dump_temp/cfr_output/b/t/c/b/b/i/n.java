/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.o.d.w;
import b.t.c.b.b.i.e;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class n
implements e {
    private final Lock \u00d200000;

    public n(Lock lock) {
        this.\u00d200000 = lock;
    }

    public /* synthetic */ n(Lock lock, int n2, w w2) {
        if ((n2 & 1) != 0) {
            lock = new ReentrantLock();
        }
        this(lock);
    }

    protected final Lock Object() {
        return this.\u00d200000;
    }

    @Override
    public void \u00d200000() {
        this.\u00d200000.lock();
    }

    @Override
    public void o00000() {
        this.\u00d200000.unlock();
    }

    public n() {
        this(null, 1, null);
    }
}

