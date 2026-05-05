/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.o.d.fc;
import b.s.kb$_b;
import b.s.kb$_c;
import b.s.kb$_d;
import b.s.kb$_e;
import b.s.vc;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class kb
extends vc
implements List,
g {
    public static final kb$_e return = new kb$_e(null);
    private static final int \u00d500000 = 0x7FFFFFF7;

    @Override
    public abstract int o00000();

    public abstract Object get(int var1);

    @Override
    public Iterator iterator() {
        return new kb$_c(this);
    }

    @Override
    public int indexOf(Object object) {
        Object object2 = this;
        int n2 = 0;
        object2 = object2.iterator();
        while (object2.hasNext()) {
            if (fc.o00000(object2.next(), object)) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        List list = this;
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!fc.o00000(listIterator.previous(), object)) continue;
            return listIterator.nextIndex();
        }
        return -1;
    }

    public ListIterator listIterator() {
        return new kb$_b(this, 0);
    }

    public ListIterator listIterator(int n2) {
        return new kb$_b(this, n2);
    }

    public List subList(int n2, int n3) {
        return new kb$_d(this, n2, n3);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        return return.o00000(this, (Collection)object);
    }

    @Override
    public int hashCode() {
        return return.o00000(this);
    }

    public boolean addAll(int n2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int n2, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(int n2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

