/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.c;

import b.o.d.mc;
import b.o.d.w;
import b.o.r;
import b.t.c.b.c.n;
import b.t.u;
import b.t.v;
import b.t.z;
import java.util.List;

public final class h
extends n
implements mc {
    private final v \u00d5\u00d6\u00d8000;
    private final List newnewString;
    private final boolean \u00d8\u00d6\u00d8000;
    private final List \u00d4\u00d6\u00d8000;
    private final u \u00f5\u00d6\u00d8000;
    private final boolean returnnewString;
    private final boolean \u00f4\u00d6\u00d8000;
    private final boolean ifnewString;
    private final z \u00d3\u00d6\u00d8000;

    public h(v v2, List list, boolean bl, List list2, u u2, boolean bl2, boolean bl3, boolean bl4, z z2, b.o.e.h h2) {
        super(h2);
        this.\u00d5\u00d6\u00d8000 = v2;
        this.newnewString = list;
        this.\u00d8\u00d6\u00d8000 = bl;
        this.\u00d4\u00d6\u00d8000 = list2;
        this.\u00f5\u00d6\u00d8000 = u2;
        this.returnnewString = bl2;
        this.\u00f4\u00d6\u00d8000 = bl3;
        this.ifnewString = bl4;
        this.\u00d3\u00d6\u00d8000 = z2;
    }

    public /* synthetic */ h(v v2, List list, boolean bl, List list2, u u2, boolean bl2, boolean bl3, boolean bl4, z z2, b.o.e.h h2, int n2, w w2) {
        if ((n2 & 0x200) != 0) {
            h2 = null;
        }
        this(v2, list, bl, list2, u2, bl2, bl3, bl4, z2, h2);
    }

    @Override
    public final v privatevoid() {
        return this.\u00d5\u00d6\u00d8000;
    }

    @Override
    public final List \u00f5\u00f60000() {
        return this.newnewString;
    }

    @Override
    public final boolean \u00f4\u00f60000() {
        return this.\u00d8\u00d6\u00d8000;
    }

    @Override
    public final List \u00d8\u00f50000() {
        return this.\u00d4\u00d6\u00d8000;
    }

    @Override
    public final u nulldosuper() {
        return this.\u00f5\u00d6\u00d8000;
    }

    @Override
    public final boolean privatedosuper() {
        return this.returnnewString;
    }

    @Override
    public final boolean fordosuper() {
        return this.\u00f4\u00d6\u00d8000;
    }

    @Override
    public final boolean \u00d5\u00d8\u00d2000() {
        return this.ifnewString;
    }

    @Override
    public final z \u00f4\u00d8\u00d2000() {
        return this.\u00d3\u00d6\u00d8000;
    }

    @Override
    public final n \u00d3o0000(boolean bl) {
        h h2 = this;
        return new h(h2.o00000(h2.privatevoid(), bl), this.\u00f5\u00f60000(), bl, this.\u00d8\u00f50000(), ((n)this).nulldosuper(), false, ((n)this).fordosuper(), ((n)this).\u00d5\u00d8\u00d2000(), ((n)this).\u00f4\u00d8\u00d2000(), null, 512, null);
    }

    private final v o00000(v v2, boolean bl) {
        Object object;
        if (!(v2 instanceof z)) {
            return v2;
        }
        if (bl) {
            object = r.o00000(r.new((z)v2));
        } else {
            object = r.\u00d400000((z)v2);
            if (object == null || (object = r.o00000((Class)object)) == null) {
                object = (z)v2;
            }
        }
        return (v)object;
    }

    @Override
    public final n nullsuper(boolean bl) {
        return new h(this.privatevoid(), this.\u00f5\u00f60000(), this.\u00f4\u00f60000() && !bl, this.\u00d8\u00f50000(), ((n)this).nulldosuper(), bl, ((n)this).fordosuper(), ((n)this).\u00d5\u00d8\u00d2000(), ((n)this).\u00f4\u00d8\u00d2000(), null, 512, null);
    }

    @Override
    public final n \u00d8\u00d8\u00d2000() {
        return null;
    }

    @Override
    public final n \u00d4\u00d8\u00d2000() {
        return null;
    }

    @Override
    public final boolean \u00d3\u00d8\u00d2000() {
        return false;
    }
}

