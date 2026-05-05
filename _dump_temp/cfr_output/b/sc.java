/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.j;
import b.o.d.rb;
import b.o.e.e;
import b.pc;
import b.pd;
import b.r.b;
import b.r.d.b.o;
import b.r.d.b.q;
import b.r.i;
import b.r.l;
import b.sc$_b$_b$_b$1;
import b.vc;
import b.xd;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class sc
extends pd
implements b {
    private e \u00f8\u00f8\u00f4000;
    private Object O0\u00f5000;
    private b ifwhileString;
    private Object \u00f5\u00f8\u00f4000;

    public sc(e e2, Object object) {
        super(null);
        this.\u00f8\u00f8\u00f4000 = e2;
        this.O0\u00f5000 = object;
        this.ifwhileString = this;
        this.\u00f5\u00f8\u00f4000 = j.o00000();
    }

    @Override
    public final l O\u00d80000() {
        return i.o00000;
    }

    @Override
    public final void return(Object object) {
        this.ifwhileString = null;
        this.\u00f5\u00f8\u00f4000 = object;
    }

    @Override
    public final Object \u00d300000(Object object, b b2) {
        b b3;
        this.ifwhileString = b3 = b2;
        this.O0\u00f5000 = object;
        Object object2 = b.r.c.b.\u00d200000();
        if (object2 == b.r.c.b.\u00d200000()) {
            q.\u00d200000(b2);
        }
        return object2;
    }

    @Override
    public final Object o00000(vc object, Object object2, b b2) {
        b b3 = b2;
        object = ((vc)object).super();
        sc sc2 = this;
        e e2 = sc2.\u00f8\u00f8\u00f4000;
        if (object != e2) {
            sc2.\u00f8\u00f8\u00f4000 = object;
            sc2.ifwhileString = sc2.o00000(e2, b3);
        } else {
            sc2.ifwhileString = b3;
        }
        sc2.O0\u00f5000 = object2;
        Object object3 = b.r.c.b.\u00d200000();
        if (object3 == b.r.c.b.\u00d200000()) {
            q.\u00d200000(b2);
        }
        return object3;
    }

    private final b o00000(e e2, b b2) {
        l l2 = i.o00000;
        return new sc$_b$_b$_b$1(l2, this, e2, b2);
    }

    public final Object \u00f8\u00f5\u00d2000() {
        while (true) {
            b b2;
            Object object;
            Object object2 = this.\u00f5\u00f8\u00f4000;
            if (this.ifwhileString == null) {
                object = object2;
                pc.o00000(object);
                return object;
            }
            if (xd.o00000(j.o00000(), object2)) {
                try {
                    object = this.\u00f8\u00f8\u00f4000;
                    object2 = this.O0\u00f5000;
                    object = !(object instanceof o) ? b.r.c.b.\u00d200000((e)object, this, object2, b2) : ((e)rb.o00000(object, 3)).o00000(this, object2, b2);
                }
                catch (Throwable throwable) {
                    b2.return(xd.String(pc.o00000(throwable)));
                    continue;
                }
                object2 = object;
                if (object2 == b.r.c.b.\u00d200000()) continue;
                b2.return(xd.String(object2));
                continue;
            }
            this.\u00f5\u00f8\u00f4000 = j.o00000();
            b2.return(object2);
        }
    }

    public static final /* synthetic */ void o00000(sc sc2, e e2) {
        sc2.\u00f8\u00f8\u00f4000 = e2;
    }

    public static final /* synthetic */ void o00000(sc sc2, b b2) {
        sc2.ifwhileString = b2;
    }

    public static final /* synthetic */ void o00000(sc sc2, Object object) {
        sc2.\u00f5\u00f8\u00f4000 = object;
    }
}

