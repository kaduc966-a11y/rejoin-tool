/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q.b;

import b.t.c.b.b.d.k;
import b.t.c.b.b.q.b.kb;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.qc;

public abstract class o
extends kb
implements lc {
    private final k \u00f8o\u00d8000;
    private final String StringinterfaceObject;

    public o(bc bc2, k k2) {
        super(bc2, b.t.c.b.b.q.e.o.\u00d8o\u00f6000.o00000(), k2.\u00d200000(), g.o00000);
        this.\u00f8o\u00d8000 = k2;
        this.StringinterfaceObject = "package " + this.\u00f8o\u00d8000 + " of " + bc2;
    }

    @Override
    public final k OOO000() {
        return this.\u00f8o\u00d8000;
    }

    @Override
    public Object o00000(qc qc2, Object object) {
        return qc2.super(this, object);
    }

    @Override
    public bc Stringint() {
        return (bc)super.\u00d8\u00f80000();
    }

    @Override
    public g \u00f4\u00f80000() {
        return g.o00000;
    }

    @Override
    public String toString() {
        return this.StringinterfaceObject;
    }
}

