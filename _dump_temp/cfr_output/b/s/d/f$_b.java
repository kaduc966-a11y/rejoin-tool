/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.c.i;
import b.s.cb;
import b.s.d.f;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class f$_b
implements ListIterator,
i {
    private final f \u00f50\u00f5000;
    private int \u00f40\u00f5000;
    private int \u00f80\u00f5000;
    private int StringpublicString;

    public f$_b(f f2, int n2) {
        this.\u00f50\u00f5000 = f2;
        this.\u00f40\u00f5000 = n2;
        this.\u00f80\u00f5000 = -1;
        this.StringpublicString = f.\u00d400000(this.\u00f50\u00f5000);
    }

    @Override
    public final boolean hasPrevious() {
        return this.\u00f40\u00f5000 > 0;
    }

    @Override
    public final boolean hasNext() {
        return this.\u00f40\u00f5000 < f.new(this.\u00f50\u00f5000);
    }

    @Override
    public final int previousIndex() {
        return this.\u00f40\u00f5000 - 1;
    }

    @Override
    public final int nextIndex() {
        return this.\u00f40\u00f5000;
    }

    public final Object previous() {
        this.\u00d4\u00f6\u00d2000();
        if (this.\u00f40\u00f5000 <= 0) {
            throw new NoSuchElementException();
        }
        f$_b f$_b = this;
        f$_b.\u00f40\u00f5000 = this.\u00f40\u00f5000 + -1;
        f$_b.\u00f80\u00f5000 = this.\u00f40\u00f5000;
        return f.o00000(this.\u00f50\u00f5000)[this.\u00f80\u00f5000];
    }

    @Override
    public final Object next() {
        this.\u00d4\u00f6\u00d2000();
        if (this.\u00f40\u00f5000 >= f.new(this.\u00f50\u00f5000)) {
            throw new NoSuchElementException();
        }
        int n2 = this.\u00f40\u00f5000;
        this.\u00f40\u00f5000 = n2 + 1;
        this.\u00f80\u00f5000 = n2;
        return f.o00000(this.\u00f50\u00f5000)[this.\u00f80\u00f5000];
    }

    public final void set(Object object) {
        this.\u00d4\u00f6\u00d2000();
        if (!(this.\u00f80\u00f5000 != -1)) {
            object = "Call next() or previous() before replacing element from the iterator.";
            throw new IllegalStateException(object.toString());
        }
        ((cb)this.\u00f50\u00f5000).set(this.\u00f80\u00f5000, object);
    }

    public final void add(Object object) {
        this.\u00d4\u00f6\u00d2000();
        int n2 = this.\u00f40\u00f5000;
        this.\u00f40\u00f5000 = n2 + 1;
        ((cb)this.\u00f50\u00f5000).add(n2, object);
        this.\u00f80\u00f5000 = -1;
        this.StringpublicString = f.\u00d400000(this.\u00f50\u00f5000);
    }

    @Override
    public final void remove() {
        this.\u00d4\u00f6\u00d2000();
        if (!(this.\u00f80\u00f5000 != -1)) {
            String string = "Call next() or previous() before removing element from the iterator.";
            throw new IllegalStateException(string.toString());
        }
        ((cb)this.\u00f50\u00f5000).O\u00d80000(this.\u00f80\u00f5000);
        this.\u00f40\u00f5000 = this.\u00f80\u00f5000;
        this.\u00f80\u00f5000 = -1;
        this.StringpublicString = f.\u00d400000(this.\u00f50\u00f5000);
    }

    private final void \u00d4\u00f6\u00d2000() {
        if (f.\u00d400000(this.\u00f50\u00f5000) != this.StringpublicString) {
            throw new ConcurrentModificationException();
        }
    }
}

