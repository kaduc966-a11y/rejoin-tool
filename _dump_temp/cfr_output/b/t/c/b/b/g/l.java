/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.o.d.fc;
import b.o.d.w;
import b.o.e.g;
import b.t.c.b.b.g.d;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.ic;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class l
implements d {
    private final String null;
    private final g \u00f500000;
    private final String \u00f600000;

    private l(String string, g g2) {
        this.null = string;
        this.\u00f500000 = g2;
        this.\u00f600000 = "must return " + this.null;
    }

    @Override
    public String o00000() {
        return this.\u00f600000;
    }

    @Override
    public boolean new(ic ic2) {
        return fc.o00000((Object)ic2.\u00d3\u00f4o000(), this.\u00f500000.\u00f800000(b.null(ic2)));
    }

    public /* synthetic */ l(String string, g g2, w w2) {
        this(string, g2);
    }
}

