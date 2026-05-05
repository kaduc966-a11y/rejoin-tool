/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.o.d.gb;
import b.s.jc;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class qc
implements Serializable,
Set,
g {
    public static final qc privateclassclass = new qc();
    private static final long \u00f80\u00f6000 = 3406603774387020532L;

    private qc() {
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof Set && ((Set)object).isEmpty();
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "[]";
    }

    public final int O\u00d8\u00d3000() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    public final boolean \u00f400000(Void void_) {
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return jc.\u00d80\u00f6000;
    }

    private final Object o\u00d8\u00d3000() {
        return privateclassclass;
    }

    public final boolean \u00f500000(Void void_) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.O\u00d8\u00d3000();
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        return gb.o00000(this, objectArray);
    }

    @Override
    public final Object[] toArray() {
        return gb.o00000(this);
    }
}

