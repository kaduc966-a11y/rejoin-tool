/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.n;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class kc
implements n {
    private final Map O\u00d3\u00f5000;
    private final g \u00f8\u00d2\u00f5000;

    public kc(Map map, g g2) {
        this.O\u00d3\u00f5000 = map;
        this.\u00f8\u00d2\u00f5000 = g2;
    }

    @Override
    public final Map oO\u00d3000() {
        return this.O\u00d3\u00f5000;
    }

    @Override
    public final boolean equals(Object object) {
        return ((Object)this.oO\u00d3000()).equals(object);
    }

    @Override
    public final int hashCode() {
        return ((Object)this.oO\u00d3000()).hashCode();
    }

    public final String toString() {
        return this.oO\u00d3000().toString();
    }

    public final int \u00d4O\u00d3000() {
        return this.oO\u00d3000().size();
    }

    @Override
    public final boolean isEmpty() {
        return this.oO\u00d3000().isEmpty();
    }

    @Override
    public final boolean containsKey(Object object) {
        return this.oO\u00d3000().containsKey(object);
    }

    @Override
    public final boolean containsValue(Object object) {
        return this.oO\u00d3000().containsValue(object);
    }

    public final Object get(Object object) {
        return this.oO\u00d3000().get(object);
    }

    public final Set \u00d5O\u00d3000() {
        return this.oO\u00d3000().keySet();
    }

    public final Collection \u00d3O\u00d3000() {
        return this.oO\u00d3000().values();
    }

    public final Set nullinterfacesuper() {
        return this.oO\u00d3000().entrySet();
    }

    @Override
    public final Object \u00f4o0000(Object object) {
        Object object2;
        Map map = this.oO\u00d3000();
        Object v2 = map.get(object2 = object);
        if (v2 == null && !map.containsKey(object2)) {
            return this.\u00f8\u00d2\u00f5000.\u00f800000(object);
        }
        return v2;
    }

    public final Object put(Object object, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.\u00d4O\u00d3000();
    }

    public final Set keySet() {
        return this.\u00d5O\u00d3000();
    }

    public final Collection values() {
        return this.\u00d3O\u00d3000();
    }

    public final Set entrySet() {
        return this.nullinterfacesuper();
    }
}

