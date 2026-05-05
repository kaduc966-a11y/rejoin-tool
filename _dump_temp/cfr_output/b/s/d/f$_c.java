/*
 * Decompiled with CFR 0.152.
 */
package b.s.d;

import b.o.d.fc;
import b.s.cb;
import b.s.d.f;
import b.s.d.f$_c$_b;
import b.s.d.g;
import b.s.d.k;
import b.s.kb;
import b.s.mc;
import b.s.z;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class f$_c
extends cb
implements Serializable,
List,
RandomAccess,
b.o.d.c.f {
    private Object[] whilethisclass;
    private final int \u00d3\u00d5\u00f5000;
    private int o\u00d5\u00f5000;
    private final f$_c O\u00d5\u00f5000;
    private final f \u00f8\u00d4\u00f5000;

    public f$_c(Object[] objectArray, int n2, int n3, f$_c f$_c, f f2) {
        this.whilethisclass = objectArray;
        this.\u00d3\u00d5\u00f5000 = n2;
        this.o\u00d5\u00f5000 = n3;
        this.O\u00d5\u00f5000 = f$_c;
        this.\u00f8\u00d4\u00f5000 = f2;
        this.modCount = f.\u00d400000(this.\u00f8\u00d4\u00f5000);
    }

    private final Object \u00d8\u00d2\u00d3000() {
        if (this.thissupernew()) {
            return new k(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final void \u00d400000(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override
    public final int \u00d3o\u00d3000() {
        this.\u00d5\u00d2\u00d3000();
        return this.o\u00d5\u00f5000;
    }

    @Override
    public final boolean isEmpty() {
        this.\u00d5\u00d2\u00d3000();
        return this.o\u00d5\u00f5000 == 0;
    }

    public final Object get(int n2) {
        this.\u00d5\u00d2\u00d3000();
        kb.return.\u00d200000(n2, this.o\u00d5\u00f5000);
        return this.whilethisclass[this.\u00d3\u00d5\u00f5000 + n2];
    }

    @Override
    public final Object set(int n2, Object object) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        kb.return.\u00d200000(n2, this.o\u00d5\u00f5000);
        Object object2 = this.whilethisclass[this.\u00d3\u00d5\u00f5000 + n2];
        this.whilethisclass[this.\u00d3\u00d5\u00f5000 + n2] = object;
        return object2;
    }

    @Override
    public final int indexOf(Object object) {
        this.\u00d5\u00d2\u00d3000();
        for (int i2 = 0; i2 < this.o\u00d5\u00f5000; ++i2) {
            if (!fc.o00000(this.whilethisclass[this.\u00d3\u00d5\u00f5000 + i2], object)) continue;
            return i2;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object object) {
        this.\u00d5\u00d2\u00d3000();
        for (int i2 = this.o\u00d5\u00f5000 - 1; i2 >= 0; --i2) {
            if (!fc.o00000(this.whilethisclass[this.\u00d3\u00d5\u00f5000 + i2], object)) continue;
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
        this.\u00d5\u00d2\u00d3000();
        kb.return.Object(n2, this.o\u00d5\u00f5000);
        return new f$_c$_b(this, n2);
    }

    @Override
    public final boolean add(Object object) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        f$_c f$_c = this;
        f$_c.new(f$_c.\u00d3\u00d5\u00f5000 + this.o\u00d5\u00f5000, object);
        return true;
    }

    @Override
    public final void add(int n2, Object object) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        kb.return.Object(n2, this.o\u00d5\u00f5000);
        f$_c f$_c = this;
        f$_c.new(f$_c.\u00d3\u00d5\u00f5000 + n2, object);
    }

    @Override
    public final boolean addAll(Collection collection) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        int n2 = collection.size();
        f$_c f$_c = this;
        f$_c.new(f$_c.\u00d3\u00d5\u00f5000 + this.o\u00d5\u00f5000, collection, n2);
        return n2 > 0;
    }

    public final boolean addAll(int n2, Collection collection) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        kb.return.Object(n2, this.o\u00d5\u00f5000);
        int n3 = collection.size();
        f$_c f$_c = this;
        f$_c.new(f$_c.\u00d3\u00d5\u00f5000 + n2, collection, n3);
        return n3 > 0;
    }

    @Override
    public final void clear() {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        f$_c f$_c = this;
        f$_c.\u00f500000(f$_c.\u00d3\u00d5\u00f5000, this.o\u00d5\u00f5000);
    }

    @Override
    public final Object O\u00d80000(int n2) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        kb.return.\u00d200000(n2, this.o\u00d5\u00f5000);
        f$_c f$_c = this;
        return f$_c.O\u00f40000(f$_c.\u00d3\u00d5\u00f5000 + n2);
    }

    @Override
    public final boolean remove(Object object) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        int n2 = this.indexOf(object);
        if (n2 >= 0) {
            ((cb)this).O\u00d80000(n2);
        }
        return n2 >= 0;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        f$_c f$_c = this;
        return f$_c.new(f$_c.\u00d3\u00d5\u00f5000, this.o\u00d5\u00f5000, collection, false) > 0;
    }

    @Override
    public final boolean retainAll(Collection collection) {
        this.\u00d4\u00d2\u00d3000();
        this.\u00d5\u00d2\u00d3000();
        f$_c f$_c = this;
        return f$_c.new(f$_c.\u00d3\u00d5\u00f5000, this.o\u00d5\u00f5000, collection, true) > 0;
    }

    public final List subList(int n2, int n3) {
        kb.return.\u00d200000(n2, n3, this.o\u00d5\u00f5000);
        f$_c f$_c = this;
        return new f$_c(this.whilethisclass, this.\u00d3\u00d5\u00f5000 + n2, n3 - n2, f$_c, f$_c.\u00f8\u00d4\u00f5000);
    }

    @Override
    public final Object[] toArray(Object[] objectArray) {
        this.\u00d5\u00d2\u00d3000();
        if (objectArray.length < this.o\u00d5\u00f5000) {
            return Arrays.copyOfRange(this.whilethisclass, this.\u00d3\u00d5\u00f5000, this.\u00d3\u00d5\u00f5000 + this.o\u00d5\u00f5000, objectArray.getClass());
        }
        z.o00000(this.whilethisclass, objectArray, 0, this.\u00d3\u00d5\u00f5000, this.\u00d3\u00d5\u00f5000 + this.o\u00d5\u00f5000);
        return mc.o00000(this.o\u00d5\u00f5000, objectArray);
    }

    @Override
    public final Object[] toArray() {
        this.\u00d5\u00d2\u00d3000();
        return z.\u00d300000(this.whilethisclass, this.\u00d3\u00d5\u00f5000, this.\u00d3\u00d5\u00f5000 + this.o\u00d5\u00f5000);
    }

    @Override
    public final boolean equals(Object object) {
        this.\u00d5\u00d2\u00d3000();
        return object == this || object instanceof List && this.\u00d5O0000((List)object);
    }

    @Override
    public final int hashCode() {
        this.\u00d5\u00d2\u00d3000();
        return g.\u00d200000(this.whilethisclass, this.\u00d3\u00d5\u00f5000, this.o\u00d5\u00f5000);
    }

    @Override
    public final String toString() {
        this.\u00d5\u00d2\u00d3000();
        return g.o00000(this.whilethisclass, this.\u00d3\u00d5\u00f5000, this.o\u00d5\u00f5000, (Collection)this);
    }

    private final void \u00f4\u00d2\u00d3000() {
        ++this.modCount;
    }

    private final void \u00d5\u00d2\u00d3000() {
        if (f.\u00d400000(this.\u00f8\u00d4\u00f5000) != this.modCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void \u00d4\u00d2\u00d3000() {
        if (this.thissupernew()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean thissupernew() {
        return f.\u00d300000(this.\u00f8\u00d4\u00f5000);
    }

    private final boolean \u00d5O0000(List list) {
        return g.\u00d200000(this.whilethisclass, this.\u00d3\u00d5\u00f5000, this.o\u00d5\u00f5000, list);
    }

    private final void new(int n2, Object object) {
        this.\u00f4\u00d2\u00d3000();
        if (this.O\u00d5\u00f5000 != null) {
            this.O\u00d5\u00f5000.new(n2, object);
        } else {
            f.o00000(this.\u00f8\u00d4\u00f5000, n2, object);
        }
        this.whilethisclass = f.o00000(this.\u00f8\u00d4\u00f5000);
        n2 = this.o\u00d5\u00f5000;
        this.o\u00d5\u00f5000 = n2 + 1;
    }

    private final void new(int n2, Collection collection, int n3) {
        this.\u00f4\u00d2\u00d3000();
        if (this.O\u00d5\u00f5000 != null) {
            this.O\u00d5\u00f5000.new(n2, collection, n3);
        } else {
            f.o00000(this.\u00f8\u00d4\u00f5000, n2, collection, n3);
        }
        this.whilethisclass = f.o00000(this.\u00f8\u00d4\u00f5000);
        this.o\u00d5\u00f5000 += n3;
    }

    private final Object O\u00f40000(int n2) {
        this.\u00f4\u00d2\u00d3000();
        Object object = this.O\u00d5\u00f5000 != null ? this.O\u00d5\u00f5000.O\u00f40000(n2) : f.o00000(this.\u00f8\u00d4\u00f5000, n2);
        int n3 = this.o\u00d5\u00f5000;
        this.o\u00d5\u00f5000 = n3 + -1;
        return object;
    }

    private final void \u00f500000(int n2, int n3) {
        if (n3 > 0) {
            this.\u00f4\u00d2\u00d3000();
        }
        if (this.O\u00d5\u00f5000 != null) {
            this.O\u00d5\u00f5000.\u00f500000(n2, n3);
        } else {
            f.o00000(this.\u00f8\u00d4\u00f5000, n2, n3);
        }
        this.o\u00d5\u00f5000 -= n3;
    }

    private final int new(int n2, int n3, Collection collection, boolean bl) {
        n2 = this.O\u00d5\u00f5000 != null ? this.O\u00d5\u00f5000.new(n2, n3, collection, bl) : f.o00000(this.\u00f8\u00d4\u00f5000, n2, n3, collection, bl);
        if (n2 > 0) {
            this.\u00f4\u00d2\u00d3000();
        }
        this.o\u00d5\u00f5000 -= n2;
        return n2;
    }

    public static final /* synthetic */ int new(f$_c f$_c) {
        return f$_c.modCount;
    }

    public static final /* synthetic */ int o00000(f$_c f$_c) {
        return f$_c.o\u00d5\u00f5000;
    }

    public static final /* synthetic */ Object[] \u00d400000(f$_c f$_c) {
        return f$_c.whilethisclass;
    }

    public static final /* synthetic */ int \u00d500000(f$_c f$_c) {
        return f$_c.\u00d3\u00d5\u00f5000;
    }

    public static final /* synthetic */ f \u00d300000(f$_c f$_c) {
        return f$_c.\u00f8\u00d4\u00f5000;
    }
}

