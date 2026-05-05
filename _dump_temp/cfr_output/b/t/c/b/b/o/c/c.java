/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.o.c.b;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.e.i;
import b.t.c.b.b.q.pc;

public final class c
extends b {
    public c(short s2) {
        super(s2);
    }

    @Override
    public final rc o00000(bc stringArray) {
        i i2 = pc.\u00d300000((bc)stringArray, d$_b.\u00f5\u00d50000);
        if (i2 != null && (i2 = i2.nullint()) != null) {
            return (rc)i2;
        }
        String[] stringArray2 = new String[1];
        stringArray = stringArray2;
        stringArray2[0] = "UShort";
        return k.new(b.t.c.b.b.h.d.c.\u00d3O0000, stringArray);
    }

    @Override
    public final String toString() {
        return ((Number)this.o00000()).intValue() + ".toUShort()";
    }
}

