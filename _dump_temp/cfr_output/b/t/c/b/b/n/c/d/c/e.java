/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.qb;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.d.d;
import b.t.c.b.b.i.k;
import b.t.c.b.b.l.d.c;
import b.t.c.b.b.n.b.f;
import b.t.c.b.b.n.b.j;
import b.t.c.b.b.n.b.w;
import b.t.c.b.b.n.c.d.c.e$_b$0;
import b.t.c.b.b.n.c.d.c.e$_b$1;
import b.t.c.b.b.n.c.d.c.e$_b$2;
import b.t.c.b.b.n.c.d.c.e$_c;
import b.t.c.b.b.n.c.d.c.i;
import b.t.c.b.b.n.c.d.l;
import b.t.c.b.b.o.h.b;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.ib;
import b.t.m;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e
extends b.t.c.b.b.q.b.o {
    static final /* synthetic */ m[] o\u00d2\u00d8000;
    private final b.t.c.b.b.n.c.b.f nullinterfaceObject;
    private final b.t.c.b.b.n.c.d.i forinterfaceObject;
    private final c \u00d5\u00d2\u00d8000;
    private final b.t.c.b.b.i.f O\u00d2\u00d8000;
    private final i \u00f4\u00d2\u00d8000;
    private final b.t.c.b.b.i.f \u00d3\u00d2\u00d8000;
    private final o \u00d4\u00d2\u00d8000;
    private final b.t.c.b.b.i.f \u00d8\u00d2\u00d8000;

    public e(b.t.c.b.b.n.c.d.i object, b.t.c.b.b.n.c.b.f f2) {
        super(((b.t.c.b.b.n.c.d.i)object).\u00d300000(), f2.StringObject());
        this.nullinterfaceObject = f2;
        this.forinterfaceObject = b.t.c.b.b.n.c.d.e.o00000((b.t.c.b.b.n.c.d.i)object, this, null, 0, 6, null);
        this.\u00d5\u00d2\u00d8000 = ((b.t.c.b.b.n.c.d.i)object).\u00d500000().supersuper().\u00d400000().\u00d300000().\u00d500000();
        object = this;
        this.O\u00d2\u00d8000 = this.forinterfaceObject.return().o00000(new e$_b$0((e)object));
        this.\u00f4\u00d2\u00d8000 = new i(this.forinterfaceObject, this.nullinterfaceObject, this);
        object = this;
        this.\u00d3\u00d2\u00d8000 = this.forinterfaceObject.return().o00000(new e$_b$1((e)object), mc.\u00d500000());
        this.\u00d4\u00d2\u00d8000 = this.forinterfaceObject.\u00d500000().OO0000().\u00d200000() ? o.\u00d8o\u00f6000.o00000() : l.o00000(this.forinterfaceObject, this.nullinterfaceObject);
        object = this;
        this.\u00d8\u00d2\u00d8000 = this.forinterfaceObject.return().o00000(new e$_b$2((e)object));
    }

    public final Map \u00f8\u00d4\u00d2000() {
        return (Map)k.o00000(this.O\u00d2\u00d8000, (Object)this, o\u00d2\u00d8000[0]);
    }

    @Override
    public final o \u00d4\u00f80000() {
        return this.\u00d4\u00d2\u00d8000;
    }

    public final List O\u00d5\u00d2000() {
        return (List)this.\u00d3\u00d2\u00d8000.newreturn();
    }

    public final ib o00000(b.t.c.b.b.n.c.b.b b2) {
        return this.\u00f4\u00d2\u00d8000.\u00d600000().super(b2);
    }

    public final i o\u00d5\u00d2000() {
        return this.\u00f4\u00d2\u00d8000;
    }

    @Override
    public final String toString() {
        return "Lazy Java package fragment: " + this.OOO000() + " of module " + this.forinterfaceObject.\u00d500000().Object();
    }

    @Override
    public final g \u00f4\u00f80000() {
        return new w(this);
    }

    private static final Map \u00d300000(e e2) {
        Object object = e2.forinterfaceObject.\u00d500000().\u00f600000().o00000(e2.OOO000().super());
        Collection collection = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            qb qb2;
            Object object2 = (String)object.next();
            Object object3 = d.String.o00000(b.o00000((String)object2).o00000());
            j j2 = f.o00000(e2.forinterfaceObject.\u00d500000().\u00f5O0000(), (d)object3, e2.\u00d5\u00d2\u00d8000);
            if (j2 != null) {
                object3 = j2;
                qb2 = yc.o00000(object2, object3);
            } else {
                qb2 = null;
            }
            if (qb2 == null) continue;
            object2 = qb2;
            collection.add(object2);
        }
        return y.o00000((List)collection);
    }

    private static final List new(e object) {
        Object object2 = object = (Iterable)((e)object).nullinterfaceObject.\u00f5\u00d30000();
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (b.t.c.b.b.n.c.b.f)object3;
            Object object4 = object;
            object4.add(object3.StringObject());
        }
        return (List)object;
    }

    private static final HashMap return(e object) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((e)((Object)object)).\u00f8\u00d4\u00d2000().entrySet()) {
            Object object2 = (String)entry.getKey();
            j j2 = (j)entry.getValue();
            object2 = b.o00000((String)object2);
            b.t.c.b.b.n.b.b.c c2 = j2.\u00d200000();
            switch (e$_c.super[c2.\u00d600000().ordinal()]) {
                case 1: {
                    Map map = hashMap;
                    String string = c2.\u00d300000();
                    if (string == null) break;
                    b b2 = b.o00000(string);
                    map.put(object2, b2);
                    break;
                }
                case 2: {
                    Object object3 = object2;
                    ((Map)hashMap).put(object3, object3);
                }
            }
        }
        return hashMap;
    }

    static {
        m[] mArray = new m[2];
        m[] mArray2 = mArray;
        mArray[0] = new b.o.d.ib(e.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        mArray2[1] = new b.o.d.ib(e.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0);
        o\u00d2\u00d8000 = mArray2;
    }

    static /* synthetic */ Map o00000(e e2) {
        return e.\u00d300000(e2);
    }

    static /* synthetic */ List \u00d400000(e e2) {
        return e.new(e2);
    }

    static /* synthetic */ HashMap \u00d500000(e e2) {
        return e.return(e2);
    }
}

