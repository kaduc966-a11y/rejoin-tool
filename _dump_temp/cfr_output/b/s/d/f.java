/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.fc;
import b.o.d.w;
import b.s.cb;
import b.s.d.f$_b;
import b.s.d.f$_c;
import b.s.d.f$_d;
import b.s.d.g;
import b.s.d.k;
import b.s.kb;
import b.s.mc;
import b.s.z;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f
extends cb
implements Serializable,
List,
RandomAccess,
b.o.d.c.f {
    private static final f$_d \u00d3\u00d4\u00f5000 = new f$_d(null);
    private Object[] o\u00d4\u00f5000;
    private int O\u00d4\u00f5000;
    private boolean newthisclass;
    private static final f \u00f8\u00d3\u00f5000;

    public f(int n2) {
        this.o\u00d4\u00f5000 = g.o00000(n2);
    }

    public /* synthetic */ f(int n2, int n3, w w2) {
        if ((n3 & 1) != 0) {
            n2 = 10;
        }
        this(n2);
    }

    public final List returnthisnew() {
        this.\u00d4o\u00d3000();
        this.newthisclass = true;
        if (this.O\u00d4\u00f5000 > 0) {
            return this;
        }
        return \u00f8\u00d3\u00f5000;
    }

    private final Object \u00d5o\u00d3000() {
        if (this.newthisclass) {
            return new k(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override
    public final int \u00d3o\u00d3000() {
        return this.O\u00d4\u00f5000;
    }

    @Override
    public final boolean isEmpty() {
        return this.O\u00d4\u00f5000 == 0;
    }

    public final Object get(int n2) {
        kb.return.\u00d200000(n2, this.O\u00d4\u00f5000);
        return this.o\u00d4\u00f5000[n2];
    }

    @Override
    public final Object set(int n2, Object object) {
        this.\u00d4o\u00d3000();
        kb.return.\u00d200000(n2, this.O\u00d4\u00f5000);
        Object object2 = this.o\u00d4\u00f5000[n2];
        this.o\u00d4\u00f5000[n2] = object;
        return object2;
    }

    @Override
    public final int indexOf(Object object) {
        for (int i2 = 0; i2 < this.O\u00d4\u00f5000; ++i2) {
            if (!fc.o00000(this.o\u00d4\u00f5000[i2], object)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object object) {
        for (int i2 = this.O\u00d4\u00f5000 - 1; i2 >= 0; --i2) {
            if (!fc.o00000(this.o\u00d4\u00f5000[i2], object)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final Iterator iterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator(int n2) {
        kb.return.Object(n2, this.O\u00d4\u00f5000);
        return new f$_b(this, n2);
    }

    @Override
    public final boolean add(Object object) {
        this.\u00d4o\u00d3000();
        f f2 = this;
        f2.o00000(f2.O\u00d4\u00f5000, object);
        return true;
    }

    @Override
    public final void add(int n2, Object object) {
        this.\u00d4o\u00d3000();
        kb.return.Object(n2, this.O\u00d4\u00f5000);
        this.o00000(n2, object);
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.\u00d4o\u00d3000();
        int n2 = collection.size();
        f f2 = this;
        f2.o00000(f2.O\u00d4\u00f5000, collection, n2);
        return n2 > 0;
    }

    public final boolean addAll(int n2, Collection collection) {
        this.\u00d4o\u00d3000();
        kb.return.Object(n2, this.O\u00d4\u00f5000);
        int n3 = collection.size();
        this.o00000(n2, collection, n3);
        return n3 > 0;
    }

    @Override
    public final void clear() {
        this.\u00d4o\u00d3000();
        this.\u00d400000(0, this.O\u00d4\u00f5000);
    }

    @Override
    public final Object O\u00d80000(int n2) {
        this.\u00d4o\u00d3000();
        kb.return.\u00d200000(n2, this.O\u00d4\u00f5000);
        return this.o\u00d80000(n2);
    }

    @Override
    public final boolean remove(Object object) {
        this.\u00d4o\u00d3000();
        int n2 = this.indexOf(object);
        if (n2 >= 0) {
            ((cb)this).O\u00d80000(n2);
        }
        return n2 >= 0;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        this.\u00d4o\u00d3000();
        return this.o00000(0, this.O\u00d4\u00f5000, collection, false) > 0;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        this.\u00d4o\u00d3000();
        return this.o00000(0, this.O\u00d4\u00f5000, collection, true) > 0;
    }

    public final List subList(int n2, int n3) {
        kb.return.\u00d200000(n2, n3, this.O\u00d4\u00f5000);
        return new f$_c(this.o\u00d4\u00f5000, n2, n3 - n2, null, this);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        if (objectArray.length < this.O\u00d4\u00f5000) {
            return Arrays.copyOfRange(this.o\u00d4\u00f5000, 0, this.O\u00d4\u00f5000, objectArray.getClass());
        }
        z.o00000(this.o\u00d4\u00f5000, objectArray, 0, 0, this.O\u00d4\u00f5000);
        return mc.o00000(this.O\u00d4\u00f5000, objectArray);
    }

    @Override
    public final Object[] toArray() {
        return z.\u00d300000(this.o\u00d4\u00f5000, 0, this.O\u00d4\u00f5000);
    }

    @Override
    public final boolean equals(Object object) {
        return object == this || object instanceof List && this.\u00d4O0000((List)object);
    }

    @Override
    public final int hashCode() {
        return g.\u00d200000(this.o\u00d4\u00f5000, 0, this.O\u00d4\u00f5000);
    }

    @Override
    public final String toString() {
        return g.o00000(this.o\u00d4\u00f5000, 0, this.O\u00d4\u00f5000, (Collection)this);
    }

    private final void \u00d8o\u00d3000() {
        ++this.modCount;
    }

    private final void \u00d4o\u00d3000() {
        if (this.newthisclass) {
            throw new UnsupportedOperationException();
        }
    }

    private final void nullclass(int n2) {
        f f2 = this;
        f2.\u00d3\u00d80000(f2.O\u00d4\u00f5000 + n2);
    }

    private final void \u00d3\u00d80000(int n2) {
        if (n2 < 0) {
            throw new OutOfMemoryError();
        }
        if (n2 > this.o\u00d4\u00f5000.length) {
            n2 = kb.return.o00000(this.o\u00d4\u00f5000.length, n2);
            this.o\u00d4\u00f5000 = g.\u00d200000(this.o\u00d4\u00f5000, n2);
        }
    }

    private final boolean \u00d4O0000(List list) {
        return g.\u00d200000(this.o\u00d4\u00f5000, 0, this.O\u00d4\u00f5000, list);
    }

    private final void \u00d300000(int n2, int n3) {
        this.nullclass(n3);
        Object[] objectArray = this.o\u00d4\u00f5000;
        Object[] objectArray2 = this.o\u00d4\u00f5000;
        int n4 = this.O\u00d4\u00f5000;
        int n5 = n2 + n3;
        z.o00000(objectArray, objectArray2, n5, n2, n4);
        this.O\u00d4\u00f5000 += n3;
    }

    private final void o00000(int n2, Object object) {
        this.\u00d8o\u00d3000();
        this.\u00d300000(n2, 1);
        this.o\u00d4\u00f5000[n2] = object;
    }

    private final void o00000(int n2, Collection object, int n3) {
        this.\u00d8o\u00d3000();
        this.\u00d300000(n2, n3);
        object = object.iterator();
        for (int i2 = 0; i2 < n3; ++i2) {
            this.o\u00d4\u00f5000[n2 + i2] = object.next();
        }
    }

    private final Object o\u00d80000(int n2) {
        this.\u00d8o\u00d3000();
        Object object = this.o\u00d4\u00f5000[n2];
        Object[] objectArray = this.o\u00d4\u00f5000;
        Object[] objectArray2 = this.o\u00d4\u00f5000;
        int n3 = n2 + 1;
        int n4 = this.O\u00d4\u00f5000;
        z.o00000(objectArray, objectArray2, n2, n3, n4);
        g.o00000(this.o\u00d4\u00f5000, this.O\u00d4\u00f5000 - 1);
        int n5 = this.O\u00d4\u00f5000;
        this.O\u00d4\u00f5000 = n5 + -1;
        return object;
    }

    private final void \u00d400000(int n2, int n3) {
        if (n3 > 0) {
            this.\u00d8o\u00d3000();
        }
        Object[] objectArray = this.o\u00d4\u00f5000;
        Object[] objectArray2 = this.o\u00d4\u00f5000;
        int n4 = n2 + n3;
        int n5 = this.O\u00d4\u00f5000;
        z.o00000(objectArray, objectArray2, n2, n4, n5);
        g.Object(this.o\u00d4\u00f5000, this.O\u00d4\u00f5000 - n3, this.O\u00d4\u00f5000);
        this.O\u00d4\u00f5000 -= n3;
    }

    private final int o00000(int n2, int n3, Collection collection, boolean bl) {
        int n4 = 0;
        int n5 = 0;
        while (n4 < n3) {
            if (collection.contains(this.o\u00d4\u00f5000[n2 + n4]) == bl) {
                this.o\u00d4\u00f5000[n2 + n5++] = this.o\u00d4\u00f5000[n2 + n4++];
                continue;
            }
            ++n4;
        }
        int n6 = n3 - n5;
        Object[] objectArray = this.o\u00d4\u00f5000;
        Object[] objectArray2 = this.o\u00d4\u00f5000;
        n3 = n2 + n3;
        int n7 = this.O\u00d4\u00f5000;
        z.o00000(objectArray, objectArray2, n2 += n5, n3, n7);
        g.Object(this.o\u00d4\u00f5000, this.O\u00d4\u00f5000 - n6, this.O\u00d4\u00f5000);
        if (n6 > 0) {
            this.\u00d8o\u00d3000();
        }
        this.O\u00d4\u00f5000 -= n6;
        return n6;
    }

    public f() {
        this(0, 1, null);
    }

    public static final /* synthetic */ int \u00d400000(f f2) {
        return f2.modCount;
    }

    public static final /* synthetic */ int new(f f2) {
        return f2.O\u00d4\u00f5000;
    }

    public static final /* synthetic */ Object[] o00000(f f2) {
        return f2.o\u00d4\u00f5000;
    }

    public static final /* synthetic */ boolean \u00d300000(f f2) {
        return f2.newthisclass;
    }

    public static final /* synthetic */ void o00000(f f2, int n2, Object object) {
        f2.o00000(n2, object);
    }

    public static final /* synthetic */ void o00000(f f2, int n2, Collection collection, int n3) {
        f2.o00000(n2, collection, n3);
    }

    public static final /* synthetic */ Object o00000(f f2, int n2) {
        return f2.o\u00d80000(n2);
    }

    public static final /* synthetic */ void o00000(f f2, int n2, int n3) {
        f2.\u00d400000(n2, n3);
    }

    public static final /* synthetic */ int o00000(f f2, int n2, int n3, Collection collection, boolean bl) {
        return f2.o00000(n2, n3, collection, bl);
    }

    static {
        f f2 = new f(0);
        new f(0).newthisclass = true;
        \u00f8\u00d3\u00f5000 = f2;
    }
}

