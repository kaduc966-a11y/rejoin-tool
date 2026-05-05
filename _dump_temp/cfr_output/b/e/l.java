/*
 * Decompiled with CFR 0.152.
 */
package b.e;

import b.e.ab;
import b.e.bb;
import b.e.f;
import b.e.g;
import b.e.h;
import b.e.j;
import b.e.m;
import b.e.t;
import b.e.u;
import b.e.v;
import b.e.x;
import b.o.d.fc;
import java.util.NoSuchElementException;

public class l
extends v {
    public static final int \u00d500000(x x2) {
        if (x2.if()) {
            throw new NoSuchElementException("Progression " + x2 + " is empty.");
        }
        return x2.\u00f8O0000();
    }

    public static final long \u00d500000(u u2) {
        if (u2.if()) {
            throw new NoSuchElementException("Progression " + u2 + " is empty.");
        }
        return u2.\u00d3O0000();
    }

    public static final char o00000(t t2) {
        if (t2.if()) {
            throw new NoSuchElementException("Progression " + t2 + " is empty.");
        }
        return t2.\u00f400000();
    }

    public static final Integer \u00d200000(x x2) {
        if (x2.if()) {
            return null;
        }
        return x2.\u00f8O0000();
    }

    public static final Long o00000(u u2) {
        if (u2.if()) {
            return null;
        }
        return u2.\u00d3O0000();
    }

    public static final Character Object(t t2) {
        if (t2.if()) {
            return null;
        }
        return Character.valueOf(t2.\u00f400000());
    }

    public static final int o00000(x x2) {
        if (x2.if()) {
            throw new NoSuchElementException("Progression " + x2 + " is empty.");
        }
        return x2.oo0000();
    }

    public static final long Object(u u2) {
        if (u2.if()) {
            throw new NoSuchElementException("Progression " + u2 + " is empty.");
        }
        return u2.oO0000();
    }

    public static final char \u00d400000(t t2) {
        if (t2.if()) {
            throw new NoSuchElementException("Progression " + t2 + " is empty.");
        }
        return t2.\u00f500000();
    }

    public static final Integer Object(x x2) {
        if (x2.if()) {
            return null;
        }
        return x2.oo0000();
    }

    public static final Long \u00d200000(u u2) {
        if (u2.if()) {
            return null;
        }
        return u2.oO0000();
    }

    public static final Character \u00d200000(t t2) {
        if (t2.if()) {
            return null;
        }
        return Character.valueOf(t2.\u00f500000());
    }

    private static final int o00000(m m2) {
        return bb.o00000(m2, (b.b.f)b.b.f.super);
    }

    private static final long \u00d200000(j j2) {
        return bb.\u00d200000(j2, (b.b.f)b.b.f.super);
    }

    private static final char o00000(f f2) {
        return bb.o00000(f2, (b.b.f)b.b.f.super);
    }

    public static final int o00000(m m2, b.b.f f2) {
        try {
            return b.b.h.super(f2, m2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchElementException(illegalArgumentException.getMessage());
        }
    }

    public static final long \u00d200000(j j2, b.b.f f2) {
        try {
            return b.b.h.super(f2, j2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchElementException(illegalArgumentException.getMessage());
        }
    }

    public static final char o00000(f f2, b.b.f f3) {
        try {
            return (char)f3.o00000(f2.\u00f400000(), f2.\u00f500000() + '\u0001');
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new NoSuchElementException(illegalArgumentException.getMessage());
        }
    }

    private static final Integer \u00d200000(m m2) {
        return bb.\u00d200000(m2, (b.b.f)b.b.f.super);
    }

    private static final Long o00000(j j2) {
        return bb.o00000(j2, (b.b.f)b.b.f.super);
    }

    private static final Character \u00d200000(f f2) {
        return bb.\u00d200000(f2, (b.b.f)b.b.f.super);
    }

    public static final Integer \u00d200000(m m2, b.b.f f2) {
        if (((x)m2).if()) {
            return null;
        }
        return b.b.h.super(f2, m2);
    }

    public static final Long o00000(j j2, b.b.f f2) {
        if (((u)j2).if()) {
            return null;
        }
        return b.b.h.super(f2, j2);
    }

    public static final Character \u00d200000(f f2, b.b.f f3) {
        if (((t)f2).if()) {
            return null;
        }
        return Character.valueOf((char)f3.o00000(f2.\u00f400000(), f2.\u00f500000() + '\u0001'));
    }

    private static final boolean o00000(m m2, Integer n2) {
        return n2 != null && m2.Oo0000(n2);
    }

    private static final boolean o00000(j j2, Long l2) {
        return l2 != null && j2.\u00f400000(l2);
    }

    private static final boolean o00000(f f2, Character c2) {
        return c2 != null && f2.\u00d400000(c2.charValue());
    }

    public static final boolean o00000(g g2, byte by) {
        return g2.o00000(Integer.valueOf(by));
    }

    public static final boolean \u00d400000(g g2, byte by) {
        return g2.o00000(Long.valueOf(by));
    }

    public static final boolean \u00d200000(g g2, byte by) {
        return g2.o00000(Short.valueOf(by));
    }

    public static final /* synthetic */ boolean \u00d500000(g g2, byte by) {
        return g2.o00000(Double.valueOf(by));
    }

    public static final /* synthetic */ boolean Object(g g2, byte by) {
        return g2.o00000(Float.valueOf(by));
    }

    public static final boolean \u00d200000(h h2, byte by) {
        return h2.o00000(Integer.valueOf(by));
    }

    public static final boolean o00000(h h2, byte by) {
        return h2.o00000(Long.valueOf(by));
    }

    public static final boolean Object(h h2, byte by) {
        return h2.o00000(Short.valueOf(by));
    }

    private static final boolean o00000(m m2, byte by) {
        return bb.o00000((g)m2, by);
    }

    private static final boolean o00000(j j2, byte by) {
        return bb.\u00d400000((g)j2, by);
    }

    public static final /* synthetic */ boolean o00000(g g2, double d2) {
        Integer n2 = bb.Object(d2);
        if (n2 != null) {
            return g2.o00000(n2);
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d400000(g g2, double d2) {
        Long l2 = bb.\u00d200000(d2);
        if (l2 != null) {
            return g2.o00000(l2);
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d500000(g g2, double d2) {
        Byte by = bb.\u00d400000(d2);
        if (by != null) {
            return g2.o00000(by);
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d200000(g g2, double d2) {
        Short s2 = bb.o00000(d2);
        if (s2 != null) {
            return g2.o00000(s2);
        }
        return false;
    }

    public static final boolean Object(g g2, double d2) {
        return g2.o00000(Float.valueOf((float)d2));
    }

    public static final /* synthetic */ boolean o00000(g g2, float f2) {
        Integer n2 = bb.\u00d200000(f2);
        if (n2 != null) {
            return g2.o00000(n2);
        }
        return false;
    }

    public static final /* synthetic */ boolean Object(g g2, float f2) {
        Long l2 = bb.Object(f2);
        if (l2 != null) {
            return g2.o00000(l2);
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d500000(g g2, float f2) {
        Byte by = bb.\u00d400000(f2);
        if (by != null) {
            return g2.o00000(by);
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d200000(g g2, float f2) {
        Short s2 = bb.o00000(f2);
        if (s2 != null) {
            return g2.o00000(s2);
        }
        return false;
    }

    public static final boolean \u00d400000(g g2, float f2) {
        return g2.o00000(Double.valueOf(f2));
    }

    public static final boolean o00000(h h2, float f2) {
        return h2.o00000(Double.valueOf(f2));
    }

    public static final boolean \u00d500000(g g2, int n2) {
        return g2.o00000(Long.valueOf(n2));
    }

    public static final boolean \u00d200000(g g2, int n2) {
        Byte by = bb.o00000(n2);
        if (by != null) {
            return g2.o00000(by);
        }
        return false;
    }

    public static final boolean Object(g g2, int n2) {
        Short s2 = bb.\u00d200000(n2);
        if (s2 != null) {
            return g2.o00000(s2);
        }
        return false;
    }

    public static final /* synthetic */ boolean o00000(g g2, int n2) {
        return g2.o00000(Double.valueOf(n2));
    }

    public static final /* synthetic */ boolean \u00d400000(g g2, int n2) {
        return g2.o00000(Float.valueOf(n2));
    }

    public static final boolean Object(h h2, int n2) {
        return h2.o00000(Long.valueOf(n2));
    }

    public static final boolean \u00d200000(h h2, int n2) {
        Byte by = bb.o00000(n2);
        if (by != null) {
            return h2.o00000(by);
        }
        return false;
    }

    public static final boolean o00000(h h2, int n2) {
        Short s2 = bb.\u00d200000(n2);
        if (s2 != null) {
            return h2.o00000(s2);
        }
        return false;
    }

    private static final boolean o00000(j j2, int n2) {
        return bb.\u00d500000((g)j2, n2);
    }

    public static final boolean o00000(g g2, long l2) {
        Integer n2 = bb.\u00d200000(l2);
        if (n2 != null) {
            return g2.o00000(n2);
        }
        return false;
    }

    public static final boolean \u00d500000(g g2, long l2) {
        Byte by = bb.Object(l2);
        if (by != null) {
            return g2.o00000(by);
        }
        return false;
    }

    public static final boolean \u00d200000(g g2, long l2) {
        Short s2 = bb.o00000(l2);
        if (s2 != null) {
            return g2.o00000(s2);
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d400000(g g2, long l2) {
        return g2.o00000(Double.valueOf(l2));
    }

    public static final /* synthetic */ boolean Object(g g2, long l2) {
        return g2.o00000(Float.valueOf(l2));
    }

    public static final boolean \u00d200000(h h2, long l2) {
        Integer n2 = bb.\u00d200000(l2);
        if (n2 != null) {
            return h2.o00000(n2);
        }
        return false;
    }

    public static final boolean o00000(h h2, long l2) {
        Byte by = bb.Object(l2);
        if (by != null) {
            return h2.o00000(by);
        }
        return false;
    }

    public static final boolean Object(h h2, long l2) {
        Short s2 = bb.o00000(l2);
        if (s2 != null) {
            return h2.o00000(s2);
        }
        return false;
    }

    private static final boolean o00000(m m2, long l2) {
        return bb.o00000((g)m2, l2);
    }

    public static final boolean \u00d200000(g g2, short s2) {
        return g2.o00000(Integer.valueOf(s2));
    }

    public static final boolean \u00d400000(g g2, short s2) {
        return g2.o00000(Long.valueOf(s2));
    }

    public static final boolean o00000(g g2, short s2) {
        Byte by = bb.o00000(s2);
        if (by != null) {
            return g2.o00000(by);
        }
        return false;
    }

    public static final /* synthetic */ boolean \u00d500000(g g2, short s2) {
        return g2.o00000(Double.valueOf(s2));
    }

    public static final /* synthetic */ boolean Object(g g2, short s2) {
        return g2.o00000(Float.valueOf(s2));
    }

    public static final boolean Object(h h2, short s2) {
        return h2.o00000(Integer.valueOf(s2));
    }

    public static final boolean \u00d200000(h h2, short s2) {
        return h2.o00000(Long.valueOf(s2));
    }

    public static final boolean o00000(h h2, short s2) {
        Byte by = bb.o00000(s2);
        if (by != null) {
            return h2.o00000(by);
        }
        return false;
    }

    private static final boolean o00000(m m2, short s2) {
        return bb.\u00d200000((g)m2, s2);
    }

    private static final boolean o00000(j j2, short s2) {
        return bb.\u00d400000((g)j2, s2);
    }

    public static final x o00000(int n2, byte by) {
        return x.thisObject.o00000(n2, by, -1);
    }

    public static final u \u00d200000(long l2, byte by) {
        return u.o\u00d30000.o00000(l2, by, -1L);
    }

    public static final x \u00d200000(byte by, byte by2) {
        return x.thisObject.o00000(by, by2, -1);
    }

    public static final x \u00d200000(short s2, byte by) {
        return x.thisObject.o00000(s2, by, -1);
    }

    public static final t \u00d200000(char c2, char c3) {
        return t.\u00d8\u00d20000.super(c2, c3, -1);
    }

    public static final x o00000(int n2, int n3) {
        return x.thisObject.o00000(n2, n3, -1);
    }

    public static final u \u00d200000(long l2, int n2) {
        return u.o\u00d30000.o00000(l2, n2, -1L);
    }

    public static final x \u00d200000(byte by, int n2) {
        return x.thisObject.o00000(by, n2, -1);
    }

    public static final x o00000(short s2, int n2) {
        return x.thisObject.o00000(s2, n2, -1);
    }

    public static final u o00000(int n2, long l2) {
        return u.o\u00d30000.o00000(n2, l2, -1L);
    }

    public static final u \u00d200000(long l2, long l3) {
        return u.o\u00d30000.o00000(l2, l3, -1L);
    }

    public static final u o00000(byte by, long l2) {
        return u.o\u00d30000.o00000(by, l2, -1L);
    }

    public static final u \u00d200000(short s2, long l2) {
        return u.o\u00d30000.o00000(s2, l2, -1L);
    }

    public static final x o00000(int n2, short s2) {
        return x.thisObject.o00000(n2, s2, -1);
    }

    public static final u o00000(long l2, short s2) {
        return u.o\u00d30000.o00000(l2, s2, -1L);
    }

    public static final x o00000(byte by, short s2) {
        return x.thisObject.o00000(by, s2, -1);
    }

    public static final x \u00d200000(short s2, short s3) {
        return x.thisObject.o00000(s2, s3, -1);
    }

    public static final x \u00d400000(x x2) {
        return x.thisObject.o00000(x2.oo0000(), x2.\u00f8O0000(), -x2.Oo0000());
    }

    public static final u \u00d400000(u u2) {
        return u.o\u00d30000.o00000(u2.oO0000(), u2.\u00d3O0000(), -u2.\u00d4O0000());
    }

    public static final t \u00d500000(t t2) {
        return t.\u00d8\u00d20000.super(t2.\u00f500000(), t2.\u00f400000(), -t2.return());
    }

    public static final x o00000(x x2, int n2) {
        bb.o00000(n2 > 0, (Number)n2);
        return x.thisObject.o00000(x2.\u00f8O0000(), x2.oo0000(), x2.Oo0000() > 0 ? n2 : -n2);
    }

    public static final u o00000(u u2, long l2) {
        bb.o00000(l2 > 0L, (Number)l2);
        return u.o\u00d30000.o00000(u2.\u00d3O0000(), u2.oO0000(), u2.\u00d4O0000() > 0L ? l2 : -l2);
    }

    public static final t o00000(t t2, int n2) {
        bb.o00000(n2 > 0, (Number)n2);
        return t.\u00d8\u00d20000.super(t2.\u00f400000(), t2.\u00f500000(), t2.return() > 0 ? n2 : -n2);
    }

    public static final Byte o00000(int n2) {
        boolean bl = -128 <= n2 ? n2 < 128 : false;
        if (bl) {
            return (byte)n2;
        }
        return null;
    }

    public static final Byte Object(long l2) {
        boolean bl = -128L <= l2 ? l2 < 128L : false;
        if (bl) {
            return (byte)l2;
        }
        return null;
    }

    public static final Byte o00000(short s2) {
        short s3 = s2;
        boolean bl = -128 <= s3 ? s3 < 128 : false;
        if (bl) {
            return (byte)s2;
        }
        return null;
    }

    public static final Byte \u00d400000(double d2) {
        boolean bl = -128.0 <= d2 ? d2 <= 127.0 : false;
        if (bl) {
            return (byte)d2;
        }
        return null;
    }

    public static final Byte \u00d400000(float f2) {
        boolean bl = -128.0f <= f2 ? f2 <= 127.0f : false;
        if (bl) {
            return (byte)f2;
        }
        return null;
    }

    public static final Integer \u00d200000(long l2) {
        boolean bl = Integer.MIN_VALUE <= l2 ? l2 < 0x80000000L : false;
        if (bl) {
            return (int)l2;
        }
        return null;
    }

    public static final Integer Object(double d2) {
        boolean bl = -2.147483648E9 <= d2 ? d2 <= 2.147483647E9 : false;
        if (bl) {
            return (int)d2;
        }
        return null;
    }

    public static final Integer \u00d200000(float f2) {
        boolean bl = -2.1474836E9f <= f2 ? f2 <= 2.1474836E9f : false;
        if (bl) {
            return (int)f2;
        }
        return null;
    }

    public static final Long \u00d200000(double d2) {
        boolean bl = -9.223372036854776E18 <= d2 ? d2 <= 9.223372036854776E18 : false;
        if (bl) {
            return (long)d2;
        }
        return null;
    }

    public static final Long Object(float f2) {
        boolean bl = -9.223372E18f <= f2 ? f2 <= 9.223372E18f : false;
        if (bl) {
            return (long)f2;
        }
        return null;
    }

    public static final Short \u00d200000(int n2) {
        boolean bl = Short.MIN_VALUE <= n2 ? n2 < 32768 : false;
        if (bl) {
            return (short)n2;
        }
        return null;
    }

    public static final Short o00000(long l2) {
        boolean bl = -32768L <= l2 ? l2 < 32768L : false;
        if (bl) {
            return (short)l2;
        }
        return null;
    }

    public static final Short o00000(double d2) {
        boolean bl = -32768.0 <= d2 ? d2 <= 32767.0 : false;
        if (bl) {
            return (short)d2;
        }
        return null;
    }

    public static final Short o00000(float f2) {
        boolean bl = -32768.0f <= f2 ? f2 <= 32767.0f : false;
        if (bl) {
            return (short)f2;
        }
        return null;
    }

    public static final m \u00d200000(int n2, byte by) {
        return new m(n2, by - 1);
    }

    public static final j o00000(long l2, byte by) {
        return new j(l2, (long)by - 1L);
    }

    public static final m Object(byte by, byte by2) {
        return new m(by, by2 - 1);
    }

    public static final m o00000(short s2, byte by) {
        return new m(s2, by - 1);
    }

    public static final f o00000(char c2, char c3) {
        if (fc.o00000((int)c3, 0) <= 0) {
            return f.\u00d8\u00d20000.o00000();
        }
        return new f(c2, (char)(c3 - '\u0001'));
    }

    public static final m \u00d400000(int n2, int n3) {
        if (n3 <= Integer.MIN_VALUE) {
            return m.thisObject.o00000();
        }
        return new m(n2, n3 - 1);
    }

    public static final j o00000(long l2, int n2) {
        return new j(l2, (long)n2 - 1L);
    }

    public static final m o00000(byte by, int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            return m.thisObject.o00000();
        }
        return new m(by, n2 - 1);
    }

    public static final m \u00d200000(short s2, int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            return m.thisObject.o00000();
        }
        return new m(s2, n2 - 1);
    }

    public static final j \u00d200000(int n2, long l2) {
        if (l2 <= Long.MIN_VALUE) {
            return j.o\u00d30000.o00000();
        }
        return new j(n2, l2 - 1L);
    }

    public static final j \u00d400000(long l2, long l3) {
        if (l3 <= Long.MIN_VALUE) {
            return j.o\u00d30000.o00000();
        }
        return new j(l2, l3 - 1L);
    }

    public static final j \u00d200000(byte by, long l2) {
        if (l2 <= Long.MIN_VALUE) {
            return j.o\u00d30000.o00000();
        }
        return new j(by, l2 - 1L);
    }

    public static final j o00000(short s2, long l2) {
        if (l2 <= Long.MIN_VALUE) {
            return j.o\u00d30000.o00000();
        }
        return new j(s2, l2 - 1L);
    }

    public static final m \u00d200000(int n2, short s2) {
        return new m(n2, s2 - 1);
    }

    public static final j \u00d200000(long l2, short s2) {
        return new j(l2, (long)s2 - 1L);
    }

    public static final m \u00d200000(byte by, short s2) {
        return new m(by, s2 - 1);
    }

    public static final m o00000(short s2, short s3) {
        return new m(s2, s3 - 1);
    }

    public static final Comparable Object(Comparable comparable, Comparable comparable2) {
        if (comparable.compareTo(comparable2) < 0) {
            return comparable2;
        }
        return comparable;
    }

    public static final byte o00000(byte by, byte by2) {
        if (by < by2) {
            return by2;
        }
        return by;
    }

    public static final short Object(short s2, short s3) {
        if (s2 < s3) {
            return s3;
        }
        return s2;
    }

    public static final int \u00d200000(int n2, int n3) {
        if (n2 < n3) {
            return n3;
        }
        return n2;
    }

    public static final long o00000(long l2, long l3) {
        if (l2 < l3) {
            return l3;
        }
        return l2;
    }

    public static final float Object(float f2, float f3) {
        if (f2 < f3) {
            return f3;
        }
        return f2;
    }

    public static final double \u00d400000(double d2, double d3) {
        if (d2 < d3) {
            return d3;
        }
        return d2;
    }

    public static final Comparable \u00d400000(Comparable comparable, Comparable comparable2) {
        if (comparable.compareTo(comparable2) > 0) {
            return comparable2;
        }
        return comparable;
    }

    public static final byte \u00d400000(byte by, byte by2) {
        if (by > by2) {
            return by2;
        }
        return by;
    }

    public static final short \u00d400000(short s2, short s3) {
        if (s2 > s3) {
            return s3;
        }
        return s2;
    }

    public static final int Object(int n2, int n3) {
        if (n2 > n3) {
            return n3;
        }
        return n2;
    }

    public static final long Object(long l2, long l3) {
        if (l2 > l3) {
            return l3;
        }
        return l2;
    }

    public static final float \u00d400000(float f2, float f3) {
        if (f2 > f3) {
            return f3;
        }
        return f2;
    }

    public static final double Object(double d2, double d3) {
        if (d2 > d3) {
            return d3;
        }
        return d2;
    }

    public static final Comparable o00000(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable2 != null && comparable3 != null) {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static final byte o00000(byte by, byte by2, byte by3) {
        if (by2 > by3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + by3 + " is less than minimum " + by2 + '.');
        }
        if (by < by2) {
            return by2;
        }
        if (by > by3) {
            return by3;
        }
        return by;
    }

    public static final short o00000(short s2, short s3, short s4) {
        if (s3 > s4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + s4 + " is less than minimum " + s3 + '.');
        }
        if (s2 < s3) {
            return s3;
        }
        if (s2 > s4) {
            return s4;
        }
        return s2;
    }

    public static final int o00000(int n2, int n3, int n4) {
        if (n3 > n4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + n4 + " is less than minimum " + n3 + '.');
        }
        if (n2 < n3) {
            return n3;
        }
        if (n2 > n4) {
            return n4;
        }
        return n2;
    }

    public static final long o00000(long l2, long l3, long l4) {
        if (l3 > l4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + l4 + " is less than minimum " + l3 + '.');
        }
        if (l2 < l3) {
            return l3;
        }
        if (l2 > l4) {
            return l4;
        }
        return l2;
    }

    public static final float o00000(float f2, float f3, float f4) {
        if (f3 > f4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
        }
        if (f2 < f3) {
            return f3;
        }
        if (f2 > f4) {
            return f4;
        }
        return f2;
    }

    public static final double o00000(double d2, double d3, double d4) {
        if (d3 > d4) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d4 + " is less than minimum " + d3 + '.');
        }
        if (d2 < d3) {
            return d3;
        }
        if (d2 > d4) {
            return d4;
        }
        return d2;
    }

    public static final Comparable o00000(Comparable comparable, ab ab2) {
        if (ab2.if()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + ab2 + '.');
        }
        if (ab2.o00000(comparable, ab2.OO0000())) {
            ab ab3 = ab2;
            if (!ab3.o00000(ab3.OO0000(), comparable)) {
                return ab2.OO0000();
            }
        }
        ab ab4 = ab2;
        if (ab4.o00000(ab4.\u00f800000(), comparable) && !ab2.o00000(comparable, ab2.\u00f800000())) {
            return ab2.\u00f800000();
        }
        return comparable;
    }

    public static final Comparable o00000(Comparable comparable, g g2) {
        if (g2 instanceof ab) {
            return bb.o00000(comparable, (ab)g2);
        }
        if (g2.if()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g2 + '.');
        }
        if (comparable.compareTo(g2.OO0000()) < 0) {
            return g2.OO0000();
        }
        if (comparable.compareTo(g2.\u00f800000()) > 0) {
            return g2.\u00f800000();
        }
        return comparable;
    }

    public static final int o00000(int n2, g g2) {
        if (g2 instanceof ab) {
            return ((Number)((Object)bb.o00000((Comparable)Integer.valueOf(n2), (ab)g2))).intValue();
        }
        if (g2.if()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g2 + '.');
        }
        if (n2 < ((Number)((Object)g2.OO0000())).intValue()) {
            return ((Number)((Object)g2.OO0000())).intValue();
        }
        if (n2 > ((Number)((Object)g2.\u00f800000())).intValue()) {
            return ((Number)((Object)g2.\u00f800000())).intValue();
        }
        return n2;
    }

    public static final long o00000(long l2, g g2) {
        if (g2 instanceof ab) {
            return ((Number)((Object)bb.o00000((Comparable)Long.valueOf(l2), (ab)g2))).longValue();
        }
        if (g2.if()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + g2 + '.');
        }
        if (l2 < ((Number)((Object)g2.OO0000())).longValue()) {
            return ((Number)((Object)g2.OO0000())).longValue();
        }
        if (l2 > ((Number)((Object)g2.\u00f800000())).longValue()) {
            return ((Number)((Object)g2.\u00f800000())).longValue();
        }
        return l2;
    }
}

