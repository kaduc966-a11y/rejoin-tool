/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.o.d.w;
import b.o.e.g;
import b.t.c.b.b.h.e.b;
import b.t.c.b.b.i.f;
import b.t.c.b.b.i.k;
import b.t.c.b.b.i.l;
import b.t.c.b.b.q.fb$_b$0;
import b.t.c.b.b.q.fb$_b$1;
import b.t.c.b.b.q.fb$_c;
import b.t.c.b.b.q.ib;
import b.t.m;

public final class fb {
    public static final fb$_c \u00d600000;
    static final /* synthetic */ m[] Object;
    private final ib \u00d200000;
    private final g \u00d400000;
    private final b \u00d500000;
    private final f o00000;

    private fb(ib object, l l2, g g2, b b2) {
        this.\u00d200000 = object;
        this.\u00d400000 = g2;
        this.\u00d500000 = b2;
        object = this;
        this.o00000 = l2.o00000(new fb$_b$0((fb)object));
    }

    private final b.t.c.b.b.o.e.f o00000() {
        return (b.t.c.b.b.o.e.f)k.o00000(this.o00000, (Object)this, Object[0]);
    }

    public final b.t.c.b.b.o.e.f o00000(b b2) {
        if (!b2.o00000(b.t.c.b.b.o.f.b.\u00d500000(this.\u00d200000))) {
            return this.o00000();
        }
        if (!b2.o00000(this.\u00d200000.\u00d3OO000())) {
            return this.o00000();
        }
        fb fb2 = this;
        return b2.o00000(this.\u00d200000, new fb$_b$1(fb2, b2));
    }

    private static final b.t.c.b.b.o.e.f \u00d200000(fb fb2) {
        return (b.t.c.b.b.o.e.f)fb2.\u00d400000.\u00f800000(fb2.\u00d500000);
    }

    private static final b.t.c.b.b.o.e.f \u00d200000(fb fb2, b b2) {
        return (b.t.c.b.b.o.e.f)fb2.\u00d400000.\u00f800000(b2);
    }

    public /* synthetic */ fb(ib ib2, l l2, g g2, b b2, w w2) {
        this(ib2, l2, g2, b2);
    }

    static {
        m[] mArray = new m[1];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(fb.class, "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0);
        Object = mArray2;
        \u00d600000 = new fb$_c(null);
    }

    static /* synthetic */ b.t.c.b.b.o.e.f o00000(fb fb2) {
        return fb.\u00d200000(fb2);
    }

    static /* synthetic */ b.t.c.b.b.o.e.f o00000(fb fb2, b b2) {
        return fb.\u00d200000(fb2, b2);
    }
}

