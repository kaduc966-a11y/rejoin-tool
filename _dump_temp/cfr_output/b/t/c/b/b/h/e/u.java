/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h.e;

import b.t.c.b.b.h.bc;
import b.t.c.b.b.h.e.p;
import b.t.c.b.b.h.g.c;
import b.t.c.b.b.h.hc;
import b.t.c.b.b.h.lb;
import b.t.c.b.b.h.o;
import b.t.c.b.b.h.rc;
import b.t.c.b.b.h.w;
import b.t.c.b.b.k.b;
import b.t.c.b.b.o.d.b.e;
import b.t.c.b.b.q.wb;
import java.util.ArrayDeque;
import java.util.Collection;

public final class u {
    public static final rc o00000(rc object, rc object2, p p2) {
        Object object3 = new ArrayDeque<b.t.c.b.b.h.e.w>();
        ((ArrayDeque)object3).add(new b.t.c.b.b.h.e.w((rc)object, null));
        object = ((rc)object2).thisdosuper();
        while (!((ArrayDeque)object3).isEmpty()) {
            object2 = (b.t.c.b.b.h.e.w)((ArrayDeque)object3).poll();
            rc rc22 = ((b.t.c.b.b.h.e.w)object2).new();
            Object object4 = rc22.thisdosuper();
            if (p2.o00000((bc)object4, (bc)object)) {
                object4 = rc22;
                boolean bl = rc22.\u00f5\u00d6\u00d2000();
                for (object2 = ((b.t.c.b.b.h.e.w)object2).o00000(); object2 != null; object2 = ((b.t.c.b.b.h.e.w)object2).o00000()) {
                    boolean bl2;
                    object3 = ((b.t.c.b.b.h.e.w)object2).new();
                    Object object5 = ((rc)object3).\u00d4\u00d6\u00d2000();
                    if (!(object5 instanceof Collection) || !((Collection)object5).isEmpty()) {
                        object5 = object5.iterator();
                        while (object5.hasNext()) {
                            if (!(((hc)object5.next()).\u00d200000() != w.\u00d400000)) continue;
                            bl2 = true;
                            break;
                        }
                    } else {
                        bl2 = false;
                    }
                    object4 = bl2 ? u.o00000(e.o00000(lb.\u00d200000.o00000((rc)object3), false, 1, null).\u00d400000().new((rc)object4, w.\u00d400000)) : lb.\u00d200000.o00000((rc)object3).\u00d400000().new((rc)object4, w.\u00d400000);
                    bl = bl || ((rc)object3).\u00f5\u00d6\u00d2000();
                }
                object3 = ((rc)object4).thisdosuper();
                if (!p2.o00000((bc)object3, (bc)object)) {
                    throw new AssertionError((Object)("Type constructors should be equals!\nsubstitutedSuperType: " + u.o00000((bc)object3) + ", \n\nsupertype: " + u.o00000((bc)object) + " \n" + p2.o00000((bc)object3, (bc)object)));
                }
                return o.o00000(object4, bl);
            }
            for (rc rc22 : object4.\u00d5OO000()) {
                ((ArrayDeque)object3).add(new b.t.c.b.b.h.e.w(rc22, (b.t.c.b.b.h.e.w)object2));
            }
        }
        return null;
    }

    private static final rc o00000(rc rc2) {
        return (rc)c.super(rc2).\u00d400000();
    }

    private static final String o00000(bc object) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        u.o00000("type: ".concat(String.valueOf(object)), stringBuilder2);
        u.o00000("hashCode: " + object.hashCode(), stringBuilder2);
        u.o00000("javaClass: " + object.getClass().getCanonicalName(), stringBuilder2);
        for (object = (wb)object.\u00f4OO000(); object != null; object = object.\u00d8\u00f80000()) {
            u.o00000("fqName: " + b.\u00f400000.super((wb)object), stringBuilder2);
            u.o00000("javaClass: " + object.getClass().getCanonicalName(), stringBuilder2);
        }
        return stringBuilder.toString();
    }

    private static final StringBuilder o00000(String string, StringBuilder stringBuilder) {
        return stringBuilder.append(string).append('\n');
    }
}

