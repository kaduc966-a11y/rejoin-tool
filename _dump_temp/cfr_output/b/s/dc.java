/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.o.d.gb;
import b.o.d.pc;
import b.s.mc;
import b.s.z;
import java.util.Collection;
import java.util.Iterator;

final class dc
implements Collection,
g {
    private final Object[] thisclassclass;
    private final boolean \u00d8\u00f8\u00f5000;

    public dc(Object[] objectArray, boolean bl) {
        this.thisclassclass = objectArray;
        this.\u00d8\u00f8\u00f5000 = bl;
    }

    public final Object[] \u00f5\u00d5\u00d3000() {
        return this.thisclassclass;
    }

    public final boolean \u00f8\u00d5\u00d3000() {
        return this.\u00d8\u00f8\u00f5000;
    }

    public final int StringObjectnew() {
        return this.thisclassclass.length;
    }

    @Override
    public final boolean isEmpty() {
        return this.thisclassclass.length == 0;
    }

    @Override
    public final boolean contains(Object object) {
        return z.\u00d300000(this.thisclassclass, object);
    }

    public final boolean containsAll(Collection object) {
        if (!((Collection)(object = (Iterable)object)).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object e2 = object.next();
                if (this.contains(e2)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public final Iterator iterator() {
        return pc.o00000(this.thisclassclass);
    }

    @Override
    public final Object[] toArray() {
        return mc.o00000(this.thisclassclass, this.\u00d8\u00f8\u00f5000);
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.StringObjectnew();
    }

    public final Object[] toArray(Object[] objectArray) {
        return gb.o00000(this, objectArray);
    }
}

