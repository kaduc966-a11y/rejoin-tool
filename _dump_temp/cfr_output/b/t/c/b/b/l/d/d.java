/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.d;

import b.s.mc;
import b.t.c.b.b.l.b$_mb;
import b.t.c.b.b.l.b$_nb;
import java.util.ArrayList;
import java.util.List;

public final class d {
    private final List o00000;

    public d(b$_mb object) {
        List list;
        d d2 = this;
        List list2 = ((b$_mb)object).Ooo000();
        if (((b$_mb)object).\u00f6Oo000()) {
            int n2 = ((b$_mb)object).\u00d3oo000();
            Object object2 = object = (Iterable)((b$_mb)object).Ooo000();
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            int n3 = 0;
            object2 = object2.iterator();
            while (object2.hasNext()) {
                int n4;
                Object object3 = object2.next();
                if ((n4 = n3++) < 0) {
                    mc.\u00d800000();
                }
                object3 = (b$_nb)object3;
                Object object4 = object;
                object4.add(n4 >= n2 ? ((b$_nb)object3).\u00f4O\u00d4000().super(true).supernullnew() : object3);
            }
            list = (List)object;
        } else {
            list = list2;
        }
        d2.o00000 = list;
    }

    public final b$_nb o00000(int n2) {
        return (b$_nb)this.o00000.get(n2);
    }
}

