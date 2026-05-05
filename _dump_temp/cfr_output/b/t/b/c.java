/*
 * Decompiled with CFR 0.152.
 */
package b.t.b;

import b.o.d.fc;
import b.o.r;
import b.s.mc;
import b.t.b.j;
import b.t.w;
import b.t.z;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class c {
    public static final /* synthetic */ Annotation \u00d200000(w object) {
        Object v1;
        block1: {
            for (Object e2 : (Iterable)object.\u00d8\u00f50000()) {
                Annotation annotation = (Annotation)e2;
                fc.o00000(3, "T");
                if (!(annotation instanceof Annotation)) continue;
                v1 = e2;
                break block1;
            }
            v1 = null;
        }
        fc.o00000(1, "T?");
        return v1;
    }

    public static final /* synthetic */ boolean \u00d300000(w object) {
        Object v1;
        block1: {
            for (Object e2 : (Iterable)object.\u00d8\u00f50000()) {
                Annotation annotation = (Annotation)e2;
                fc.o00000(3, "T");
                if (!(annotation instanceof Annotation)) continue;
                v1 = e2;
                break block1;
            }
            v1 = null;
        }
        fc.o00000(1, "T?");
        return (Annotation)v1 != null;
    }

    public static final /* synthetic */ List super(w w2) {
        fc.o00000(4, "T");
        return c.super(w2, b.o.d.z.\u00d200000(Annotation.class));
    }

    public static final List super(w object, z object2) {
        List list3 = mc.o00000((Iterable)object.\u00d8\u00f50000(), r.\u00d300000((z)object2));
        if (!((Collection)list3).isEmpty()) {
            return list3;
        }
        if ((object2 = j.\u00d200000.o00000(r.\u00d300000((z)object2))) != null) {
            List list2;
            block4: {
                for (List list3 : (Iterable)object.\u00d8\u00f50000()) {
                    if (!fc.o00000((Object)r.\u00d300000(r.o00000((Annotation)((Object)list3))), object2)) continue;
                    list2 = list3;
                    break block4;
                }
                list2 = null;
            }
            object = (Annotation)((Object)list2);
            if (object != null) {
                return b.s.z.\u00d500000((Annotation[])object.getClass().getMethod("value", new Class[0]).invoke(object, new Object[0]));
            }
        }
        return mc.\u00d500000();
    }
}

