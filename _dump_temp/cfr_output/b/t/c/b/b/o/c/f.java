/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.t.c.b.b.d.d;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.pc;
import b.yc;

public final class f
extends j {
    private final d \u00d300000;
    private final b.t.c.b.b.d.f \u00d200000;

    public f(d d2, b.t.c.b.b.d.f f2) {
        super(yc.o00000(d2, f2));
        this.\u00d300000 = d2;
        this.\u00d200000 = f2;
    }

    public final b.t.c.b.b.d.f \u00d200000() {
        return this.\u00d200000;
    }

    @Override
    public final rc o00000(bc stringArray) {
        i i2 = pc.\u00d300000((bc)stringArray, this.\u00d300000);
        if (i2 != null) {
            stringArray = i2;
            if ((i2 = n.\u00f400000(i2) ? stringArray : null) != null && (i2 = i2.nullint()) != null) {
                return (rc)i2;
            }
        }
        String[] stringArray2 = new String[2];
        stringArray = stringArray2;
        stringArray2[0] = this.\u00d300000.toString();
        stringArray[1] = this.\u00d200000.toString();
        return k.new(c.\u00f6\u00d50000, stringArray);
    }

    @Override
    public final String toString() {
        return "" + this.\u00d300000.o00000() + '.' + this.\u00d200000;
    }
}

