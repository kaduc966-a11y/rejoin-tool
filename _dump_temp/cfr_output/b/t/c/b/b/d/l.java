/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.d;

import b.o.d.fc;
import b.q.f;
import b.qd;
import b.t.c.b.b.d.h;
import b.t.c.b.b.d.k;
import b.t.c.b.b.d.l$_b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public final class l {
    public static final boolean \u00d200000(k k2, k k3) {
        if (fc.o00000((Object)k2, (Object)k3)) {
            return true;
        }
        if (k3.\u00d600000()) {
            return true;
        }
        return l.o00000(k2.super(), k3.super());
    }

    public static final boolean o00000(k k2, k k3) {
        return fc.o00000((Object)l.o00000(k2), (Object)k3);
    }

    private static final boolean o00000(String string, String string2) {
        return f.\u00d300000(string, string2, false, 2, null) && string.charAt(string2.length()) == '.';
    }

    public static final k \u00d300000(k k2, k k3) {
        if (!l.\u00d200000(k2, k3) || k3.\u00d600000()) {
            return k2;
        }
        if (fc.o00000((Object)k2, (Object)k3)) {
            return k.\u00d200000;
        }
        return new k(k2.super().substring(k3.super().length() + 1));
    }

    public static final k o00000(k k2) {
        if (k2.\u00d600000()) {
            return null;
        }
        return k2.\u00d300000();
    }

    public static final boolean o00000(String string) {
        if (string == null) {
            return false;
        }
        h h2 = h.\u00d400000;
        int n2 = string.length();
        block4: for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            switch (l$_b.o00000[h2.ordinal()]) {
                case 1: 
                case 2: {
                    if (!Character.isJavaIdentifierStart(c2)) {
                        return false;
                    }
                    h2 = h.o00000;
                    continue block4;
                }
                case 3: {
                    if (c2 == '.') {
                        h2 = h.\u00d500000;
                        continue block4;
                    }
                    if (Character.isJavaIdentifierPart(c2)) continue block4;
                    return false;
                }
                default: {
                    throw new qd();
                }
            }
        }
        return h2 != h.\u00d500000;
    }

    public static final Object o00000(k k2, Map iterator) {
        Object object;
        Object object2 = new LinkedHashMap();
        Iterator iterator2 = iterator.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = iterator2.next();
            iterator = (k)entry.getKey();
            if (!(fc.o00000((Object)k2, (Object)iterator) || l.o00000(k2, (k)((Object)iterator)))) continue;
            object2.put(entry.getKey(), entry.getValue());
        }
        iterator = object2;
        Iterator<Object> iterator3 = !iterator.isEmpty() ? iterator : null;
        if (iterator3 == null) {
            return null;
        }
        iterator = ((Iterable)iterator3.entrySet()).iterator();
        if (!iterator.hasNext()) {
            object = null;
        } else {
            object2 = iterator.next();
            if (!iterator.hasNext()) {
                object = object2;
            } else {
                int n2 = l.\u00d300000((k)((Map.Entry)object2).getKey(), k2).super().length();
                do {
                    int n3;
                    if (n2 <= (n3 = l.\u00d300000((k)((Map.Entry)((Object)(iterator2 = iterator.next()))).getKey(), k2).super().length())) continue;
                    object2 = iterator2;
                    n2 = n3;
                } while (iterator.hasNext());
                object = object2;
            }
        }
        Map.Entry entry = (Map.Entry)object;
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }
}

