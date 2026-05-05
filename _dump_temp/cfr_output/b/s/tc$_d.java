/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.fc;
import b.o.d.w;
import java.util.Map;

public final class tc$_d {
    private tc$_d() {
    }

    public final int \u00d200000(Map.Entry entry) {
        Object k2 = entry.getKey();
        Object v2 = entry.getValue();
        return (k2 != null ? k2.hashCode() : 0) ^ (v2 != null ? v2.hashCode() : 0);
    }

    public final String o00000(Map.Entry entry) {
        return "" + entry.getKey() + '=' + entry.getValue();
    }

    public final boolean o00000(Map.Entry entry, Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        return fc.o00000(entry.getKey(), ((Map.Entry)object).getKey()) && fc.o00000(entry.getValue(), ((Map.Entry)object).getValue());
    }

    public /* synthetic */ tc$_d(w w2) {
        this();
    }
}

