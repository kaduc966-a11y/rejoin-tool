/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.c;

import b.m;
import b.o.d.ib;
import b.o.e.h;
import b.qd;
import b.s.mc;
import b.t.c.b.b.b.c;
import b.t.c.b.b.b.c.i;
import b.t.c.b.b.b.c.j$_b$0;
import b.t.c.b.b.b.c.j$_b$1;
import b.t.c.b.b.b.c.j$_b$2;
import b.t.c.b.b.b.c.j$_c;
import b.t.c.b.b.b.c.j$_d;
import b.t.c.b.b.b.c.j$_e;
import b.t.c.b.b.b.c.k;
import b.t.c.b.b.i.f;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.f.b;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j
extends c {
    static final /* synthetic */ b.t.m[] \u00f600000;
    private final j$_c \u00f500000;
    private h for;
    private final f \u00f800000;

    public j(l l2, j$_c object) {
        super(l2);
        this.\u00f500000 = object;
        object = this;
        this.\u00f800000 = l2.o00000(new j$_b$0((j)object, l2));
        switch (j$_e.o00000[this.\u00f500000.ordinal()]) {
            case 1: {
                return;
            }
            case 2: {
                this.o00000(false);
                return;
            }
            case 3: {
                this.o00000(true);
                return;
            }
        }
        throw new qd();
    }

    public final void o00000(h object) {
        boolean bl;
        boolean bl2 = bl = this.for == null;
        if (m.new && !bl) {
            object = "JvmBuiltins repeated initialization";
            throw new AssertionError(object);
        }
        this.for = object;
    }

    public final void \u00d200000(bc bc2, boolean bl) {
        boolean bl2 = bl;
        bc bc3 = bc2;
        this.o00000(new j$_b$1(bc3, bl2));
    }

    public final k whilesuper() {
        return (k)b.t.c.b.b.i.k.o00000(this.\u00f800000, (Object)this, \u00f600000[0]);
    }

    @Override
    public final b \u00d3o0000() {
        return this.whilesuper();
    }

    @Override
    public final b.t.c.b.b.q.f.c \u00f600000() {
        return this.whilesuper();
    }

    protected final List \u00f5o0000() {
        return mc.return(super.\u00d2O0000(), new i(this.\u00d5O0000(), this.\u00d5o0000(), null, 4, null));
    }

    private static final j$_d o00000(bc bc2, boolean bl) {
        return new j$_d(bc2, bl);
    }

    private static final j$_d \u00d200000(j object) {
        h h2 = ((j)object).for;
        if (h2 == null) {
            object = "JvmBuiltins instance has not been initialized properly";
            throw new AssertionError(object);
        }
        Object object2 = h2.newreturn();
        j$_d cfr_ignored_0 = (j$_d)object2;
        ((j)object).for = null;
        return (j$_d)object2;
    }

    private static final k \u00d200000(j j2, l l2) {
        return new k(j2.\u00d5o0000(), l2, new j$_b$2(j2));
    }

    static {
        b.t.m[] mArray = new b.t.m[1];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new ib(j.class, "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;", 0);
        \u00f600000 = mArray2;
    }

    static /* synthetic */ k o00000(j j2, l l2) {
        return j.\u00d200000(j2, l2);
    }

    static /* synthetic */ j$_d \u00d300000(bc bc2, boolean bl) {
        return j.o00000(bc2, bl);
    }

    static /* synthetic */ j$_d o00000(j j2) {
        return j.\u00d200000(j2);
    }
}

