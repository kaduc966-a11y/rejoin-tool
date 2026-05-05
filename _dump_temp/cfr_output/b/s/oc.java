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
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class oc
implements Serializable,
List,
RandomAccess,
g {
    public static final oc \u00f40\u00f6000 = new oc();
    private static final long \u00f50\u00f6000 = -7390468764508069838L;

    private oc() {
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof List && ((List)object).isEmpty();
    }

    @Override
    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "[]";
    }

    public final int privateObjectnew() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    public final boolean return(Void void_) {
        return false;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return collection.isEmpty();
    }

    public final Void \u00f4\u00f40000(int n2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + n2 + '.');
    }

    public final int \u00d400000(Void void_) {
        return -1;
    }

    public final int \u00d500000(Void void_) {
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return jc.\u00d80\u00f6000;
    }

    public final ListIterator listIterator() {
        return jc.\u00d80\u00f6000;
    }

    public final ListIterator listIterator(int n2) {
        if (n2 != 0) {
            throw new IndexOutOfBoundsException("Index: ".concat(String.valueOf(n2)));
        }
        return jc.\u00d80\u00f6000;
    }

    public final List subList(int n2, int n3) {
        if (n2 == 0 && n3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + n2 + ", toIndex: " + n3);
    }

    private final Object \u00f8\u00d6\u00d3000() {
        return \u00f40\u00f6000;
    }

    public final boolean \u00d800000(Void void_) {
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

    public final boolean addAll(int n2, Collection collection) {
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

    public final Void new(int n2, Void void_) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void o00000(int n2, Void void_) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Void \u00d8\u00f40000(int n2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object remove(int n2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.privateObjectnew();
    }

    @Override
    public final /* synthetic */ boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ Object set(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void add(int n2, Object object) {
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

