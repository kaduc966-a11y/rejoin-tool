/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.d;

import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.d.c;
import b.t.c.b.b.h.d.h;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.q.kb;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class m
implements bc {
    private final c thisclasssuper;
    private final String[] \u00d8\u00d8o000;
    private final String \u00f4\u00d8o000;

    public m(c object, String ... objectArray) {
        this.thisclasssuper = object;
        this.\u00d8\u00d8o000 = objectArray;
        object = h.\u00d800000.\u00d200000();
        Object[] objectArray2 = new Object[1];
        objectArray = objectArray2;
        String string = this.thisclasssuper.o00000();
        String[] stringArray = Arrays.copyOf(this.\u00d8\u00d8o000, this.\u00d8\u00d8o000.length);
        objectArray2[0] = String.format(string, Arrays.copyOf(stringArray, stringArray.length));
        this.\u00f4\u00d8o000 = String.format((String)object, Arrays.copyOf(objectArray, objectArray.length));
    }

    public final c privateint() {
        return this.thisclasssuper;
    }

    public final String \u00f5\u00d20000(int n2) {
        return this.\u00d8\u00d8o000[n2];
    }

    @Override
    public final List \u00f5OO000() {
        return mc.\u00d500000();
    }

    @Override
    public final Collection \u00d5OO000() {
        return mc.\u00d500000();
    }

    @Override
    public final boolean \u00d8OO000() {
        return false;
    }

    @Override
    public final kb \u00f4OO000() {
        return k.\u00d400000.new();
    }

    @Override
    public final b.t.c.b.b.b.c forint() {
        return b.t.c.b.b.b.m.\u00d2O0000.o00000();
    }

    public final String toString() {
        return this.\u00f4\u00d8o000;
    }

    @Override
    public final bc o00000(b b2) {
        return this;
    }
}

