/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.f$_b;
import b.e.g;
import b.e.h;
import b.e.t;
import b.o.d.fc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f
extends t
implements g,
h {
    public static final f$_b \u00d8\u00d20000 = new f$_b(null);
    private static final f whilenew = new f('\u0001', '\u0000');

    public f(char c2, char c3) {
        super(c2, c3, 1);
    }

    public final Character \u00f5O0000() {
        return Character.valueOf(this.\u00f400000());
    }

    public final Character thissuper() {
        return Character.valueOf(this.\u00f500000());
    }

    public final Character Stringsuper() {
        if (this.\u00f500000() == '\uffff') {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return Character.valueOf((char)(this.\u00f500000() + '\u0001'));
    }

    public static /* synthetic */ void \u00d8O0000() {
    }

    public final boolean \u00d400000(char c2) {
        return fc.o00000((int)this.\u00f400000(), c2) <= 0 && fc.o00000((int)c2, this.\u00f500000()) <= 0;
    }

    @Override
    public final boolean if() {
        return fc.o00000((int)this.\u00f400000(), this.\u00f500000()) > 0;
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof f && (((t)this).if() && ((t)((f)object)).if() || this.\u00f400000() == ((f)object).\u00f400000() && this.\u00f500000() == ((f)object).\u00f500000());
    }

    @Override
    public final int hashCode() {
        if (((t)this).if()) {
            return -1;
        }
        return 31 * this.\u00f400000() + this.\u00f500000();
    }

    @Override
    public final String toString() {
        return this.\u00f400000() + ".." + this.\u00f500000();
    }

    @Override
    public final /* synthetic */ boolean o00000(Comparable comparable) {
        return this.\u00d400000(((Character)comparable).charValue());
    }

    public static final /* synthetic */ f \u00f4O0000() {
        return whilenew;
    }
}

