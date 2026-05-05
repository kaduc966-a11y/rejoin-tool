/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.w;
import b.t.c.b.b.n.b.m$_b;
import b.t.c.b.b.n.b.m$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class m {
    public static final m$_c \u00d5O0000 = new m$_c(null);
    private final boolean Object;
    private final boolean OO0000;
    private final boolean \u00f500000;
    private final boolean \u00d500000;
    private final boolean \u00f4O0000;
    private final m float;
    private final boolean void;
    private final m supersuper;
    private final m o00000;
    private final boolean \u00d6O0000;
    private final boolean public;
    public static final m \u00d600000 = new m(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    public static final m \u00d2O0000 = new m(false, false, false, false, false, null, false, null, null, false, true, 1023, null);
    public static final m \u00d4O0000 = new m(false, false, false, false, false, null, false, null, null, true, false, 1535, null);
    public static final m \u00f400000 = new m(false, true, false, false, false, null, false, null, null, false, false, 2045, null);
    public static final m \u00f6O0000;
    public static final m \u00f600000;
    public static final m Oo0000;
    public static final m classsuper;
    public static final m \u00d200000;
    public static final m \u00d400000;
    public static final m oO0000;
    public static final m \u00f5O0000;

    public m(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, m m2, boolean bl6, m m3, m m4, boolean bl7, boolean bl8) {
        this.Object = bl;
        this.OO0000 = bl2;
        this.\u00f500000 = bl3;
        this.\u00d500000 = bl4;
        this.\u00f4O0000 = bl5;
        this.float = m2;
        this.void = bl6;
        this.supersuper = m3;
        this.o00000 = m4;
        this.\u00d6O0000 = bl7;
        this.public = bl8;
    }

    public /* synthetic */ m(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, m m2, boolean bl6, m m3, m m4, boolean bl7, boolean bl8, int n2, w w2) {
        if ((n2 & 1) != 0) {
            bl = true;
        }
        if ((n2 & 2) != 0) {
            bl2 = true;
        }
        if ((n2 & 4) != 0) {
            bl3 = false;
        }
        if ((n2 & 8) != 0) {
            bl4 = false;
        }
        if ((n2 & 0x10) != 0) {
            bl5 = false;
        }
        if ((n2 & 0x20) != 0) {
            m2 = null;
        }
        if ((n2 & 0x40) != 0) {
            bl6 = true;
        }
        if ((n2 & 0x80) != 0) {
            m3 = m2;
        }
        if ((n2 & 0x100) != 0) {
            m4 = m2;
        }
        if ((n2 & 0x200) != 0) {
            bl7 = false;
        }
        if ((n2 & 0x400) != 0) {
            bl8 = false;
        }
        this(bl, bl2, bl3, bl4, bl5, m2, bl6, m3, m4, bl7, bl8);
    }

    public final boolean \u00d300000() {
        return this.Object;
    }

    public final boolean \u00d200000() {
        return this.OO0000;
    }

    public final boolean o00000() {
        return this.\u00f500000;
    }

    public final boolean String() {
        return this.void;
    }

    public final boolean \u00d500000() {
        return this.\u00d6O0000;
    }

    public final m o00000(b.t.c.b.b.h.w w2, boolean bl) {
        m m2;
        if (bl && this.\u00f500000) {
            return this;
        }
        switch (m$_b.o00000[w2.ordinal()]) {
            case 1: {
                m2 = this.supersuper;
                if (m2 != null) break;
                return this;
            }
            case 2: {
                m2 = this.o00000;
                if (m2 != null) break;
                return this;
            }
            default: {
                m2 = this.float;
                if (m2 != null) break;
                m2 = this;
            }
        }
        return m2;
    }

    public final m \u00d600000() {
        return new m(this.Object, true, this.\u00f500000, this.\u00d500000, this.\u00f4O0000, this.float, this.void, this.supersuper, this.o00000, this.\u00d6O0000, this.public);
    }

    public m() {
        this(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    }

    static {
        m m2 = \u00d600000;
        \u00f6O0000 = new m(false, false, false, false, false, m2, false, null, null, false, false, 2012, null);
        m2 = \u00d4O0000;
        \u00f600000 = new m(false, false, false, false, false, m2, false, null, null, true, false, 1500, null);
        m2 = \u00d600000;
        Oo0000 = new m(false, true, false, false, false, m2, false, null, null, false, false, 2012, null);
        classsuper = new m(false, false, false, true, false, \u00d600000, false, null, null, false, false, 2007, null);
        \u00d200000 = new m(false, false, false, true, false, \u00d2O0000, false, null, null, false, true, 983, null);
        \u00d400000 = new m(false, false, false, true, false, \u00d2O0000, false, null, null, false, true, 919, null);
        m2 = \u00d600000;
        oO0000 = new m(false, false, true, false, false, m2, false, null, null, false, false, 2008, null);
        \u00f5O0000 = new m(true, true, false, false, false, null, true, null, null, false, false, 1980, null);
    }
}

