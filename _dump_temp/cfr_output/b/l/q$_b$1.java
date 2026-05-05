/*
 * Decompiled with CFR 0.152.
 */
package b.l;

import b.l.q;
import b.o.d.c.g;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class q$_b$1
implements Iterator,
g {
    private String \u00d80\u00f5000;
    private boolean thispublicString;
    final /* synthetic */ q \u00d50\u00f5000;

    q$_b$1(q q2) {
        this.\u00d50\u00f5000 = q2;
    }

    @Override
    public final boolean hasNext() {
        if (this.\u00d80\u00f5000 == null && !this.thispublicString) {
            this.\u00d80\u00f5000 = q.o00000(this.\u00d50\u00f5000).readLine();
            if (this.\u00d80\u00f5000 == null) {
                this.thispublicString = true;
            }
        }
        return this.\u00d80\u00f5000 != null;
    }

    public final String \u00d3\u00f6\u00d2000() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        String string = this.\u00d80\u00f5000;
        this.\u00d80\u00f5000 = null;
        return string;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

