/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ac;
import b.o.d.c.g;
import b.o.d.fc;
import b.o.d.gb;
import b.s.z;
import b.v$_b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class v
implements Collection,
g {
    private final int[] o\u00d3\u00f6000;

    public static /* synthetic */ void O\u00f5\u00d3000() {
    }

    public static int[] o\u00f50000(int n2) {
        return v.return(new int[n2]);
    }

    public static final int new(int[] nArray, int n2) {
        return ac.\u00d500000(nArray[n2]);
    }

    public static final void o00000(int[] nArray, int n2, int n3) {
        nArray[n2] = n3;
    }

    public static int \u00d300000(int[] nArray) {
        return nArray.length;
    }

    public final int o\u00f5\u00d3000() {
        return v.\u00d300000(this.o\u00d3\u00f6000);
    }

    public static Iterator o00000(int[] nArray) {
        return new v$_b(nArray);
    }

    @Override
    public final Iterator iterator() {
        return v.o00000(this.o\u00d3\u00f6000);
    }

    public static boolean o00000(int[] nArray, int n2) {
        return z.\u00f600000(nArray, n2);
    }

    public final boolean \u00d3\u00f50000(int n2) {
        return v.o00000(this.o\u00d3\u00f6000, n2);
    }

    public static boolean o00000(int[] nArray, Collection object) {
        if (!((Collection)(object = (Iterable)object)).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object e2 = object.next();
                if (e2 instanceof ac && z.\u00f600000(nArray, ((ac)e2).o00000())) continue;
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection collection) {
        return v.o00000(this.o\u00d3\u00f6000, collection);
    }

    public static boolean \u00d500000(int[] nArray) {
        return nArray.length == 0;
    }

    @Override
    public final boolean isEmpty() {
        return v.\u00d500000(this.o\u00d3\u00f6000);
    }

    public static String \u00d400000(int[] nArray) {
        return "UIntArray(storage=" + Arrays.toString(nArray) + ')';
    }

    public final String toString() {
        return v.\u00d400000(this.o\u00d3\u00f6000);
    }

    public static int \u00d800000(int[] nArray) {
        return Arrays.hashCode(nArray);
    }

    @Override
    public final int hashCode() {
        return v.\u00d800000(this.o\u00d3\u00f6000);
    }

    public static boolean o00000(int[] nArray, Object object) {
        if (!(object instanceof v)) {
            return false;
        }
        return fc.o00000((Object)nArray, (Object)((v)object).nullclassnew());
    }

    @Override
    public final boolean equals(Object object) {
        return v.o00000(this.o\u00d3\u00f6000, object);
    }

    public final boolean whilereturn(int n2) {
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

    private /* synthetic */ v(int[] nArray) {
        this.o\u00d3\u00f6000 = nArray;
    }

    public static int[] return(int[] nArray) {
        return nArray;
    }

    public static final /* synthetic */ v new(int[] nArray) {
        return new v(nArray);
    }

    public final /* synthetic */ int[] nullclassnew() {
        return this.o\u00d3\u00f6000;
    }

    public static final boolean o00000(int[] nArray, int[] nArray2) {
        return fc.o00000((Object)nArray, (Object)nArray2);
    }

    @Override
    public final /* synthetic */ int size() {
        return this.o\u00f5\u00d3000();
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof ac)) {
            return false;
        }
        return this.\u00d3\u00f50000(((ac)object).o00000());
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

