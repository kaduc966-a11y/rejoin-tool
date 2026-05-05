/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.c;

import b.dc;
import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.o.c.q;
import b.t.c.b.b.o.c.r$_b$0;
import b.t.c.b.b.o.c.r$_b$1;
import b.t.c.b.b.o.c.r$_c;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.kb;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class r
implements b.t.c.b.b.h.bc {
    public static final r$_c O\u00f6o000 = new r$_c(null);
    private final long \u00f8\u00f5o000;
    private final bc \u00f5\u00f5o000;
    private final Set \u00d8\u00f5o000;
    private final ib ifreturnsuper = oc.o00000(zb.ifreturnclass.Object(), this, false);
    private final dc \u00f4\u00f5o000;

    public final Set thisfloat() {
        return this.\u00d8\u00f5o000;
    }

    private r(long l2, bc bc2, Set set) {
        r r2 = this;
        this.\u00f4\u00f5o000 = b.r.o00000(new r$_b$0(r2));
        this.\u00f8\u00f5o000 = l2;
        this.\u00f5\u00f5o000 = bc2;
        this.\u00d8\u00f5o000 = set;
    }

    private final boolean \u00d4\u00d2O000() {
        Object object = q.o00000(this.\u00f5\u00f5o000);
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                rc rc2 = (rc)object.next();
                if (!this.\u00d8\u00f5o000.contains(rc2)) continue;
                return false;
            }
        }
        return true;
    }

    private final List \u00d8\u00d2O000() {
        return (List)this.\u00f4\u00f5o000.\u00d200000();
    }

    @Override
    public final List \u00f5OO000() {
        return mc.\u00d500000();
    }

    @Override
    public final Collection \u00d5OO000() {
        return this.\u00d8\u00d2O000();
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
        return this.\u00f5\u00f5o000.returnforsuper();
    }

    @Override
    public final b.t.c.b.b.h.bc o00000(b b2) {
        return this;
    }

    public final String toString() {
        return "IntegerLiteralType" + this.\u00d5\u00d2O000();
    }

    private final String \u00d5\u00d2O000() {
        return "[" + mc.o00000(this.\u00d8\u00f5o000, ",", null, null, 0, null, r$_b$1.\u00d3O\u00d5000, 30, null) + ']';
    }

    private static final List new(r r2) {
        Object[] objectArray = new ib[1];
        Object object = objectArray;
        objectArray[0] = b.t.c.b.b.h.r.super(r2.forint().for().nullint(), mc.o00000(new lc(b.t.c.b.b.h.w.o00000, r2.ifreturnsuper)), null, 2, null);
        object = mc.\u00d400000(object);
        if (!r2.\u00d4\u00d2O000()) {
            ((Collection)object).add(r2.forint().\u00d8o0000());
        }
        return object;
    }

    private static final CharSequence \u00d800000(rc rc2) {
        return rc2.toString();
    }

    public /* synthetic */ r(long l2, bc bc2, Set set, w w2) {
        this(l2, bc2, set);
    }

    public static final /* synthetic */ long \u00d400000(r r2) {
        return r2.\u00f8\u00f5o000;
    }

    public static final /* synthetic */ bc o00000(r r2) {
        return r2.\u00f5\u00f5o000;
    }

    static /* synthetic */ List \u00d300000(r r2) {
        return r.new(r2);
    }

    static /* synthetic */ CharSequence return(rc rc2) {
        return r.\u00d800000(rc2);
    }
}

