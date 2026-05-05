/*
 * Decompiled with CFR 0.152.
 */
package b;

import b.ac$_b;
import b.dd;
import b.e.k;
import b.e.z;
import b.f;
import b.jc;
import b.lc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ac
implements Comparable {
    public static final ac$_b \u00d600000 = new ac$_b(null);
    private final int \u00d200000;
    public static final int \u00d500000 = 0;
    public static final int Object = -1;
    public static final int \u00d400000 = 4;
    public static final int o00000 = 32;

    public static /* synthetic */ void new() {
    }

    private static final int return(int n2, byte by) {
        return Integer.compareUnsigned(n2, ac.\u00d500000(by & 0xFF));
    }

    private static final int return(int n2, short s2) {
        return Integer.compareUnsigned(n2, ac.\u00d500000(s2 & 0xFFFF));
    }

    private static int \u00d3O0000(int n2, int n3) {
        return jc.\u00d300000(n2, n3);
    }

    private int \u00d300000(int n2) {
        return jc.\u00d300000(this.o00000(), n2);
    }

    private static final int return(int n2, long l2) {
        return Long.compareUnsigned(f.super((long)n2 & 0xFFFFFFFFL), l2);
    }

    private static final int \u00d300000(int n2, byte by) {
        return ac.\u00d500000(n2 + ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00d400000(int n2, short s2) {
        return ac.\u00d500000(n2 + ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00f800000(int n2, int n3) {
        return ac.\u00d500000(n2 + n3);
    }

    private static final long \u00d300000(int n2, long l2) {
        return f.super(f.super((long)n2 & 0xFFFFFFFFL) + l2);
    }

    private static final int \u00d500000(int n2, byte by) {
        return ac.\u00d500000(n2 - ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00d500000(int n2, short s2) {
        return ac.\u00d500000(n2 - ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int oO0000(int n2, int n3) {
        return ac.\u00d500000(n2 - n3);
    }

    private static final long \u00d500000(int n2, long l2) {
        return f.super(f.super((long)n2 & 0xFFFFFFFFL) - l2);
    }

    private static final int \u00f400000(int n2, byte by) {
        return ac.\u00d500000(n2 * ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00f400000(int n2, short s2) {
        return ac.\u00d500000(n2 * ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int new(int n2, int n3) {
        return ac.\u00d500000(n2 * n3);
    }

    private static final long \u00f400000(int n2, long l2) {
        return f.super(f.super((long)n2 & 0xFFFFFFFFL) * l2);
    }

    private static final int new(int n2, byte by) {
        return Integer.divideUnsigned(n2, ac.\u00d500000(by & 0xFF));
    }

    private static final int new(int n2, short s2) {
        return Integer.divideUnsigned(n2, ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00f400000(int n2, int n3) {
        return jc.\u00d400000(n2, n3);
    }

    private static final long new(int n2, long l2) {
        return Long.divideUnsigned(f.super((long)n2 & 0xFFFFFFFFL), l2);
    }

    private static final int \u00d800000(int n2, byte by) {
        return Integer.remainderUnsigned(n2, ac.\u00d500000(by & 0xFF));
    }

    private static final int \u00d800000(int n2, short s2) {
        return Integer.remainderUnsigned(n2, ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int \u00d4O0000(int n2, int n3) {
        return jc.\u00d200000(n2, n3);
    }

    private static final long \u00d800000(int n2, long l2) {
        return Long.remainderUnsigned(f.super((long)n2 & 0xFFFFFFFFL), l2);
    }

    private static final int o00000(int n2, byte by) {
        return Integer.divideUnsigned(n2, ac.\u00d500000(by & 0xFF));
    }

    private static final int o00000(int n2, short s2) {
        return Integer.divideUnsigned(n2, ac.\u00d500000(s2 & 0xFFFF));
    }

    private static final int return(int n2, int n3) {
        return Integer.divideUnsigned(n2, n3);
    }

    private static final long o00000(int n2, long l2) {
        return Long.divideUnsigned(f.super((long)n2 & 0xFFFFFFFFL), l2);
    }

    private static final byte \u00d400000(int n2, byte by) {
        return lc.super((byte)Integer.remainderUnsigned(n2, ac.\u00d500000(by & 0xFF)));
    }

    private static final short \u00d300000(int n2, short s2) {
        return dd.\u00d2O0000((short)Integer.remainderUnsigned(n2, ac.\u00d500000(s2 & 0xFFFF)));
    }

    private static final int OO0000(int n2, int n3) {
        return Integer.remainderUnsigned(n2, n3);
    }

    private static final long \u00d400000(int n2, long l2) {
        return Long.remainderUnsigned(f.super((long)n2 & 0xFFFFFFFFL), l2);
    }

    private static final int thissuper(int n2) {
        return ac.\u00d500000(n2 + 1);
    }

    private static final int \u00f500000(int n2) {
        return ac.\u00d500000(n2 + -1);
    }

    private static final z \u00d500000(int n2, int n3) {
        return new z(n2, n3, null);
    }

    private static final z while(int n2, int n3) {
        return k.\u00d400000(n2, n3);
    }

    private static final int if(int n2, int n3) {
        return ac.\u00d500000(n2 << n3);
    }

    private static final int o00000(int n2, int n3) {
        return ac.\u00d500000(n2 >>> n3);
    }

    private static final int \u00f500000(int n2, int n3) {
        return ac.\u00d500000(n2 & n3);
    }

    private static final int \u00d400000(int n2, int n3) {
        return ac.\u00d500000(n2 | n3);
    }

    private static final int \u00d800000(int n2, int n3) {
        return ac.\u00d500000(n2 ^ n3);
    }

    private static final int \u00d800000(int n2) {
        return ac.\u00d500000(~n2);
    }

    private static final byte \u00d4O0000(int n2) {
        return (byte)n2;
    }

    private static final short o00000(int n2) {
        return (short)n2;
    }

    private static final int oO0000(int n2) {
        return n2;
    }

    private static final long \u00d400000(int n2) {
        return (long)n2 & 0xFFFFFFFFL;
    }

    private static final byte \u00d3O0000(int n2) {
        return lc.super((byte)n2);
    }

    private static final short \u00d5O0000(int n2) {
        return dd.\u00d2O0000((short)n2);
    }

    private static final int \u00f400000(int n2) {
        return n2;
    }

    private static final long while(int n2) {
        return f.super((long)n2 & 0xFFFFFFFFL);
    }

    private static final float new(int n2) {
        return (float)jc.\u00d300000(n2);
    }

    private static final double if(int n2) {
        return jc.\u00d300000(n2);
    }

    public static String \u00f800000(int n2) {
        return String.valueOf((long)n2 & 0xFFFFFFFFL);
    }

    public final String toString() {
        return ac.\u00f800000(this.\u00d200000);
    }

    public static int OO0000(int n2) {
        return Integer.hashCode(n2);
    }

    public final int hashCode() {
        return ac.OO0000(this.\u00d200000);
    }

    public static boolean o00000(int n2, Object object) {
        if (!(object instanceof ac)) {
            return false;
        }
        int n3 = ((ac)object).o00000();
        return n2 == n3;
    }

    public final boolean equals(Object object) {
        return ac.o00000(this.\u00d200000, object);
    }

    private /* synthetic */ ac(int n2) {
        this.\u00d200000 = n2;
    }

    public static int \u00d500000(int n2) {
        return n2;
    }

    public static final /* synthetic */ ac return(int n2) {
        return new ac(n2);
    }

    public final /* synthetic */ int o00000() {
        return this.\u00d200000;
    }

    public static final boolean \u00d300000(int n2, int n3) {
        return n2 == n3;
    }

    public final /* synthetic */ int compareTo(Object object) {
        ac ac2 = this;
        int n2 = ((ac)object).o00000();
        return jc.\u00d300000(ac2.o00000(), n2);
    }
}

