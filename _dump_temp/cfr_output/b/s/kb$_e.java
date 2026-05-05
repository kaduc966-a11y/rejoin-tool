/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.fc;
import b.o.d.w;
import java.util.Collection;

public final class kb$_e {
    private kb$_e() {
    }

    public final void \u00d200000(int n2, int n3) {
        if (n2 < 0 || n2 >= n3) {
            throw new IndexOutOfBoundsException("index: " + n2 + ", size: " + n3);
        }
    }

    public final void Object(int n2, int n3) {
        if (n2 < 0 || n2 > n3) {
            throw new IndexOutOfBoundsException("index: " + n2 + ", size: " + n3);
        }
    }

    public final void \u00d200000(int n2, int n3, int n4) {
        if (n2 < 0 || n3 > n4) {
            throw new IndexOutOfBoundsException("fromIndex: " + n2 + ", toIndex: " + n3 + ", size: " + n4);
        }
        if (n2 > n3) {
            throw new IllegalArgumentException("fromIndex: " + n2 + " > toIndex: " + n3);
        }
    }

    public final void o00000(int n2, int n3, int n4) {
        if (n2 < 0 || n3 > n4) {
            throw new IndexOutOfBoundsException("startIndex: " + n2 + ", endIndex: " + n3 + ", size: " + n4);
        }
        if (n2 > n3) {
            throw new IllegalArgumentException("startIndex: " + n2 + " > endIndex: " + n3);
        }
    }

    public final int o00000(int n2, int n3) {
        int n4 = n2;
        n2 = n4 + (n4 >> 1);
        if (n2 - n3 < 0) {
            n2 = n3;
        }
        if (n2 - 0x7FFFFFF7 > 0) {
            n2 = n3 > 0x7FFFFFF7 ? Integer.MAX_VALUE : 0x7FFFFFF7;
        }
        return n2;
    }

    public final int o00000(Collection object) {
        int n2 = 1;
        object = object.iterator();
        while (object.hasNext()) {
            Object e2;
            Object e3 = e2 = object.next();
            n2 = 31 * n2 + (e3 != null ? e3.hashCode() : 0);
        }
        return n2;
    }

    public final boolean o00000(Collection object, Collection object2) {
        if (object.size() != object2.size()) {
            return false;
        }
        object2 = object2.iterator();
        object = object.iterator();
        while (object.hasNext()) {
            Object e2;
            Object e3 = object.next();
            if (fc.o00000(e3, e2 = object2.next())) continue;
            return false;
        }
        return true;
    }

    public /* synthetic */ kb$_e(w w2) {
        this();
    }
}

