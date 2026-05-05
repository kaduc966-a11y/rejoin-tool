/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.ac;
import b.dd;
import b.f;
import b.g.n;
import b.lc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class q {
    public static final int \u00d400000(n object) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            int n3 = ((ac)object.next()).o00000();
            n2 = ac.\u00d500000(n2 + n3);
        }
        return n2;
    }

    public static final long \u00d300000(n object) {
        long l2 = 0L;
        object = object.o00000();
        while (object.hasNext()) {
            long l3 = ((f)object.next()).super();
            l2 = f.super(l2 + l3);
        }
        return l2;
    }

    public static final int super(n object) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            byte by = ((lc)object.next()).super();
            n2 = ac.\u00d500000(n2 + ac.\u00d500000(by & 0xFF));
        }
        return n2;
    }

    public static final int \u00d200000(n object) {
        int n2 = 0;
        object = object.o00000();
        while (object.hasNext()) {
            short s2 = ((dd)object.next()).o00000();
            n2 = ac.\u00d500000(n2 + ac.\u00d500000(s2 & 0xFFFF));
        }
        return n2;
    }
}

