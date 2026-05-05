/*
 * Decompiled with CFR 0.152.
 */
package b.l.b;

import b.l.b.f$_b;
import b.l.b.f$_c;
import b.l.b.i;
import b.o.d.w;
import b.q.fb;
import b.q.h;
import b.s.kb;
import java.nio.charset.Charset;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class f {
    public static final f$_b \u00f600000 = new f$_b(null);
    private final boolean interface;
    private final boolean OO0000;
    private final int \u00d200000;
    private final f$_c do;
    private final int super;
    private static final int \u00d3O0000 = 8;
    private static final int \u00d300000 = 6;
    public static final int \u00f800000 = 3;
    public static final int \u00d800000 = 4;
    public static final byte \u00d2O0000 = 61;
    private static final int \u00d600000 = 76;
    private static final int \u00d4O0000 = 64;
    private static final byte[] \u00d400000;
    private static final f class;
    private static final f \u00f400000;
    private static final f int;

    private f(boolean bl, boolean bl2, int n2, f$_c f$_c) {
        this.interface = bl;
        this.OO0000 = bl2;
        this.\u00d200000 = n2;
        this.do = f$_c;
        if (!(!this.interface || !this.OO0000)) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        this.super = this.\u00d200000 / 4;
    }

    public final boolean \u00d600000() {
        return this.interface;
    }

    public final boolean o00000() {
        return this.OO0000;
    }

    public final int \u00d200000() {
        return this.\u00d200000;
    }

    public final f$_c \u00f400000() {
        return this.do;
    }

    public final f o00000(f$_c f$_c) {
        if (this.do == f$_c) {
            return this;
        }
        return new f(this.interface, this.OO0000, this.\u00d200000, f$_c);
    }

    public final byte[] \u00d600000(byte[] byArray, int n2, int n3) {
        return this.\u00d400000(byArray, n2, n3);
    }

    public static /* synthetic */ byte[] Object(f f2, byte[] byArray, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = byArray.length;
        }
        return f2.\u00d600000(byArray, n2, n3);
    }

    public final int o00000(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        return this.\u00d200000(byArray, byArray2, n2, n3, n4);
    }

    public static /* synthetic */ int \u00d200000(f f2, byte[] byArray, byte[] byArray2, int n2, int n3, int n4, int n5, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        if ((n5 & 4) != 0) {
            n2 = 0;
        }
        if ((n5 & 8) != 0) {
            n3 = 0;
        }
        if ((n5 & 0x10) != 0) {
            n4 = byArray.length;
        }
        return f2.o00000(byArray, byArray2, n2, n3, n4);
    }

    public final String Object(byte[] byArray, int n2, int n3) {
        byArray = this.\u00d400000(byArray, n2, n3);
        return new String(byArray, fb.\u00d800000);
    }

    public static /* synthetic */ String o00000(f f2, byte[] byArray, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = byArray.length;
        }
        return f2.Object(byArray, n2, n3);
    }

    public final Appendable o00000(byte[] object, Appendable appendable, int n2, int n3) {
        object = this.\u00d400000((byte[])object, n2, n3);
        object = new String((byte[])object, fb.\u00d800000);
        appendable.append((CharSequence)object);
        return appendable;
    }

    public static /* synthetic */ Appendable o00000(f f2, byte[] byArray, Appendable appendable, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((n4 & 4) != 0) {
            n2 = 0;
        }
        if ((n4 & 8) != 0) {
            n3 = byArray.length;
        }
        return f2.o00000(byArray, appendable, n2, n3);
    }

    public final byte[] \u00d200000(byte[] byArray, int n2, int n3) {
        this.o00000(byArray.length, n2, n3);
        byte[] byArray2 = new byte[this.\u00d500000(byArray, n2, n3)];
        if (!(this.Object(byArray, byArray2, 0, n2, n3) == byArray2.length)) {
            throw new IllegalStateException("Check failed.");
        }
        return byArray2;
    }

    public static /* synthetic */ byte[] \u00d200000(f f2, byte[] byArray, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = byArray.length;
        }
        return f2.\u00d200000(byArray, n2, n3);
    }

    public final int \u00d400000(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        this.o00000(byArray.length, n3, n4);
        this.\u00d200000(byArray2.length, n2, this.\u00d500000(byArray, n3, n4));
        return this.Object(byArray, byArray2, n2, n3, n4);
    }

    public static /* synthetic */ int o00000(f f2, byte[] byArray, byte[] byArray2, int n2, int n3, int n4, int n5, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((n5 & 4) != 0) {
            n2 = 0;
        }
        if ((n5 & 8) != 0) {
            n3 = 0;
        }
        if ((n5 & 0x10) != 0) {
            n4 = byArray.length;
        }
        return f2.\u00d400000(byArray, byArray2, n2, n3, n4);
    }

    public final byte[] \u00d200000(CharSequence object, int n2, int n3) {
        byte[] byArray;
        f f2 = this;
        if (object instanceof String) {
            f2.o00000(((String)object).length(), n2, n3);
            object = ((String)object).substring(n2, n3);
            Charset charset = fb.\u00d800000;
            byArray = ((String)object).getBytes(charset);
        } else {
            byArray = f2.o00000((CharSequence)object, n2, n3);
        }
        object = byArray;
        return f.\u00d200000(this, (byte[])object, 0, 0, 6, null);
    }

    public static /* synthetic */ byte[] o00000(f f2, CharSequence charSequence, int n2, int n3, int n4, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            n3 = charSequence.length();
        }
        return f2.\u00d200000(charSequence, n2, n3);
    }

    public final int o00000(CharSequence object, byte[] byArray, int n2, int n3, int n4) {
        byte[] byArray2;
        f f2 = this;
        if (object instanceof String) {
            f2.o00000(((String)object).length(), n3, n4);
            object = ((String)object).substring(n3, n4);
            Charset charset = fb.\u00d800000;
            byArray2 = ((String)object).getBytes(charset);
        } else {
            byArray2 = f2.o00000((CharSequence)object, n3, n4);
        }
        object = byArray2;
        return f.o00000(this, (byte[])object, byArray, n2, 0, 0, 24, null);
    }

    public static /* synthetic */ int o00000(f f2, CharSequence charSequence, byte[] byArray, int n2, int n3, int n4, int n5, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        if ((n5 & 4) != 0) {
            n2 = 0;
        }
        if ((n5 & 8) != 0) {
            n3 = 0;
        }
        if ((n5 & 0x10) != 0) {
            n4 = charSequence.length();
        }
        return f2.o00000(charSequence, byArray, n2, n3, n4);
    }

    public final byte[] \u00d400000(byte[] byArray, int n2, int n3) {
        this.o00000(byArray.length, n2, n3);
        byte[] byArray2 = new byte[this.\u00d200000(n3 - n2)];
        this.\u00d200000(byArray, byArray2, 0, n2, n3);
        return byArray2;
    }

    public final int \u00d200000(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7;
        int n8;
        this.o00000(byArray.length, n3, n4);
        this.\u00d200000(byArray2.length, n2, this.\u00d200000(n4 - n3));
        byte[] byArray3 = this.interface ? i.\u00d300000() : i.o00000();
        int n9 = n2;
        int n10 = n8 = this.OO0000 ? this.super : Integer.MAX_VALUE;
        while (n3 + 2 < n4) {
            int n11 = Math.min((n4 - n3) / 3, n8);
            for (n7 = 0; n7 < n11; ++n7) {
                n6 = byArray[n3++] & 0xFF;
                n5 = byArray[n3++] & 0xFF;
                int n12 = byArray[n3++] & 0xFF;
                n6 = n6 << 16 | n5 << 8 | n12;
                byArray2[n9++] = byArray3[n6 >>> 18];
                byArray2[n9++] = byArray3[n6 >>> 12 & 0x3F];
                byArray2[n9++] = byArray3[n6 >>> 6 & 0x3F];
                byArray2[n9++] = byArray3[n6 & 0x3F];
            }
            if (n11 != n8 || n3 == n4) continue;
            byArray2[n9++] = \u00d400000[0];
            byArray2[n9++] = \u00d400000[1];
        }
        switch (n4 - n3) {
            case 1: {
                n6 = (byArray[n3++] & 0xFF) << 4;
                byArray2[n9++] = byArray3[n6 >>> 6];
                byArray2[n9++] = byArray3[n6 & 0x3F];
                if (!this.\u00d400000()) break;
                byArray2[n9++] = 61;
                byArray2[n9++] = 61;
                break;
            }
            case 2: {
                n7 = byArray[n3++] & 0xFF;
                n6 = byArray[n3++] & 0xFF;
                n5 = n7 << 10 | n6 << 2;
                byArray2[n9++] = byArray3[n5 >>> 12];
                byArray2[n9++] = byArray3[n5 >>> 6 & 0x3F];
                byArray2[n9++] = byArray3[n5 & 0x3F];
                if (!this.\u00d400000()) break;
                byArray2[n9++] = 61;
            }
        }
        if (!(n3 == n4)) {
            throw new IllegalStateException("Check failed.");
        }
        return n9 - n2;
    }

    public final int \u00d200000(int n2) {
        int n3 = n2 / 3;
        n3 *= 4;
        if ((n2 %= 3) != 0) {
            n3 += this.\u00d400000() ? 4 : n2 + 1;
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        if (this.OO0000) {
            int n4 = n3;
            n3 = n4 + (n4 - 1) / this.\u00d200000 * 2;
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("Input is too big");
        }
        return n3;
    }

    private final boolean \u00d400000() {
        return this.do == f$_c.\u00d500000 || this.do == f$_c.o00000;
    }

    private final int Object(byte[] byArray, byte[] byArray2, int n2, int n3, int n4) {
        int n5;
        int[] nArray = this.interface ? i.\u00d400000() : i.new();
        int n6 = 0;
        int n7 = -8;
        int n8 = n2;
        boolean bl = false;
        while (n3 < n4) {
            int n9;
            if (n7 == -8 && n3 + 3 < n4) {
                int n10;
                int n11;
                n5 = nArray[byArray[n3++] & 0xFF];
                n9 = nArray[byArray[n3++] & 0xFF];
                if ((n5 = n5 << 18 | n9 << 12 | (n11 = nArray[byArray[n3++] & 0xFF]) << 6 | (n10 = nArray[byArray[n3++] & 0xFF])) >= 0) {
                    byArray2[n8++] = (byte)(n5 >> 16);
                    byArray2[n8++] = (byte)(n5 >> 8);
                    byArray2[n8++] = (byte)n5;
                    continue;
                }
                n3 -= 4;
            }
            if ((n9 = nArray[n5 = byArray[n3] & 0xFF]) < 0) {
                if (n9 == -2) {
                    bl = true;
                    n3 = this.o00000(byArray, n3, n4, n7);
                    break;
                }
                if (this.OO0000) {
                    ++n3;
                    continue;
                }
                throw new IllegalArgumentException("Invalid symbol '" + (char)n5 + "'(" + Integer.toString(n5, h.o00000(8)) + ") at index " + n3);
            }
            ++n3;
            n6 = n6 << 6 | n9;
            if ((n7 += 6) < 0) continue;
            byArray2[n8++] = (byte)(n6 >>> n7);
            n6 &= (1 << n7) - 1;
            n7 -= 8;
        }
        if (n7 == -2) {
            throw new IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (n7 != -8 && !bl && this.do == f$_c.\u00d500000) {
            throw new IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (n6 != 0) {
            throw new IllegalArgumentException("The pad bits must be zeros");
        }
        if ((n3 = this.o00000(byArray, n3, n4)) < n4) {
            n5 = byArray[n3] & 0xFF;
            throw new IllegalArgumentException("Symbol '" + (char)n5 + "'(" + Integer.toString(n5, h.o00000(8)) + ") at index " + (n3 - 1) + " is prohibited after the pad character");
        }
        return n8 - n2;
    }

    public final int \u00d500000(byte[] byArray, int n2, int n3) {
        int n4 = n3 - n2;
        if (n4 == 0) {
            return 0;
        }
        if (n4 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + n2 + ", endIndex: " + n3);
        }
        if (this.OO0000) {
            while (n2 < n3) {
                int n5 = byArray[n2] & 0xFF;
                n5 = i.new()[n5];
                if (n5 < 0) {
                    if (n5 == -2) {
                        n4 -= n3 - n2;
                        break;
                    }
                    --n4;
                }
                ++n2;
            }
        } else if (byArray[n3 - 1] == 61) {
            --n4;
            if (byArray[n3 - 2] == 61) {
                --n4;
            }
        }
        return (int)((long)n4 * 6L / 8L);
    }

    public final byte[] o00000(CharSequence charSequence, int n2, int n3) {
        this.o00000(charSequence.length(), n2, n3);
        byte[] byArray = new byte[n3 - n2];
        int n4 = 0;
        while (n2 < n3) {
            char c2 = charSequence.charAt(n2);
            byArray[n4++] = c2 <= '\u00ff' ? (int)c2 : 63;
            ++n2;
        }
        return byArray;
    }

    public final String o00000(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length);
        for (byte by : byArray) {
            stringBuilder.append((char)by);
        }
        return stringBuilder.toString();
    }

    private final int o00000(byte[] byArray, int n2, int n3, int n4) {
        switch (n4) {
            case -8: {
                throw new IllegalArgumentException("Redundant pad character at index ".concat(String.valueOf(n2)));
            }
            case -2: {
                return n2 + 1;
            }
            case -4: {
                this.o00000(n2);
                n2 = this.o00000(byArray, n2 + 1, n3);
                if (n2 == n3 || byArray[n2] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index ".concat(String.valueOf(n2)));
                }
                return n2 + 1;
            }
            case -6: {
                this.o00000(n2);
                return n2 + 1;
            }
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    private final void o00000(int n2) {
        if (this.do == f$_c.\u00d600000) {
            throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index ".concat(String.valueOf(n2)));
        }
    }

    private final int o00000(byte[] byArray, int n2, int n3) {
        if (!this.OO0000) {
            return n2;
        }
        while (n2 < n3) {
            int n4 = byArray[n2] & 0xFF;
            if (i.new()[n4] != -1) {
                return n2;
            }
            ++n2;
        }
        return n2;
    }

    public final void o00000(int n2, int n3, int n4) {
        kb.return.o00000(n3, n4, n2);
    }

    private final void \u00d200000(int n2, int n3, int n4) {
        if (n3 < 0 || n3 > n2) {
            throw new IndexOutOfBoundsException("destination offset: " + n3 + ", destination size: " + n2);
        }
        int n5 = n3 + n4;
        if (n5 < 0 || n5 > n2) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + n3 + ", destination size: " + n2 + ", capacity needed: " + n4);
        }
    }

    public /* synthetic */ f(boolean bl, boolean bl2, int n2, f$_c f$_c, w w2) {
        this(bl, bl2, n2, f$_c);
    }

    public static final /* synthetic */ byte[] Object() {
        return \u00d400000;
    }

    public static final /* synthetic */ f \u00d500000() {
        return f.class;
    }

    public static final /* synthetic */ f void() {
        return \u00f400000;
    }

    public static final /* synthetic */ f \u00f500000() {
        return int;
    }

    static {
        byte[] byArray = new byte[2];
        byte[] byArray2 = byArray;
        byArray[0] = 13;
        byArray2[1] = 10;
        \u00d400000 = byArray2;
        f.class = new f(true, false, -1, f$_c.\u00d500000);
        \u00f400000 = new f(false, true, 76, f$_c.\u00d500000);
        int = new f(false, true, 64, f$_c.\u00d500000);
    }
}

