/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.s.d.i;
import b.s.d.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public final class d
extends j {
    private final i \u00d4\u00d3\u00f5000;

    public d(i i2) {
        this.\u00d4\u00d3\u00f5000 = i2;
    }

    public final i \u00f8O\u00d3000() {
        return this.\u00d4\u00d3\u00f5000;
    }

    @Override
    public final int privateinterfacesuper() {
        return this.\u00d4\u00d3\u00f5000.size();
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00d4\u00d3\u00f5000.isEmpty();
    }

    @Override
    public final boolean \u00d400000(Map.Entry entry) {
        return this.\u00d4\u00d3\u00f5000.\u00d300000(entry);
    }

    @Override
    public final void clear() {
        this.\u00d4\u00d3\u00f5000.clear();
    }

    public final boolean \u00d800000(Map.Entry entry) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean \u00d500000(Map.Entry entry) {
        return this.\u00d4\u00d3\u00f5000.new(entry);
    }

    @Override
    public final Iterator iterator() {
        return this.\u00d4\u00d3\u00f5000.returnprivatesuper();
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.\u00d4\u00d3\u00f5000.new(collection);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        this.\u00d4\u00d3\u00f5000.\u00d40\u00d3000();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        this.\u00d4\u00d3\u00f5000.\u00d40\u00d3000();
        return super.retainAll(collection);
    }
}

