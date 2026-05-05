/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.m;

import b.s.mc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class e {
    public static final Map o00000(Iterable object) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        object = object.iterator();
        int n2 = 0;
        while (object.hasNext()) {
            int n3 = n2++;
            Object e2 = object.next();
            ((Map)linkedHashMap).put(e2, n3);
        }
        return linkedHashMap;
    }

    public static final void o00000(Collection collection, Object object) {
        if (object != null) {
            collection.add(object);
        }
    }

    public static final HashMap new(int n2) {
        return new HashMap(e.o00000(n2));
    }

    public static final HashSet \u00d400000(int n2) {
        return new HashSet(e.o00000(n2));
    }

    public static final LinkedHashSet \u00d300000(int n2) {
        return new LinkedHashSet(e.o00000(n2));
    }

    private static final int o00000(int n2) {
        if (n2 < 3) {
            return 3;
        }
        int n3 = n2;
        return n3 + n3 / 3 + 1;
    }

    public static final List o00000(ArrayList arrayList) {
        switch (arrayList.size()) {
            case 0: {
                return mc.\u00d500000();
            }
            case 1: {
                return mc.o00000(mc.Oo0000(arrayList));
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }
}

