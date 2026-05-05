/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.d.c;

import b.e.bb;
import b.g.c;
import b.s.mc;
import b.s.y;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.c.b.b;
import b.t.c.b.b.n.c.b.h;
import b.t.c.b.b.n.c.b.i;
import b.t.c.b.b.n.c.b.t;
import b.t.c.b.b.n.c.b.w;
import b.t.c.b.b.n.c.d.c.g$_b$0;
import b.t.c.b.b.n.c.d.c.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class g
implements m {
    private final b \u00d800000;
    private final b.o.e.g \u00d400000;
    private final b.o.e.g return;
    private final Map \u00d300000;
    private final Map new;
    private final Map \u00d500000;

    public g(b object, b.o.e.g object2) {
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        this.\u00d800000 = object;
        this.\u00d400000 = object2;
        object = this;
        this.return = new g$_b$0((g)object);
        g g2 = this;
        object = c.nullnew(mc.\u00d5o0000(g2.\u00d800000.\u00f8O0000()), this.return);
        g g3 = g2;
        object2 = object;
        object = new LinkedHashMap();
        object2 = object2.o00000();
        while (object2.hasNext()) {
            object6 = object;
            object5 = object2.next();
            object4 = ((b.t.c.b.b.n.c.b.y)object5).oO0000();
            object3 = object6.get(object4);
            if (object3 == null) {
                object3 = new ArrayList();
                object6.put(object4, object3);
            }
            ((List)object3).add(object5);
        }
        g3.\u00d300000 = object;
        g g4 = this;
        object = c.nullnew(mc.\u00d5o0000(g4.\u00d800000.forsuper()), this.\u00d400000);
        g3 = g4;
        object2 = object;
        object = new LinkedHashMap();
        object2 = object2.o00000();
        while (object2.hasNext()) {
            object5 = object2.next();
            object6 = (t)object5;
            object3 = object;
            object3.put((f)object6.oO0000(), object5);
        }
        g3.new = object;
        g g5 = this;
        object = g5.\u00d800000.oo0000();
        object2 = this.\u00d400000;
        g3 = g5;
        object4 = new ArrayList();
        object5 = object.iterator();
        while (object5.hasNext()) {
            object6 = object5.next();
            if (!((Boolean)object2.\u00f800000(object6)).booleanValue()) continue;
            object4.add(object6);
        }
        object = (List)object4;
        int n2 = bb.\u00d200000(y.\u00d200000(mc.o00000((Iterable)object, 10)), 16);
        object4 = new LinkedHashMap(n2);
        object5 = object.iterator();
        while (object5.hasNext()) {
            object6 = object5.next();
            object = (h)object6;
            object3 = object4;
            object3.put(object.oO0000(), object6);
        }
        g3.\u00d500000 = object4;
    }

    @Override
    public Collection \u00d200000(f f2) {
        List list = (List)this.\u00d300000.get(f2);
        if (list != null) {
            return list;
        }
        return mc.\u00d500000();
    }

    @Override
    public Set \u00d200000() {
        Object object = c.nullnew(mc.\u00d5o0000(this.\u00d800000.\u00f8O0000()), this.return);
        Collection collection = new LinkedHashSet();
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (b.t.c.b.b.n.c.b.y)object2;
            Collection collection2 = collection;
            collection2.add(object2.oO0000());
        }
        return (Set)collection;
    }

    @Override
    public t o00000(f f2) {
        return (t)this.new.get(f2);
    }

    @Override
    public Set o00000() {
        Object object = c.nullnew(mc.\u00d5o0000(this.\u00d800000.forsuper()), this.\u00d400000);
        Collection collection = new LinkedHashSet();
        object = object.o00000();
        while (object.hasNext()) {
            Object object2 = object.next();
            object2 = (t)object2;
            Collection collection2 = collection;
            collection2.add(object2.oO0000());
        }
        return (Set)collection;
    }

    @Override
    public Set \u00d300000() {
        return this.\u00d500000.keySet();
    }

    @Override
    public h \u00d300000(f f2) {
        return (h)this.\u00d500000.get(f2);
    }

    private static final boolean \u00d200000(g g2, b.t.c.b.b.n.c.b.y y2) {
        return (Boolean)g2.\u00d400000.\u00f800000(y2) != false && !i.o00000((w)y2);
    }

    static /* synthetic */ boolean o00000(g g2, b.t.c.b.b.n.c.b.y y2) {
        return g.\u00d200000(g2, y2);
    }
}

