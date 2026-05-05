/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.f;
import b.nc$_b;
import b.o.d.c.g;
import b.o.d.fc;
import b.o.d.gb;
import b.s.z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nc
implements Collection,
g {
    private final long[] \u00d8\u00d3\u00f6000;

    public static /* synthetic */ void \u00f4\u00f5\u00d3000() {
    }

    public static long[] \u00d5\u00f50000(int n2) {
        return nc.return(new long[n2]);
    }

    public static final long o00000(long[] lArray, int n2) {
        return f.super(lArray[n2]);
    }

    public static final void o00000(long[] lArray, int n2, long l2) {
        lArray[n2] = l2;
    }

    public static int \u00d500000(long[] lArray) {
        return lArray.length;
    }

    public final int \u00f5\u00f5\u00d3000() {
        return nc.\u00d500000(this.\u00d8\u00d3\u00f6000);
    }

    public static Iterator \u00d300000(long[] lArray) {
        return new nc$_b(lArray);
    }

    @Override
    public final Iterator iterator() {
        return nc.\u00d300000(this.\u00d8\u00d3\u00f6000);
    }

    public static boolean o00000(long[] lArray, long l2) {
        return z.\u00d300000(lArray, l2);
    }

    public final boolean \u00f500000(long l2) {
        return nc.o00000(this.\u00d8\u00d3\u00f6000, l2);
    }

    public static boolean o00000(long[] lArray, Collection object) {
        if (!((Collection)(object = (Iterable)object)).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object e2 = object.next();
                if (e2 instanceof f && z.\u00d300000(lArray, ((f)e2).super())) continue;
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection collection) {
        return nc.o00000(this.\u00d8\u00d3\u00f6000, collection);
    }

    public static boolean o00000(long[] lArray) {
        return lArray.length == 0;
    }

    @Override
    public final boolean isEmpty() {
        return nc.o00000(this.\u00d8\u00d3\u00f6000);
    }

    public static String \u00d800000(long[] lArray) {
        return "ULongArray(storage=" + Arrays.toString(lArray) + ')';
    }

    public final String toString() {
        return nc.\u00d800000(this.\u00d8\u00d3\u00f6000);
    }

    public static int new(long[] lArray) {
        return Arrays.hashCode(lArray);
    }

    @Override
    public final int hashCode() {
        return nc.new(this.\u00d8\u00d3\u00f6000);
    }

    public static boolean o00000(long[] lArray, Object object) {
        if (!(object instanceof nc)) {
            return false;
        }
        return fc.o00000((Object)lArray, (Object)((nc)object).privateclassnew());
    }

    @Override
    public final boolean equals(Object object) {
        return nc.o00000(this.\u00d8\u00d3\u00f6000, object);
    }

    public final boolean if(long l2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private /* synthetic */ nc(long[] lArray) {
        this.\u00d8\u00d3\u00f6000 = lArray;
    }

    public static long[] return(long[] lArray) {
        return lArray;
    }

    public static final /* synthetic */ nc \u00d400000(long[] lArray) {
        return new nc(lArray);
    }

    public final /* synthetic */ long[] privateclassnew() {
        return this.\u00d8\u00d3\u00f6000;
    }

    public static final boolean o00000(long[] lArray, long[] lArray2) {
        return fc.o00000((Object)lArray, (Object)lArray2);
    }

    @Override
    public final /* synthetic */ int size() {
        return this.\u00f5\u00f5\u00d3000();
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof f)) {
            return false;
        }
        return this.\u00f500000(((f)object).super());
    }

    public final /* synthetic */ boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object[] toArray(Object[] objectArray) {
        return gb.o00000(this, objectArray);
    }

    @Override
    public final Object[] toArray() {
        return gb.o00000(this);
    }
}

