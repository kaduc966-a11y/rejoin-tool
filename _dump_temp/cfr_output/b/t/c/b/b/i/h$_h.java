/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.o.e.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class h$_h {
    private final Object o00000;
    private final h new;

    public h$_h(Object object, h h2) {
        this.o00000 = object;
        this.new = h2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        object = (h$_h)object;
        return this.o00000.equals(((h$_h)object).o00000);
    }

    public int hashCode() {
        return this.o00000.hashCode();
    }

    static /* synthetic */ h o00000(h$_h h$_h) {
        return h$_h.new;
    }
}

