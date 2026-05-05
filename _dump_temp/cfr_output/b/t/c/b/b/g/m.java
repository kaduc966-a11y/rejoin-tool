/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.o.d.fc;
import b.o.d.w;
import b.o.e.g;
import b.q.kb;
import b.t.c.b.b.d.f;
import b.t.c.b.b.g.d;
import b.t.c.b.b.g.m$2;
import b.t.c.b.b.g.m$3;
import b.t.c.b.b.g.m$4;
import b.t.c.b.b.g.r;
import b.t.c.b.b.g.r$_b;
import b.t.c.b.b.g.r$_c;
import b.t.c.b.b.q.ic;
import java.util.Arrays;
import java.util.Collection;

public final class m {
    private final f \u00d200000;
    private final kb String;
    private final Collection \u00d500000;
    private final g \u00d300000;
    private final d[] o00000;

    private m(f f2, kb kb2, Collection collection, g g2, d ... dArray) {
        this.\u00d200000 = f2;
        this.String = kb2;
        this.\u00d500000 = collection;
        this.\u00d300000 = g2;
        this.o00000 = dArray;
    }

    public final boolean o00000(ic ic2) {
        CharSequence charSequence;
        if (this.\u00d200000 != null && !fc.o00000((Object)ic2.\u00d5\u00f80000(), (Object)this.\u00d200000)) {
            return false;
        }
        if (this.String != null && !this.String.\u00d200000(charSequence = (CharSequence)ic2.\u00d5\u00f80000().\u00d400000())) {
            return false;
        }
        return this.\u00d500000 == null || this.\u00d500000.contains(ic2.\u00d5\u00f80000());
    }

    public final r \u00d200000(ic ic2) {
        Object object = this.o00000;
        int n2 = ((d[])object).length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = object[i2].o00000(ic2);
            if (string == null) continue;
            return new r$_b(string);
        }
        object = (String)this.\u00d300000.\u00f800000(ic2);
        if (object != null) {
            return new r$_b((String)object);
        }
        return r$_c.\u00d200000;
    }

    public m(f f2, d[] dArray, g g2) {
        this(f2, null, null, g2, Arrays.copyOf(dArray, dArray.length));
    }

    public /* synthetic */ m(f f2, d[] dArray, g g2, int n2, w w2) {
        if ((n2 & 4) != 0) {
            g2 = m$2.\u00d30\u00d4000;
        }
        this(f2, dArray, g2);
    }

    public m(kb kb2, d[] dArray, g g2) {
        this(null, kb2, null, g2, Arrays.copyOf(dArray, dArray.length));
    }

    public /* synthetic */ m(kb kb2, d[] dArray, g g2, int n2, w w2) {
        if ((n2 & 4) != 0) {
            g2 = m$3.nullvoidnew;
        }
        this(kb2, dArray, g2);
    }

    public m(Collection collection, d[] dArray, g g2) {
        this(null, null, collection, g2, Arrays.copyOf(dArray, dArray.length));
    }

    public /* synthetic */ m(Collection collection, d[] dArray, g g2, int n2, w w2) {
        if ((n2 & 4) != 0) {
            g2 = m$4.o0\u00d4000;
        }
        this(collection, dArray, g2);
    }
}

