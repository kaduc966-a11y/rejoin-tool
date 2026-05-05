/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

final class s$_b {
    private final Object o00000;
    private final int \u00d200000;

    s$_b(Object object, int n2) {
        this.o00000 = object;
        this.\u00d200000 = n2;
    }

    public final int hashCode() {
        return System.identityHashCode(this.o00000) * 65535 + this.\u00d200000;
    }

    public final boolean equals(Object object) {
        if (!(object instanceof s$_b)) {
            return false;
        }
        object = (s$_b)object;
        return this.o00000 == ((s$_b)object).o00000 && this.\u00d200000 == ((s$_b)object).\u00d200000;
    }
}

