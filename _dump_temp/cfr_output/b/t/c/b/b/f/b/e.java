/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.f.b;

import b.o.e.g;
import b.s.mc;
import b.t.c.b.b.d.f;
import b.t.c.b.b.f.b.y;
import b.t.c.b.b.h.c.j;
import b.t.c.b.b.l.b$_c;
import b.t.c.b.b.l.b$_d;
import b.t.c.b.b.l.b$_f;
import b.t.c.b.b.l.d.d;
import b.t.c.b.b.l.d.k;
import b.t.c.b.b.l.d.l;
import b.t.c.b.b.p.d$_c;
import b.t.c.b.b.q.hb;
import b.t.c.b.b.q.o;
import b.t.c.b.b.q.xb;
import b.yc;
import java.util.ArrayList;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final o super(b$_d object, boolean bl, b.t.c.b.b.l.d.e e2, d d2, g g2, g object2) {
        if (((b$_d)object).\u00d2O\u00d2000()) {
            Object object3 = y.\u00d200000(e2, ((b$_d)object).\u00f8O\u00d2000());
            Object object4 = k.o00000((b$_d)object, d2);
            if ((object4 == null || (object4 = (j)g2.\u00f800000(object4)) == null) && (object4 = (j)object2.\u00f800000(object3)) == null) {
                object3 = "cannot determine underlying type for value class " + y.\u00d200000(e2, ((b$_d)object).\u00d6o\u00d2000()) + " with property " + object3;
                throw new IllegalStateException(object3.toString());
            }
            object = object4;
            return new xb((f)object3, (j)object);
        }
        if (bl && l.\u00d5O0000.\u00d200000(((b$_d)object).voidintsuper()).booleanValue()) {
            Object object5;
            d$_c d$_c;
            Object t2;
            block7: {
                object = ((b$_d)object).\u00d4\u00d3\u00d2000();
                object2 = null;
                bl = false;
                object = object.iterator();
                while (object.hasNext()) {
                    t2 = object.next();
                    d$_c = (b$_f)t2;
                    if (!(l.Stringsuper.\u00d200000(((b$_f)d$_c).\u00d6\u00d8\u00d2000()) == false)) continue;
                    if (bl) {
                        object5 = null;
                        break block7;
                    }
                    object2 = t2;
                    bl = true;
                }
                object5 = !bl ? null : object2;
            }
            b$_f b$_f = (b$_f)object5;
            if (b$_f == null) {
                return null;
            }
            Object object6 = object = (Iterable)b$_f.floatdosuper();
            object2 = new ArrayList(mc.o00000((Iterable)object, 10));
            object = object6.iterator();
            while (object.hasNext()) {
                t2 = object.next();
                d$_c = (b$_c)t2;
                object6 = object2;
                object6.add(yc.o00000(y.\u00d200000(e2, ((b$_c)d$_c).\u00d2\u00f5o000()), g2.\u00f800000(k.\u00d200000((b$_c)d$_c, d2))));
            }
            object = (List)object2;
            return new hb((List)object);
        }
        return null;
    }
}

