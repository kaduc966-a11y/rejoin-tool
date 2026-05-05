/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.m;
import b.o.d.fc;
import b.o.d.w;
import b.t.c.b.b.h.h;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.i;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class qb
extends h {
    private final i[] \u00d600000;
    private final hc[] void;
    private final boolean \u00f400000;

    public qb(i[] iArray, hc[] hcArray, boolean bl) {
        boolean bl2;
        this.\u00d600000 = iArray;
        this.void = hcArray;
        this.\u00f400000 = bl;
        boolean bl3 = bl2 = this.\u00d600000.length <= this.void.length;
        if (m.new && !bl2) {
            String string = "Number of arguments should not be less than number of parameters, but: parameters=" + this.\u00d600000.length + ", args=" + this.void.length;
            throw new AssertionError((Object)string);
        }
    }

    public /* synthetic */ qb(i[] iArray, hc[] hcArray, boolean bl, int n2, w w2) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        this(iArray, hcArray, bl);
    }

    public final i[] return() {
        return this.\u00d600000;
    }

    public final hc[] \u00d800000() {
        return this.void;
    }

    public qb(List list, List list2) {
        this(((Collection)list).toArray(new i[0]), ((Collection)list2).toArray(new hc[0]), false, 4, null);
    }

    @Override
    public final boolean o00000() {
        return this.void.length == 0;
    }

    @Override
    public final boolean \u00d500000() {
        return this.\u00f400000;
    }

    @Override
    public final hc o00000(rc i2) {
        i i3 = (i2 = ((rc)i2).thisdosuper().\u00f4OO000()) instanceof i ? (i)i2 : null;
        if (i3 == null) {
            return null;
        }
        i2 = i3;
        int n2 = i3.privateObjectsuper();
        if (n2 < this.\u00d600000.length && fc.o00000((Object)this.\u00d600000[n2].\u00d3OO000(), (Object)i2.\u00d3OO000())) {
            return this.void[n2];
        }
        return null;
    }
}

