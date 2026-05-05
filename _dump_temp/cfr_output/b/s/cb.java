/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.f;
import java.util.AbstractList;
import java.util.List;

public abstract class cb
extends AbstractList
implements List,
f {
    public abstract Object set(int var1, Object var2);

    public abstract Object O\u00d80000(int var1);

    public abstract void add(int var1, Object var2);

    public final Object remove(int n2) {
        return this.O\u00d80000(n2);
    }

    public abstract int \u00d3o\u00d3000();

    @Override
    public final int size() {
        return this.\u00d3o\u00d3000();
    }
}

