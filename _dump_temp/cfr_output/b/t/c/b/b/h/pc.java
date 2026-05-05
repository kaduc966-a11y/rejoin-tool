/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.m;
import b.o.d.fc;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.c.l;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.pc$_b$0;
import b.t.c.b.b.h.pc$_b$1;
import b.t.c.b.b.h.pc$_b$2;
import b.t.c.b.b.h.pc$_c$_b$_b$1;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.e.d;
import b.t.c.b.b.o.e.f;
import b.t.c.b.b.q.kb;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class pc
implements bc,
l {
    private rc newreturnsuper;
    private final LinkedHashSet \u00d3\u00f5o000;
    private final int o\u00f5o000;

    public pc(Collection object) {
        boolean bl;
        boolean bl2 = bl = !object.isEmpty();
        if (m.new && !bl) {
            object = "Attempt to create an empty intersection";
            throw new AssertionError(object);
        }
        this.\u00d3\u00f5o000 = new LinkedHashSet(object);
        this.o\u00f5o000 = this.\u00d3\u00f5o000.hashCode();
    }

    private pc(Collection collection, rc rc2) {
        this(collection);
        this.newreturnsuper = rc2;
    }

    @Override
    public final List \u00f5OO000() {
        return mc.\u00d500000();
    }

    @Override
    public final Collection \u00d5OO000() {
        return this.\u00d3\u00f5o000;
    }

    public final f o\u00d2O000() {
        return d.o00000.super("member scope for intersection type", this.\u00d3\u00f5o000);
    }

    @Override
    public final boolean \u00d8OO000() {
        return false;
    }

    @Override
    public final kb \u00f4OO000() {
        return null;
    }

    @Override
    public final c forint() {
        return ((rc)this.\u00d3\u00f5o000.iterator().next()).thisdosuper().forint();
    }

    public final String toString() {
        return pc.o00000(this, null, 1, null);
    }

    public final String o00000(g g2) {
        return mc.o00000(mc.return((Iterable)this.\u00d3\u00f5o000, new pc$_c$_b$_b$1(g2)), " & ", "{", "}", 0, null, new pc$_b$0(g2), 24, null);
    }

    public static /* synthetic */ String o00000(pc pc2, g g2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            g2 = pc$_b$1.\u00d8o\u00d4000;
        }
        return pc2.o00000(g2);
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof pc)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d3\u00f5o000, (Object)((pc)object).\u00d3\u00f5o000);
    }

    public final ib whileif() {
        pc pc2 = this;
        return oc.o00000(zb.ifreturnclass.Object(), this, mc.\u00d500000(), false, this.o\u00d2O000(), new pc$_b$2(pc2));
    }

    public final int hashCode() {
        return this.o\u00f5o000;
    }

    public final pc new(b b2) {
        pc pc2;
        pc pc3;
        Object object;
        pc pc4 = this;
        boolean bl = false;
        Object object2 = object = (Iterable)pc4.\u00d5OO000();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object e2 = object2.next();
            rc rc2 = (rc)e2;
            Iterable iterable = object;
            bl = true;
            iterable.add(rc2.OO0000(b2));
        }
        object2 = (List)object;
        if (!bl) {
            pc3 = null;
        } else {
            rc rc3 = pc4.O\u00d2O000();
            object = rc3 != null ? rc3.OO0000(b2) : null;
            pc3 = pc2 = new pc((Collection)object2).\u00d300000((rc)object);
        }
        if (pc3 == null) {
            pc2 = this;
        }
        return pc2;
    }

    public final pc \u00d300000(rc rc2) {
        return new pc(this.\u00d3\u00f5o000, rc2);
    }

    public final rc O\u00d2O000() {
        return this.newreturnsuper;
    }

    private static final String \u00d500000(rc rc2) {
        return rc2.toString();
    }

    private static final CharSequence new(g g2, rc rc2) {
        return g2.\u00f800000(rc2).toString();
    }

    private static final ib new(pc pc2, b b2) {
        return pc2.new(b2).whileif();
    }

    static /* synthetic */ CharSequence o00000(g g2, rc rc2) {
        return pc.new(g2, rc2);
    }

    static /* synthetic */ String \u00d400000(rc rc2) {
        return pc.\u00d500000(rc2);
    }

    static /* synthetic */ ib o00000(pc pc2, b b2) {
        return pc.new(pc2, b2);
    }
}

