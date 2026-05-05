/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.ac;
import b.b.d;
import b.dd;
import b.e.ab;
import b.e.bb;
import b.e.db;
import b.e.g;
import b.e.k;
import b.e.r;
import b.e.w;
import b.e.z;
import b.f;
import b.lc;
import b.o.d.fc;
import java.util.NoSuchElementException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class b {
    public static final int \u00d200000(w w2) {
        if (w2.if()) {
            throw new NoSuchElementException("Progression " + w2 + " is empty.");
        }
        return w2.\u00f5\u00d20000();
    }

    public static final long \u00d300000(db db2) {
        if (db2.if()) {
            throw new NoSuchElementException("Progression " + db2 + " is empty.");
        }
        return db2.\u00f8o0000();
    }

    public static final ac \u00d300000(w w2) {
        if (w2.if()) {
            return null;
        }
        return ac.return(w2.\u00f5\u00d20000());
    }

    public static final f super(db db2) {
        if (db2.if()) {
            return null;
        }
        return f.\u00d4O0000(db2.\u00f8o0000());
    }

    public static final int class(w w2) {
        if (w2.if()) {
            throw new NoSuchElementException("Progression " + w2 + " is empty.");
        }
        return w2.ifnew();
    }

    public static final long \u00d200000(db db2) {
        if (db2.if()) {
            throw new NoSuchElementException("Progression " + db2 + " is empty.");
        }
        return db2.O\u00d20000();
    }

    public static final ac super(w w2) {
        if (w2.if()) {
            return null;
        }
        return ac.return(w2.ifnew());
    }

    public static final f \u00d400000(db db2) {
        if (db2.if()) {
            return null;
        }
        return f.\u00d4O0000(db2.O\u00d20000());
    }

    private static final int super(z z2) {
        return k.\u00d200000(z2, (b.b.f)b.b.f.super);
    }

    private static final long \u00d200000(r r2) {
        return k.super(r2, (b.b.f)b.b.f.super);
    }

    public static final int \u00d200000(z z2, b.b.f f2) {
        try {
            return d.o00000(f2, z2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchElementException(illegalArgumentException.getMessage());
        }
    }

    public static final long super(r r2, b.b.f f2) {
        try {
            return d.o00000(f2, r2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchElementException(illegalArgumentException.getMessage());
        }
    }

    private static final ac \u00d200000(z z2) {
        return k.super(z2, (b.b.f)b.b.f.super);
    }

    private static final f super(r r2) {
        return k.\u00d200000(r2, (b.b.f)b.b.f.super);
    }

    public static final ac super(z z2, b.b.f f2) {
        if (((w)z2).if()) {
            return null;
        }
        return ac.return(d.o00000(f2, z2));
    }

    public static final f \u00d200000(r r2, b.b.f f2) {
        if (((db)r2).if()) {
            return null;
        }
        return f.\u00d4O0000(d.o00000(f2, r2));
    }

    private static final boolean super(z z2, ac ac2) {
        return ac2 != null && z2.oo0000(ac2.o00000());
    }

    private static final boolean super(r r2, f f2) {
        return f2 != null && r2.\u00d800000(f2.super());
    }

    public static final boolean super(z z2, byte by) {
        return z2.oo0000(ac.\u00d500000(by & 0xFF));
    }

    public static final boolean super(r r2, byte by) {
        return r2.\u00d800000(f.super((long)by & 0xFFL));
    }

    public static final boolean super(r r2, int n2) {
        return r2.\u00d800000(f.super((long)n2 & 0xFFFFFFFFL));
    }

    public static final boolean super(z z2, long l2) {
        return f.super(l2 >>> 32) == 0L && z2.oo0000(ac.\u00d500000((int)l2));
    }

    public static final boolean super(z z2, short s2) {
        return z2.oo0000(ac.\u00d500000(s2 & 0xFFFF));
    }

    public static final boolean super(r r2, short s2) {
        return r2.\u00d800000(f.super((long)s2 & 0xFFFFL));
    }

    public static final w \u00d200000(byte by, byte by2) {
        return w.\u00f4\u00d40000.o00000(ac.\u00d500000(by & 0xFF), ac.\u00d500000(by2 & 0xFF), -1);
    }

    public static final w \u00d300000(int n2, int n3) {
        return w.\u00f4\u00d40000.o00000(n2, n3, -1);
    }

    public static final db \u00d400000(long l2, long l3) {
        return db.o\u00d40000.o00000(l2, l3, -1L);
    }

    public static final w super(short s2, short s3) {
        return w.\u00f4\u00d40000.o00000(ac.\u00d500000(s2 & 0xFFFF), ac.\u00d500000(s3 & 0xFFFF), -1);
    }

    public static final w \u00d400000(w w2) {
        return w.\u00f4\u00d40000.o00000(w2.ifnew(), w2.\u00f5\u00d20000(), -w2.\u00f4\u00d20000());
    }

    public static final db class(db db2) {
        return db.o\u00d40000.o00000(db2.O\u00d20000(), db2.\u00f8o0000(), -db2.privatesuper());
    }

    public static final w super(w w2, int n2) {
        bb.o00000(n2 > 0, (Number)n2);
        return w.\u00f4\u00d40000.o00000(w2.\u00f5\u00d20000(), w2.ifnew(), w2.\u00f4\u00d20000() > 0 ? n2 : -n2);
    }

    public static final db super(db db2, long l2) {
        bb.o00000(l2 > 0L, (Number)l2);
        return db.o\u00d40000.o00000(db2.\u00f8o0000(), db2.O\u00d20000(), db2.privatesuper() > 0L ? l2 : -l2);
    }

    public static final z super(byte by, byte by2) {
        if (fc.o00000(by2 & 0xFF, 0) <= 0) {
            return z.\u00f4\u00d40000.super();
        }
        by = (byte)ac.\u00d500000(by & 0xFF);
        by2 = (byte)ac.\u00d500000(ac.\u00d500000(by2 & 0xFF) - 1);
        return new z(by, by2, null);
    }

    public static final z \u00d400000(int n2, int n3) {
        if (Integer.compareUnsigned(n3, 0) <= 0) {
            return z.\u00f4\u00d40000.super();
        }
        return new z(n2, ac.\u00d500000(n3 - 1), null);
    }

    public static final r \u00d300000(long l2, long l3) {
        if (Long.compareUnsigned(l3, 0L) <= 0) {
            return r.o\u00d40000.o00000();
        }
        long l4 = f.super(l3 - f.super(1L));
        return new r(l2, l4, null);
    }

    public static final z \u00d400000(short s2, short s3) {
        if (fc.o00000(s3 & 0xFFFF, 0) <= 0) {
            return z.\u00f4\u00d40000.super();
        }
        s2 = (short)ac.\u00d500000(s2 & 0xFFFF);
        s3 = (short)ac.\u00d500000(ac.\u00d500000(s3 & 0xFFFF) - 1);
        return new z(s2, s3, null);
    }

    public static final int super(int n2, int n3) {
        if (Integer.compareUnsigned(n2, n3) < 0) {
            return n3;
        }
        return n2;
    }

    public static final long super(long l2, long l3) {
        if (Long.compareUnsigned(l2, l3) < 0) {
            return l3;
        }
        return l2;
    }

    public static final byte \u00d300000(byte by, byte by2) {
        if (fc.o00000(by & 0xFF, by2 & 0xFF) < 0) {
            return by2;
        }
        return by;
    }

    public static final short \u00d200000(short s2, short s3) {
        if (fc.o00000(s2 & 0xFFFF, s3 & 0xFFFF) < 0) {
            return s3;
        }
        return s2;
    }

    public static final int \u00d200000(int n2, int n3) {
        if (Integer.compareUnsigned(n2, n3) > 0) {
            return n3;
        }
        return n2;
    }

    public static final long \u00d200000(long l2, long l3) {
        if (Long.compareUnsigned(l2, l3) > 0) {
            return l3;
        }
        return l2;
    }

    public static final byte \u00d400000(byte by, byte by2) {
        if (fc.o00000(by & 0xFF, by2 & 0xFF) > 0) {
            return by2;
        }
        return by;
    }

    public static final short \u00d300000(short s2, short s3) {
        if (fc.o00000(s2 & 0xFFFF, s3 & 0xFFFF) > 0) {
            return s3;
        }
        return s2;
    }

    public static final int super(int n2, int n3, int n4) {
        if (Integer.compareUnsigned(n3, n4) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ac.\u00f800000(n4) + " is less than minimum " + ac.\u00f800000(n3) + '.');
        }
        if (Integer.compareUnsigned(n2, n3) < 0) {
            return n3;
        }
        if (Integer.compareUnsigned(n2, n4) > 0) {
            return n4;
        }
        return n2;
    }

    public static final long super(long l2, long l3, long l4) {
        if (Long.compareUnsigned(l3, l4) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f.\u00d400000(l4) + " is less than minimum " + f.\u00d400000(l3) + '.');
        }
        if (Long.compareUnsigned(l2, l3) < 0) {
            return l3;
        }
        if (Long.compareUnsigned(l2, l4) > 0) {
            return l4;
        }
        return l2;
    }

    public static final byte super(byte by, byte by2, byte by3) {
        if (fc.o00000(by2 & 0xFF, by3 & 0xFF) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + lc.\u00d300000(by3) + " is less than minimum " + lc.\u00d300000(by2) + '.');
        }
        if (fc.o00000(by & 0xFF, by2 & 0xFF) < 0) {
            return by2;
        }
        if (fc.o00000(by & 0xFF, by3 & 0xFF) > 0) {
            return by3;
        }
        return by;
    }

    public static final short super(short s2, short s3, short s4) {
        if (fc.o00000(s3 & 0xFFFF, s4 & 0xFFFF) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + dd.\u00d300000(s4) + " is less than minimum " + dd.\u00d300000(s3) + '.');
        }
        if (fc.o00000(s2 & 0xFFFF, s3 & 0xFFFF) < 0) {
            return s3;
        }
        if (fc.o00000(s2 & 0xFFFF, s4 & 0xFFFF) > 0) {
            return s4;
        }
        return s2;
    }

    public static final int super(int n2, g g2) {
        if (g2 instanceof ab) {
            return ((ac)bb.o00000((Comparable)ac.return(n2), (ab)g2)).o00000();
        }
        if (g2.if()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g2 + '.');
        }
        if (Integer.compareUnsigned(n2, ((ac)g2.OO0000()).o00000()) < 0) {
            return ((ac)g2.OO0000()).o00000();
        }
        if (Integer.compareUnsigned(n2, ((ac)g2.\u00f800000()).o00000()) > 0) {
            return ((ac)g2.\u00f800000()).o00000();
        }
        return n2;
    }

    public static final long super(long l2, g g2) {
        if (g2 instanceof ab) {
            return ((f)bb.o00000((Comparable)f.\u00d4O0000(l2), (ab)g2)).super();
        }
        if (g2.if()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g2 + '.');
        }
        if (Long.compareUnsigned(l2, ((f)g2.OO0000()).super()) < 0) {
            return ((f)g2.OO0000()).super();
        }
        if (Long.compareUnsigned(l2, ((f)g2.\u00f800000()).super()) > 0) {
            return ((f)g2.\u00f800000()).super();
        }
        return l2;
    }
}

