/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.b.b;

import b.o.d.fc;
import b.o.d.w;
import b.s.l;
import b.t.c.b.b.b.b.d;
import b.t.c.b.b.b.b.g;
import b.t.c.b.b.d.f;
import b.t.c.b.b.q.ab;
import b.t.c.b.b.q.b.ib;
import b.t.c.b.b.q.e.o;
import b.t.c.b.b.q.eb;
import b.t.c.b.b.q.hc$_b;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.mc;
import b.t.c.b.b.q.wb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class d$_b {
    private d$_b() {
    }

    public final d super(g object, boolean bl) {
        Object object2;
        List list = ((g)object).\u00d8\u00d6o000();
        d d2 = new d((wb)object, null, hc$_b.\u00d400000, bl, null);
        mc mc2 = ((b.t.c.b.b.q.b.w)object).\u00f5o\u00d2000();
        object = list;
        List list2 = b.s.mc.\u00d500000();
        List list3 = b.s.mc.\u00d500000();
        mc mc3 = mc2;
        d d3 = d2;
        Object object3 = new ArrayList<List>();
        object = object.iterator();
        while (object.hasNext() && ((i)(object2 = object.next())).\u00d4\u00d5o000() == b.t.c.b.b.h.w.o00000) {
            ((ArrayList)object3).add(object2);
        }
        object2 = (List)object3;
        object3 = object = b.s.mc.O\u00d20000((Iterable)object2);
        object = new ArrayList(b.s.mc.o00000((Iterable)object, 10));
        Iterator iterator = object3.iterator();
        while (iterator.hasNext()) {
            object3 = iterator.next();
            object3 = (l)object3;
            object2 = object;
            object2.add(d.\u00f4o\u00d6000.super(d2, ((l)object3).o00000(), (i)((l)object3).String()));
        }
        object2 = (List)object;
        d3.new(null, mc3, list3, list2, (List)object2, ((i)b.s.mc.thissuper(list)).nullint(), ab.\u00d400000, eb.\u00d200000);
        d2.\u00d5O0000(true);
        return d2;
    }

    private final jc super(d d2, int n2, i i2) {
        String string = i2.\u00d5\u00f80000().\u00d400000();
        string = fc.o00000((Object)string, (Object)"T") ? "instance" : (fc.o00000((Object)string, (Object)"E") ? "receiver" : string.toLowerCase(Locale.ROOT));
        return new ib(d2, null, n2, o.\u00d8o\u00f6000.o00000(), f.\u00d300000(string), i2.nullint(), false, false, false, null, b.t.c.b.b.q.g.o00000);
    }

    public /* synthetic */ d$_b(w w2) {
        this();
    }
}

