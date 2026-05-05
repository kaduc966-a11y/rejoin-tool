/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.s.z;
import b.t.c.b.b.g.i$_b$1;
import b.t.c.b.b.g.i$_c;
import b.t.c.b.b.g.n;
import java.util.Arrays;
import java.util.Iterator;

public final class i
extends n {
    public static final i$_c whilereturnclass = new i$_c(null);
    private Object[] oo\u00f6000;
    private int Oo\u00f6000;

    private i(Object[] objectArray, int n2) {
        super(null);
        this.oo\u00f6000 = objectArray;
        this.Oo\u00f6000 = n2;
    }

    public i() {
        this(new Object[20], 0);
    }

    @Override
    public final int whileStringnew() {
        return this.Oo\u00f6000;
    }

    private final void \u00f8\u00f40000(int n2) {
        if (this.oo\u00f6000.length > n2) {
            return;
        }
        int n3 = this.oo\u00f6000.length;
        while ((n3 *= 2) <= n2) {
        }
        this.oo\u00f6000 = Arrays.copyOf(this.oo\u00f6000, n3);
    }

    @Override
    public final void \u00d300000(int n2, Object object) {
        this.\u00f8\u00f40000(n2);
        if (this.oo\u00f6000[n2] == null) {
            int n3 = ((n)this).whileStringnew();
            this.Oo\u00f6000 = n3 + 1;
        }
        this.oo\u00f6000[n2] = object;
    }

    @Override
    public final Object \u00f5\u00f40000(int n2) {
        return z.\u00d800000(this.oo\u00f6000, n2);
    }

    @Override
    public final Iterator iterator() {
        return new i$_b$1(this);
    }

    public static final /* synthetic */ Object[] o00000(i i2) {
        return i2.oo\u00f6000;
    }
}

