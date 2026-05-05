/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b;

import b.dc;
import b.lb;
import b.o.e.h;
import b.r;
import b.s.mc;
import b.t.c.b.b.b.d;
import b.t.c.b.b.b.l$_b$0;
import b.t.c.b.b.b.l$_c;
import b.t.c.b.b.b.l$_d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.kb;
import b.t.c.b.b.q.t;
import b.t.m;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class l {
    public static final l$_d \u00f600000;
    static final /* synthetic */ m[] super;
    private final t \u00d200000;
    private final dc int;
    private final l$_c \u00d600000;
    private final l$_c \u00d300000;
    private final l$_c OO0000;
    private final l$_c class;
    private final l$_c \u00f400000;
    private final l$_c \u00d800000;
    private final l$_c \u00f800000;
    private final l$_c \u00d400000;

    public l(bc bc2, t t2) {
        this.\u00d200000 = t2;
        this.int = r.o00000(lb.\u00d400000, (h)new l$_b$0(bc2));
        this.\u00d600000 = new l$_c(1);
        this.\u00d300000 = new l$_c(1);
        this.OO0000 = new l$_c(1);
        this.class = new l$_c(2);
        this.\u00f400000 = new l$_c(3);
        this.\u00d800000 = new l$_c(1);
        this.\u00f800000 = new l$_c(2);
        this.\u00d400000 = new l$_c(3);
    }

    private final b.t.c.b.b.o.e.f o00000() {
        return (b.t.c.b.b.o.e.f)this.int.\u00d200000();
    }

    private final ib o00000(String object, int n2) {
        object = f.\u00d300000((String)object);
        kb kb2 = this.o00000().\u00d200000((f)object, b.t.c.b.b.j.b.f.o00000);
        ib ib2 = kb2 instanceof ib ? (ib)kb2 : null;
        if (ib2 == null) {
            ib2 = this.\u00d200000.o00000(new b.t.c.b.b.d.d(d.\u00d5\u00d20000, (f)object), mc.o00000((Object)n2));
        }
        return ib2;
    }

    public final ib \u00d200000() {
        return this.\u00d600000.o00000(this, super[0]);
    }

    private static final b.t.c.b.b.o.e.f \u00d200000(bc bc2) {
        return bc2.new(d.\u00d5\u00d20000).\u00f8\u00f80000();
    }

    public static final /* synthetic */ ib o00000(l l2, String string, int n2) {
        return l2.o00000(string, n2);
    }

    static {
        m[] mArray = new m[8];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(l.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        mArray2[1] = new b.o.d.ib(l.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        mArray2[2] = new b.o.d.ib(l.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        mArray2[3] = new b.o.d.ib(l.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        mArray2[4] = new b.o.d.ib(l.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        mArray2[5] = new b.o.d.ib(l.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        mArray2[6] = new b.o.d.ib(l.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        mArray2[7] = new b.o.d.ib(l.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0);
        super = mArray2;
        \u00f600000 = new l$_d(null);
    }

    static /* synthetic */ b.t.c.b.b.o.e.f o00000(bc bc2) {
        return l.\u00d200000(bc2);
    }
}

