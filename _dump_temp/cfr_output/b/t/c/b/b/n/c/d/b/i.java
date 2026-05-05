/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.b;

import b.o.d.fc;
import b.o.d.w;
import b.s.ub;
import b.t.c.b.b.h.ib;
import b.t.c.b.b.h.m;
import b.t.c.b.b.h.t;
import b.t.c.b.b.n.c.d.b.e;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
extends m {
    private final t \u00d400000;
    private final e \u00d800000;
    private final boolean \u00f400000;
    private final boolean return;
    private final Set \u00d500000;
    private final ib \u00f500000;

    public i(t t2, e e2, boolean bl, boolean bl2, Set set, ib ib2) {
        super(t2, set, ib2);
        this.\u00d400000 = t2;
        this.\u00d800000 = e2;
        this.\u00f400000 = bl;
        this.return = bl2;
        this.\u00d500000 = set;
        this.\u00f500000 = ib2;
    }

    public /* synthetic */ i(t t2, e e2, boolean bl, boolean bl2, Set set, ib ib2, int n2, w w2) {
        if ((n2 & 2) != 0) {
            e2 = e.o00000;
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        if ((n2 & 8) != 0) {
            bl2 = false;
        }
        if ((n2 & 0x10) != 0) {
            set = null;
        }
        if ((n2 & 0x20) != 0) {
            ib2 = null;
        }
        this(t2, e2, bl, bl2, set, ib2);
    }

    @Override
    public final t Object() {
        return this.\u00d400000;
    }

    public final e \u00d400000() {
        return this.\u00d800000;
    }

    public final boolean \u00d500000() {
        return this.\u00f400000;
    }

    public final boolean \u00d600000() {
        return this.return;
    }

    @Override
    public final Set \u00d200000() {
        return this.\u00d500000;
    }

    @Override
    public final ib o00000() {
        return this.\u00f500000;
    }

    public final i o00000(e e2) {
        return i.o00000(this, null, e2, false, false, null, null, 61, null);
    }

    public final i o00000(boolean bl) {
        return i.o00000(this, null, null, bl, false, null, null, 59, null);
    }

    public final i o00000(ib ib2) {
        return i.o00000(this, null, null, false, false, null, ib2, 31, null);
    }

    public final i \u00d200000(b.t.c.b.b.q.i i2) {
        return i.o00000(this, null, null, false, false, ((m)this).\u00d200000() != null ? ub.\u00d200000(((m)this).\u00d200000(), (Object)i2) : ub.super((Object)i2), null, 47, null);
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof i)) {
            return false;
        }
        return fc.o00000((Object)((m)((i)object)).o00000(), (Object)((m)this).o00000()) && ((m)((i)object)).Object() == ((m)this).Object() && ((i)object).\u00d800000 == this.\u00d800000 && ((i)object).\u00f400000 == this.\u00f400000 && ((i)object).return == this.return;
    }

    @Override
    public final int hashCode() {
        ib ib2 = ((m)this).o00000();
        int n2 = ib2 != null ? ((Object)ib2).hashCode() : 0;
        n2 = n2 + (31 * n2 + ((m)this).Object().hashCode());
        n2 += 31 * n2 + this.\u00d800000.hashCode();
        n2 += 31 * n2 + (this.\u00f400000 ? 1 : 0);
        return n2 + (31 * n2 + (this.return ? 1 : 0));
    }

    public final i o00000(t t2, e e2, boolean bl, boolean bl2, Set set, ib ib2) {
        return new i(t2, e2, bl, bl2, set, ib2);
    }

    public static /* synthetic */ i o00000(i i2, t t2, e e2, boolean bl, boolean bl2, Set set, ib ib2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            t2 = i2.\u00d400000;
        }
        if ((n2 & 2) != 0) {
            e2 = i2.\u00d800000;
        }
        if ((n2 & 4) != 0) {
            bl = i2.\u00f400000;
        }
        if ((n2 & 8) != 0) {
            bl2 = i2.return;
        }
        if ((n2 & 0x10) != 0) {
            set = i2.\u00d500000;
        }
        if ((n2 & 0x20) != 0) {
            ib2 = i2.\u00f500000;
        }
        return i2.o00000(t2, e2, bl, bl2, set, ib2);
    }

    public final String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + (Object)((Object)this.\u00d400000) + ", flexibility=" + (Object)((Object)this.\u00d800000) + ", isRaw=" + this.\u00f400000 + ", isForAnnotationParameter=" + this.return + ", visitedTypeParameters=" + this.\u00d500000 + ", defaultType=" + this.\u00f500000 + ')';
    }
}

