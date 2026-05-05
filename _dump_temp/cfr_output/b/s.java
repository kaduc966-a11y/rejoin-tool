/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.lc;
import b.o.d.c.g;
import b.o.d.fc;
import b.o.d.gb;
import b.s$_b;
import b.s.z;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class s
implements Collection,
g {
    private final byte[] privatevoidclass;

    public static /* synthetic */ void \u00f5\u00f4\u00d3000() {
    }

    public static byte[] O\u00f50000(int n2) {
        return s.return(new byte[n2]);
    }

    public static final byte o00000(byte[] byArray, int n2) {
        return lc.super(byArray[n2]);
    }

    public static final void o00000(byte[] byArray, int n2, byte by) {
        byArray[n2] = by;
    }

    public static int o00000(byte[] byArray) {
        return byArray.length;
    }

    public final int Stringclassnew() {
        return s.o00000(this.privatevoidclass);
    }

    public static Iterator \u00d300000(byte[] byArray) {
        return new s$_b(byArray);
    }

    @Override
    public final Iterator iterator() {
        return s.\u00d300000(this.privatevoidclass);
    }

    public static boolean o00000(byte[] byArray, byte by) {
        return z.String(byArray, by);
    }

    public final boolean \u00d800000(byte by) {
        return s.o00000(this.privatevoidclass, by);
    }

    public static boolean o00000(byte[] byArray, Collection object) {
        if (!((Collection)(object = (Iterable)object)).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                Object e2 = object.next();
                if (e2 instanceof lc && z.String(byArray, ((lc)e2).super())) continue;
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection collection) {
        return s.o00000(this.privatevoidclass, collection);
    }

    public static boolean \u00d500000(byte[] byArray) {
        return byArray.length == 0;
    }

    @Override
    public final boolean isEmpty() {
        return s.\u00d500000(this.privatevoidclass);
    }

    public static String new(byte[] byArray) {
        return "UByteArray(storage=" + Arrays.toString(byArray) + ')';
    }

    public final String toString() {
        return s.new(this.privatevoidclass);
    }

    public static int \u00d800000(byte[] byArray) {
        return Arrays.hashCode(byArray);
    }

    @Override
    public final int hashCode() {
        return s.\u00d800000(this.privatevoidclass);
    }

    public static boolean o00000(byte[] byArray, Object object) {
        if (!(object instanceof s)) {
            return false;
        }
        return fc.o00000((Object)byArray, (Object)((s)object).\u00f4\u00f4\u00d3000());
    }

    @Override
    public final boolean equals(Object object) {
        return s.o00000(this.privatevoidclass, object);
    }

    public final boolean \u00f400000(byte by) {
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

    private /* synthetic */ s(byte[] byArray) {
        this.privatevoidclass = byArray;
    }

    public static byte[] return(byte[] byArray) {
        return byArray;
    }

    public static final /* synthetic */ s \u00d400000(byte[] byArray) {
        return new s(byArray);
    }

    public final /* synthetic */ byte[] \u00f4\u00f4\u00d3000() {
        return this.privatevoidclass;
    }

    public static final boolean o00000(byte[] byArray, byte[] byArray2) {
        return fc.o00000((Object)byArray, (Object)byArray2);
    }

    @Override
    public final /* synthetic */ int size() {
        return this.Stringclassnew();
    }

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof lc)) {
            return false;
        }
        return this.\u00d800000(((lc)object).super());
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

