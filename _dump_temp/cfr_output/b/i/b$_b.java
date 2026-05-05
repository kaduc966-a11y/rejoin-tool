/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.b;
import b.i.g;
import b.i.m;
import b.i.p;
import b.i.y;
import b.o.d.w;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_b {
    private b$_b() {
    }

    public final long \u00d3O0000(long l2) {
        long l3;
        long l4 = l3 = b.\u00d200000(l2);
        if (g.o00000()) {
            if (b.newsuper(l4)) {
                long l5 = b.\u00d800000(l4);
                if (!(-4611686018426999999L <= l5 ? l5 < 4611686018427000000L : false)) {
                    throw new AssertionError((Object)(b.\u00d800000(l4) + " ns is out of nanoseconds range"));
                }
            } else {
                long l6 = b.\u00d800000(l4);
                if (!(-4611686018427387903L < l6 && l6 < 0x3FFFFFFFFFFFFFFFL) && !((l6 = b.\u00d800000(l4)) == 0x3FFFFFFFFFFFFFFFL || l6 == -4611686018427387903L)) {
                    throw new AssertionError((Object)(b.\u00d800000(l4) + " ms is out of milliseconds range"));
                }
                l6 = b.\u00d800000(l4);
                boolean bl = -4611686018426L <= l6 ? l6 < 4611686018427L : false;
                if (bl) {
                    throw new AssertionError((Object)(b.\u00d800000(l4) + " ms is denormalized"));
                }
            }
        }
        return l3;
    }

    public final long \u00d400000() {
        return b.\u00d200000();
    }

    public static /* synthetic */ void \u00d200000() {
    }

    public final long \u00d600000() {
        return b.null();
    }

    public final long super() {
        return b.\u00d800000();
    }

    public final long \u00d300000() {
        return b.\u00d300000();
    }

    public static /* synthetic */ void class() {
    }

    public final double super(double d2, m m2, m m3) {
        return p.super(d2, m2, m3);
    }

    private final long \u00f400000(int n2) {
        return y.o00000(n2, m.\u00d300000);
    }

    public static /* synthetic */ void \u00f600000(int n2) {
    }

    private final long \u00d800000(long l2) {
        return y.new(l2, m.\u00d300000);
    }

    public static /* synthetic */ void int(long l2) {
    }

    private final long \u00d2O0000(double d2) {
        return y.o00000(d2, m.\u00d300000);
    }

    public static /* synthetic */ void \u00d200000(double d2) {
    }

    private final long class(int n2) {
        return y.o00000(n2, m.\u00d200000);
    }

    public static /* synthetic */ void OO0000(int n2) {
    }

    private final long \u00d400000(long l2) {
        return y.new(l2, m.\u00d200000);
    }

    public static /* synthetic */ void \u00f800000(long l2) {
    }

    private final long \u00f800000(double d2) {
        return y.o00000(d2, m.\u00d200000);
    }

    public static /* synthetic */ void \u00d400000(double d2) {
    }

    private final long \u00d200000(int n2) {
        return y.o00000(n2, m.\u00f400000);
    }

    public static /* synthetic */ void \u00d800000(int n2) {
    }

    private final long super(long l2) {
        return y.new(l2, m.\u00f400000);
    }

    public static /* synthetic */ void \u00d600000(long l2) {
    }

    private final long \u00f400000(double d2) {
        return y.o00000(d2, m.\u00f400000);
    }

    public static /* synthetic */ void do(double d2) {
    }

    private final long int(int n2) {
        return y.o00000(n2, m.\u00d600000);
    }

    public static /* synthetic */ void \u00d2O0000(int n2) {
    }

    private final long \u00f400000(long l2) {
        return y.new(l2, m.\u00d600000);
    }

    public static /* synthetic */ void do(long l2) {
    }

    private final long super(double d2) {
        return y.o00000(d2, m.\u00d600000);
    }

    public static /* synthetic */ void \u00d600000(double d2) {
    }

    private final long \u00f800000(int n2) {
        return y.o00000(n2, m.int);
    }

    public static /* synthetic */ void \u00d600000(int n2) {
    }

    private final long \u00f600000(long l2) {
        return y.new(l2, m.int);
    }

    public static /* synthetic */ void class(long l2) {
    }

    private final long \u00d300000(double d2) {
        return y.o00000(d2, m.int);
    }

    public static /* synthetic */ void OO0000(double d2) {
    }

    private final long do(int n2) {
        return y.o00000(n2, m.\u00d800000);
    }

    public static /* synthetic */ void \u00d400000(int n2) {
    }

    private final long OO0000(long l2) {
        return y.new(l2, m.\u00d800000);
    }

    public static /* synthetic */ void \u00d300000(long l2) {
    }

    private final long class(double d2) {
        return y.o00000(d2, m.\u00d800000);
    }

    public static /* synthetic */ void \u00f600000(double d2) {
    }

    private final long \u00d300000(int n2) {
        return y.o00000(n2, m.\u00f600000);
    }

    public static /* synthetic */ void super(int n2) {
    }

    private final long \u00d200000(long l2) {
        return y.new(l2, m.\u00f600000);
    }

    public static /* synthetic */ void \u00d2O0000(long l2) {
    }

    private final long int(double d2) {
        return y.o00000(d2, m.\u00f600000);
    }

    public static /* synthetic */ void \u00d800000(double d2) {
    }

    public final long \u00d200000(String string) {
        long l2;
        try {
            l2 = y.o00000(string, false, false, 4, null);
            if (!(!b.\u00d300000(l2, b.void.\u00d300000()))) {
                String string2 = "invariant failed";
                throw new IllegalStateException(string2.toString());
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid duration string format: '" + string + "'.", illegalArgumentException);
        }
        return l2;
    }

    public final long \u00d400000(String string) {
        long l2;
        try {
            l2 = y.o00000(string, true, false, 4, null);
            if (!(!b.\u00d300000(l2, b.void.\u00d300000()))) {
                String string2 = "invariant failed";
                throw new IllegalStateException(string2.toString());
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IllegalArgumentException("Invalid ISO duration string format: '" + string + "'.", illegalArgumentException);
        }
        return l2;
    }

    public final b \u00d300000(String string) {
        long l2 = y.new(string, false, false);
        if (b.\u00d300000(l2, b.void.\u00d300000())) {
            return null;
        }
        return b.for(l2);
    }

    public final b super(String string) {
        long l2 = y.new(string, true, false);
        if (b.\u00d300000(l2, b.void.\u00d300000())) {
            return null;
        }
        return b.for(l2);
    }

    public /* synthetic */ b$_b(w w2) {
        this();
    }
}

