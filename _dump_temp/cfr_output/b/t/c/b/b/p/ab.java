/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.p;

import b.t.c.b.b.p.ab$_b;
import b.t.c.b.b.p.b;
import b.t.c.b.b.p.c;
import b.t.c.b.b.p.g;
import b.t.c.b.b.p.h;
import b.t.c.b.b.p.i;
import b.t.c.b.b.p.l;
import b.t.c.b.b.p.p;
import b.t.c.b.b.p.s;
import b.t.c.b.b.p.t;
import b.t.c.b.b.p.v;
import b.t.c.b.b.p.v$_b;
import b.t.c.b.b.p.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ab {
    private final byte[] class;
    private final boolean \u00f400000;
    private int super;
    private int int;
    private int \u00d400000;
    private final InputStream do;
    private int \u00d2O0000;
    private boolean \u00d600000 = false;
    private int \u00f600000;
    private int \u00d300000 = Integer.MAX_VALUE;
    private int OO0000;
    private int \u00f800000 = 64;
    private int \u00d200000 = 0x4000000;
    private ab$_b \u00d800000 = null;

    public static ab o00000(InputStream inputStream) {
        return new ab(inputStream);
    }

    static ab o00000(y y2) {
        ab ab2 = new ab(y2);
        try {
            ab2.\u00d500000(((b)y2).\u00f400000());
        }
        catch (g g2) {
            throw new IllegalArgumentException(g2);
        }
        return ab2;
    }

    public final void \u00d200000() throws g {
        if (this.OO0000 >= this.\u00f800000) {
            throw g.\u00d800000();
        }
    }

    public final int oo0000() throws IOException {
        if (this.\u00f5O0000()) {
            this.\u00d2O0000 = 0;
            return 0;
        }
        this.\u00d2O0000 = this.\u00f500000();
        if (i.o00000(this.\u00d2O0000) == 0) {
            throw g.\u00d400000();
        }
        return this.\u00d2O0000;
    }

    public final void String(int n2) throws g {
        if (this.\u00d2O0000 != n2) {
            throw g.if();
        }
    }

    public final boolean o00000(int n2, h h2) throws IOException {
        switch (i.new(n2)) {
            case 0: {
                long l2 = this.\u00d2o0000();
                h2.oO0000(n2);
                h2.oO0000(l2);
                return true;
            }
            case 1: {
                long l3 = this.\u00d5O0000();
                h2.oO0000(n2);
                h2.\u00d800000(l3);
                return true;
            }
            case 2: {
                b b2 = this.\u00d300000();
                h2.oO0000(n2);
                h2.o00000(b2);
                return true;
            }
            case 3: {
                h2.oO0000(n2);
                this.o00000(h2);
                int n3 = i.o00000(i.o00000(n2), 4);
                this.String(n3);
                h2.oO0000(n3);
                return true;
            }
            case 4: {
                return false;
            }
            case 5: {
                int n4 = this.\u00d8O0000();
                h2.oO0000(n2);
                h2.\u00f400000(n4);
                return true;
            }
        }
        throw g.\u00f500000();
    }

    public final void o00000(h h2) throws IOException {
        int n2;
        do {
            if ((n2 = this.oo0000()) == 0) {
                return;
            }
            this.\u00d200000();
            ++this.OO0000;
            n2 = !this.o00000(n2, h2) ? 1 : 0;
            --this.OO0000;
        } while (n2 == 0);
    }

    public final double String() throws IOException {
        return Double.longBitsToDouble(this.\u00d5O0000());
    }

    public final float \u00d6O0000() throws IOException {
        return Float.intBitsToFloat(this.\u00d8O0000());
    }

    public final long \u00f600000() throws IOException {
        return this.null();
    }

    public final long \u00d2o0000() throws IOException {
        return this.null();
    }

    public final int \u00d3o0000() throws IOException {
        return this.\u00f500000();
    }

    public final long \u00d600000() throws IOException {
        return this.\u00d5O0000();
    }

    public final int \u00d800000() throws IOException {
        return this.\u00d8O0000();
    }

    public final boolean for() throws IOException {
        return this.null() != 0L;
    }

    public final String ifsuper() throws IOException {
        int n2 = this.\u00f500000();
        if (n2 <= this.super - this.\u00d400000 && n2 > 0) {
            String string = new String(this.class, this.\u00d400000, n2, "UTF-8");
            this.\u00d400000 += n2;
            return string;
        }
        if (n2 == 0) {
            return "";
        }
        return new String(this.\u00d300000(n2), "UTF-8");
    }

    public final String private() throws IOException {
        byte[] byArray;
        int n2;
        int n3 = this.\u00f500000();
        if (n3 <= this.super - (n2 = this.\u00d400000) && n3 > 0) {
            byArray = this.class;
            this.\u00d400000 = n2 + n3;
        } else {
            if (n3 == 0) {
                return "";
            }
            byArray = this.\u00d300000(n3);
            n2 = 0;
        }
        int n4 = n2;
        if (!p.\u00d400000(byArray, n4, n4 + n3)) {
            throw g.\u00d500000();
        }
        return new String(byArray, n2, n3, "UTF-8");
    }

    public final void o00000(int n2, v$_b v$_b, s s2) throws IOException {
        this.\u00d200000();
        ++this.OO0000;
        v$_b.super(this, s2);
        this.String(i.o00000(n2, 4));
        --this.OO0000;
    }

    public final void o00000(v$_b v$_b, s s2) throws IOException {
        int n2 = this.\u00f500000();
        this.\u00d200000();
        n2 = this.\u00d500000(n2);
        ++this.OO0000;
        v$_b.super(this, s2);
        this.String(0);
        --this.OO0000;
        this.\u00d200000(n2);
    }

    public final v o00000(c object, s s2) throws IOException {
        int n2 = this.\u00f500000();
        this.\u00d200000();
        n2 = this.\u00d500000(n2);
        ++this.OO0000;
        object = (v)object.o00000(this, s2);
        this.String(0);
        --this.OO0000;
        this.\u00d200000(n2);
        return object;
    }

    public final b \u00d300000() throws IOException {
        int n2 = this.\u00f500000();
        if (n2 <= this.super - this.\u00d400000 && n2 > 0) {
            b b2 = this.\u00f400000 && this.\u00d600000 ? new l(this.class, this.\u00d400000, n2) : b.o00000(this.class, this.\u00d400000, n2);
            this.\u00d400000 += n2;
            return b2;
        }
        if (n2 == 0) {
            return b.o00000;
        }
        return new y(this.\u00d300000(n2));
    }

    public final int \u00f800000() throws IOException {
        return this.\u00f500000();
    }

    public final int \u00f6O0000() throws IOException {
        return this.\u00f500000();
    }

    public final int returnsuper() throws IOException {
        return this.\u00d8O0000();
    }

    public final long \u00f8O0000() throws IOException {
        return this.\u00d5O0000();
    }

    public final int \u00d2O0000() throws IOException {
        return ab.null(this.\u00f500000());
    }

    public final long oO0000() throws IOException {
        return ab.o00000(this.null());
    }

    public final int \u00f500000() throws IOException {
        block4: {
            int n2;
            int n3;
            block6: {
                byte[] byArray;
                block8: {
                    block7: {
                        block5: {
                            n3 = this.\u00d400000;
                            if (this.super == n3) break block4;
                            byArray = this.class;
                            if ((n2 = this.class[n3++]) >= 0) {
                                this.\u00d400000 = n3;
                                return n2;
                            }
                            if (this.super - n3 < 9) break block4;
                            if ((long)(n2 ^= byArray[n3++] << 7) >= 0L) break block5;
                            n2 = (int)((long)n2 ^ 0xFFFFFFFFFFFFFF80L);
                            break block6;
                        }
                        if ((long)(n2 ^= byArray[n3++] << 14) < 0L) break block7;
                        n2 = (int)((long)n2 ^ 0x3F80L);
                        break block6;
                    }
                    if ((long)(n2 ^= byArray[n3++] << 21) >= 0L) break block8;
                    n2 = (int)((long)n2 ^ 0xFFFFFFFFFFE03F80L);
                    break block6;
                }
                byte by = byArray[n3++];
                n2 = (int)((long)(n2 ^ by << 28) ^ 0xFE03F80L);
                if (by < 0 && byArray[n3++] < 0 && byArray[n3++] < 0 && byArray[n3++] < 0 && byArray[n3++] < 0 && byArray[n3++] < 0) break block4;
            }
            this.\u00d400000 = n3;
            return n2;
        }
        return (int)this.\u00d3O0000();
    }

    public static int o00000(int n2, InputStream inputStream) throws IOException {
        int n3;
        int n4;
        if ((n2 & 0x80) == 0) {
            return n2;
        }
        n2 &= 0x7F;
        for (n4 = 7; n4 < 32; n4 += 7) {
            n3 = inputStream.read();
            if (n3 == -1) {
                throw g.\u00f400000();
            }
            n2 |= (n3 & 0x7F) << n4;
            if ((n3 & 0x80) != 0) continue;
            return n2;
        }
        while (n4 < 64) {
            n3 = inputStream.read();
            if (n3 == -1) {
                throw g.\u00f400000();
            }
            if ((n3 & 0x80) == 0) {
                return n2;
            }
            n4 += 7;
        }
        throw g.\u00d300000();
    }

    public final long null() throws IOException {
        block4: {
            long l2;
            int n2;
            block6: {
                byte[] byArray;
                block12: {
                    block11: {
                        block10: {
                            block9: {
                                block8: {
                                    block7: {
                                        block5: {
                                            byte by;
                                            n2 = this.\u00d400000;
                                            if (this.super == n2) break block4;
                                            byArray = this.class;
                                            if ((by = this.class[n2++]) >= 0) {
                                                this.\u00d400000 = n2;
                                                return by;
                                            }
                                            if (this.super - n2 < 9) break block4;
                                            if ((l2 = (long)(by ^ byArray[n2++] << 7)) >= 0L) break block5;
                                            l2 ^= 0xFFFFFFFFFFFFFF80L;
                                            break block6;
                                        }
                                        if ((l2 ^= (long)(byArray[n2++] << 14)) < 0L) break block7;
                                        l2 ^= 0x3F80L;
                                        break block6;
                                    }
                                    if ((l2 ^= (long)(byArray[n2++] << 21)) >= 0L) break block8;
                                    l2 ^= 0xFFFFFFFFFFE03F80L;
                                    break block6;
                                }
                                if ((l2 ^= (long)byArray[n2++] << 28) < 0L) break block9;
                                l2 ^= 0xFE03F80L;
                                break block6;
                            }
                            if ((l2 ^= (long)byArray[n2++] << 35) >= 0L) break block10;
                            l2 ^= 0xFFFFFFF80FE03F80L;
                            break block6;
                        }
                        if ((l2 ^= (long)byArray[n2++] << 42) < 0L) break block11;
                        l2 ^= 0x3F80FE03F80L;
                        break block6;
                    }
                    if ((l2 ^= (long)byArray[n2++] << 49) >= 0L) break block12;
                    l2 ^= 0xFFFE03F80FE03F80L;
                    break block6;
                }
                if ((l2 = l2 ^ (long)byArray[n2++] << 56 ^ 0xFE03F80FE03F80L) < 0L && (long)byArray[n2++] < 0L) break block4;
            }
            this.\u00d400000 = n2;
            return l2;
        }
        return this.\u00d3O0000();
    }

    final long \u00d3O0000() throws IOException {
        long l2 = 0L;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte by = this.\u00d500000();
            l2 |= (long)(by & 0x7F) << i2;
            if ((by & 0x80) != 0) continue;
            return l2;
        }
        throw g.\u00d300000();
    }

    public final int \u00d8O0000() throws IOException {
        int n2 = this.\u00d400000;
        if (this.super - n2 < 4) {
            this.o00000(4);
            n2 = this.\u00d400000;
        }
        byte[] byArray = this.class;
        this.\u00d400000 = n2 + 4;
        return byArray[n2] & 0xFF | (byArray[n2 + 1] & 0xFF) << 8 | (byArray[n2 + 2] & 0xFF) << 16 | (byArray[n2 + 3] & 0xFF) << 24;
    }

    public final long \u00d5O0000() throws IOException {
        int n2 = this.\u00d400000;
        if (this.super - n2 < 8) {
            this.o00000(8);
            n2 = this.\u00d400000;
        }
        byte[] byArray = this.class;
        this.\u00d400000 = n2 + 8;
        return (long)byArray[n2] & 0xFFL | ((long)byArray[n2 + 1] & 0xFFL) << 8 | ((long)byArray[n2 + 2] & 0xFFL) << 16 | ((long)byArray[n2 + 3] & 0xFFL) << 24 | ((long)byArray[n2 + 4] & 0xFFL) << 32 | ((long)byArray[n2 + 5] & 0xFFL) << 40 | ((long)byArray[n2 + 6] & 0xFFL) << 48 | ((long)byArray[n2 + 7] & 0xFFL) << 56;
    }

    public static int null(int n2) {
        return n2 >>> 1 ^ -(n2 & 1);
    }

    public static long o00000(long l2) {
        return l2 >>> 1 ^ -(l2 & 1L);
    }

    private ab(InputStream inputStream) {
        this.class = new byte[4096];
        this.super = 0;
        this.\u00d400000 = 0;
        this.\u00f600000 = 0;
        this.do = inputStream;
        this.\u00f400000 = false;
    }

    private ab(y y2) {
        this.class = y2.if;
        this.\u00d400000 = y2.oO0000();
        this.super = this.\u00d400000 + ((b)y2).\u00f400000();
        this.\u00f600000 = -this.\u00d400000;
        this.do = null;
        this.\u00f400000 = true;
    }

    public final int \u00d500000(int n2) throws g {
        if (n2 < 0) {
            throw g.new();
        }
        int n3 = this.\u00d300000;
        if ((n2 += this.\u00f600000 + this.\u00d400000) > n3) {
            throw g.\u00f400000();
        }
        this.\u00d300000 = n2;
        this.o00000();
        return n3;
    }

    private void o00000() {
        this.super += this.int;
        int n2 = this.\u00f600000 + this.super;
        if (n2 > this.\u00d300000) {
            this.int = n2 - this.\u00d300000;
            this.super -= this.int;
            return;
        }
        this.int = 0;
    }

    public final void \u00d200000(int n2) {
        this.\u00d300000 = n2;
        this.o00000();
    }

    public final int newsuper() {
        if (this.\u00d300000 == Integer.MAX_VALUE) {
            return -1;
        }
        int n2 = this.\u00f600000 + this.\u00d400000;
        return this.\u00d300000 - n2;
    }

    public final boolean \u00f5O0000() throws IOException {
        return this.\u00d400000 == this.super && !this.\u00d800000(1);
    }

    private void \u00f600000(int n2) throws IOException {
        if (this.super - this.\u00d400000 < n2) {
            this.o00000(n2);
        }
    }

    private void o00000(int n2) throws IOException {
        if (!this.\u00d800000(n2)) {
            throw g.\u00f400000();
        }
    }

    private boolean \u00d800000(int n2) throws IOException {
        block8: {
            do {
                if (this.\u00d400000 + n2 <= this.super) {
                    throw new IllegalStateException("refillBuffer() called when " + n2 + " bytes were already available in buffer");
                }
                if (this.\u00f600000 + this.\u00d400000 + n2 > this.\u00d300000) {
                    return false;
                }
                if (this.\u00d800000 != null) {
                    this.\u00d800000.o00000();
                }
                if (this.do == null) break block8;
                int n3 = this.\u00d400000;
                if (n3 > 0) {
                    if (this.super > n3) {
                        System.arraycopy(this.class, n3, this.class, 0, this.super - n3);
                    }
                    this.\u00f600000 += n3;
                    this.super -= n3;
                    this.\u00d400000 = 0;
                }
                if ((n3 = this.do.read(this.class, this.super, this.class.length - this.super)) == 0 || n3 < -1 || n3 > this.class.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + n3 + "\nThe InputStream implementation is buggy.");
                }
                if (n3 <= 0) break block8;
                this.super += n3;
                if (this.\u00f600000 + n2 - this.\u00d200000 > 0) {
                    throw g.return();
                }
                this.o00000();
            } while (this.super < n2);
            return true;
        }
        return false;
    }

    public final byte \u00d500000() throws IOException {
        if (this.\u00d400000 == this.super) {
            this.o00000(1);
        }
        return this.class[this.\u00d400000++];
    }

    private byte[] \u00d300000(int n2) throws IOException {
        int n3;
        byte[] byArray;
        if (n2 <= 0) {
            if (n2 == 0) {
                return t.o00000;
            }
            throw g.new();
        }
        if (this.\u00f600000 + this.\u00d400000 + n2 > this.\u00d300000) {
            ab ab2 = this;
            ab2.\u00d600000(ab2.\u00d300000 - this.\u00f600000 - this.\u00d400000);
            throw g.\u00f400000();
        }
        if (n2 < 4096) {
            byte[] byArray2 = new byte[n2];
            int n4 = this.super - this.\u00d400000;
            System.arraycopy(this.class, this.\u00d400000, byArray2, 0, n4);
            this.\u00d400000 = this.super;
            this.\u00f600000(n2 - n4);
            System.arraycopy(this.class, 0, byArray2, n4, n2 - n4);
            this.\u00d400000 = n2 - n4;
            return byArray2;
        }
        int n5 = this.\u00d400000;
        int n6 = this.super;
        this.\u00f600000 += this.super;
        this.\u00d400000 = 0;
        this.super = 0;
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>();
        for (int i2 = n2 - (n6 - n5); i2 > 0; i2 -= byArray.length) {
            int n7;
            byArray = new byte[Math.min(i2, 4096)];
            for (n3 = 0; n3 < byArray.length; n3 += n7) {
                n7 = this.do == null ? -1 : this.do.read(byArray, n3, byArray.length - n3);
                if (n7 == -1) {
                    throw g.\u00f400000();
                }
                this.\u00f600000 += n7;
            }
            arrayList.add(byArray);
        }
        byArray = new byte[n2];
        n3 = n6 - n5;
        System.arraycopy(this.class, n5, byArray, 0, n3);
        for (byte[] byArray3 : arrayList) {
            System.arraycopy(byArray3, 0, byArray, n3, byArray3.length);
            n3 += byArray3.length;
        }
        return byArray;
    }

    public final void \u00d600000(int n2) throws IOException {
        if (n2 <= this.super - this.\u00d400000 && n2 >= 0) {
            this.\u00d400000 += n2;
            return;
        }
        this.\u00f500000(n2);
    }

    private void \u00f500000(int n2) throws IOException {
        if (n2 < 0) {
            throw g.new();
        }
        if (this.\u00f600000 + this.\u00d400000 + n2 > this.\u00d300000) {
            ab ab2 = this;
            ab2.\u00d600000(ab2.\u00d300000 - this.\u00f600000 - this.\u00d400000);
            throw g.\u00f400000();
        }
        int n3 = this.super - this.\u00d400000;
        this.\u00d400000 = this.super;
        this.o00000(1);
        while (n2 - n3 > this.super) {
            n3 += this.super;
            this.\u00d400000 = this.super;
            this.o00000(1);
        }
        this.\u00d400000 = n2 - n3;
    }
}

