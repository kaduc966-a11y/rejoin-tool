/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.pc;
import b.r.b;
import b.r.i;
import b.r.l;
import b.xd;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class e
implements b {
    private xd \u00f4\u00f40000;

    @Override
    public final l O\u00d80000() {
        return i.o00000;
    }

    public final xd o\u00d80000() {
        return this.\u00f4\u00f40000;
    }

    public final void o00000(xd xd2) {
        this.\u00f4\u00f40000 = xd2;
    }

    @Override
    public final void return(Object object) {
        e e2 = this;
        synchronized (e2) {
            this.\u00f4\u00f40000 = xd.\u00d300000(object);
            ((Object)this).notifyAll();
            return;
        }
    }

    public final void nullclass() {
        e e2 = this;
        synchronized (e2) {
            xd xd2;
            while ((xd2 = this.\u00f4\u00f40000) == null) {
                ((Object)this).wait();
            }
            pc.o00000(xd2.o00000());
            return;
        }
    }
}

