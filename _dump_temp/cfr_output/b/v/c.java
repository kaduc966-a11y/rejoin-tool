/*
 * Decompiled with CFR 0.152.
 */
package b.v;

import b.o.e.e;
import b.q.o;
import b.s.z;
import b.v.b;
import b.v.d;
import b.v.f;
import b.xc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class c
extends b {
    private static final int super = 32;
    private static final int \u00d200000 = 36;

    public static final d o00000() {
        byte[] byArray = new byte[16];
        f.o00000(byArray);
        return f.\u00d200000(byArray);
    }

    public static final d \u00d200000(byte[] byArray) {
        byArray[6] = (byte)(byArray[6] & 0xF);
        byArray[6] = (byte)(byArray[6] | 0x40);
        byArray[8] = (byte)(byArray[8] & 0x3F);
        byArray[8] = (byte)(byArray[8] | 0x80);
        return d.\u00d600000.\u00d200000(byArray);
    }

    public static final long \u00d400000(byte[] byArray, int n2) {
        return ((long)byArray[n2 + 0] & 0xFFL) << 56 | ((long)byArray[n2 + 1] & 0xFFL) << 48 | ((long)byArray[n2 + 2] & 0xFFL) << 40 | ((long)byArray[n2 + 3] & 0xFFL) << 32 | ((long)byArray[n2 + 4] & 0xFFL) << 24 | ((long)byArray[n2 + 5] & 0xFFL) << 16 | ((long)byArray[n2 + 6] & 0xFFL) << 8 | (long)byArray[n2 + 7] & 0xFFL;
    }

    public static final void \u00d200000(long l2, byte[] byArray, int n2, int n3, int n4) {
        if ((n4 = 8 - n4) <= (n3 = 7 - n3)) {
            while (true) {
                int n5 = n3 << 3;
                n5 = (int)(l2 >> n5 & 0xFFL);
                n5 = o.new()[n5];
                byArray[n2++] = (byte)(n5 >> 8);
                byArray[n2++] = (byte)n5;
                if (n3 == n4) break;
                --n3;
            }
        }
    }

    public static final void \u00d200000(byte[] byArray, int n2, long l2) {
        for (int i2 = 7; i2 >= 0; --i2) {
            int n3 = i2 << 3;
            byArray[n2++] = (byte)(l2 >> n3);
        }
    }

    public static final d \u00d500000(String string) {
        int n2;
        int n3;
        int n4;
        String string2 = "a hexadecimal digit";
        String string3 = string;
        long l2 = 0L;
        int n5 = 0;
        while (n5 < 8) {
            char c2;
            String string4 = string3;
            if ((c2 = string4.charAt(n4 = n5++)) >>> 8 != 0 || o.o00000()[c2] < 0L) {
                int n6;
                int n7 = n6 = n4;
                f.o00000(string4, string2, n7);
                throw new xc();
            }
            l2 = l2 << 4 | o.o00000()[c2];
        }
        long l3 = l2;
        string3 = string;
        if (string3.charAt(8) != '-') {
            f.o00000(string3, "'-' (hyphen)", 8);
            throw new xc();
        }
        string3 = string;
        long l4 = 0L;
        n4 = 9;
        while (n4 < 13) {
            int n8;
            char c3;
            String string5 = string3;
            if ((c3 = string5.charAt(n8 = n4++)) >>> 8 != 0 || o.o00000()[c3] < 0L) {
                int n9 = n8;
                String string6 = string5;
                int n10 = n9;
                f.o00000(string6, string2, n10);
                throw new xc();
            }
            l4 = l4 << 4 | o.o00000()[c3];
        }
        long l5 = l4;
        string3 = string;
        if (string3.charAt(13) != '-') {
            f.o00000(string3, "'-' (hyphen)", 13);
            throw new xc();
        }
        String string7 = string;
        long l6 = 0L;
        int n11 = 14;
        while (n11 < 18) {
            int n12;
            string3 = string7;
            if ((n3 = string3.charAt(n12 = n11++)) >>> 8 != 0 || o.o00000()[n3] < 0L) {
                int n13 = n12;
                String string8 = string3;
                int n14 = n13;
                f.o00000(string8, string2, n14);
                throw new xc();
            }
            l6 = l6 << 4 | o.o00000()[n3];
        }
        long l7 = l6;
        string7 = string;
        if (string7.charAt(18) != '-') {
            f.o00000(string7, "'-' (hyphen)", 18);
            throw new xc();
        }
        string7 = string;
        long l8 = 0L;
        int n15 = 19;
        while (n15 < 23) {
            string3 = string7;
            if ((n2 = string3.charAt(n3 = n15++)) >>> 8 != 0 || o.o00000()[n2] < 0L) {
                int n16;
                int n17 = n16 = n3;
                f.o00000(string3, string2, n17);
                throw new xc();
            }
            l8 = l8 << 4 | o.o00000()[n2];
        }
        long l9 = l8;
        string7 = string;
        if (string7.charAt(23) != '-') {
            f.o00000(string7, "'-' (hyphen)", 23);
            throw new xc();
        }
        String string9 = string;
        long l10 = 0L;
        n3 = 24;
        while (n3 < 36) {
            char c4;
            string = string9;
            if ((c4 = string.charAt(n2 = n3++)) >>> 8 != 0 || o.o00000()[c4] < 0L) {
                int n18 = n2;
                String string10 = string;
                f.o00000(string10, string2, n18);
                throw new xc();
            }
            l10 = l10 << 4 | o.o00000()[c4];
        }
        l4 = l10;
        l6 = l3 << 32 | l5 << 16 | l7;
        l8 = l9 << 48 | l4;
        return d.\u00d600000.\u00d200000(l6, l8);
    }

    public static final d \u00f400000(String string) {
        int n2;
        int n3;
        int n4;
        String string2 = string;
        long l2 = 0L;
        int n5 = 0;
        while (n5 < 8) {
            String string3 = string2;
            if ((n4 = string3.charAt(n3 = n5++)) >>> 8 != 0 || o.o00000()[n4] < 0L) {
                return null;
            }
            l2 = l2 << 4 | o.o00000()[n4];
        }
        long l3 = l2;
        if (string.charAt(8) != '-') {
            return null;
        }
        string2 = string;
        long l4 = 0L;
        n3 = 9;
        while (n3 < 13) {
            char c2;
            String string4 = string2;
            if ((c2 = string4.charAt(n4 = n3++)) >>> 8 != 0 || o.o00000()[c2] < 0L) {
                return null;
            }
            l4 = l4 << 4 | o.o00000()[c2];
        }
        long l5 = l4;
        if (string.charAt(13) != '-') {
            return null;
        }
        String string5 = string;
        long l6 = 0L;
        n4 = 14;
        while (n4 < 18) {
            int n6;
            string2 = string5;
            if ((n2 = string2.charAt(n6 = n4++)) >>> 8 != 0 || o.o00000()[n2] < 0L) {
                return null;
            }
            l6 = l6 << 4 | o.o00000()[n2];
        }
        long l7 = l6;
        if (string.charAt(18) != '-') {
            return null;
        }
        string5 = string;
        long l8 = 0L;
        int n7 = 19;
        while (n7 < 23) {
            char c3;
            string2 = string5;
            if ((c3 = string2.charAt(n2 = n7++)) >>> 8 != 0 || o.o00000()[c3] < 0L) {
                return null;
            }
            l8 = l8 << 4 | o.o00000()[c3];
        }
        long l9 = l8;
        if (string.charAt(23) != '-') {
            return null;
        }
        String string6 = string;
        long l10 = 0L;
        n2 = 24;
        while (n2 < 36) {
            int n8;
            char c4;
            string = string6;
            if ((c4 = string.charAt(n8 = n2++)) >>> 8 != 0 || o.o00000()[c4] < 0L) {
                return null;
            }
            l10 = l10 << 4 | o.o00000()[c4];
        }
        l4 = l10;
        l6 = l3 << 32 | l5 << 16 | l7;
        l8 = l9 << 48 | l4;
        return d.\u00d600000.\u00d200000(l6, l8);
    }

    public static final void o00000(String string, int n2, e e2) {
        if (string.charAt(n2) != '-') {
            e2.o00000(string, "'-' (hyphen)", n2);
        }
    }

    public static final d \u00d200000(String string, e e2) {
        int n2;
        String string2;
        int n3;
        int n4;
        String string3;
        String string4 = "a hexadecimal digit";
        String string5 = string;
        long l2 = 0L;
        int n5 = 0;
        while (n5 < 8) {
            string3 = string5;
            if ((n4 = string3.charAt(n3 = n5++)) >>> 8 != 0 || o.o00000()[n4] < 0L) {
                int n6 = n3;
                String string6 = string3;
                int n7 = n6;
                string = string6;
                e2.o00000(string, string4, n7);
                throw new xc();
            }
            l2 = l2 << 4 | o.o00000()[n4];
        }
        long l3 = l2;
        string5 = string;
        if (string5.charAt(8) != '-') {
            e2.o00000(string5, "'-' (hyphen)", 8);
        }
        String string7 = string;
        long l4 = 0L;
        n3 = 9;
        while (n3 < 13) {
            string2 = string7;
            if ((n2 = string2.charAt(n4 = n3++)) >>> 8 != 0 || o.o00000()[n2] < 0L) {
                int n8 = n4;
                string3 = string2;
                int n9 = n8;
                string = string3;
                e2.o00000(string, string4, n9);
                throw new xc();
            }
            l4 = l4 << 4 | o.o00000()[n2];
        }
        long l5 = l4;
        string7 = string;
        if (string7.charAt(13) != '-') {
            e2.o00000(string7, "'-' (hyphen)", 13);
        }
        String string8 = string;
        long l6 = 0L;
        n4 = 14;
        while (n4 < 18) {
            char c2;
            String string9 = string8;
            if ((c2 = string9.charAt(n2 = n4++)) >>> 8 != 0 || o.o00000()[c2] < 0L) {
                int n10 = n2;
                string2 = string9;
                int n11 = n10;
                String string10 = string2;
                e2.o00000(string10, string4, n11);
                throw new xc();
            }
            l6 = l6 << 4 | o.o00000()[c2];
        }
        long l7 = l6;
        string8 = string;
        if (string8.charAt(18) != '-') {
            e2.o00000(string8, "'-' (hyphen)", 18);
        }
        String string11 = string;
        long l8 = 0L;
        n2 = 19;
        while (n2 < 23) {
            int n12;
            char c3;
            String string12 = string11;
            if ((c3 = string12.charAt(n12 = n2++)) >>> 8 != 0 || o.o00000()[c3] < 0L) {
                int n13 = n12;
                string11 = string12;
                int n14 = n13;
                String string13 = string11;
                e2.o00000(string13, string4, n14);
                throw new xc();
            }
            l8 = l8 << 4 | o.o00000()[c3];
        }
        long l9 = l8;
        string11 = string;
        if (string11.charAt(23) != '-') {
            e2.o00000(string11, "'-' (hyphen)", 23);
        }
        String string14 = string;
        long l10 = 0L;
        int n15 = 24;
        while (n15 < 36) {
            int n16;
            char c4;
            string = string14;
            if ((c4 = string.charAt(n16 = n15++)) >>> 8 != 0 || o.o00000()[c4] < 0L) {
                int n17 = n16;
                String string15 = string;
                e2.o00000(string15, string4, n17);
                throw new xc();
            }
            l10 = l10 << 4 | o.o00000()[c4];
        }
        long l11 = l10;
        long l12 = l3 << 32 | l5 << 16 | l7;
        l8 = l9 << 48 | l11;
        return d.\u00d600000.\u00d200000(l12, l8);
    }

    public static final d void(String string) {
        int n2;
        String string2 = string;
        long l2 = 0L;
        int n3 = 0;
        while (n3 < 16) {
            int n4;
            String string3 = string2;
            if ((n2 = string3.charAt(n4 = n3++)) >>> 8 != 0 || o.o00000()[n2] < 0L) {
                int n5 = n4;
                String string4 = string3;
                int n6 = n5;
                f.o00000(string4, "a hexadecimal digit", n6);
                throw new xc();
            }
            l2 = l2 << 4 | o.o00000()[n2];
        }
        long l3 = l2;
        long l4 = 0L;
        int n7 = 16;
        while (n7 < 32) {
            string2 = string;
            n2 = n7++;
            char c2 = string2.charAt(n2);
            n3 = c2;
            if (c2 >>> 8 != 0 || o.o00000()[n3] < 0L) {
                int n8 = n2;
                f.o00000(string2, "a hexadecimal digit", n8);
                throw new xc();
            }
            l4 = l4 << 4 | o.o00000()[n3];
        }
        long l5 = l4;
        return d.\u00d600000.\u00d200000(l3, l5);
    }

    public static final d \u00d600000(String string) {
        int n2;
        String string2 = string;
        long l2 = 0L;
        int n3 = 0;
        while (n3 < 16) {
            int n4;
            String string3 = string2;
            if ((n2 = string3.charAt(n4 = n3++)) >>> 8 != 0 || o.o00000()[n2] < 0L) {
                return null;
            }
            l2 = l2 << 4 | o.o00000()[n2];
        }
        long l3 = l2;
        long l4 = 0L;
        int n5 = 16;
        while (n5 < 32) {
            char c2;
            string2 = string;
            if ((c2 = string2.charAt(n2 = n5++)) >>> 8 != 0 || o.o00000()[c2] < 0L) {
                return null;
            }
            l4 = l4 << 4 | o.o00000()[c2];
        }
        long l5 = l4;
        return d.\u00d600000.\u00d200000(l3, l5);
    }

    public static final d o00000(String string, e e2) {
        int n2;
        int n3;
        String string2 = string;
        long l2 = 0L;
        int n4 = 0;
        while (n4 < 16) {
            String string3 = string2;
            if ((n3 = string3.charAt(n2 = n4++)) >>> 8 != 0 || o.o00000()[n3] < 0L) {
                int n5 = n2;
                String string4 = string3;
                int n6 = n5;
                String string5 = string4;
                e2.o00000(string5, "a hexadecimal digit", n6);
                throw new xc();
            }
            l2 = l2 << 4 | o.o00000()[n3];
        }
        long l3 = l2;
        long l4 = 0L;
        n2 = 16;
        while (n2 < 32) {
            char c2;
            string2 = string;
            if ((c2 = string2.charAt(n3 = n2++)) >>> 8 != 0 || o.o00000()[c2] < 0L) {
                int n7 = n3;
                String string6 = string2;
                e2.o00000(string6, "a hexadecimal digit", n7);
                throw new xc();
            }
            l4 = l4 << 4 | o.o00000()[c2];
        }
        long l5 = l4;
        return d.\u00d600000.\u00d200000(l3, l5);
    }

    private static final String \u00d200000(String string, int n2) {
        if (string.length() <= n2) {
            return string;
        }
        return string.substring(0, n2) + "...";
    }

    private static final String \u00d200000(byte[] byArray, int n2) {
        return z.o00000(byArray, null, (CharSequence)"[", (CharSequence)"]", n2, null, null, 49, null);
    }

    public static final Void o00000(String string, String string2, int n2) {
        throw new IllegalArgumentException("Expected " + string2 + " at index " + n2 + ", but was '" + string.charAt(n2) + '\'');
    }

    public static final /* synthetic */ String Object(byte[] byArray, int n2) {
        return c.\u00d200000(byArray, n2);
    }

    public static final /* synthetic */ String o00000(String string, int n2) {
        return c.\u00d200000(string, n2);
    }
}

