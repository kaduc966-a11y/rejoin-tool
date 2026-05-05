/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.m;
import b.o.d.z;
import b.o.e.g;
import b.t.c.b.b.h.bb;
import b.t.c.b.b.h.c.ab;
import b.t.c.b.b.h.c.j;
import b.t.c.b.b.h.c.o;
import b.t.c.b.b.h.c.q;
import b.t.c.b.b.h.cb$_b;
import b.t.c.b.b.h.cb$_d$_b;
import b.t.c.b.b.h.tb;
import b.t.c.b.b.m.c;
import java.util.ArrayDeque;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class cb {
    private final boolean super;
    private final boolean \u00d400000;
    private final boolean class;
    private final boolean \u00d300000;
    private final o \u00d600000;
    private final bb \u00f600000;
    private final tb int;
    private int \u00d200000;
    private boolean \u00f400000;
    private ArrayDeque \u00f800000;
    private Set \u00d800000;

    public cb(boolean bl, boolean bl2, boolean bl3, boolean bl4, o o2, bb bb2, tb tb2) {
        this.super = bl;
        this.\u00d400000 = bl2;
        this.class = bl3;
        this.\u00d300000 = bl4;
        this.\u00d600000 = o2;
        this.\u00f600000 = bb2;
        this.int = tb2;
    }

    public final boolean \u00d800000() {
        return this.super;
    }

    public final boolean \u00f500000() {
        return this.\u00d400000;
    }

    public final boolean \u00d300000() {
        return this.class;
    }

    public final o new() {
        return this.\u00d600000;
    }

    public final bb \u00d500000() {
        return this.\u00f600000;
    }

    public final q new(q q2) {
        return this.int.o00000(q2);
    }

    public final q \u00d300000(q q2) {
        return this.\u00f600000.o00000(q2);
    }

    public boolean o00000(q q2, q q3) {
        return true;
    }

    public cb$_b o00000(j j2, ab ab2) {
        return cb$_b.\u00d300000;
    }

    public Boolean o00000(q q2, q q3, boolean bl) {
        return null;
    }

    public static /* synthetic */ Boolean o00000(cb cb2, q q2, q q3, boolean bl, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return cb2.o00000(q2, q3, bl);
    }

    public boolean o00000(g g2) {
        cb$_d$_b cb$_d$_b = new cb$_d$_b();
        g2.\u00f800000(cb$_d$_b);
        return cb$_d$_b.o00000();
    }

    public final ArrayDeque \u00d400000() {
        return this.\u00f800000;
    }

    public final Set return() {
        return this.\u00d800000;
    }

    public final void o00000() {
        boolean bl;
        boolean bl2 = bl = !this.\u00f400000;
        if (m.new && !bl) {
            String string = "Supertypes were locked for " + z.\u00d200000(this.getClass());
            throw new AssertionError((Object)string);
        }
        this.\u00f400000 = true;
        if (this.\u00f800000 == null) {
            this.\u00f800000 = new ArrayDeque(4);
        }
        if (this.\u00d800000 == null) {
            this.\u00d800000 = c.\u00d8\u00d3\u00f5000.o00000();
        }
    }

    public final void \u00f400000() {
        this.\u00f800000.clear();
        this.\u00d800000.clear();
        this.\u00f400000 = false;
    }

    public final boolean o00000(q q2) {
        return this.\u00d300000 && this.\u00d600000.o00000(q2);
    }

    public static final /* synthetic */ int o00000(cb cb2) {
        return cb2.\u00d200000;
    }

    public static final /* synthetic */ void o00000(cb cb2, int n2) {
        cb2.\u00d200000 = n2;
    }
}

