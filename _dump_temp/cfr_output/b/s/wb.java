/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.h;
import b.qb;
import b.s.mc;
import b.s.nc;
import b.s.wb$_b$1;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class wb
extends nc {
    private static final Iterable o00000(h h2) {
        return new wb$_b$1(h2);
    }

    public static final Integer \u00d400000(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection)iterable).size();
        }
        return null;
    }

    public static final int o00000(Iterable iterable, int n2) {
        if (iterable instanceof Collection) {
            return ((Collection)iterable).size();
        }
        return n2;
    }

    public static final List \u00d300000(Iterable object) {
        ArrayList arrayList = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            Iterable iterable = (Iterable)object.next();
            mc.new((Collection)arrayList, iterable);
        }
        return arrayList;
    }

    public static final qb new(Iterable object) {
        int n2 = mc.o00000((Iterable)object, 10);
        ArrayList<Object> arrayList = new ArrayList<Object>(n2);
        ArrayList<Object> arrayList2 = new ArrayList<Object>(n2);
        object = object.iterator();
        while (object.hasNext()) {
            qb qb2 = (qb)object.next();
            arrayList.add(qb2.new());
            arrayList2.add(qb2.o00000());
        }
        return yc.o00000(arrayList, arrayList2);
    }
}

