/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.n.c.g;

import b.o.d.w;
import b.s.mc;
import b.t.c.b.b.n.c.g.b;
import b.t.c.b.b.o.o;
import java.util.ArrayList;
import java.util.List;

public final class g {
    private final b o00000;
    private final List \u00d300000;
    private final String \u00d200000;
    private final o \u00d500000;
    private final g String;

    public g(b object, List object2, String object3, o object4) {
        g g2;
        Object object5;
        this.o00000 = object;
        this.\u00d300000 = object2;
        this.\u00d200000 = object3;
        this.\u00d500000 = object4;
        if ((object5 = this).\u00d200000 != null) {
            Object object6;
            b b2 = this.o00000;
            object = this.\u00d300000;
            b b3 = b2 != null ? b2.o00000() : null;
            object4 = object5;
            object2 = object;
            object = new ArrayList(mc.o00000((Iterable)object, 10));
            object2 = object2.iterator();
            while (object2.hasNext()) {
                object3 = object2.next();
                object3 = (b)object3;
                object6 = object;
                Object object7 = object3;
                object6.add(object7 != null ? ((b)object7).o00000() : null);
            }
            object6 = (List)object;
            object5 = object4;
            object = object6;
            object2 = b3;
            g2 = new g((b)object2, (List)object, null, null, 8, null);
        } else {
            g2 = null;
        }
        object5.String = g2;
    }

    public /* synthetic */ g(b b2, List list, String string, o o2, int n2, w w2) {
        if ((n2 & 1) != 0) {
            b2 = null;
        }
        if ((n2 & 2) != 0) {
            list = mc.\u00d500000();
        }
        if ((n2 & 4) != 0) {
            string = null;
        }
        if ((n2 & 8) != 0) {
            o2 = null;
        }
        this(b2, list, string, o2);
    }

    public final b Object() {
        return this.o00000;
    }

    public final List \u00d200000() {
        return this.\u00d300000;
    }

    public final String \u00d400000() {
        return this.\u00d200000;
    }

    public final g o00000() {
        return this.String;
    }

    public g() {
        this(null, null, null, null, 15, null);
    }
}

