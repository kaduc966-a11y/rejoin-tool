/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.o.d.w;
import b.t.c.b.b.b.b.b$_f;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.d.k;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class b {
    public static final b$_f \u00d800000 = new b$_f(null);
    private final k \u00d300000;
    private final String return;
    private final boolean new;
    private final d o00000;
    private final boolean \u00d400000;
    private final int \u00d500000;

    public b(k k2, String string, boolean bl, d d2, boolean bl2, int n2) {
        this.\u00d300000 = k2;
        this.return = string;
        this.new = bl;
        this.o00000 = d2;
        this.\u00d400000 = bl2;
        this.\u00d500000 = n2;
    }

    public /* synthetic */ b(k k2, String string, boolean bl, d d2, boolean bl2, int n2, int n3, w w2) {
        if ((n3 & 0x20) != 0) {
            n2 = 254;
        }
        this(k2, string, bl, d2, bl2, n2);
    }

    public final k o00000() {
        return this.\u00d300000;
    }

    public final String new() {
        return this.return;
    }

    public final int \u00d300000() {
        return this.\u00d500000;
    }

    public final f new(int n2) {
        return f.\u00d300000(this.return + n2);
    }

    public final d o00000(int n2) {
        return new d(this.\u00d300000, this.new(n2));
    }

    public String toString() {
        return this.\u00d300000 + '.' + this.return + 'N';
    }
}

