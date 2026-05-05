/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.l.c.b;

import b.t.c.b.b.l.c.b$_b$_b;
import java.util.ArrayList;
import java.util.List;

public final class g {
    public static final List o00000(List object) {
        ArrayList<b$_b$_b> arrayList;
        ArrayList<b$_b$_b> arrayList2 = arrayList = new ArrayList<b$_b$_b>();
        arrayList.ensureCapacity(object.size());
        object = object.iterator();
        while (object.hasNext()) {
            b$_b$_b b$_b$_b = (b$_b$_b)object.next();
            int n2 = b$_b$_b.voidsuper();
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList2.add(b$_b$_b);
            }
        }
        arrayList2.trimToSize();
        return arrayList;
    }
}

