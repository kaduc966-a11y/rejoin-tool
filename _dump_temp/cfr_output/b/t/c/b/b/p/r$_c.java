/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.r;
import b.t.c.b.b.p.r$_b;
import java.util.Iterator;
import java.util.Map;

class r$_c
implements Iterator {
    private Iterator o00000;

    public r$_c(Iterator iterator) {
        this.o00000 = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.o00000.hasNext();
    }

    public Map.Entry o00000() {
        Map.Entry entry = (Map.Entry)this.o00000.next();
        if (entry.getValue() instanceof r) {
            return new r$_b(entry, null);
        }
        return entry;
    }

    @Override
    public void remove() {
        this.o00000.remove();
    }
}

