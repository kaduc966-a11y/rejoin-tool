/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.o.d.fc;
import b.qb;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.k;
import b.t.c.b.b.b.o;
import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.lc;
import b.t.c.b.b.q.wb;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    public static final i \u00d600000;
    private static final Set \u00d400000;
    private static final Set \u00d300000;
    private static final HashMap \u00d800000;
    private static final HashMap super;
    private static final HashMap \u00d200000;
    private static final Set class;

    private i() {
    }

    public final boolean o00000(f f2) {
        return i.class.contains(f2);
    }

    public final b.t.c.b.b.d.d o00000(b.t.c.b.b.d.d d2) {
        return (b.t.c.b.b.d.d)\u00d800000.get(d2);
    }

    public static final boolean o00000(rc i2) {
        if (b.t.c.b.b.h.o.o00000(i2)) {
            return false;
        }
        kb kb2 = i2.thisdosuper().\u00f4OO000();
        if (kb2 == null) {
            return false;
        }
        i2 = kb2;
        return \u00d600000.o00000((wb)i2);
    }

    public final boolean o00000(wb wb2) {
        wb wb3 = wb2.\u00d8\u00f80000();
        return wb3 instanceof lc && fc.o00000((Object)((lc)wb3).OOO000(), (Object)d.oO0000) && \u00d400000.contains(wb2.\u00d5\u00f80000());
    }

    static {
        Collection collection;
        \u00d600000 = new i();
        k[] object2 = k.values();
        Enum[] enumArray = object2;
        Collection collection2 = new ArrayList(object2.length);
        for (k k2 : enumArray) {
            collection = collection2;
            collection.add(k2.super());
        }
        \u00d400000 = mc.\u00d4O0000((Iterable)((List)collection2));
        o[] oArray = o.values();
        enumArray = oArray;
        collection2 = new ArrayList(oArray.length);
        for (Enum enum_ : enumArray) {
            collection = collection2;
            collection.add(((o)enum_).new());
        }
        \u00d300000 = mc.\u00d4O0000((Iterable)((List)collection2));
        \u00d800000 = new HashMap();
        super = new HashMap();
        qb[] qbArray = new qb[4];
        qb[] qbArray2 = qbArray;
        qbArray[0] = yc.o00000((Object)o.return, f.\u00d300000("ubyteArrayOf"));
        qbArray2[1] = yc.o00000((Object)o.o00000, f.\u00d300000("ushortArrayOf"));
        qbArray2[2] = yc.o00000((Object)o.\u00f400000, f.\u00d300000("uintArrayOf"));
        qbArray2[3] = yc.o00000((Object)o.\u00d500000, f.\u00d300000("ulongArrayOf"));
        \u00d200000 = y.\u00d200000(qbArray2);
        k[] kArray = k.values();
        Collection collection3 = new LinkedHashSet();
        int n2 = kArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            k k3;
            k k4 = k3 = kArray[i2];
            collection = collection3;
            collection.add(k4.\u00d200000().o00000());
        }
        i.class = (Set)collection3;
        for (k k5 : k.values()) {
            ((Map)\u00d800000).put(k5.\u00d200000(), k5.\u00d300000());
            ((Map)super).put(k5.\u00d300000(), k5.\u00d200000());
        }
    }
}

