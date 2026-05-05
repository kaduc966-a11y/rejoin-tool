/*
 * Decompiled with CFR 0.152.
 */
package b.s;

import b.ac;
import b.dd;
import b.f;
import b.hc;
import b.lc;
import b.nc;
import b.s;
import b.v;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class jb {
    public static final byte[] \u00d400000(Collection object) {
        byte[] byArray = s.O\u00f50000(object.size());
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            byte by = ((lc)object.next()).super();
            s.o00000(byArray, n2++, by);
        }
        return byArray;
    }

    public static final int[] \u00d200000(Collection object) {
        int[] nArray = v.o\u00f50000(object.size());
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((ac)object.next()).o00000();
            v.o00000(nArray, n2++, n3);
        }
        return nArray;
    }

    public static final long[] \u00d300000(Collection object) {
        long[] lArray = nc.\u00d5\u00f50000(object.size());
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            long l2 = ((f)object.next()).super();
            nc.o00000(lArray, n2++, l2);
        }
        return lArray;
    }

    public static final short[] super(Collection object) {
        short[] sArray = hc.\u00d4\u00f50000(object.size());
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            short s2 = ((dd)object.next()).o00000();
            hc.o00000(sArray, n2++, s2);
        }
        return sArray;
    }

    public static final int super(Iterable object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            int n3 = ((ac)object.next()).o00000();
            n2 = ac.\u00d500000(n2 + n3);
        }
        return n2;
    }

    public static final long \u00d400000(Iterable object) {
        long l2 = 0L;
        object = object.iterator();
        while (object.hasNext()) {
            long l3 = ((f)object.next()).super();
            l2 = f.super(l2 + l3);
        }
        return l2;
    }

    public static final int \u00d200000(Iterable object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            byte by = ((lc)object.next()).super();
            n2 = ac.\u00d500000(n2 + ac.\u00d500000(by & 0xFF));
        }
        return n2;
    }

    public static final int \u00d300000(Iterable object) {
        int n2 = 0;
        object = object.iterator();
        while (object.hasNext()) {
            short s2 = ((dd)object.next()).o00000();
            n2 = ac.\u00d500000(n2 + ac.\u00d500000(s2 & 0xFFFF));
        }
        return n2;
    }
}

