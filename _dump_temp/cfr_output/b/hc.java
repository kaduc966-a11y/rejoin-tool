/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.dd;
import b.hc$_b;
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
public final class hc
implements Collection,
g {
    private final short[] \u00d4\u00d3\u00f6000;

    public static /* synthetic */ void \u00d4\u00f5\u00d3000() {
    }

    public static short[] \u00d4\u00f50000(int n2) {
        return hc.return(new short[n2]);
    }

    public static final short o00000(short[] sArray, int n2) {
        return dd.\u00d2O0000(sArray[n2]);
    }

    public static final void o00000(short[] sArray, int n2, short s2) {
        sArray[n2] = s2;
    }

    public static int \u00d400000(short[] sArray) {
        return sArray.length;
    }

    public final int \u00d5\u00f5\u00d3000() {
        return hc.\u00d400000(this.\u00d4\u00d3\u00f6000);
    }

    public static Iterator new(short[] sArray) {
        return new hc$_b(sArray);
    }

    @Override
    public final Iterator iterator() {
        return hc.new(this.\u00d4\u00d3\u00f6000);
    }

    public static boolean o00000(short[] sArray, short s2) {
        return z.\u00d200000(sArray, s2);
    }

    public final boolean \u00f400000(short s2) {
        return hc.o00000(this.\u00d4\u00d3\u00f6000, s2);
    }

    public static boolean o00000(short[] sArray, Collection object) {
        if (!((Collection)(object = (Iterable)object)).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object e2 = object.next();
                if (e2 instanceof dd && z.\u00d200000(sArray, ((dd)e2).o00000())) continue;
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection collection) {
        return hc.o00000(this.\u00d4\u00d3\u00f6000, collection);
    }

    public static boolean o00000(short[] sArray) {
        return sArray.length == 0;
    }

    @Override
    public final boolean isEmpty() {
        return hc.o00000(this.\u00d4\u00d3\u00f6000);
    }

    public static String \u00d800000(short[] sArray) {
        return "UShortArray(storage=" + Arrays.toString(sArray) + ')';
    }

    public final String toString() {
        return hc.\u00d800000(this.\u00d4\u00d3\u00f6000);
    }

    public static int \u00d300000(short[] sArray) {
        return Arrays.hashCode(sArray);
    }

    @Override
    public final int hashCode() {
        return hc.\u00d300000(this.\u00d4\u00d3\u00f6000);
    }

    public static boolean o00000(short[] sArray, Object object) {
        if (!(object instanceof hc)) {
            return false;
        }
        return fc.o00000((Object)sArray, (Object)((hc)object).forclassnew());
    }

    @Override
    public final boolean equals(Object object) {
        return hc.o00000(this.\u00d4\u00d3\u00f6000, object);
    }

    public final boolean \u00d800000(short s2) {
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

    private /* synthetic */ hc(short[] sArray) {
        this.\u00d4\u00d3\u00f6000 = sArray;
    }

    public static short[] return(short[] sArray) {
        return sArray;
    }

    public static final /* synthetic */ hc \u00d500000(short[] sArray) {
        return new hc(sArray);
    }

    public final /* synthetic */ short[] forclassnew() {
        return this.\u00d4\u00d3\u00f6000;
    }

    public static final boolean o00000(short[] sArray, short[] sArray2) {
        return fc.o00000((Object)sArray, (Object)sArray2);
    }

    @Override
    public final /* synthetic */ int size() {
        return this.\u00d5\u00f5\u00d3000();
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof dd)) {
            return false;
        }
        return this.\u00f400000(((dd)object).o00000());
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

