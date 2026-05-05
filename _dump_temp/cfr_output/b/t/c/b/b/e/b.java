/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.e;

import b.o.d.c.g;
import b.o.d.fc;
import b.t.c.b.b.e.c;
import java.util.Iterator;
import java.util.Set;

public class b
implements Iterable,
g {
    private final Set \u00d8O\u00f6000;

    public final Set \u00f4\u00d8\u00d3000() {
        return this.\u00d8O\u00f6000;
    }

    public String toString() {
        return c.o00000(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        return fc.o00000((Object)this.\u00d8O\u00f6000, (Object)((b)object).\u00d8O\u00f6000);
    }

    public int hashCode() {
        return ((Object)this.\u00d8O\u00f6000).hashCode();
    }

    public Iterator iterator() {
        return this.\u00d8O\u00f6000.iterator();
    }
}

