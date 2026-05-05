/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.e.g;
import b.s.ac;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class lc
implements ac {
    private final Map nullinterfaceString;
    private final g o\u00d3\u00f5000;

    public lc(Map map, g g2) {
        this.nullinterfaceString = map;
        this.o\u00d3\u00f5000 = g2;
    }

    @Override
    public final Map oO\u00d3000() {
        return this.nullinterfaceString;
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

    public final int \u00f4O\u00d3000() {
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

    public final Set \u00f5O\u00d3000() {
        return this.oO\u00d3000().keySet();
    }

    public final Collection \u00d8O\u00d3000() {
        return this.oO\u00d3000().values();
    }

    public final Set forinterfacesuper() {
        return this.oO\u00d3000().entrySet();
    }

    public final Object put(Object object, Object object2) {
        return this.oO\u00d3000().put(object, object2);
    }

    public final Object remove(Object object) {
        return this.oO\u00d3000().remove(object);
    }

    public final void putAll(Map map) {
        this.oO\u00d3000().putAll(map);
    }

    @Override
    public final void clear() {
        this.oO\u00d3000().clear();
    }

    @Override
    public final Object \u00f4o0000(Object object) {
        Object object2;
        Map map = this.oO\u00d3000();
        Object v2 = map.get(object2 = object);
        if (v2 == null && !map.containsKey(object2)) {
            return this.o\u00d3\u00f5000.\u00f800000(object);
        }
        return v2;
    }

    @Override
    public final int size() {
        return this.\u00f4O\u00d3000();
    }

    public final Set keySet() {
        return this.\u00f5O\u00d3000();
    }

    public final Collection values() {
        return this.\u00d8O\u00d3000();
    }

    public final Set entrySet() {
        return this.forinterfacesuper();
    }
}

