/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.b;
import b.s.d.i;
import b.s.d.i$_e;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i$_f
extends i$_e
implements Iterator,
b {
    public i$_f(i i2) {
        super(i2);
    }

    public final Object next() {
        this.\u00f4\u00f6\u00d2000();
        if (this.\u00d8\u00f6\u00d2000() >= i.return(this.\u00f8\u00f6\u00d2000())) {
            throw new NoSuchElementException();
        }
        i$_f i$_f = this;
        int n2 = i$_f.\u00d8\u00f6\u00d2000();
        this.whileString(n2 + 1);
        i$_f.\u00d3\u00d60000(n2);
        Object object = i.\u00d500000(this.\u00f8\u00f6\u00d2000())[this.\u00f5\u00f6\u00d2000()];
        this.privatepublicsuper();
        return object;
    }
}

