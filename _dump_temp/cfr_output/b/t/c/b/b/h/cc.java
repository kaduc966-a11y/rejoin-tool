/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.d.k;
import b.t.c.b.b.o.n;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class cc
implements bc {
    private int O\u00f4o000;

    @Override
    public abstract kb \u00f4OO000();

    public int hashCode() {
        int n2;
        int n3 = this.O\u00f4o000;
        if (n3 != 0) {
            return n3;
        }
        kb kb2 = this.\u00f4OO000();
        int n4 = this.new(kb2) ? n.\u00d8O0000(kb2).hashCode() : System.identityHashCode(this);
        this.O\u00f4o000 = n2 = n4;
        return n4;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bc)) {
            return false;
        }
        if (object.hashCode() != this.hashCode()) {
            return false;
        }
        if (((bc)object).\u00f5OO000().size() != this.\u00f5OO000().size()) {
            return false;
        }
        kb kb2 = this.\u00f4OO000();
        kb kb3 = ((bc)object).\u00f4OO000();
        if (kb3 == null) {
            return false;
        }
        object = kb3;
        if (!this.new(kb2) || !this.new((kb)object)) {
            return false;
        }
        return this.o00000((kb)object);
    }

    protected abstract boolean o00000(kb var1);

    protected final boolean o00000(kb wb2, kb wb3) {
        if (!fc.o00000((Object)wb2.\u00d5\u00f80000(), (Object)wb3.\u00d5\u00f80000())) {
            return false;
        }
        wb2 = wb2.\u00d8\u00f80000();
        for (wb3 = wb3.\u00d8\u00f80000(); wb2 != null && wb3 != null; wb2 = wb2.\u00d8\u00f80000(), wb3 = wb3.\u00d8\u00f80000()) {
            if (wb2 instanceof b.t.c.b.b.q.bc) {
                return wb3 instanceof b.t.c.b.b.q.bc;
            }
            if (wb3 instanceof b.t.c.b.b.q.bc) {
                return false;
            }
            if (wb2 instanceof lc) {
                return wb3 instanceof lc && fc.o00000((Object)((lc)wb2).OOO000(), (Object)((lc)wb3).OOO000());
            }
            if (wb3 instanceof lc) {
                return false;
            }
            if (fc.o00000((Object)wb2.\u00d5\u00f80000(), (Object)wb3.\u00d5\u00f80000())) continue;
            return false;
        }
        return true;
    }

    private final boolean new(kb kb2) {
        return !k.o00000(kb2) && !n.\u00d300000(kb2);
    }
}

