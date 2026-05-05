/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.d.fc;
import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.g.g;
import b.t.c.b.b.g.j;
import b.t.c.b.b.h.ic;
import b.t.c.b.b.h.zb$_b;
import b.t.c.b.b.m.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class zb
extends j
implements Iterable,
b.o.d.c.g {
    public static final zb$_b ifreturnclass = new zb$_b(null);
    private static final zb \u00f5O\u00f6000 = new zb(mc.\u00d500000());

    private zb(List object) {
        object = object.iterator();
        while (object.hasNext()) {
            ic ic2 = (ic)object.next();
            this.o00000(ic2.o00000(), (Object)ic2);
        }
    }

    private zb(ic ic2) {
        this(mc.o00000(ic2));
    }

    public final zb \u00d800000(zb zb2) {
        zb zb3 = this;
        if (zb3.ifStringnew() && zb2.ifStringnew()) {
            return zb3;
        }
        List list = new ArrayList();
        Iterator iterator = zb$_b.o00000(ifreturnclass).iterator();
        while (iterator.hasNext()) {
            ic ic2;
            int n2 = ((Number)iterator.next()).intValue();
            ic ic3 = (ic)zb3.\u00f8\u00d8\u00d3000().\u00f5\u00f40000(n2);
            ic ic4 = (ic)zb2.\u00f8\u00d8\u00d3000().\u00f5\u00f40000(n2);
            ic ic5 = ic3;
            if (ic5 == null) {
                ic ic6 = ic4;
                ic2 = ic6 != null ? ic6.new(ic3) : null;
            } else {
                ic2 = ic5.new(ic4);
            }
            ic3 = ic2;
            e.o00000(list, ic3);
        }
        return ifreturnclass.o00000(list);
    }

    public final zb return(zb zb2) {
        zb zb3 = this;
        if (zb3.ifStringnew() && zb2.ifStringnew()) {
            return zb3;
        }
        List list = new ArrayList();
        Iterator iterator = zb$_b.o00000(ifreturnclass).iterator();
        while (iterator.hasNext()) {
            ic ic2;
            int n2 = ((Number)iterator.next()).intValue();
            ic ic3 = (ic)zb3.\u00f8\u00d8\u00d3000().\u00f5\u00f40000(n2);
            ic ic4 = (ic)zb2.\u00f8\u00d8\u00d3000().\u00f5\u00f40000(n2);
            ic ic5 = ic3;
            if (ic5 == null) {
                ic ic6 = ic4;
                ic2 = ic6 != null ? ic6.o00000(ic3) : null;
            } else {
                ic2 = ic5.o00000(ic4);
            }
            ic3 = ic2;
            e.o00000(list, ic3);
        }
        return ifreturnclass.o00000(list);
    }

    public final boolean \u00d300000(ic ic2) {
        int n2 = ifreturnclass.\u00d200000(ic2.o00000());
        return this.\u00f8\u00d8\u00d3000().\u00f5\u00f40000(n2) != null;
    }

    public final zb new(ic object) {
        if (this.\u00d300000((ic)object)) {
            return this;
        }
        if (this.ifStringnew()) {
            return new zb((ic)object);
        }
        object = mc.\u00d500000((Collection)mc.\u00f5O0000(this), object);
        return ifreturnclass.o00000((List)object);
    }

    public final zb o00000(ic object) {
        if (this.ifStringnew()) {
            return this;
        }
        Object object2 = this.\u00f8\u00d8\u00d3000();
        Collection collection = new ArrayList();
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object e2 = object2.next();
            if (!(!fc.o00000((Object)((ic)e2), object))) continue;
            collection.add(e2);
        }
        object = (List)collection;
        if (object.size() == this.\u00f8\u00d8\u00d3000().whileStringnew()) {
            return this;
        }
        return ifreturnclass.o00000((List)object);
    }

    @Override
    public final g \u00f5\u00d8\u00d3000() {
        return ifreturnclass;
    }

    public static final /* synthetic */ zb O\u00f4\u00d3000() {
        return \u00f5O\u00f6000;
    }

    public /* synthetic */ zb(List list, w w2) {
        this(list);
    }
}

