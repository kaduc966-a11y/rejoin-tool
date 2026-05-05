/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.q;
import b.t.c.b.b.p.x$1;
import b.t.c.b.b.p.x$2;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class x
extends AbstractList
implements RandomAccess,
q {
    private final q \u00d300000;

    public x(q q2) {
        this.\u00d300000 = q2;
    }

    public String \u00d400000(int n2) {
        return (String)this.\u00d300000.get(n2);
    }

    @Override
    public int size() {
        return this.\u00d300000.size();
    }

    @Override
    public b super(int n2) {
        return this.\u00d300000.super(n2);
    }

    @Override
    public void super(b b2) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator(int n2) {
        return new x$1(this, n2);
    }

    @Override
    public Iterator iterator() {
        return new x$2(this);
    }

    @Override
    public List super() {
        return this.\u00d300000.super();
    }

    @Override
    public q \u00d200000() {
        return this;
    }

    static /* synthetic */ q super(x x2) {
        return x2.\u00d300000;
    }
}

