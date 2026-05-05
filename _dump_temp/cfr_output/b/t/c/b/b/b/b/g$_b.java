/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.o.d.fc;
import b.s.mc;
import b.t.c.b.b.b.b.b$_b;
import b.t.c.b.b.b.b.b$_c;
import b.t.c.b.b.b.b.b$_d;
import b.t.c.b.b.b.b.b$_e;
import b.t.c.b.b.b.b.g;
import b.t.c.b.b.b.d;
import b.t.c.b.b.h.lc;
import b.t.c.b.b.h.oc;
import b.t.c.b.b.h.p;
import b.t.c.b.b.h.zb;
import b.t.c.b.b.m.b.b;
import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.pc;
import b.t.c.b.b.q.r;
import b.t.c.b.b.q.r$_b;
import b.xc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class g$_b
extends p {
    final /* synthetic */ g \u00d3\u00f4o000;

    public g$_b(g g2) {
        this.\u00d3\u00f4o000 = g2;
        super(g.\u00d300000(g2));
    }

    @Override
    public final Collection newif() {
        Object[] objectArray;
        Object object;
        Object object2 = this.\u00d3\u00f4o000.\u00d8\u00d2\u00d2000();
        if (fc.o00000(object2, (Object)b$_b.\u00f800000)) {
            object = mc.o00000(g.ififsuper());
        } else if (fc.o00000(object2, (Object)b$_c.\u00f400000)) {
            b.t.c.b.b.d.d[] dArray = new b.t.c.b.b.d.d[2];
            objectArray = dArray;
            dArray[0] = g.o\u00d3\u00d2000();
            objectArray[1] = new b.t.c.b.b.d.d(d.oO0000, b$_b.\u00f800000.new(this.\u00d3\u00f4o000.\u00d5\u00d2\u00d2000()));
            object = mc.new(objectArray);
        } else if (fc.o00000(object2, (Object)b$_e.if)) {
            object = mc.o00000(g.ififsuper());
        } else if (fc.o00000(object2, (Object)b$_d.\u00f500000)) {
            b.t.c.b.b.d.d[] dArray = new b.t.c.b.b.d.d[2];
            objectArray = dArray;
            dArray[0] = g.o\u00d3\u00d2000();
            objectArray[1] = new b.t.c.b.b.d.d(d.privatesuper, b$_e.if.new(this.\u00d3\u00f4o000.\u00d5\u00d2\u00d2000()));
            object = mc.new(objectArray);
        } else {
            b.o00000(null, 1, null);
            throw new xc();
        }
        objectArray = object;
        object2 = g.new(this.\u00d3\u00f4o000).Stringint();
        objectArray = (Iterable)objectArray;
        Object object3 = objectArray;
        objectArray = new ArrayList(mc.o00000((Iterable)objectArray, 10));
        object3 = object3.iterator();
        while (object3.hasNext()) {
            Object object4 = object3.next();
            object4 = (b.t.c.b.b.d.d)object4;
            Object[] objectArray2 = objectArray;
            ib ib2 = pc.\u00d300000((bc)object2, object4);
            if (ib2 == null) {
                throw new IllegalStateException(("Built-in class " + object4 + " not found").toString());
            }
            object4 = ib2;
            Iterable iterable = mc.\u00f500000(this.\u00f5OO000(), object4.\u00d3OO000().\u00f5OO000().size());
            Object object5 = iterable;
            iterable = new ArrayList(mc.o00000(iterable, 10));
            object5 = object5.iterator();
            while (object5.hasNext()) {
                Object object6 = object5.next();
                object6 = (i)object6;
                Iterable iterable2 = iterable;
                iterable2.add(new lc(object6.nullint()));
            }
            iterable = (List)iterable;
            objectArray2.add(oc.o00000(zb.ifreturnclass.Object(), (ib)object4, (List)iterable));
        }
        return mc.\u00f5O0000((Iterable)((List)objectArray));
    }

    @Override
    public final List \u00f5OO000() {
        return g.o00000(this.\u00d3\u00f4o000);
    }

    public final g \u00f4oO000() {
        return this.\u00d3\u00f4o000;
    }

    @Override
    public final boolean \u00d8OO000() {
        return true;
    }

    public final String toString() {
        return this.\u00f4oO000().toString();
    }

    @Override
    public final r returnif() {
        return r$_b.o00000;
    }
}

