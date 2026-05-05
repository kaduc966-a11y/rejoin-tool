/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.e;
import b.s.d.b$_b;
import b.s.d.i;
import b.s.d.k;
import b.s.tb;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class b
extends tb
implements Serializable,
Set,
e {
    private static final b$_b privateinterfaceString = new b$_b(null);
    private final i \u00f5\u00d3\u00f5000;
    private static final b \u00f4\u00d3\u00f5000 = new b(i.\u00d4\u00d2\u00f5000.o00000());

    public b(i i2) {
        this.\u00f5\u00d3\u00f5000 = i2;
    }

    public b() {
        this(new i());
    }

    public b(int n2) {
        this(new i(n2));
    }

    public final Set newthisnew() {
        this.\u00f5\u00d3\u00f5000.\u00d80\u00d3000();
        if (this.size() > 0) {
            return this;
        }
        return \u00f4\u00d3\u00f5000;
    }

    private final Object oo\u00d3000() {
        if (this.\u00f5\u00d3\u00f5000.\u00d8\u00f8\u00d2000()) {
            return new k(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    private final void \u00d300000(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override
    public final int privateinterfacesuper() {
        return this.\u00f5\u00d3\u00f5000.size();
    }

    @Override
    public final boolean isEmpty() {
        return this.\u00f5\u00d3\u00f5000.isEmpty();
    }

    @Override
    public final boolean contains(Object object) {
        return this.\u00f5\u00d3\u00f5000.containsKey(object);
    }

    @Override
    public final void clear() {
        this.\u00f5\u00d3\u00f5000.clear();
    }

    @Override
    public final boolean add(Object object) {
        return this.\u00f5\u00d3\u00f5000.\u00d5o0000(object) >= 0;
    }

    @Override
    public final boolean remove(Object object) {
        return this.\u00f5\u00d3\u00f5000.\u00d8o0000(object);
    }

    @Override
    public final Iterator iterator() {
        return this.\u00f5\u00d3\u00f5000.whileprivatesuper();
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.\u00f5\u00d3\u00f5000.\u00d40\u00d3000();
        return super.addAll(collection);
    }

    @Override
    public final boolean removeAll(Collection collection) {
        this.\u00f5\u00d3\u00f5000.\u00d40\u00d3000();
        return super.removeAll(collection);
    }

    @Override
    public final boolean retainAll(Collection collection) {
        this.\u00f5\u00d3\u00f5000.\u00d40\u00d3000();
        return super.retainAll(collection);
    }
}

