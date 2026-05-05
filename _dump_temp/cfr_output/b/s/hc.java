/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.s.oc;
import b.s.qc;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

final class hc
implements Serializable,
Map,
g {
    public static final hc \u00d50\u00f6000 = new hc();
    private static final long forclassclass = 8246714829545688274L;

    private hc() {
    }

    @Override
    public final boolean equals(Object object) {
        return object instanceof Map && ((Map)object).isEmpty();
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    public final int \u00d5\u00d6\u00d3000() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final boolean containsKey(Object object) {
        return false;
    }

    public final boolean o00000(Void void_) {
        return false;
    }

    public final Void \u00f8o0000(Object object) {
        return null;
    }

    public final Set \u00d3\u00d6\u00d3000() {
        return qc.privateclassclass;
    }

    public final Set \u00d8\u00d6\u00d3000() {
        return qc.privateclassclass;
    }

    public final Collection \u00d4\u00d6\u00d3000() {
        return oc.\u00f40\u00f6000;
    }

    private final Object forObjectnew() {
        return \u00d50\u00f6000;
    }

    public final Void o00000(Object object, Void void_) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Void privatesuper(Object object) {
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
        return this.\u00d5\u00d6\u00d3000();
    }

    public final Set entrySet() {
        return this.\u00d3\u00d6\u00d3000();
    }

    public final Set keySet() {
        return this.\u00d8\u00d6\u00d3000();
    }

    public final Collection values() {
        return this.\u00d4\u00d6\u00d3000();
    }

    public final /* synthetic */ Object put(Object object, Object object2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

