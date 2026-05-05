/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.o.d.c.g;
import b.o.d.fc;
import b.o.d.gb;
import b.s.mc;
import java.util.Collection;
import java.util.Iterator;

public abstract class vc
implements Collection,
g {
    public abstract int o00000();

    @Override
    public abstract Iterator iterator();

    @Override
    public boolean contains(Object object) {
        Object object2 = this;
        if (!((Collection)object2).isEmpty()) {
            object2 = object2.iterator();
            while (object2.hasNext()) {
                if (!fc.o00000(object2.next(), object)) continue;
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection object) {
        if (!((Collection)(object = (Iterable)object)).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object e2 = object.next();
                if (this.contains(e2)) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public String toString() {
        return mc.o00000(this, ", ", "[", "]", 0, null, arg_0 -> vc.o00000(this, arg_0), 24, null);
    }

    @Override
    public Object[] toArray() {
        return gb.o00000(this);
    }

    public Object[] toArray(Object[] objectArray) {
        return gb.o00000(this, objectArray);
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final CharSequence o00000(vc vc2, Object object) {
        if (object == vc2) {
            return "(this Collection)";
        }
        return String.valueOf(object);
    }

    @Override
    public final int size() {
        return this.o00000();
    }
}

