/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.b;

import b.o.d.fc;
import b.t.c.b.b.d.d;
import b.t.c.b.b.d.f;
import b.t.c.b.b.n.b.k;
import b.t.c.b.b.n.b.k$_b;
import b.t.c.b.b.o.c.bb;
import b.t.c.b.b.o.c.j;
import b.t.c.b.b.o.c.m;
import b.t.c.b.b.q.e.e;
import b.t.c.b.b.q.e.l;
import b.t.c.b.b.q.g;
import b.t.c.b.b.q.ib;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k$_c$1
extends k$_b {
    private final HashMap \u00d4O0000;
    final /* synthetic */ k OO0000;
    final /* synthetic */ ib oO0000;
    final /* synthetic */ d \u00d3O0000;
    final /* synthetic */ List while;
    final /* synthetic */ g \u00d5O0000;

    k$_c$1(k k2, ib ib2, d d2, List list, g g2) {
        this.OO0000 = k2;
        this.oO0000 = ib2;
        this.\u00d3O0000 = d2;
        this.while = list;
        this.\u00d5O0000 = g2;
        super(k2);
        this.\u00d4O0000 = new HashMap();
    }

    @Override
    public final void super(f f2, j j2) {
        if (f2 != null) {
            ((Map)this.\u00d4O0000).put(f2, j2);
        }
    }

    @Override
    public final void super(f object, ArrayList object2) {
        if (object == null) {
            return;
        }
        Object object3 = b.t.c.b.b.n.c.f.e.super((f)object, this.oO0000);
        if (object3 != null) {
            Map map = this.\u00d4O0000;
            object2 = m.o00000.super(b.t.c.b.b.m.e.o00000((ArrayList)object2), object3.forclasssuper());
            map.put(object, object2);
            return;
        }
        if (this.OO0000.super(this.\u00d3O0000) && fc.o00000((Object)((f)object).\u00d400000(), (Object)"value")) {
            object2 = (Iterable)object2;
            object3 = new ArrayList();
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object = object2.next();
                if (!(object instanceof bb)) continue;
                object3.add(object);
            }
            Object object4 = (List)object3;
            object = this.while;
            object3 = object4.iterator();
            while (object3.hasNext()) {
                object2 = object3.next();
                object2 = (bb)object2;
                object4 = object;
                object4.add((l)((j)object2).o00000());
            }
        }
    }

    @Override
    public final void super() {
        if (this.OO0000.super(this.\u00d3O0000, this.\u00d4O0000)) {
            return;
        }
        if (this.OO0000.super(this.\u00d3O0000)) {
            return;
        }
        this.while.add(new e(this.oO0000.nullint(), this.\u00d4O0000, this.\u00d5O0000));
    }
}

