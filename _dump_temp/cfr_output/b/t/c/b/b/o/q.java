/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.o.d.fc;
import b.o.e.f;
import b.s.mc;
import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.h.e.b$_b;
import b.t.c.b.b.o.i;
import b.t.c.b.b.o.i$_b$_b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.o.q$_b$0;
import b.t.c.b.b.o.q$_b$1;
import b.t.c.b.b.o.q$_b$2;
import b.t.c.b.b.o.q$_b$3;
import b.t.c.b.b.q.dc;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.wb;

public final class q {
    public static final q o00000 = new q();

    private q() {
    }

    public final boolean o00000(wb wb2, wb wb3, boolean bl, boolean bl2) {
        if (wb2 instanceof ib && wb3 instanceof ib) {
            return this.o00000((ib)wb2, (ib)wb3);
        }
        if (wb2 instanceof b.t.c.b.b.q.i && wb3 instanceof b.t.c.b.b.q.i) {
            return q.o00000(this, (b.t.c.b.b.q.i)wb2, (b.t.c.b.b.q.i)wb3, bl, null, 8, null);
        }
        if (wb2 instanceof b.t.c.b.b.q.b && wb3 instanceof b.t.c.b.b.q.b) {
            return q.o00000(this, (b.t.c.b.b.q.b)wb2, (b.t.c.b.b.q.b)wb3, bl, bl2, false, b$_b.\u00d200000, 16, null);
        }
        if (wb2 instanceof lc && wb3 instanceof lc) {
            return fc.o00000((Object)((lc)wb2).OOO000(), (Object)((lc)wb3).OOO000());
        }
        return fc.o00000((Object)wb2, (Object)wb3);
    }

    public static /* synthetic */ boolean o00000(q q2, wb wb2, wb wb3, boolean bl, boolean bl2, int n2, Object object) {
        if ((n2 & 8) != 0) {
            bl2 = true;
        }
        return q2.o00000(wb2, wb3, bl, bl2);
    }

    private final boolean o00000(ib ib2, ib ib3) {
        return fc.o00000((Object)ib2.\u00d3OO000(), (Object)ib3.\u00d3OO000());
    }

    public final boolean o00000(b.t.c.b.b.q.i i2, b.t.c.b.b.q.i i3, boolean bl, f f2) {
        if (fc.o00000((Object)i2, (Object)i3)) {
            return true;
        }
        if (fc.o00000((Object)i2.\u00d8\u00f80000(), (Object)i3.\u00d8\u00f80000())) {
            return false;
        }
        if (!this.o00000((wb)i2, (wb)i3, f2, bl)) {
            return false;
        }
        return i2.privateObjectsuper() == i3.privateObjectsuper();
    }

    public static /* synthetic */ boolean o00000(q q2, b.t.c.b.b.q.i i2, b.t.c.b.b.q.i i3, boolean bl, f f2, int n2, Object object) {
        if ((n2 & 8) != 0) {
            f2 = q$_b$0.\u00d8\u00d8\u00d3000;
        }
        return q2.o00000(i2, i3, bl, f2);
    }

    private final g o00000(b.t.c.b.b.q.b b2) {
        do {
            if (b2 instanceof hc && ((hc)b2).O\u00f5o000() == hc$_b.o00000) continue;
            return b2.\u00f4\u00f80000();
        } while ((b2 = (hc)mc.\u00d3o0000(((hc)b2).\u00d5\u00f4o000())) != null);
        return null;
    }

    public final boolean o00000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, boolean bl, boolean bl2, boolean bl3, b b4) {
        if (fc.o00000((Object)b2, (Object)b3)) {
            return true;
        }
        if (!fc.o00000((Object)b2.\u00d5\u00f80000(), (Object)b3.\u00d5\u00f80000())) {
            return false;
        }
        if (bl2 && b2 instanceof dc && b3 instanceof dc && ((dc)((Object)b2)).\u00d80O000() != ((dc)((Object)b3)).\u00d80O000()) {
            return false;
        }
        if (fc.o00000((Object)b2.\u00d8\u00f80000(), (Object)b3.\u00d8\u00f80000())) {
            if (!bl) {
                return false;
            }
            if (!fc.o00000((Object)this.o00000(b2), (Object)this.o00000(b3))) {
                return false;
            }
        }
        if (n.\u00d300000(b2) || n.\u00d300000(b3)) {
            return false;
        }
        if (!this.o00000((wb)b2, (wb)b3, q$_b$1.returnStringnew, bl)) {
            return false;
        }
        Object object = b3;
        boolean bl4 = bl;
        b.t.c.b.b.q.b b5 = b2;
        return ((i)(object = i.o00000(b4, new q$_b$2(bl4, b5, (b.t.c.b.b.q.b)object)))).o00000(b2, b3, null, !bl3).\u00d200000() == i$_b$_b.\u00d400000 && ((i)object).o00000(b3, b2, null, !bl3).\u00d200000() == i$_b$_b.\u00d400000;
    }

    public static /* synthetic */ boolean o00000(q q2, b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, boolean bl, boolean bl2, boolean bl3, b b4, int n2, Object object) {
        if ((n2 & 8) != 0) {
            bl2 = true;
        }
        if ((n2 & 0x10) != 0) {
            bl3 = false;
        }
        return q2.o00000(b2, b3, bl, bl2, bl3, b4);
    }

    private final boolean o00000(wb wb2, wb wb3, f f2, boolean bl) {
        wb2 = wb2.\u00d8\u00f80000();
        wb3 = wb3.\u00d8\u00f80000();
        if (wb2 instanceof hc || wb3 instanceof hc) {
            return (Boolean)f2.o00000(wb2, wb3);
        }
        return q.o00000(this, wb2, wb3, bl, false, 8, null);
    }

    public final boolean o00000(b.t.c.b.b.q.i i2, b.t.c.b.b.q.i i3, boolean bl) {
        return q.o00000(this, i2, i3, bl, null, 8, null);
    }

    private static final boolean o00000(wb wb2, wb wb3) {
        return false;
    }

    private static final boolean \u00d200000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, wb wb2, wb wb3) {
        return fc.o00000((Object)wb2, (Object)b2) && fc.o00000((Object)wb3, (Object)b3);
    }

    private static final boolean Object(wb wb2, wb wb3) {
        return false;
    }

    private static final boolean o00000(boolean bl, b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, bc object, bc object2) {
        if (fc.o00000(object, object2)) {
            return true;
        }
        object = object.\u00f4OO000();
        object2 = object2.\u00f4OO000();
        if (!(object instanceof b.t.c.b.b.q.i) || !(object2 instanceof b.t.c.b.b.q.i)) {
            return false;
        }
        b.t.c.b.b.q.b b4 = b3;
        return o00000.o00000((b.t.c.b.b.q.i)object, (b.t.c.b.b.q.i)object2, bl, new q$_b$3(b2, b4));
    }

    static /* synthetic */ boolean \u00d400000(wb wb2, wb wb3) {
        return q.o00000(wb2, wb3);
    }

    static /* synthetic */ boolean \u00d200000(wb wb2, wb wb3) {
        return q.Object(wb2, wb3);
    }

    static /* synthetic */ boolean \u00d200000(boolean bl, b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, bc bc2, bc bc3) {
        return q.o00000(bl, b2, b3, bc2, bc3);
    }

    static /* synthetic */ boolean o00000(b.t.c.b.b.q.b b2, b.t.c.b.b.q.b b3, wb wb2, wb wb3) {
        return q.\u00d200000(b2, b3, wb2, wb3);
    }
}

