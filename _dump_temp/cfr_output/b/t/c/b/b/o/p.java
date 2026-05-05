/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.o;

import b.t.c.b.b.d.f;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.k.b;
import b.t.c.b.b.o.n;
import b.t.c.b.b.o.p$1;
import b.t.c.b.b.o.p$_b;
import b.t.c.b.b.q.h;
import b.t.c.b.b.q.hc;
import b.t.c.b.b.q.i;
import b.t.c.b.b.q.ib;
import b.t.c.b.b.q.jc;
import b.t.c.b.b.q.wb;
import java.util.Comparator;

public class p
implements Comparator {
    public static final p \u00d200000 = new p();
    private static final b o00000 = b.\u00f600000.o00000(new p$1());

    private p() {
    }

    public int o00000(wb wb2, wb wb3) {
        int n2;
        Object object;
        Object object2 = p$_b.\u00d200000(wb2, wb3);
        if (object2 != null) {
            return (Integer)object2;
        }
        if (wb2 instanceof h && wb3 instanceof h) {
            String string;
            object2 = (h)wb2;
            object = (h)wb3;
            String string2 = o00000.super(object2.\u00f5\u00d6o000());
            int n3 = string2.compareTo(string = o00000.super(object.\u00f5\u00d6o000()));
            if (n3 != 0) {
                return n3;
            }
        } else if (wb2 instanceof b.t.c.b.b.q.b && wb3 instanceof b.t.c.b.b.q.b) {
            int n4;
            Object object3;
            Object object4;
            int n5;
            object2 = (b.t.c.b.b.q.b)wb2;
            object = (b.t.c.b.b.q.b)wb3;
            Object object5 = object2.nullclasssuper();
            Object object6 = object.nullclasssuper();
            assert (object5 != null == (object6 != null));
            if (object5 != null && (n5 = ((String)(object5 = o00000.super(object5.forclasssuper()))).compareTo((String)(object6 = o00000.super(object6.forclasssuper())))) != 0) {
                return n5;
            }
            object5 = object2.\u00f5\u00d8o000();
            object6 = object.\u00f5\u00d8o000();
            for (n5 = 0; n5 < Math.min(object5.size(), object6.size()); ++n5) {
                object4 = o00000.super(((jc)object5.get(n5)).forclasssuper());
                n4 = ((String)object4).compareTo((String)(object3 = o00000.super(((jc)object6.get(n5)).forclasssuper())));
                if (n4 == 0) continue;
                return n4;
            }
            n5 = object5.size() - object6.size();
            if (n5 != 0) {
                return n5;
            }
            object4 = object2.\u00f8\u00d8o000();
            object3 = object.\u00f8\u00d8o000();
            for (n4 = 0; n4 < Math.min(object4.size(), object3.size()); ++n4) {
                object5 = ((i)object4.get(n4)).\u00d8\u00d5o000();
                object6 = ((i)object3.get(n4)).\u00d8\u00d5o000();
                n5 = object5.size() - object6.size();
                if (n5 != 0) {
                    return n5;
                }
                for (n5 = 0; n5 < object5.size(); ++n5) {
                    String string;
                    String string3 = o00000.super((rc)object5.get(n5));
                    int n6 = string3.compareTo(string = o00000.super((rc)object6.get(n5)));
                    if (n6 == 0) continue;
                    return n6;
                }
            }
            n4 = object4.size() - object3.size();
            if (n4 != 0) {
                return n4;
            }
            if (object2 instanceof hc && object instanceof hc) {
                object5 = ((hc)object2).O\u00f5o000();
                object6 = ((hc)object).O\u00f5o000();
                n5 = ((Enum)object5).ordinal() - ((Enum)object6).ordinal();
                if (n5 != 0) {
                    return n5;
                }
            }
        } else if (wb2 instanceof ib && wb3 instanceof ib) {
            object2 = (ib)wb2;
            object = (ib)wb3;
            if (object2.privateintsuper().ordinal() != object.privateintsuper().ordinal()) {
                return object2.privateintsuper().ordinal() - object.privateintsuper().ordinal();
            }
            if (object2.\u00d5o\u00d2000() != object.\u00d5o\u00d2000()) {
                if (object2.\u00d5o\u00d2000()) {
                    return 1;
                }
                return -1;
            }
        } else {
            throw new AssertionError((Object)String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", wb2, wb2.getClass(), wb3, wb3.getClass()));
        }
        if ((n2 = o00000.super(wb2).compareTo(o00000.super(wb3))) != 0) {
            return n2;
        }
        object = n.\u00f800000(wb2).\u00d5\u00f80000();
        f f2 = n.\u00f800000(wb3).\u00d5\u00f80000();
        return ((f)object).super(f2);
    }
}

