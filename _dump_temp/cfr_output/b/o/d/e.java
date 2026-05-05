/*
 * Decompiled with CFR 0.152.
 */
package b.o.d;

import b.o.d.yb;
import b.t.k;
import java.io.Serializable;

public class e
extends yb
implements Serializable {
    private final Class whilenullsuper;

    public e(Class clazz) {
        super(1);
        this.whilenullsuper = clazz;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return this.whilenullsuper.equals(((e)object).whilenullsuper);
    }

    @Override
    public int hashCode() {
        return this.whilenullsuper.hashCode();
    }

    @Override
    public String toString() {
        return "fun interface " + this.whilenullsuper.getName();
    }

    @Override
    protected k \u00f8\u00d8O000() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}

