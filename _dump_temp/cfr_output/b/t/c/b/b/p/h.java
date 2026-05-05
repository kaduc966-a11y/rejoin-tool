/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.b;
import b.t.c.b.b.p.h$_b;
import b.t.c.b.b.p.i;
import b.t.c.b.b.p.m;
import b.t.c.b.b.p.v;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class h {
    private final byte[] \u00d300000;
    private final int \u00d200000;
    private int super;
    private int class = 0;
    private final OutputStream \u00d400000;

    static int return(int n2) {
        if (n2 > 4096) {
            return 4096;
        }
        return n2;
    }

    private h(byte[] byArray, int n2, int n3) {
        this.\u00d400000 = null;
        this.\u00d300000 = byArray;
        this.super = n2;
        this.\u00d200000 = n2 + n3;
    }

    private h(OutputStream outputStream, byte[] byArray) {
        this.\u00d400000 = outputStream;
        this.\u00d300000 = byArray;
        this.super = 0;
        this.\u00d200000 = byArray.length;
    }

    public static h o00000(OutputStream outputStream, int n2) {
        return new h(outputStream, new byte[n2]);
    }

    public static h new(byte[] byArray) {
        return h.o00000(byArray, 0, byArray.length);
    }

    public static h o00000(byte[] byArray, int n2, int n3) {
        return new h(byArray, n2, n3);
    }

    public final void o00000(int n2, double d2) throws IOException {
        this.\u00d400000(n2, 1);
        this.o00000(d2);
    }

    public final void new(int n2, float f2) throws IOException {
        this.\u00d400000(n2, 5);
        this.new(f2);
    }

    public final void return(int n2, int n3) throws IOException {
        this.\u00d400000(n2, 0);
        this.o00000(n3);
    }

    public final void o00000(int n2, boolean bl) throws IOException {
        this.\u00d400000(n2, 0);
        this.o00000(bl);
    }

    public final void new(int n2, v v2) throws IOException {
        this.\u00d400000(n2, 3);
        this.\u00d300000(v2);
        this.\u00d400000(n2, 4);
    }

    public final void \u00d300000(int n2, v v2) throws IOException {
        this.\u00d400000(n2, 2);
        this.o00000(v2);
    }

    public final void o00000(int n2, b b2) throws IOException {
        this.\u00d400000(n2, 2);
        this.o00000(b2);
    }

    public final void \u00d300000(int n2, int n3) throws IOException {
        this.\u00d400000(n2, 0);
        this.if(n3);
    }

    public final void new(int n2, int n3) throws IOException {
        this.\u00d400000(n2, 0);
        this.\u00f800000(n3);
    }

    public final void new(int n2, long l2) throws IOException {
        this.\u00d400000(n2, 0);
        this.if(l2);
    }

    public final void \u00d400000(int n2, v v2) throws IOException {
        this.\u00d400000(1, 3);
        this.\u00d300000(2, n2);
        this.\u00d300000(3, v2);
        this.\u00d400000(1, 4);
    }

    public final void o00000(double d2) throws IOException {
        this.o00000(Double.doubleToRawLongBits(d2));
    }

    public final void new(float f2) throws IOException {
        this.\u00d8O0000(Float.floatToRawIntBits(f2));
    }

    public final void oO0000(long l2) throws IOException {
        this.\u00f400000(l2);
    }

    public final void \u00d300000(long l2) throws IOException {
        this.\u00f400000(l2);
    }

    public final void o00000(int n2) throws IOException {
        if (n2 >= 0) {
            this.oO0000(n2);
            return;
        }
        this.\u00f400000((long)n2);
    }

    public final void \u00d800000(long l2) throws IOException {
        this.o00000(l2);
    }

    public final void \u00f400000(int n2) throws IOException {
        this.\u00d8O0000(n2);
    }

    public final void o00000(boolean bl) throws IOException {
        this.\u00d400000(bl ? 1 : 0);
    }

    public final void o00000(String object) throws IOException {
        object = ((String)object).getBytes("UTF-8");
        this.oO0000(((Object)object).length);
        this.\u00d400000((byte[])object);
    }

    public final void \u00d300000(v v2) throws IOException {
        v2.super(this);
    }

    public final void o00000(v v2) throws IOException {
        this.oO0000(v2.\u00f800000());
        v2.super(this);
    }

    public final void o00000(b b2) throws IOException {
        this.oO0000(b2.\u00f400000());
        this.\u00d300000(b2);
    }

    public final void \u00d300000(byte[] byArray) throws IOException {
        this.oO0000(byArray.length);
        this.\u00d400000(byArray);
    }

    public final void if(int n2) throws IOException {
        this.oO0000(n2);
    }

    public final void \u00f800000(int n2) throws IOException {
        this.o00000(n2);
    }

    public final void thissuper(int n2) throws IOException {
        this.\u00d8O0000(n2);
    }

    public final void new(long l2) throws IOException {
        this.o00000(l2);
    }

    public final void \u00d800000(int n2) throws IOException {
        this.oO0000(h.\u00d500000(n2));
    }

    public final void if(long l2) throws IOException {
        this.\u00f400000(h.\u00d400000(l2));
    }

    public static int new(int n2, double d2) {
        return h.\u00d3O0000(n2) + h.new(d2);
    }

    public static int o00000(int n2, float f2) {
        return h.\u00d3O0000(n2) + h.o00000(f2);
    }

    public static int \u00d500000(int n2, int n3) {
        return h.\u00d3O0000(n2) + h.\u00f500000(n3);
    }

    public static int new(int n2, boolean bl) {
        return h.\u00d3O0000(n2) + h.new(bl);
    }

    public static int o00000(int n2, v v2) {
        return h.\u00d3O0000(n2) + h.new(v2);
    }

    public static int new(int n2, b b2) {
        return h.\u00d3O0000(n2) + h.new(b2);
    }

    public static int o00000(int n2, int n3) {
        return h.\u00d3O0000(n2) + h.\u00d5O0000(n3);
    }

    public static int o00000(int n2, long l2) {
        return h.\u00d3O0000(n2) + h.while(l2);
    }

    public static int new(double d2) {
        return 8;
    }

    public static int o00000(float f2) {
        return 4;
    }

    public static int \u00d500000(long l2) {
        return h.\u00f500000(l2);
    }

    public static int return(long l2) {
        return h.\u00f500000(l2);
    }

    public static int \u00f500000(int n2) {
        if (n2 >= 0) {
            return h.new(n2);
        }
        return 10;
    }

    public static int \u00f800000(long l2) {
        return 8;
    }

    public static int OO0000(int n2) {
        return 4;
    }

    public static int new(boolean bl) {
        return 1;
    }

    public static int new(String object) {
        try {
            byte[] byArray = ((String)object).getBytes("UTF-8");
            object = byArray;
            return h.new(byArray.length) + ((Object)object).length;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 not supported.", unsupportedEncodingException);
        }
    }

    public static int \u00d400000(v v2) {
        return v2.\u00f800000();
    }

    public static int new(v v2) {
        int n2 = v2.\u00f800000();
        return h.new(n2) + n2;
    }

    public static int o00000(m m2) {
        int n2 = m2.super();
        return h.new(n2) + n2;
    }

    public static int new(b b2) {
        return h.new(b2.\u00f400000()) + b2.\u00f400000();
    }

    public static int o00000(byte[] byArray) {
        return h.new(byArray.length) + byArray.length;
    }

    public static int \u00d300000(int n2) {
        return h.new(n2);
    }

    public static int \u00d5O0000(int n2) {
        return h.\u00f500000(n2);
    }

    public static int while(int n2) {
        return 4;
    }

    public static int OO0000(long l2) {
        return 8;
    }

    public static int \u00d4O0000(int n2) {
        return h.new(h.\u00d500000(n2));
    }

    public static int while(long l2) {
        return h.\u00f500000(h.\u00d400000(l2));
    }

    private void o00000() throws IOException {
        if (this.\u00d400000 == null) {
            throw new h$_b();
        }
        this.\u00d400000.write(this.\u00d300000, 0, this.super);
        this.super = 0;
    }

    public final void new() throws IOException {
        if (this.\u00d400000 != null) {
            this.o00000();
        }
    }

    public final int \u00d300000() {
        if (this.\u00d400000 == null) {
            return this.\u00d200000 - this.super;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public final void \u00d400000() {
        if (this.\u00d300000() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void o00000(byte by) throws IOException {
        if (this.super == this.\u00d200000) {
            this.o00000();
        }
        this.\u00d300000[this.super++] = by;
        ++this.class;
    }

    public final void \u00d400000(int n2) throws IOException {
        this.o00000((byte)n2);
    }

    public final void \u00d300000(b b2) throws IOException {
        this.o00000(b2, 0, b2.\u00f400000());
    }

    public final void \u00d400000(byte[] byArray) throws IOException {
        this.new(byArray, 0, byArray.length);
    }

    public final void new(byte[] byArray, int n2, int n3) throws IOException {
        if (this.\u00d200000 - this.super >= n3) {
            System.arraycopy(byArray, n2, this.\u00d300000, this.super, n3);
            this.super += n3;
        } else {
            int n4 = this.\u00d200000 - this.super;
            System.arraycopy(byArray, n2, this.\u00d300000, this.super, n4);
            n2 += n4;
            this.super = this.\u00d200000;
            this.class += n4;
            this.o00000();
            if ((n3 -= n4) <= this.\u00d200000) {
                System.arraycopy(byArray, n2, this.\u00d300000, 0, n3);
                this.super = n3;
            } else {
                this.\u00d400000.write(byArray, n2, n3);
            }
        }
        this.class += n3;
    }

    public final void o00000(b b2, int n2, int n3) throws IOException {
        if (this.\u00d200000 - this.super >= n3) {
            b2.\u00d200000(this.\u00d300000, n2, this.super, n3);
            this.super += n3;
        } else {
            int n4 = this.\u00d200000 - this.super;
            b2.\u00d200000(this.\u00d300000, n2, this.super, n4);
            n2 += n4;
            this.super = this.\u00d200000;
            this.class += n4;
            this.o00000();
            if ((n3 -= n4) <= this.\u00d200000) {
                b2.\u00d200000(this.\u00d300000, n2, 0, n3);
                this.super = n3;
            } else {
                b2.\u00d200000(this.\u00d400000, n2, n3);
            }
        }
        this.class += n3;
    }

    public final void \u00d400000(int n2, int n3) throws IOException {
        this.oO0000(i.o00000(n2, n3));
    }

    public static int \u00d3O0000(int n2) {
        return h.new(i.o00000(n2, 0));
    }

    public final void oO0000(int n2) throws IOException {
        while (true) {
            if ((n2 & 0xFFFFFF80) == 0) {
                this.\u00d400000(n2);
                return;
            }
            this.\u00d400000(n2 & 0x7F | 0x80);
            n2 >>>= 7;
        }
    }

    public static int new(int n2) {
        if ((n2 & 0xFFFFFF80) == 0) {
            return 1;
        }
        if ((n2 & 0xFFFFC000) == 0) {
            return 2;
        }
        if ((n2 & 0xFFE00000) == 0) {
            return 3;
        }
        if ((n2 & 0xF0000000) == 0) {
            return 4;
        }
        return 5;
    }

    public final void \u00f400000(long l2) throws IOException {
        while (true) {
            if ((l2 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                this.\u00d400000((int)l2);
                return;
            }
            this.\u00d400000((int)l2 & 0x7F | 0x80);
            l2 >>>= 7;
        }
    }

    public static int \u00f500000(long l2) {
        if ((l2 & 0xFFFFFFFFFFFFFF80L) == 0L) {
            return 1;
        }
        if ((l2 & 0xFFFFFFFFFFFFC000L) == 0L) {
            return 2;
        }
        if ((l2 & 0xFFFFFFFFFFE00000L) == 0L) {
            return 3;
        }
        if ((l2 & 0xFFFFFFFFF0000000L) == 0L) {
            return 4;
        }
        if ((l2 & 0xFFFFFFF800000000L) == 0L) {
            return 5;
        }
        if ((l2 & 0xFFFFFC0000000000L) == 0L) {
            return 6;
        }
        if ((l2 & 0xFFFE000000000000L) == 0L) {
            return 7;
        }
        if ((l2 & 0xFF00000000000000L) == 0L) {
            return 8;
        }
        if ((l2 & Long.MIN_VALUE) == 0L) {
            return 9;
        }
        return 10;
    }

    public final void \u00d8O0000(int n2) throws IOException {
        this.\u00d400000(n2 & 0xFF);
        this.\u00d400000(n2 >> 8 & 0xFF);
        this.\u00d400000(n2 >> 16 & 0xFF);
        this.\u00d400000(n2 >> 24 & 0xFF);
    }

    public final void o00000(long l2) throws IOException {
        this.\u00d400000((int)l2 & 0xFF);
        this.\u00d400000((int)(l2 >> 8) & 0xFF);
        this.\u00d400000((int)(l2 >> 16) & 0xFF);
        this.\u00d400000((int)(l2 >> 24) & 0xFF);
        this.\u00d400000((int)(l2 >> 32) & 0xFF);
        this.\u00d400000((int)(l2 >> 40) & 0xFF);
        this.\u00d400000((int)(l2 >> 48) & 0xFF);
        this.\u00d400000((int)(l2 >> 56) & 0xFF);
    }

    public static int \u00d500000(int n2) {
        return n2 << 1 ^ n2 >> 31;
    }

    public static long \u00d400000(long l2) {
        return l2 << 1 ^ l2 >> 63;
    }
}

