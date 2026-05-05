/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.q.f;
import b.t.c.b.b.d.d;
import b.t.c.b.b.f.b.i;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.n.b.bb;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.k$_c$1;
import b.t.c.b.b.n.b.x;
import b.t.c.b.b.o.c.ab;
import b.t.c.b.b.o.c.c;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.m;
import b.t.c.b.b.o.c.n;
import b.t.c.b.b.o.c.p;
import b.t.c.b.b.o.c.v;
import b.t.c.b.b.o.c.w;
import b.t.c.b.b.o.c.y;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pc;
import b.t.c.b.b.q.t;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k
extends bb {
    private final bc void;
    private final t \u00f400000;
    private final i \u00f500000;
    private b.t.c.b.b.l.d.c \u00d600000;

    public k(bc bc2, t t2, b.t.c.b.b.i.l l2, x x2) {
        super(l2, x2);
        this.void = bc2;
        this.\u00f400000 = t2;
        this.\u00f500000 = new i(this.void, this.\u00f400000);
        this.\u00d600000 = b.t.c.b.b.l.d.c.\u00f800000;
    }

    @Override
    public final b.t.c.b.b.l.d.c \u00d300000() {
        return this.\u00d600000;
    }

    public final void super(b.t.c.b.b.l.d.c c2) {
        this.\u00d600000 = c2;
    }

    public final l \u00d300000(b$_db b$_db, e e2) {
        return this.\u00f500000.o00000(b$_db, e2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final j \u00d200000(String object, Object object2) {
        Object object3;
        block11: {
            block8: {
                int n2;
                block10: {
                    block9: {
                        if (!f.\u00d300000((CharSequence)"ZBCS", (CharSequence)object, false, 2, null)) break block8;
                        n2 = (Integer)object2;
                        Object object4 = object;
                        switch (((String)object4).hashCode()) {
                            case 66: {
                                if (((String)object4).equals("B")) break;
                                throw new AssertionError(object);
                            }
                            case 67: {
                                if (!((String)object4).equals("C")) {
                                    throw new AssertionError(object);
                                }
                                break block9;
                            }
                            case 83: {
                                if (!((String)object4).equals("S")) {
                                    throw new AssertionError(object);
                                }
                                break block10;
                            }
                            case 90: {
                                if (!((String)object4).equals("Z")) throw new AssertionError(object);
                                object3 = n2 != 0;
                                break block11;
                            }
                        }
                        object3 = (byte)n2;
                        break block11;
                    }
                    object3 = Character.valueOf((char)n2);
                    break block11;
                }
                object3 = (short)n2;
                break block11;
                throw new AssertionError(object);
            }
            object3 = object2;
        }
        object = object3;
        return m.o00000.super(object, this.void);
    }

    protected final j super(j j2) {
        j j3 = j2;
        if (j3 instanceof n) {
            return new w(((Number)((n)j2).o00000()).byteValue());
        }
        if (j3 instanceof b.t.c.b.b.o.c.x) {
            return new c(((Number)((b.t.c.b.b.o.c.x)j2).o00000()).shortValue());
        }
        if (j3 instanceof p) {
            return new ab(((Number)((p)j2).o00000()).intValue());
        }
        if (j3 instanceof b.t.c.b.b.o.c.l) {
            return new v(((Number)((b.t.c.b.b.o.c.l)j2).o00000()).longValue());
        }
        return j2;
    }

    @Override
    protected final j$_b super(d d2, g g2, List list) {
        ib ib2 = this.\u00d200000(d2);
        return new k$_c$1(this, ib2, d2, list, g2);
    }

    private final j super(b.t.c.b.b.d.f f2, Object object) {
        j j2 = m.o00000.super(object, this.void);
        if (j2 == null) {
            j2 = y.\u00d800000.o00000("Unsupported annotation argument: ".concat(String.valueOf(f2)));
        }
        return j2;
    }

    private final ib \u00d200000(d d2) {
        return pc.o00000(this.void, d2, this.\u00f400000);
    }

    public static final /* synthetic */ j super(k k2, b.t.c.b.b.d.f f2, Object object) {
        return k2.super(f2, object);
    }
}

