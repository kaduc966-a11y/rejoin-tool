/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.r;
import b.t.c.b.b.p.r$1;
import b.t.c.b.b.p.v;
import java.util.Map;

class r$_b
implements Map.Entry {
    private Map.Entry o00000;

    private r$_b(Map.Entry entry) {
        this.o00000 = entry;
    }

    public Object getKey() {
        return this.o00000.getKey();
    }

    public Object getValue() {
        r r2 = (r)this.o00000.getValue();
        if (r2 == null) {
            return null;
        }
        return r2.\u00d200000();
    }

    public Object setValue(Object object) {
        if (!(object instanceof v)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return ((r)this.o00000.getValue()).\u00d200000((v)object);
    }

    /* synthetic */ r$_b(Map.Entry entry, r$1 r$1) {
        this(entry);
    }
}

