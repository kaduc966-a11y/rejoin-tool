/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.o.e.g;
import b.t.c.b.b.i.n;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class o
extends n {
    private final Runnable String;
    private final g \u00d300000;

    public o(Lock lock, Runnable runnable, g g2) {
        super(lock);
        this.String = runnable;
        this.\u00d300000 = g2;
    }

    public o(Runnable runnable, g g2) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this((Lock)reentrantLock, runnable, g2);
    }

    @Override
    public final void \u00d200000() {
        try {
            while (!this.Object().tryLock(50L, TimeUnit.MILLISECONDS)) {
                this.String.run();
            }
        }
        catch (InterruptedException interruptedException) {
            this.\u00d300000.\u00f800000(interruptedException);
        }
    }
}

