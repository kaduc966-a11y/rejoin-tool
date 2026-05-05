/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.d.fc;
import b.o.d.jb;
import b.o.d.w;
import b.t.c.b.b.h.c.g;
import b.t.c.b.b.h.c.r;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.i;
import b.t.c.b.c.c;
import b.t.c.b.c.j;
import b.t.c.b.gc;
import b.t.c.b.z;
import b.t.l;
import b.t.u;
import b.xc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class mc
extends jb
implements g,
r {
    private final String o\u00f4\u00d5000;
    private final l O\u00f4\u00d5000;
    private final boolean \u00f8\u00d8\u00d5000;
    private final i newStringObject;
    public volatile List \u00d3\u00f4\u00d5000;

    private mc(i i2, z z2, String string, l l2, boolean bl) {
        super(z2);
        this.o\u00f4\u00d5000 = string;
        this.O\u00f4\u00d5000 = l2;
        this.\u00f8\u00d8\u00d5000 = bl;
        this.newStringObject = i2;
    }

    @Override
    public final String \u00f5\u00d4o000() {
        return this.o\u00f4\u00d5000;
    }

    @Override
    public final l \u00d8\u00d4o000() {
        return this.O\u00f4\u00d5000;
    }

    @Override
    public final boolean StringObjectsuper() {
        return this.\u00f8\u00d8\u00d5000;
    }

    public mc(z z2, String string, l l2, boolean bl) {
        this(null, z2, string, l2, bl);
    }

    public mc(z z2, i iterator, j j2) {
        this((i)((Object)iterator), z2, iterator.\u00d5\u00f80000().\u00d400000(), b.t.c.b.j.o00000(iterator.\u00d4\u00d5o000()), iterator.\u00f4\u00d5o000());
        iterator = iterator.\u00d8\u00d5o000();
        mc mc2 = this;
        Iterator iterator2 = iterator;
        iterator = new ArrayList(b.s.mc.o00000((Iterable)((Object)iterator), 10));
        iterator2 = iterator2.iterator();
        while (iterator2.hasNext()) {
            Object object = iterator2.next();
            object = (rc)object;
            Iterator iterator3 = iterator;
            object = new c((rc)object, null, 2, null);
            u u2 = j.o00000(j2, (u)object, null, 2, null).o00000();
            if (u2 == null) {
                gc.o00000(z2);
                throw new xc();
            }
            iterator3.add((u)u2);
        }
        mc2.\u00f500000((List)((Object)iterator));
    }

    public /* synthetic */ mc(z z2, i i2, j j2, int n2, w w2) {
        if ((n2 & 4) != 0) {
            j2 = j.\u00d300000.o00000();
        }
        this(z2, i2, j2);
    }

    public final i nullObjectsuper() {
        i i2 = this.newStringObject;
        if (i2 == null) {
            throw new IllegalStateException("Descriptor-less type parameter: ".concat(String.valueOf(this)).toString());
        }
        return i2;
    }

    @Override
    public final List \u00f4\u00d4o000() {
        List list = this.\u00d3\u00f4\u00d5000;
        if (list != null) {
            return list;
        }
        fc.return("");
        return null;
    }

    public final void \u00f500000(List list) {
        this.\u00d3\u00f4\u00d5000 = list;
    }
}

