/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.s.cb;
import b.s.hb;
import b.s.u$_b$1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class u
extends cb {
    private final List \u00d4\u00d4\u00f5000;

    public u(List list) {
        this.\u00d4\u00d4\u00f5000 = list;
    }

    @Override
    public final int \u00d3o\u00d3000() {
        return this.\u00d4\u00d4\u00f5000.size();
    }

    public final Object get(int n2) {
        return this.\u00d4\u00d4\u00f5000.get(hb.return(this, n2));
    }

    @Override
    public final void clear() {
        this.\u00d4\u00d4\u00f5000.clear();
    }

    @Override
    public final Object O\u00d80000(int n2) {
        return this.\u00d4\u00d4\u00f5000.remove(hb.return(this, n2));
    }

    @Override
    public final Object set(int n2, Object object) {
        return this.\u00d4\u00d4\u00f5000.set(hb.return(this, n2), object);
    }

    @Override
    public final void add(int n2, Object object) {
        this.\u00d4\u00d4\u00f5000.add(hb.new((List)this, n2), object);
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator(int n2) {
        return new u$_b$1(this, n2);
    }

    public static final /* synthetic */ List o00000(u u2) {
        return u2.\u00d4\u00d4\u00f5000;
    }
}

