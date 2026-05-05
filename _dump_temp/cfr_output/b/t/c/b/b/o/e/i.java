/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o.e;

import b.m;
import b.o.d.fc;
import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.i.k;
import b.t.c.b.b.j.b.e;
import b.t.c.b.b.o.d;
import b.t.c.b.b.o.e.i$_b$0;
import b.t.c.b.b.o.e.i$_b$1;
import b.t.c.b.b.o.e.j;
import b.t.c.b.b.o.e.l;
import b.t.c.b.b.q.ec;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pb;
import b.t.c.b.b.q.qb;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class i
extends l {
    static final /* synthetic */ b.t.m[] intObject;
    private final ib \u00d2\u00d40000;
    private final boolean classObject;
    private final b.t.c.b.b.i.f O\u00d40000;
    private final b.t.c.b.b.i.f o\u00d40000;

    public i(b.t.c.b.b.i.l object, ib ib2, boolean bl) {
        boolean bl2;
        this.\u00d2\u00d40000 = ib2;
        this.classObject = bl;
        boolean bl3 = bl2 = this.\u00d2\u00d40000.privateintsuper() == ec.\u00f400000;
        if (m.new && !bl2) {
            object = "Class should be an enum: " + this.\u00d2\u00d40000;
            throw new AssertionError(object);
        }
        i i2 = this;
        this.O\u00d40000 = object.o00000(new i$_b$0(i2));
        i2 = this;
        this.o\u00d40000 = object.o00000(new i$_b$1(i2));
    }

    public final Void int(f f2, e e2) {
        return null;
    }

    private final List \u00d4\u00d20000() {
        return (List)k.o00000(this.O\u00d40000, (Object)this, intObject[0]);
    }

    private final List \u00d3\u00d20000() {
        return (List)k.o00000(this.o\u00d40000, (Object)this, intObject[1]);
    }

    public final List \u00f400000(j j2, g g2) {
        return mc.return((Collection)this.\u00d4\u00d20000(), (Iterable)this.\u00d3\u00d20000());
    }

    public final b.t.c.b.b.m.d \u00f600000(f f2, e iterator) {
        iterator = this.\u00d4\u00d20000();
        Collection collection = new b.t.c.b.b.m.d();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!fc.o00000((Object)((qb)t2).\u00d5\u00f80000(), (Object)f2)) continue;
            collection.add(t2);
        }
        return (b.t.c.b.b.m.d)collection;
    }

    @Override
    public final Collection \u00d400000(f f2, e iterator) {
        iterator = this.\u00d3\u00d20000();
        Collection collection = new b.t.c.b.b.m.d();
        iterator = iterator.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            if (!fc.o00000((Object)((pb)t2).\u00d5\u00f80000(), (Object)f2)) continue;
            collection.add(t2);
        }
        return collection;
    }

    private static final List \u00d400000(i i2) {
        Object[] objectArray = new qb[2];
        Object[] objectArray2 = objectArray;
        objectArray[0] = d.\u00d300000(i2.\u00d2\u00d40000);
        objectArray2[1] = d.o00000(i2.\u00d2\u00d40000);
        return mc.new(objectArray2);
    }

    private static final List \u00d200000(i i2) {
        if (i2.classObject) {
            return mc.new((Object)d.\u00d200000(i2.\u00d2\u00d40000));
        }
        return mc.\u00d500000();
    }

    static {
        b.t.m[] mArray = new b.t.m[2];
        b.t.m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(i.class, "functions", "getFunctions()Ljava/util/List;", 0);
        mArray2[1] = new b.o.d.ib(i.class, "properties", "getProperties()Ljava/util/List;", 0);
        intObject = mArray2;
    }

    static /* synthetic */ List super(i i2) {
        return i.\u00d400000(i2);
    }

    static /* synthetic */ List \u00d300000(i i2) {
        return i.\u00d200000(i2);
    }
}

