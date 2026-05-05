/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c;

import b.o.d.fc;

public final class eb {
    private final Object o00000;

    public eb(Object object) {
        this.o00000 = object;
    }

    public final String toString() {
        return "KmConstantValue(value=" + this.o00000 + ')';
    }

    public final int hashCode() {
        if (this.o00000 == null) {
            return 0;
        }
        return this.o00000.hashCode();
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof eb)) {
            return false;
        }
        object = (eb)object;
        return fc.o00000(this.o00000, ((eb)object).o00000);
    }
}

