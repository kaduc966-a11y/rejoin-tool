/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.o.d.fc;
import b.o.d.w;
import b.s.mc;
import b.s.ub;
import b.t.c.b.b.b.c.b;
import b.t.c.b.b.b.c.i$_b$0;
import b.t.c.b.b.b.c.i$_b$1;
import b.t.c.b.b.b.c.i$_c;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.d$_b;
import b.t.c.b.b.b.f;
import b.t.c.b.b.d.k;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.c;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.f.e;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.wb;
import b.t.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
implements e {
    public static final i$_c null;
    static final /* synthetic */ m[] String;
    private final bc \u00d800000;
    private final b.o.e.g \u00d600000;
    private final b.t.c.b.b.i.f \u00d500000;
    private static final k o00000;
    private static final b.t.c.b.b.d.f \u00d200000;
    private static final b.t.c.b.b.d.d \u00d300000;

    public i(l l2, bc object, b.o.e.g g2) {
        this.\u00d800000 = object;
        this.\u00d600000 = g2;
        object = this;
        this.\u00d500000 = l2.o00000(new i$_b$0((i)object, l2));
    }

    public /* synthetic */ i(l l2, bc bc2, b.o.e.g g2, int n2, w w2) {
        if ((n2 & 4) != 0) {
            g2 = i$_b$1.o\u00f6\u00d3000;
        }
        this(l2, bc2, g2);
    }

    private final c o00000() {
        return (c)b.t.c.b.b.i.k.o00000(this.\u00d500000, (Object)this, String[0]);
    }

    @Override
    public final boolean o00000(k k2, b.t.c.b.b.d.f f2) {
        return fc.o00000((Object)f2, (Object)\u00d200000) && fc.o00000((Object)k2, (Object)o00000);
    }

    @Override
    public final ib o00000(b.t.c.b.b.d.d d2) {
        if (fc.o00000((Object)d2, (Object)\u00d300000)) {
            return this.o00000();
        }
        return null;
    }

    @Override
    public final Collection o00000(k k2) {
        if (fc.o00000((Object)k2, (Object)o00000)) {
            return ub.super((Object)this.o00000());
        }
        return ub.\u00d300000();
    }

    private static final wb \u00d200000(bc iterator) {
        iterator = iterator.new(o00000).o0O000();
        Collection collection = new ArrayList();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!(t2 instanceof f)) continue;
            collection.add(t2);
        }
        return (wb)mc.Oo0000((List)collection);
    }

    private static final c o00000(i object, l l2) {
        object = new c((wb)((i)object).\u00d600000.\u00f800000(((i)object).\u00d800000), \u00d200000, ab.\u00d400000, ec.\u00d600000, mc.o00000(((i)object).\u00d800000.returnforsuper().oO0000()), g.o00000, false, l2);
        c c2 = object;
        ((c)object).o00000(new b(l2, c2), ub.\u00d300000(), null);
        return object;
    }

    public static final /* synthetic */ b.t.c.b.b.d.d \u00d200000() {
        return \u00d300000;
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(i.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0);
        String = mArray2;
        null = new i$_c(null);
        o00000 = d.oO0000;
        \u00d200000 = d$_b.nullObject.class();
        \u00d300000 = b.t.c.b.b.d.d.String.o00000(d$_b.nullObject.super());
    }

    static /* synthetic */ c \u00d200000(i i2, l l2) {
        return i.o00000(i2, l2);
    }

    static /* synthetic */ wb o00000(bc bc2) {
        return i.\u00d200000(bc2);
    }
}

