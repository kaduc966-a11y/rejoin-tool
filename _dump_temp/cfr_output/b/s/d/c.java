/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.e;
import b.s.d.i;
import b.s.tb;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c
extends tb
implements Set,
e {
    private final i \u00d3\u00d3\u00f5000;

    public c(i i2) {
        this.\u00d3\u00d3\u00f5000 = i2;
    }

    @Override
    public final int privateinterfacesuper() {
        return this.\u00d3\u00d3\u00f5000.size();
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00d3\u00d3\u00f5000.isEmpty();
    }

    @Override
    public final boolean contains(Object object) {
        return this.\u00d3\u00d3\u00f5000.containsKey(object);
    }

    @Override
    public final void clear() {
        this.\u00d3\u00d3\u00f5000.clear();
    }

    @Override
    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean remove(Object object) {
        return this.\u00d3\u00d3\u00f5000.\u00d8o0000(object);
    }

    @Override
    public final Iterator iterator() {
        return this.\u00d3\u00d3\u00f5000.whileprivatesuper();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        this.\u00d3\u00d3\u00f5000.\u00d40\u00d3000();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        this.\u00d3\u00d3\u00f5000.\u00d40\u00d3000();
        return super.retainAll(collection);
    }
}

