/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.h;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class h$_l {
    private final Object \u00d200000;
    private final boolean super;
    static final /* synthetic */ boolean \u00d300000;

    public static h$_l o00000(Object object) {
        return new h$_l(object, false);
    }

    public static h$_l \u00d300000() {
        return new h$_l(null, true);
    }

    private h$_l(Object object, boolean bl) {
        this.\u00d200000 = object;
        this.super = bl;
    }

    public Object \u00d200000() {
        if (!\u00d300000 && this.super) {
            throw new AssertionError((Object)"A value requested from FALL_THROUGH in ".concat(String.valueOf(this)));
        }
        return this.\u00d200000;
    }

    public boolean o00000() {
        return this.super;
    }

    public String toString() {
        if (this.o00000()) {
            return "FALL_THROUGH";
        }
        return String.valueOf(this.\u00d200000);
    }

    static {
        \u00d300000 = !h.class.desiredAssertionStatus();
    }
}

