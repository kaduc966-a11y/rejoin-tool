/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.o.e.h;
import b.s.mc;
import b.t.c.b.b.b;
import b.t.c.b.b.f.b.eb;
import b.t.c.b.b.f.b.v$_b;
import b.t.c.b.b.l.b$_b;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_d$_b;
import b.t.c.b.b.l.b$_db;
import b.t.c.b.b.l.b$_f;
import b.t.c.b.b.l.b$_n;
import b.t.c.b.b.l.b$_nb;
import b.t.c.b.b.l.b$_rb;
import b.t.c.b.b.l.b$_z;
import b.t.c.b.b.l.c.b$_i;
import b.t.c.b.b.l.d.c;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.e;
import b.t.c.b.b.l.d.g;
import b.t.c.b.b.l.d.k;
import b.t.c.b.b.l.d.l;
import b.t.c.b.b.n.b.db;
import b.t.c.b.b.n.b.f;
import b.t.c.b.b.n.b.i$_b$0;
import b.t.c.b.b.n.b.i$_b$1;
import b.t.c.b.b.n.b.i$_b$2;
import b.t.c.b.b.n.b.i$_b$3;
import b.t.c.b.b.n.b.i$_c;
import b.t.c.b.b.n.b.i$_d;
import b.t.c.b.b.n.b.i$_e$1;
import b.t.c.b.b.n.b.i$_f;
import b.t.c.b.b.n.b.i$_g;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.j$_b;
import b.t.c.b.b.n.b.t;
import b.t.c.b.b.n.b.x;
import b.t.c.b.b.n.b.y;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.p.v;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class i
implements b.t.c.b.b.f.b.k {
    public static final i$_f \u00d400000 = new i$_f(null);
    private final x Object;

    public i(x x2) {
        this.Object = x2;
    }

    protected final x \u00d200000() {
        return this.Object;
    }

    public abstract c \u00d300000();

    protected abstract i$_d \u00d200000(j var1);

    protected abstract j$_b super(b.t.c.b.b.d.d var1, b.t.c.b.b.q.g var2, List var3);

    @Override
    public abstract Object super(b$_db var1, e var2);

    protected final j$_b \u00d200000(b.t.c.b.b.d.d d2, b.t.c.b.b.q.g g2, List list) {
        if (b.Object.o00000().contains(d2)) {
            return null;
        }
        return this.super(d2, g2, list);
    }

    private final j \u00d200000(v$_b object) {
        db db2 = (object = ((b.t.c.b.b.f.b.v)object).\u00d200000()) instanceof db ? (db)object : null;
        if (db2 != null) {
            return db2.\u00f800000();
        }
        return null;
    }

    protected byte[] super(j j2) {
        return null;
    }

    @Override
    public List super(v$_b object) {
        if (this.super(((v$_b)object).\u00d600000().voidintsuper())) {
            return mc.\u00d500000();
        }
        j j2 = this.\u00d200000((v$_b)object);
        if (j2 == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + ((b.t.c.b.b.f.b.v)object).super()).toString());
        }
        object = j2;
        ArrayList arrayList = new ArrayList(1);
        object.o00000(new i$_e$1(this, arrayList), this.super((j)object));
        return arrayList;
    }

    @Override
    public List super(b.t.c.b.b.f.b.v v2, v object, eb eb2) {
        int n2 = this.super((v)object, eb2);
        if (this.super(n2)) {
            return mc.\u00d500000();
        }
        if (eb2 == eb.o00000) {
            return this.super(v2, (b$_n)object, i$_g.\u00d300000);
        }
        t t2 = i.super(this, (v)object, v2.\u00d400000(), v2.\u00d300000(), eb2, false, 16, null);
        if (t2 == null) {
            return mc.\u00d500000();
        }
        object = t2;
        return i.super(this, v2, (t)object, false, false, null, false, 60, null);
    }

    @Override
    public List \u00d200000(b.t.c.b.b.f.b.v object, b$_n object2) {
        int n2 = ((b$_n)object2).O\u00d3\u00d3000();
        b.t.c.b.b.f.b.v v2 = object;
        object = object2;
        object2 = v2;
        i i2 = this;
        return this.super(n2, new i$_b$0(i2, (b.t.c.b.b.f.b.v)object2, (b$_n)object));
    }

    @Override
    public List super(b.t.c.b.b.f.b.v object, b$_n object2) {
        int n2 = ((b$_n)object2).O\u00d3\u00d3000();
        b.t.c.b.b.f.b.v v2 = object;
        object = object2;
        object2 = v2;
        i i2 = this;
        return this.super(n2, new i$_b$1(i2, (b.t.c.b.b.f.b.v)object2, (b$_n)object));
    }

    private final List super(b.t.c.b.b.f.b.v v2, b$_n object, i$_g i$_g) {
        boolean bl = l.new.\u00d200000(((b$_n)object).O\u00d3\u00d3000());
        boolean bl2 = b.t.c.b.b.l.c.b.e.super((b$_n)object);
        if (i$_g == i$_g.\u00d300000) {
            t t2 = y.o00000((b$_n)object, v2.\u00d400000(), v2.\u00d300000(), false, true, false, 40, null);
            if (t2 == null) {
                return mc.\u00d500000();
            }
            object = t2;
            return i.super(this, v2, (t)object, true, false, bl, bl2, 8, null);
        }
        t t3 = y.o00000((b$_n)object, v2.\u00d400000(), v2.\u00d300000(), true, false, false, 48, null);
        if (t3 == null) {
            return mc.\u00d500000();
        }
        object = t3;
        if (b.q.f.\u00d300000((CharSequence)t3.super(), (CharSequence)"$delegate", false, 2, null) != (i$_g == i$_g.o00000)) {
            return mc.\u00d500000();
        }
        return this.super(v2, (t)object, true, true, bl, bl2);
    }

    @Override
    public List super(b.t.c.b.b.f.b.v v2, b$_rb object) {
        object = t.new.o00000(v2.\u00d400000().new(((b$_rb)object).\u00d6\u00d4\u00d4000()), b.t.c.b.b.l.c.b.i.super(((v$_b)v2).\u00f400000().\u00d300000()));
        return i.super(this, v2, (t)object, false, false, null, false, 60, null);
    }

    private final List super(b.t.c.b.b.f.b.v object, t t2, boolean bl, boolean bl2, Boolean bl3, boolean bl4) {
        j j2 = this.super((b.t.c.b.b.f.b.v)object, \u00d400000.super((b.t.c.b.b.f.b.v)object, bl, bl2, bl3, bl4, this.Object, this.\u00d300000()));
        if (j2 == null) {
            return mc.\u00d500000();
        }
        object = j2;
        List list = (List)this.\u00d200000((j)object).o00000().get(t2);
        if (list == null) {
            list = mc.\u00d500000();
        }
        return list;
    }

    static /* synthetic */ List super(i i2, b.t.c.b.b.f.b.v v2, t t2, boolean bl, boolean bl2, Boolean bl3, boolean bl4, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
        }
        if ((n2 & 4) != 0) {
            bl = false;
        }
        if ((n2 & 8) != 0) {
            bl2 = false;
        }
        if ((n2 & 0x10) != 0) {
            bl3 = null;
        }
        if ((n2 & 0x20) != 0) {
            bl4 = false;
        }
        return i2.super(v2, t2, bl, bl2, bl3, bl4);
    }

    @Override
    public List \u00d200000(b.t.c.b.b.f.b.v v2, v object, eb object2, int n2, b$_c object3) {
        int n3 = ((b$_c)object3).\u00d6\u00f4o000();
        v v3 = object;
        int n4 = n2;
        object = object2;
        object2 = v3;
        b.t.c.b.b.f.b.v v4 = v2;
        object3 = this;
        return this.super(n3, new i$_b$2((i)object3, v4, (v)object2, (eb)((Object)object), n4));
    }

    private final int super(b.t.c.b.b.f.b.v v2, v v3) {
        int n2;
        int n3 = this.super(v3);
        v v4 = v3;
        if (v4 instanceof b$_z) {
            n2 = k.o00000((b$_z)v3) ? 1 : 0;
        } else if (v4 instanceof b$_n) {
            n2 = k.o00000((b$_n)v3) ? 1 : 0;
        } else if (v4 instanceof b$_f) {
            n2 = ((v$_b)v2).\u00d800000() == b$_d$_b.\u00d3O0000 ? 2 : (((v$_b)v2).class() ? 1 : 0);
        } else {
            throw new UnsupportedOperationException("Unsupported message: " + v3.getClass());
        }
        return n3 + n2;
    }

    @Override
    public List \u00d200000(b.t.c.b.b.f.b.v v2, v v3, eb eb2) {
        return this.super(v2, v3, eb2, this.super(v3));
    }

    @Override
    public List super(b.t.c.b.b.f.b.v v2, v object, eb object2, int n2, b$_c object3) {
        b$_c b$_c = object3;
        v v3 = object;
        int n3 = n2;
        object = object2;
        object2 = v3;
        b.t.c.b.b.f.b.v v4 = v2;
        object3 = this;
        return this.super(b$_c != null ? b$_c.\u00d6\u00f4o000() : 0, new i$_b$3((i)object3, v4, (v)object2, (eb)((Object)object), n3));
    }

    private final List super(b.t.c.b.b.f.b.v v2, v object, eb eb2, int n2) {
        t t2 = i.super(this, (v)object, v2.\u00d400000(), v2.\u00d300000(), eb2, false, 16, null);
        if (t2 == null) {
            return mc.\u00d500000();
        }
        object = t2;
        object = t.new.o00000((t)object, n2);
        return i.super(this, v2, (t)object, false, false, null, false, 60, null);
    }

    private final int super(v v2) {
        v v3 = v2;
        if (v3 instanceof b$_z) {
            return ((b$_z)v2).\u00d3\u00f6\u00d3000();
        }
        if (v3 instanceof b$_n) {
            return ((b$_n)v2).\u00f8\u00d3\u00d3000();
        }
        return 0;
    }

    private final int super(v v2, eb eb2) {
        v v3 = v2;
        if (v3 instanceof b$_f) {
            return ((b$_f)v2).\u00d6\u00d8\u00d2000();
        }
        if (v3 instanceof b$_z) {
            return ((b$_z)v2).\u00d6\u00f5\u00d3000();
        }
        if (v3 instanceof b$_n) {
            return this.super((b$_n)v2, eb2);
        }
        return 0;
    }

    private final int super(b$_n b$_n, eb eb2) {
        switch (i$_c.o00000[eb2.ordinal()]) {
            case 1: {
                if (b$_n.\u00d2\u00d4\u00d3000()) {
                    return b$_n.\u00f8\u00d4\u00d3000();
                }
                return b$_n.O\u00d3\u00d3000();
            }
            case 2: {
                if (b$_n.\u00f4\u00d3\u00d3000()) {
                    return b$_n.\u00d3\u00d4\u00d3000();
                }
                return b$_n.O\u00d3\u00d3000();
            }
        }
        return b$_n.O\u00d3\u00d3000();
    }

    private final List super(int n2, h h2) {
        if (this.super(n2)) {
            return mc.\u00d500000();
        }
        return (List)h2.newreturn();
    }

    private final boolean super(int n2) {
        return l.return.\u00d200000(n2) == false;
    }

    @Override
    public List super(b$_nb object, e e2) {
        Object object2 = object = (Iterable)((b$_nb)object).\u00f4o\u00d4000();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (b$_db)object3;
            Object object4 = object;
            object4.add(this.super((b$_db)object3, e2));
        }
        return (List)object;
    }

    @Override
    public List super(b$_b object, e e2) {
        Object object2 = object = (Iterable)((b$_b)object).\u00d2\u00d5\u00d4000();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (b$_db)object3;
            Object object4 = object;
            object4.add(this.super((b$_db)object3, e2));
        }
        return (List)object;
    }

    protected final j super(b.t.c.b.b.f.b.v v2, j j2) {
        j j3 = j2;
        if (j3 == null) {
            if (v2 instanceof v$_b) {
                return this.\u00d200000((v$_b)v2);
            }
            j3 = null;
        }
        return j3;
    }

    protected final t super(v v2, e e2, d d2, eb eb2, boolean bl) {
        v v3 = v2;
        if (v3 instanceof b$_f) {
            b.t.c.b.b.l.c.b.d$_c d$_c = b.t.c.b.b.l.c.b.e.\u00d200000.super((b$_f)v2, e2, d2);
            if (d$_c == null) {
                return null;
            }
            return t.new.o00000(d$_c);
        }
        if (v3 instanceof b$_z) {
            b.t.c.b.b.l.c.b.d$_c d$_c = b.t.c.b.b.l.c.b.e.\u00d200000.super((b$_z)v2, e2, d2);
            if (d$_c == null) {
                return null;
            }
            return t.new.o00000(d$_c);
        }
        if (v3 instanceof b$_n) {
            b$_i b$_i = (b$_i)g.super((d$_c)v2, b.t.c.b.b.l.c.b.o00000);
            if (b$_i == null) {
                return null;
            }
            v3 = b$_i;
            switch (i$_c.o00000[eb2.ordinal()]) {
                case 1: {
                    if (((b$_i)v3).\u00d6\u00d60000()) {
                        return t.new.o00000(e2, ((b$_i)v3).\u00d4\u00d60000());
                    }
                    return null;
                }
                case 2: {
                    if (((b$_i)v3).\u00d2\u00d60000()) {
                        return t.new.o00000(e2, ((b$_i)v3).\u00f4\u00d50000());
                    }
                    return null;
                }
                case 3: {
                    return y.o00000((b$_n)v2, e2, d2, true, true, bl);
                }
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ t super(i i2, v v2, e e2, d d2, eb eb2, boolean bl, int n2, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((n2 & 0x10) != 0) {
            bl = false;
        }
        return i2.super(v2, e2, d2, eb2, bl);
    }

    protected final boolean super(b.t.c.b.b.d.d object) {
        if (((b.t.c.b.b.d.d)object).\u00d500000() == null || !fc.o00000((Object)((b.t.c.b.b.d.d)object).o00000().\u00d400000(), (Object)"Container")) {
            return false;
        }
        return (object = f.o00000(this.Object, (b.t.c.b.b.d.d)object, this.\u00d300000())) != null && b.Object.o00000((j)object);
    }

    private static final List \u00d300000(i i2, b.t.c.b.b.f.b.v v2, b$_n b$_n) {
        return i2.super(v2, b$_n, i$_g.\u00d500000);
    }

    private static final List \u00d200000(i i2, b.t.c.b.b.f.b.v v2, b$_n b$_n) {
        return i2.super(v2, b$_n, i$_g.o00000);
    }

    private static final List \u00d300000(i i2, b.t.c.b.b.f.b.v v2, v v3, eb eb2, int n2) {
        return i2.super(v2, v3, eb2, n2 + i2.super(v2, v3));
    }

    private static final List \u00d400000(i i2, b.t.c.b.b.f.b.v v2, v v3, eb eb2, int n2) {
        return i2.super(v2, v3, eb2, n2);
    }

    static /* synthetic */ List \u00d400000(i i2, b.t.c.b.b.f.b.v v2, b$_n b$_n) {
        return i.\u00d300000(i2, v2, b$_n);
    }

    static /* synthetic */ List super(i i2, b.t.c.b.b.f.b.v v2, b$_n b$_n) {
        return i.\u00d200000(i2, v2, b$_n);
    }

    static /* synthetic */ List \u00d200000(i i2, b.t.c.b.b.f.b.v v2, v v3, eb eb2, int n2) {
        return i.\u00d300000(i2, v2, v3, eb2, n2);
    }

    static /* synthetic */ List super(i i2, b.t.c.b.b.f.b.v v2, v v3, eb eb2, int n2) {
        return i.\u00d400000(i2, v2, v3, eb2, n2);
    }
}

