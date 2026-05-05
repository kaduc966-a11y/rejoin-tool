/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.o.e.g;
import b.s.mc;
import b.s.tb;
import b.t.c.b.b.m.c;
import b.t.c.b.b.o.i;
import b.t.c.b.b.o.j$_b$1;
import b.t.c.b.b.q.b;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class j {
    public static final Collection o00000(Collection linkedList, g g2) {
        if (linkedList.size() <= 1) {
            return linkedList;
        }
        linkedList = new LinkedList(linkedList);
        c c2 = c.\u00d8\u00d3\u00f5000.o00000();
        while (!((Collection)linkedList).isEmpty()) {
            Iterator iterator = mc.Oo0000(linkedList);
            c c3 = c.\u00d8\u00d3\u00f5000.o00000();
            Iterator iterator2 = iterator;
            iterator = c3;
            if ((iterator = i.o00000(iterator2, linkedList, g2, new j$_b$1((c)((Object)iterator)))).size() == 1 && c3.isEmpty()) {
                ((tb)c2).add(mc.thisObject((Iterable)((Object)iterator)));
                continue;
            }
            Object object = i.o00000((Collection)((Object)iterator), g2);
            b b2 = (b)g2.\u00f800000(object);
            iterator = (Iterable)((Object)iterator);
            Collection collection = c3;
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                Object t3 = t2;
                if (i.o00000(b2, (b)g2.\u00f800000(t3))) continue;
                collection.add(t2);
            }
            if (!((Collection)c3).isEmpty()) {
                c2.addAll(c3);
            }
            ((tb)c2).add(object);
        }
        return c2;
    }

    private static final b.i new(c c2, Object object) {
        ((tb)c2).add(object);
        return b.i.o00000;
    }

    static /* synthetic */ b.i o00000(c c2, Object object) {
        return j.new(c2, object);
    }
}

