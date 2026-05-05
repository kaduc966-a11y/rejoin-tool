/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.i;
import b.s.cb;
import b.s.d.f;
import b.s.d.f$_c;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class f$_c$_b
implements ListIterator,
i {
    private final f$_c oO\u00f5000;
    private int OO\u00f5000;
    private int \u00d3O\u00f5000;
    private int nullpublicString;

    public f$_c$_b(f$_c f$_c, int n2) {
        this.oO\u00f5000 = f$_c;
        this.OO\u00f5000 = n2;
        this.\u00d3O\u00f5000 = -1;
        this.nullpublicString = f$_c.new(this.oO\u00f5000);
    }

    @Override
    public final boolean hasPrevious() {
        return this.OO\u00f5000 > 0;
    }

    @Override
    public final boolean hasNext() {
        return this.OO\u00f5000 < f$_c.o00000(this.oO\u00f5000);
    }

    @Override
    public final int previousIndex() {
        return this.OO\u00f5000 - 1;
    }

    @Override
    public final int nextIndex() {
        return this.OO\u00f5000;
    }

    public final Object previous() {
        this.\u00d5\u00f6\u00d2000();
        if (this.OO\u00f5000 <= 0) {
            throw new NoSuchElementException();
        }
        f$_c$_b f$_c$_b = this;
        f$_c$_b.OO\u00f5000 = this.OO\u00f5000 + -1;
        f$_c$_b.\u00d3O\u00f5000 = this.OO\u00f5000;
        return f$_c.\u00d400000(this.oO\u00f5000)[f$_c.\u00d500000(this.oO\u00f5000) + this.\u00d3O\u00f5000];
    }

    @Override
    public final Object next() {
        this.\u00d5\u00f6\u00d2000();
        if (this.OO\u00f5000 >= f$_c.o00000(this.oO\u00f5000)) {
            throw new NoSuchElementException();
        }
        int n2 = this.OO\u00f5000;
        this.OO\u00f5000 = n2 + 1;
        this.\u00d3O\u00f5000 = n2;
        return f$_c.\u00d400000(this.oO\u00f5000)[f$_c.\u00d500000(this.oO\u00f5000) + this.\u00d3O\u00f5000];
    }

    public final void set(Object object) {
        this.\u00d5\u00f6\u00d2000();
        if (!(this.\u00d3O\u00f5000 != -1)) {
            object = "Call next() or previous() before replacing element from the iterator.";
            throw new IllegalStateException(object.toString());
        }
        ((cb)this.oO\u00f5000).set(this.\u00d3O\u00f5000, object);
    }

    public final void add(Object object) {
        this.\u00d5\u00f6\u00d2000();
        int n2 = this.OO\u00f5000;
        this.OO\u00f5000 = n2 + 1;
        ((cb)this.oO\u00f5000).add(n2, object);
        this.\u00d3O\u00f5000 = -1;
        this.nullpublicString = f$_c.new(this.oO\u00f5000);
    }

    @Override
    public final void remove() {
        this.\u00d5\u00f6\u00d2000();
        if (!(this.\u00d3O\u00f5000 != -1)) {
            String string = "Call next() or previous() before removing element from the iterator.";
            throw new IllegalStateException(string.toString());
        }
        ((cb)this.oO\u00f5000).O\u00d80000(this.\u00d3O\u00f5000);
        this.OO\u00f5000 = this.\u00d3O\u00f5000;
        this.\u00d3O\u00f5000 = -1;
        this.nullpublicString = f$_c.new(this.oO\u00f5000);
    }

    private final void \u00d5\u00f6\u00d2000() {
        if (f.\u00d400000(f$_c.\u00d300000(this.oO\u00f5000)) != this.nullpublicString) {
            throw new ConcurrentModificationException();
        }
    }
}

