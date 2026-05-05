/*
 * Decompiled with CFR 0.152.
 */
package b.v;

import b.i.e;
import b.i.e$_b;
import b.i.v;
import b.o.d.w;
import b.v.c;
import b.v.d;
import b.v.f;
import b.v.g;
import java.util.Comparator;

public final class d$_b {
    private d$_b() {
    }

    public final d \u00d300000() {
        return d.\u00f400000();
    }

    public final d \u00d200000(long l2, long l3) {
        if (l2 == 0L && l3 == 0L) {
            return this.\u00d300000();
        }
        return new d(l2, l3, null);
    }

    public final d o00000(long l2, long l3) {
        return this.\u00d200000(l2, l3);
    }

    public final d \u00d200000(byte[] object) {
        if (!(((byte[])object).length == 16)) {
            object = "Expected exactly 16 bytes, but was " + c.Object((byte[])object, 32) + " of size " + ((byte[])object).length;
            throw new IllegalArgumentException(object.toString());
        }
        return this.\u00d200000(f.o00000((byte[])object, 0), f.o00000((byte[])object, 8));
    }

    public final d o00000(byte[] byArray) {
        return this.\u00d200000(byArray);
    }

    public final d \u00d200000(String string) {
        switch (string.length()) {
            case 36: {
                return f.Object(string);
            }
            case 32: {
                return f.o00000(string);
            }
        }
        throw new IllegalArgumentException("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"" + c.o00000(string, 64) + "\" of length " + string.length());
    }

    public final d \u00d500000(String string) {
        switch (string.length()) {
            case 36: {
                return this.\u00d300000(string);
            }
            case 32: {
                return this.o00000(string);
            }
        }
        return null;
    }

    public final d \u00d600000(String string) {
        if (!(string.length() == 36)) {
            string = "Expected a 36-char string in the standard hex-and-dash UUID format, but was \"" + c.o00000(string, 64) + "\" of length " + string.length();
            throw new IllegalArgumentException(string.toString());
        }
        return f.Object(string);
    }

    public final d \u00d300000(String string) {
        if (string.length() != 36) {
            return null;
        }
        return f.\u00d400000(string);
    }

    public final d String(String string) {
        if (!(string.length() == 32)) {
            string = "Expected a 32-char hexadecimal string, but was \"" + c.o00000(string, 64) + "\" of length " + string.length();
            throw new IllegalArgumentException(string.toString());
        }
        return f.o00000(string);
    }

    public final d o00000(String string) {
        if (string.length() != 32) {
            return null;
        }
        return f.\u00d200000(string);
    }

    public final d \u00d500000() {
        return this.o00000();
    }

    public final d o00000() {
        return f.o00000();
    }

    public final d \u00d200000() {
        return this.o00000(e$_b.\u00d400000);
    }

    public final d o00000(v v2) {
        byte[] byArray = new byte[10];
        f.o00000(byArray);
        byte[] byArray2 = byArray;
        int n2 = (byArray[8] & 0xF | 0x70) << 8 | byArray2[9] & 0xFF;
        long l2 = v2.\u00d600000() << 16 | (long)n2;
        byArray2[0] = (byte)((byte)(byArray2[0] & 0x3F) | 0xFFFFFF80);
        long l3 = f.o00000(byArray2, 0);
        return this.\u00d200000(l2, l3);
    }

    public final d o00000(e e2) {
        return g.\u00d500000.o00000(e2);
    }

    public final Comparator \u00d600000() {
        return b.y.f.\u00d400000();
    }

    public static /* synthetic */ void String() {
    }

    public /* synthetic */ d$_b(w w2) {
        this();
    }
}

