/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.n;
import b.t.c.b.b.p.n$1;
import b.t.c.b.b.p.n$_b;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class n$_d
extends AbstractSet {
    final /* synthetic */ n o00000;

    private n$_d(n n2) {
        this.o00000 = n2;
    }

    @Override
    public Iterator iterator() {
        return new n$_b(this.o00000, null);
    }

    @Override
    public int size() {
        return this.o00000.size();
    }

    @Override
    public boolean contains(Object object) {
        object = (Map.Entry)object;
        Object object2 = this.o00000.get(object.getKey());
        return object2 == (object = object.getValue()) || object2 != null && object2.equals(object);
    }

    public boolean o00000(Map.Entry entry) {
        if (!this.contains(entry)) {
            this.o00000.super((Comparable)entry.getKey(), entry.getValue());
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object object) {
        if (this.contains(object = (Map.Entry)object)) {
            this.o00000.remove(object.getKey());
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        this.o00000.clear();
    }

    /* synthetic */ n$_d(n n2, n$1 n$1) {
        this(n2);
    }
}

