/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.b;
import b.s.d.i;
import b.s.d.i$_e;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i$_d
extends i$_e
implements Iterator,
b {
    public i$_d(i i2) {
        super(i2);
    }

    public final Object next() {
        this.\u00f4\u00f6\u00d2000();
        if (this.\u00d8\u00f6\u00d2000() >= i.return(this.\u00f8\u00f6\u00d2000())) {
            throw new NoSuchElementException();
        }
        i$_d i$_d = this;
        int n2 = i$_d.\u00d8\u00f6\u00d2000();
        this.whileString(n2 + 1);
        i$_d.\u00d3\u00d60000(n2);
        Object object = i.o00000(this.\u00f8\u00f6\u00d2000())[this.\u00f5\u00f6\u00d2000()];
        this.privatepublicsuper();
        return object;
    }
}

