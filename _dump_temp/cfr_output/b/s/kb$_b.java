/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.s.kb;
import b.s.kb$_c;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class kb$_b
extends kb$_c
implements ListIterator,
g {
    final /* synthetic */ kb \u00d4\u00f5\u00f5000;

    public kb$_b(kb kb2, int n2) {
        this.\u00d4\u00f5\u00f5000 = kb2;
        super(kb2);
        kb.return.Object(n2, this.\u00d4\u00f5\u00f5000.size());
        this.returnreturn(n2);
    }

    @Override
    public boolean hasPrevious() {
        return this.\u00f8\u00d4\u00d3000() > 0;
    }

    @Override
    public int nextIndex() {
        return this.\u00f8\u00d4\u00d3000();
    }

    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        kb$_b kb$_b = this;
        kb$_b.returnreturn(kb$_b.\u00f8\u00d4\u00d3000() + -1);
        return this.\u00d4\u00f5\u00f5000.get(this.\u00f8\u00d4\u00d3000());
    }

    @Override
    public int previousIndex() {
        return this.\u00f8\u00d4\u00d3000() - 1;
    }

    public void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

