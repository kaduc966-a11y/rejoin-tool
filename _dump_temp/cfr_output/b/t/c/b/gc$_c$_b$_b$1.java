/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b;

import b.o.r;
import b.t.bb;
import b.t.u;
import b.t.v;
import b.t.z;
import b.y.f;
import java.util.Comparator;

public final class gc$_c$_b$_b$1
implements Comparator {
    final /* synthetic */ String o00000;

    public gc$_c$_b$_b$1(String string) {
        this.o00000 = string;
    }

    public final int compare(Object object, Object object2) {
        String string;
        String string2;
        v v2 = ((u)object).privatevoid();
        if (v2 == null) {
            throw new IllegalStateException(("Upper bounds are always denotable. Upper bounds appear non-denotable for member: '" + this.o00000 + '\'').toString());
        }
        object = v2;
        if (v2 instanceof z) {
            string2 = r.\u00d300000((z)object).getName();
        } else if (object instanceof bb) {
            string2 = ((bb)object).\u00f5\u00d4o000();
        } else {
            throw new IllegalStateException(("Unknown upper bound classifier: " + b.o.d.z.\u00d200000(object.getClass())).toString());
        }
        object = (u)object2;
        object2 = (Comparable)((Object)string2);
        v v3 = object.privatevoid();
        if (v3 == null) {
            throw new IllegalStateException(("Upper bounds are always denotable. Upper bounds appear non-denotable for member: '" + this.o00000 + '\'').toString());
        }
        object = v3;
        if (v3 instanceof z) {
            string = r.\u00d300000((z)object).getName();
        } else if (object instanceof bb) {
            string = ((bb)object).\u00f5\u00d4o000();
        } else {
            throw new IllegalStateException(("Unknown upper bound classifier: " + b.o.d.z.\u00d200000(object.getClass())).toString());
        }
        return f.super((Comparable)object2, (Comparable)((Object)string));
    }
}

