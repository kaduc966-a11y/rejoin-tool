/*
 * Decompiled with CFR 0.152.
 */
package b.r.d.b;

import b.o.d.g;
import b.o.d.z;
import b.r.b;
import b.r.d.b.c;
import b.r.d.b.s;

public abstract class p
extends s
implements c,
g {
    private final int thisObjectObject;

    public p(int n2, b b2) {
        super(b2);
        this.thisObjectObject = n2;
    }

    @Override
    public int \u00f5\u00d8O000() {
        return this.thisObjectObject;
    }

    public p(int n2) {
        this(n2, null);
    }

    @Override
    public String toString() {
        if (this.\u00d8\u00d80000() == null) {
            return z.o00000(this);
        }
        return super.toString();
    }
}

