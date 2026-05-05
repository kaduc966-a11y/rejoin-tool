/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.s.f$_b;
import b.s.vc;
import java.util.Iterator;
import java.util.Set;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class f
extends vc
implements Set,
g {
    public static final f$_b new = new f$_b(null);

    protected f() {
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        return new.o00000(this, (Set)object);
    }

    @Override
    public int hashCode() {
        return new.o00000(this);
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

