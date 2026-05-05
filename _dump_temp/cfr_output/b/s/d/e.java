/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.h;
import b.s.c;
import b.s.d.i;
import java.util.Collection;
import java.util.Iterator;

public final class e
extends c
implements Collection,
h {
    private final i \u00d4\u00d5\u00f5000;

    public e(i i2) {
        this.\u00d4\u00d5\u00f5000 = i2;
    }

    public final i Stringsupernew() {
        return this.\u00d4\u00d5\u00f5000;
    }

    @Override
    public final int \u00f5\u00d2\u00d3000() {
        return this.\u00d4\u00d5\u00f5000.size();
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00d4\u00d5\u00f5000.isEmpty();
    }

    @Override
    public final boolean contains(Object object) {
        return this.\u00d4\u00d5\u00f5000.containsValue(object);
    }

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        this.\u00d4\u00d5\u00f5000.clear();
    }

    @Override
    public final Iterator iterator() {
        return this.\u00d4\u00d5\u00f5000.\u00d5\u00f8\u00d2000();
    }

    @Override
    public final boolean remove(Object object) {
        return this.\u00d4\u00d5\u00f5000.\u00d4o0000(object);
    }

    public final boolean removeAll(Collection collection) {
        this.\u00d4\u00d5\u00f5000.\u00d40\u00d3000();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        this.\u00d4\u00d5\u00f5000.\u00d40\u00d3000();
        return super.retainAll(collection);
    }
}

