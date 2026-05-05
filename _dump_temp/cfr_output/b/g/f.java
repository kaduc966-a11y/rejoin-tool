/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.f$_b$1;
import b.g.n;
import b.o.d.w;
import b.o.e.g;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f
implements n {
    private final n \u00f800000;
    private final boolean if;
    private final g \u00f500000;

    public f(n n2, boolean bl, g g2) {
        this.\u00f800000 = n2;
        this.if = bl;
        this.\u00f500000 = g2;
    }

    public /* synthetic */ f(n n2, boolean bl, g g2, int n3, w w2) {
        if ((n3 & 2) != 0) {
            bl = true;
        }
        this(n2, bl, g2);
    }

    @Override
    public final Iterator o00000() {
        return new f$_b$1(this);
    }

    public static final /* synthetic */ n \u00d300000(f f2) {
        return f2.\u00f800000;
    }

    public static final /* synthetic */ g \u00d200000(f f2) {
        return f2.\u00f500000;
    }

    public static final /* synthetic */ boolean o00000(f f2) {
        return f2.if;
    }
}

