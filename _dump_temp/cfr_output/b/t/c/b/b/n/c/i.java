/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c;

import b.d;
import b.qb;
import b.s.y;
import b.t.c.b.b.d.k;
import b.t.c.b.b.n.c.ab;
import b.t.c.b.b.n.c.bb;
import b.t.c.b.b.n.c.cb;
import b.t.c.b.b.n.c.gb;
import b.t.c.b.b.n.c.hb;
import b.t.c.b.b.n.c.jb;
import b.yc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i {
    private static final k \u00d400000 = new k("org.jspecify.nullness");
    private static final k \u00d500000 = new k("org.jspecify.annotations");
    private static final k \u00d200000 = new k("io.reactivex.rxjava3.annotations");
    private static final k Object = new k("org.checkerframework.checker.nullness.compatqual");
    private static final String \u00f400000 = \u00d200000.super();
    private static final k[] o00000;
    private static final jb void;
    private static final gb \u00d600000;

    public static final k new() {
        return \u00d500000;
    }

    public static final k[] o00000() {
        return o00000;
    }

    public static final hb o00000(d object) {
        object = \u00d600000.String() != null && \u00d600000.String().o00000((d)object) <= 0 ? \u00d600000.\u00d300000() : \u00d600000.o00000();
        cb cb2 = i.o00000((cb)((Object)object));
        return new hb((cb)((Object)object), cb2, null, 4, null);
    }

    public static final cb o00000(cb cb2) {
        if (cb2 == cb.\u00d400000) {
            return null;
        }
        return cb2;
    }

    public static final cb o00000(k k2, d d2) {
        return i.o00000(k2, jb.o00000.super(), d2);
    }

    public static final cb o00000(k k2, jb object, d d2) {
        if ((object = (cb)((Object)object.o00000(k2))) != null) {
            return object;
        }
        gb gb2 = (gb)void.o00000(k2);
        if (gb2 == null) {
            return cb.\u00d600000;
        }
        object = gb2;
        if (gb2.String() != null && ((gb)object).String().o00000(d2) <= 0) {
            return ((gb)object).\u00d300000();
        }
        return ((gb)object).o00000();
    }

    static {
        k[] kArray = new k[2];
        Object[] objectArray = kArray;
        kArray[0] = new k(\u00f400000 + ".Nullable");
        objectArray[1] = new k(\u00f400000 + ".NonNull");
        o00000 = objectArray;
        qb[] qbArray = new qb[22];
        objectArray = qbArray;
        qbArray[0] = yc.o00000(new k("org.jetbrains.annotations"), gb.\u00d500000.o00000());
        objectArray[1] = yc.o00000(new k("kotlin.annotations.jvm"), gb.\u00d500000.o00000());
        objectArray[2] = yc.o00000(new k("androidx.annotation"), gb.\u00d500000.o00000());
        objectArray[3] = yc.o00000(new k("android.support.annotation"), gb.\u00d500000.o00000());
        objectArray[4] = yc.o00000(new k("android.annotation"), gb.\u00d500000.o00000());
        objectArray[5] = yc.o00000(new k("com.android.annotations"), gb.\u00d500000.o00000());
        objectArray[6] = yc.o00000(new k("org.eclipse.jdt.annotation"), gb.\u00d500000.o00000());
        objectArray[7] = yc.o00000(new k("org.checkerframework.checker.nullness.qual"), gb.\u00d500000.o00000());
        objectArray[8] = yc.o00000(Object, gb.\u00d500000.o00000());
        objectArray[9] = yc.o00000(new k("javax.annotation"), gb.\u00d500000.o00000());
        objectArray[10] = yc.o00000(new k("edu.umd.cs.findbugs.annotations"), gb.\u00d500000.o00000());
        objectArray[11] = yc.o00000(new k("io.reactivex.annotations"), gb.\u00d500000.o00000());
        objectArray[12] = yc.o00000(new k("androidx.annotation.RecentlyNullable"), new gb(cb.\u00d400000, null, null, 4, null));
        objectArray[13] = yc.o00000(new k("androidx.annotation.RecentlyNonNull"), new gb(cb.\u00d400000, null, null, 4, null));
        objectArray[14] = yc.o00000(new k("lombok"), gb.\u00d500000.o00000());
        objectArray[15] = yc.o00000(\u00d400000, new gb(cb.\u00d400000, new d(2, 1), cb.super));
        objectArray[16] = yc.o00000(\u00d500000, new gb(cb.\u00d400000, new d(2, 1), cb.super));
        objectArray[17] = yc.o00000(\u00d200000, new gb(cb.\u00d400000, new d(1, 8), cb.super));
        objectArray[18] = yc.o00000(new k("jakarta.annotation"), new gb(cb.\u00d400000, new d(2, 4), cb.super));
        objectArray[19] = yc.o00000(ab.\u00d200000, new gb(cb.\u00d400000, new d(2, 5), cb.super));
        objectArray[20] = yc.o00000(ab.\u00d3O0000, new gb(cb.\u00d400000, new d(2, 5), cb.super));
        objectArray[21] = yc.o00000(new k("io.vertx.codegen.annotations"), new gb(cb.\u00d400000, new d(2, 5), cb.super));
        void = new bb(y.\u00d600000((qb[])objectArray));
        \u00d600000 = new gb(cb.\u00d400000, null, null, 4, null);
    }
}

