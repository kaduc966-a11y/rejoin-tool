/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.qb;
import b.s.mc;
import b.t.b;
import b.t.c.b.c;
import b.t.c.b.jc;
import b.t.c.b.n$_b$0;
import b.t.c.b.n$_b$1;
import b.t.c.b.n$_b$2;
import b.t.c.b.n$_b$3;
import b.t.c.b.n$_b$4;
import b.t.c.b.r;
import b.t.c.b.vb;
import b.t.u;
import b.yc;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class n {
    private static final vb \u00d200000 = c.o00000(n$_b$0.privatesuperObject);
    private static final vb Object = c.o00000(n$_b$1.\u00f5\u00d4\u00d5000);
    private static final vb \u00d500000 = c.o00000(n$_b$2.\u00f4\u00d4\u00d5000);
    private static final vb \u00d400000 = c.o00000(n$_b$3.\u00d8\u00d4\u00d5000);
    private static final vb o00000 = c.o00000(n$_b$4.forsuperObject);

    public static final r \u00d600000(Class clazz) {
        return (r)\u00d200000.o00000(clazz);
    }

    public static final b \u00f400000(Class clazz) {
        return (b)Object.o00000(clazz);
    }

    public static final void o00000() {
        \u00d200000.o00000();
        Object.o00000();
        \u00d500000.o00000();
        \u00d400000.o00000();
        o00000.o00000();
    }

    public static final u o00000(Class clazz, List list, boolean bl) {
        if (list.isEmpty()) {
            if (bl) {
                return (u)\u00d400000.o00000(clazz);
            }
            return (u)\u00d500000.o00000(clazz);
        }
        return n.\u00d200000(clazz, list, bl);
    }

    private static final u \u00d200000(Class object, List list, boolean bl) {
        qb qb2;
        ConcurrentMap concurrentMap = (ConcurrentHashMap)o00000.o00000((Class)object);
        Object object2 = concurrentMap.get(qb2 = yc.o00000(list, bl));
        if (object2 == null && (object2 = concurrentMap.putIfAbsent(qb2, object = b.t.b.b.super(n.\u00d600000((Class)object), list, bl, mc.\u00d500000()))) == null) {
            object2 = object;
        }
        return (u)object2;
    }

    private static final r \u00d500000(Class clazz) {
        return new r(clazz);
    }

    private static final jc OO0000(Class clazz) {
        return new jc(clazz);
    }

    private static final u float(Class clazz) {
        return b.t.b.b.super(n.\u00d600000(clazz), mc.\u00d500000(), false, mc.\u00d500000());
    }

    private static final u \u00f600000(Class clazz) {
        return b.t.b.b.super(n.\u00d600000(clazz), mc.\u00d500000(), true, mc.\u00d500000());
    }

    private static final ConcurrentHashMap void(Class clazz) {
        return new ConcurrentHashMap();
    }

    static /* synthetic */ r \u00f500000(Class clazz) {
        return n.\u00d500000(clazz);
    }

    static /* synthetic */ jc \u00d400000(Class clazz) {
        return n.OO0000(clazz);
    }

    static /* synthetic */ u Object(Class clazz) {
        return n.float(clazz);
    }

    static /* synthetic */ u \u00d200000(Class clazz) {
        return n.\u00f600000(clazz);
    }

    static /* synthetic */ ConcurrentHashMap o00000(Class clazz) {
        return n.void(clazz);
    }
}

