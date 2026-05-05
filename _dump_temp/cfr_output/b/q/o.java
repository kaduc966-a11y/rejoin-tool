/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.bb;
import b.q.f;
import b.q.h;
import b.q.nb;
import b.q.nb$_b;
import b.q.nb$_c;
import b.s.kb;
import b.s.z;
import b.xc;
import java.util.Arrays;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class o {
    private static final String \u00d300000 = "0123456789abcdef";
    private static final String \u00d600000 = "0123456789ABCDEF";
    private static final int[] \u00d200000;
    private static final int[] class;
    private static final int[] \u00d400000;
    private static final long[] super;

    public static final int[] new() {
        return \u00d200000;
    }

    public static final String o00000(byte[] byArray, nb nb2) {
        return o.o00000(byArray, 0, byArray.length, nb2);
    }

    public static /* synthetic */ String o00000(byte[] byArray, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(byArray, nb2);
    }

    public static final String o00000(byte[] byArray, int n2, int n3, nb object) {
        kb.return.o00000(n2, n3, byArray.length);
        if (n2 == n3) {
            return "";
        }
        int[] nArray = ((nb)object).\u00d200000() ? o.class : \u00d200000;
        if (((nb$_b)(object = ((nb)object).o00000())).\u00f600000()) {
            return o.\u00d400000(byArray, n2, n3, (nb$_b)object, nArray);
        }
        return o.o00000(byArray, n2, n3, (nb$_b)object, nArray);
    }

    public static /* synthetic */ String o00000(byte[] byArray, int n2, int n3, nb nb2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = byArray.length;
        }
        if ((n4 & 4) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(byArray, n2, n3, nb2);
    }

    private static final String \u00d400000(byte[] byArray, int n2, int n3, nb$_b nb$_b, int[] nArray) {
        if (nb$_b.null()) {
            return o.new(byArray, n2, n3, nb$_b, nArray);
        }
        return o.\u00d300000(byArray, n2, n3, nb$_b, nArray);
    }

    private static final String new(byte[] byArray, int n2, int n3, nb$_b nb$_b, int[] nArray) {
        int n4 = nb$_b.\u00d200000().length();
        if (!(n4 <= 1)) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        int n5 = n3 - n2;
        int n6 = 0;
        if (n4 == 0) {
            char[] cArray = new char[o.o00000(2L * (long)n5)];
            for (int i2 = n2; i2 < n3; ++i2) {
                n6 = o.o00000(byArray, i2, nArray, cArray, n6);
            }
            return f.super(cArray);
        }
        char[] cArray = new char[o.o00000(3L * (long)n5 - 1L)];
        char c2 = nb$_b.\u00d200000().charAt(0);
        n6 = o.o00000(byArray, n2, nArray, cArray, 0);
        ++n2;
        while (n2 < n3) {
            cArray[n6++] = c2;
            n6 = o.o00000(byArray, n2, nArray, cArray, n6);
            ++n2;
        }
        return f.super(cArray);
    }

    private static final String \u00d300000(byte[] byArray, int n2, int n3, nb$_b object, int[] nArray) {
        String string = ((nb$_b)object).\u00d800000();
        String string2 = ((nb$_b)object).\u00d300000();
        object = ((nb$_b)object).\u00d200000();
        char[] cArray = new char[o.o00000(n3 - n2, ((String)object).length(), string.length(), string2.length())];
        int n4 = o.o00000(byArray, n2, string, string2, nArray, cArray, 0);
        ++n2;
        while (n2 < n3) {
            n4 = o.o00000((String)object, cArray, n4);
            n4 = o.o00000(byArray, n2, string, string2, nArray, cArray, n4);
            ++n2;
        }
        return f.super(cArray);
    }

    private static final String o00000(byte[] byArray, int n2, int n3, nb$_b object, int[] nArray) {
        int n4 = ((nb$_b)object).\u00d600000();
        int n5 = ((nb$_b)object).o00000();
        String string = ((nb$_b)object).\u00d800000();
        String string2 = ((nb$_b)object).\u00d300000();
        String string3 = ((nb$_b)object).\u00d200000();
        object = ((nb$_b)object).\u00d500000();
        int n6 = o.new(n3 - n2, n4, n5, ((String)object).length(), string3.length(), string.length(), string2.length());
        char[] cArray = new char[n6];
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        while (n2 < n3) {
            if (n8 == n4) {
                cArray[n7++] = 10;
                n8 = 0;
                n9 = 0;
            } else if (n9 == n5) {
                n7 = o.o00000((String)object, cArray, n7);
                n9 = 0;
            }
            if (n9 != 0) {
                n7 = o.o00000(string3, cArray, n7);
            }
            n7 = o.o00000(byArray, n2, string, string2, nArray, cArray, n7);
            ++n9;
            ++n8;
            ++n2;
        }
        if (!(n7 == n6)) {
            throw new IllegalStateException("Check failed.");
        }
        return f.super(cArray);
    }

    private static final int o00000(byte[] byArray, int n2, String string, String string2, int[] nArray, char[] cArray, int n3) {
        int n4 = o.o00000(string, cArray, n3);
        n4 = o.o00000(byArray, n2, nArray, cArray, n4);
        return o.o00000(string2, cArray, n4);
    }

    private static final int o00000(byte[] byArray, int n2, int[] nArray, char[] cArray, int n3) {
        int n4 = byArray[n2] & 0xFF;
        n4 = nArray[n4];
        cArray[n3] = (char)(n4 >> 8);
        cArray[n3 + 1] = (char)(n4 & 0xFF);
        return n3 + 2;
    }

    private static final int o00000(int n2, int n3, int n4, int n5) {
        if (!(n2 > 0)) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        long l2 = 2L + (long)n4 + (long)n5 + (long)n3;
        return o.o00000((long)n2 * l2 - (long)n3);
    }

    public static final int new(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (!(n2 > 0)) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        int n9 = (n2 - 1) / n3;
        int n10 = (n3 - 1) / n4;
        int n11 = n2 % n3;
        n3 = ((n11 == 0 ? n3 : n11) - 1) / n4;
        n3 = n9 * n10 + n3;
        n4 = n2 - 1 - n9 - n3;
        return o.o00000((long)n9 + (long)n3 * (long)n5 + (long)n4 * (long)n6 + (long)n2 * ((long)n7 + 2L + (long)n8));
    }

    private static final int o00000(long l2) {
        if (!(0L <= l2 ? l2 <= Integer.MAX_VALUE : false)) {
            throw new IllegalArgumentException("The resulting string length is too big: " + b.f.\u00d400000(b.f.super(l2)));
        }
        return (int)l2;
    }

    public static final byte[] \u00d500000(String string, nb nb2) {
        return o.new(string, 0, string.length(), nb2);
    }

    public static /* synthetic */ byte[] new(String string, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.\u00d500000(string, nb2);
    }

    private static final byte[] new(String string, int n2, int n3, nb object) {
        byte[] byArray;
        kb.return.o00000(n2, n3, string.length());
        if (n2 == n3) {
            return new byte[0];
        }
        if (((nb$_b)(object = ((nb)object).o00000())).\u00f600000() && (byArray = o.\u00d400000(string, n2, n3, (nb$_b)object)) != null) {
            return byArray;
        }
        return o.new(string, n2, n3, (nb$_b)object);
    }

    static /* synthetic */ byte[] \u00d300000(String string, int n2, int n3, nb nb2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = string.length();
        }
        if ((n4 & 4) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.new(string, n2, n3, nb2);
    }

    private static final byte[] \u00d400000(String string, int n2, int n3, nb$_b nb$_b) {
        if (nb$_b.null()) {
            return o.o00000(string, n2, n3, nb$_b);
        }
        return o.\u00d300000(string, n2, n3, nb$_b);
    }

    private static final byte[] o00000(String string, int n2, int n3, nb$_b nb$_b) {
        int n4 = nb$_b.\u00d200000().length();
        if (!(n4 <= 1)) {
            String string2 = "Failed requirement.";
            throw new IllegalArgumentException(string2.toString());
        }
        n2 = n3 - n2;
        int n5 = 0;
        if (n4 == 0) {
            if ((n2 & 1) != 0) {
                return null;
            }
            byte[] byArray = new byte[n2 >>= 1];
            for (int i2 = 0; i2 < n2; ++i2) {
                byArray[i2] = o.o00000(string, n5);
                n5 += 2;
            }
            return byArray;
        }
        if (n2 % 3 != 2) {
            return null;
        }
        n2 = n2 / 3 + 1;
        byte[] byArray = new byte[n2];
        char c2 = nb$_b.\u00d200000().charAt(0);
        byArray[0] = o.o00000(string, 0);
        n5 += 2;
        for (int i3 = 1; i3 < n2; ++i3) {
            if (string.charAt(n5) != c2) {
                String string3 = string;
                int n6 = n5;
                int n7 = n3;
                String string4 = nb$_b.\u00d200000();
                boolean bl = nb$_b.String();
                String string5 = "byte separator";
                if (!(((CharSequence)string4).length() == 0)) {
                    int n8 = ((CharSequence)string4).length();
                    for (int i4 = 0; i4 < n8; ++i4) {
                        if (h.o00000(string4.charAt(i4), string3.charAt(n6 + i4), bl)) continue;
                        o.new(string3, n6, n7, string4, string5);
                    }
                    string4.length();
                }
            }
            byArray[i3] = o.o00000(string, n5 + 1);
            n5 += 3;
        }
        return byArray;
    }

    private static final byte[] \u00d300000(String string, int n2, int n3, nb$_b nb$_b) {
        int n4;
        int n5;
        int n6;
        long l2;
        String string2 = nb$_b.\u00d800000();
        String string3 = nb$_b.\u00d300000();
        long l3 = n3 - n2;
        String string4 = nb$_b.\u00d200000();
        int n7 = string4.length();
        int n8 = (int)((l3 + (long)n7) / (l2 = 2L + (long)string2.length() + (long)string3.length() + (long)n7));
        if ((long)n8 * l2 - (long)n7 != l3) {
            return null;
        }
        boolean bl = nb$_b.String();
        byte[] byArray = new byte[n8];
        String string5 = string;
        int n9 = n2;
        int n10 = n3;
        String string6 = string2;
        n2 = bl ? 1 : 0;
        String string7 = "byte prefix";
        if (((CharSequence)string6).length() == 0) {
            n6 = n9;
        } else {
            n5 = ((CharSequence)string6).length();
            for (n4 = 0; n4 < n5; ++n4) {
                if (h.o00000(string6.charAt(n4), string5.charAt(n9 + n4), n2 != 0)) continue;
                o.new(string5, n9, n10, string6, string7);
            }
            n6 = n9 + string6.length();
        }
        n2 = n6;
        string5 = string3 + string4 + string2;
        n10 = n8 - 1;
        for (n9 = 0; n9 < n10; ++n9) {
            int n11;
            byArray[n9] = o.o00000(string, n2);
            string6 = string;
            n2 += 2;
            int n12 = n3;
            string2 = string5;
            n4 = bl ? 1 : 0;
            String string8 = "byte suffix + byte separator + byte prefix";
            if (((CharSequence)string2).length() == 0) {
                n11 = n2;
            } else {
                int n13 = ((CharSequence)string2).length();
                for (int i2 = 0; i2 < n13; ++i2) {
                    if (h.o00000(string2.charAt(i2), string6.charAt(n2 + i2), n4 != 0)) continue;
                    o.new(string6, n2, n12, string2, string8);
                }
                n11 = n2 + string2.length();
            }
            n2 = n11;
        }
        byArray[n8 - 1] = o.o00000(string, n2);
        String string9 = string;
        n10 = n2 + 2;
        int n14 = n3;
        String string10 = string3;
        boolean bl2 = bl;
        string2 = "byte suffix";
        if (!(((CharSequence)string10).length() == 0)) {
            int n15 = ((CharSequence)string10).length();
            for (n5 = 0; n5 < n15; ++n5) {
                if (h.o00000(string10.charAt(n5), string9.charAt(n10 + n5), bl2)) continue;
                o.new(string9, n10, n14, string10, string2);
            }
            string10.length();
        }
        return byArray;
    }

    private static final byte[] new(String string, int n2, int n3, nb$_b nb$_b) {
        int n4 = nb$_b.\u00d600000();
        int n5 = nb$_b.o00000();
        String string2 = nb$_b.\u00d800000();
        String string3 = nb$_b.\u00d300000();
        String string4 = nb$_b.\u00d200000();
        String string5 = nb$_b.\u00d500000();
        boolean bl = nb$_b.String();
        byte[] byArray = new byte[o.o00000(n3 - n2, n4, n5, string5.length(), string4.length(), string2.length(), string3.length())];
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        while (n2 < n3) {
            int n9;
            int n10;
            int n11;
            int n12;
            String string6;
            boolean bl2;
            String string7;
            int n13;
            String string8;
            if (n7 == n4) {
                n2 = o.\u00d400000(string, n2, n3);
                n7 = 0;
                n8 = 0;
            } else if (n8 == n5) {
                int n14;
                string8 = string;
                n13 = n3;
                string7 = string5;
                bl2 = bl;
                string6 = "group separator";
                if (((CharSequence)string7).length() == 0) {
                    n14 = n2;
                } else {
                    n12 = ((CharSequence)string7).length();
                    for (n11 = 0; n11 < n12; ++n11) {
                        if (h.o00000(string7.charAt(n11), string8.charAt(n2 + n11), bl2)) continue;
                        o.new(string8, n2, n13, string7, string6);
                    }
                    n14 = n2 + string7.length();
                }
                n2 = n14;
                n8 = 0;
            } else if (n8 != 0) {
                int n15;
                string8 = string;
                n13 = n3;
                string7 = string4;
                bl2 = bl;
                string6 = "byte separator";
                if (((CharSequence)string7).length() == 0) {
                    n15 = n2;
                } else {
                    n12 = ((CharSequence)string7).length();
                    for (n11 = 0; n11 < n12; ++n11) {
                        if (h.o00000(string7.charAt(n11), string8.charAt(n2 + n11), bl2)) continue;
                        o.new(string8, n2, n13, string7, string6);
                    }
                    n15 = n2 + string7.length();
                }
                n2 = n15;
            }
            ++n7;
            ++n8;
            string8 = string;
            n13 = n3;
            string7 = string2;
            bl2 = bl;
            string6 = "byte prefix";
            if (((CharSequence)string7).length() == 0) {
                n10 = n2;
            } else {
                n12 = ((CharSequence)string7).length();
                for (n11 = 0; n11 < n12; ++n11) {
                    if (h.o00000(string7.charAt(n11), string8.charAt(n2 + n11), bl2)) continue;
                    o.new(string8, n2, n13, string7, string6);
                }
                n10 = n2 = n2 + string7.length();
            }
            if (n3 - 2 < n2) {
                o.o00000(string, n2, n3, "exactly", 2);
            }
            byArray[n6++] = o.o00000(string, n2);
            string8 = string;
            n2 += 2;
            n13 = n3;
            string7 = string3;
            bl2 = bl;
            string6 = "byte suffix";
            if (((CharSequence)string7).length() == 0) {
                n9 = n2;
            } else {
                n12 = ((CharSequence)string7).length();
                for (n11 = 0; n11 < n12; ++n11) {
                    if (h.o00000(string7.charAt(n11), string8.charAt(n2 + n11), bl2)) continue;
                    o.new(string8, n2, n13, string7, string6);
                }
                n9 = n2 + string7.length();
            }
            n2 = n9;
        }
        if (n6 == byArray.length) {
            return byArray;
        }
        return Arrays.copyOf(byArray, n6);
    }

    private static final byte o00000(String string, int n2) {
        String string2 = string;
        int n3 = n2;
        int n4 = string2.charAt(n3);
        if (n4 >>> 8 != 0 || o.\u00d400000[n4] < 0) {
            o.new(string2, n3);
            throw new xc();
        }
        n4 = o.\u00d400000[n4];
        String string3 = string;
        int n5 = n2 + 1;
        char c2 = string3.charAt(n5);
        n2 = c2;
        if (c2 >>> 8 != 0 || o.\u00d400000[n2] < 0) {
            o.new(string3, n5);
            throw new xc();
        }
        int n6 = o.\u00d400000[n2];
        return (byte)(n4 << 4 | n6);
    }

    public static final int o00000(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        long l2;
        if (!(n2 > 0)) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        long l3 = (long)n7 + 2L + (long)n8;
        long l4 = o.o00000(l3, n4, n6);
        if (n3 <= n4) {
            l2 = o.o00000(l3, n3, n6);
        } else {
            int n9 = n3 / n4;
            long l5 = o.o00000(l4, n9, n5);
            int n10 = n3 % n4;
            if (n10 != 0) {
                l5 = l5 + (long)n5 + o.o00000(l3, n10, n6);
            }
            l2 = l5;
        }
        long l6 = l2;
        long l7 = n2;
        long l8 = o.o00000(l7, l6, 1);
        long l9 = o.o00000(l7 -= l8 * (l6 + 1L), l4, n5);
        long l10 = o.o00000(l7 -= l9 * (l4 + (long)n5), l3, n6);
        n2 = l7 - l10 * (l3 + (long)n6) > 0L ? 1 : 0;
        return (int)(l8 * (long)n3 + l9 * (long)n4 + l10 + (long)n2);
    }

    private static final long o00000(long l2, int n2, int n3) {
        if (!(n2 > 0)) {
            String string = "Failed requirement.";
            throw new IllegalArgumentException(string.toString());
        }
        return l2 * (long)n2 + (long)n3 * ((long)n2 - 1L);
    }

    private static final long o00000(long l2, long l3, int n2) {
        if (l2 <= 0L || l3 <= 0L) {
            return 0L;
        }
        return (l2 + (long)n2) / (l3 + (long)n2);
    }

    private static final int \u00d400000(String string, int n2, int n3) {
        if (string.charAt(n2) == '\r') {
            if (n2 + 1 < n3 && string.charAt(n2 + 1) == '\n') {
                return n2 + 2;
            }
            return n2 + 1;
        }
        if (string.charAt(n2) == '\n') {
            return n2 + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + n2 + ", but was " + string.charAt(n2));
    }

    public static final String o00000(byte by, nb object) {
        String string = ((nb)object).\u00d200000() ? \u00d600000 : \u00d300000;
        if (((nb$_c)(object = ((nb)object).\u00d500000())).o00000()) {
            char[] cArray = new char[2];
            byte by2 = by;
            cArray[0] = string.charAt(by2 >> 4 & 0xF);
            cArray[1] = string.charAt(by2 & 0xF);
            if (((nb$_c)object).\u00d800000()) {
                return f.super(cArray, bb.Object(Integer.numberOfLeadingZeros(by & 0xFF) - 24 >> 2, 1), 0, 2, null);
            }
            return f.super(cArray);
        }
        return o.o00000((long)by, (nb$_c)object, string, 8);
    }

    public static /* synthetic */ String o00000(byte by, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(by, nb2);
    }

    public static final byte \u00d400000(String string, nb nb2) {
        return o.\u00d500000(string, 0, string.length(), nb2);
    }

    public static /* synthetic */ byte \u00d300000(String string, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.\u00d400000(string, nb2);
    }

    private static final byte \u00d500000(String string, int n2, int n3, nb nb2) {
        return (byte)o.o00000(string, n2, n3, nb2, 2);
    }

    static /* synthetic */ byte new(String string, int n2, int n3, nb nb2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = string.length();
        }
        if ((n4 & 4) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.\u00d500000(string, n2, n3, nb2);
    }

    public static final String o00000(short s2, nb object) {
        String string = ((nb)object).\u00d200000() ? \u00d600000 : \u00d300000;
        if (((nb$_c)(object = ((nb)object).\u00d500000())).o00000()) {
            char[] cArray = new char[4];
            short s3 = s2;
            cArray[0] = string.charAt(s3 >> 12 & 0xF);
            cArray[1] = string.charAt(s3 >> 8 & 0xF);
            cArray[2] = string.charAt(s3 >> 4 & 0xF);
            cArray[3] = string.charAt(s3 & 0xF);
            if (((nb$_c)object).\u00d800000()) {
                return f.super(cArray, bb.Object(Integer.numberOfLeadingZeros(s2 & 0xFFFF) - 16 >> 2, 3), 0, 2, null);
            }
            return f.super(cArray);
        }
        return o.o00000((long)s2, (nb$_c)object, string, 16);
    }

    public static /* synthetic */ String o00000(short s2, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(s2, nb2);
    }

    public static final short o00000(String string, nb nb2) {
        return o.\u00d300000(string, 0, string.length(), nb2);
    }

    public static /* synthetic */ short \u00d400000(String string, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(string, nb2);
    }

    private static final short \u00d300000(String string, int n2, int n3, nb nb2) {
        return (short)o.o00000(string, n2, n3, nb2, 4);
    }

    static /* synthetic */ short \u00d400000(String string, int n2, int n3, nb nb2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = string.length();
        }
        if ((n4 & 4) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.\u00d300000(string, n2, n3, nb2);
    }

    public static final String o00000(int n2, nb object) {
        String string = ((nb)object).\u00d200000() ? \u00d600000 : \u00d300000;
        if (((nb$_c)(object = ((nb)object).\u00d500000())).o00000()) {
            char[] cArray = new char[8];
            int n3 = n2;
            cArray[0] = string.charAt(n3 >> 28 & 0xF);
            cArray[1] = string.charAt(n3 >> 24 & 0xF);
            cArray[2] = string.charAt(n3 >> 20 & 0xF);
            cArray[3] = string.charAt(n3 >> 16 & 0xF);
            cArray[4] = string.charAt(n3 >> 12 & 0xF);
            cArray[5] = string.charAt(n3 >> 8 & 0xF);
            cArray[6] = string.charAt(n3 >> 4 & 0xF);
            cArray[7] = string.charAt(n3 & 0xF);
            if (((nb$_c)object).\u00d800000()) {
                return f.super(cArray, bb.Object(Integer.numberOfLeadingZeros(n2) >> 2, 7), 0, 2, null);
            }
            return f.super(cArray);
        }
        return o.o00000((long)n2, (nb$_c)object, string, 32);
    }

    public static /* synthetic */ String o00000(int n2, nb nb2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(n2, nb2);
    }

    public static final int \u00d300000(String string, nb nb2) {
        return o.o00000(string, 0, string.length(), nb2);
    }

    public static /* synthetic */ int \u00d500000(String string, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.\u00d300000(string, nb2);
    }

    public static final int o00000(String string, int n2, int n3, nb nb2) {
        return o.o00000(string, n2, n3, nb2, 8);
    }

    public static /* synthetic */ int \u00d500000(String string, int n2, int n3, nb nb2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = string.length();
        }
        if ((n4 & 4) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(string, n2, n3, nb2);
    }

    public static final String o00000(long l2, nb object) {
        String string = ((nb)object).\u00d200000() ? \u00d600000 : \u00d300000;
        if (((nb$_c)(object = ((nb)object).\u00d500000())).o00000()) {
            char[] cArray = new char[16];
            long l3 = l2;
            cArray[0] = string.charAt((int)(l3 >> 60 & 0xFL));
            cArray[1] = string.charAt((int)(l3 >> 56 & 0xFL));
            cArray[2] = string.charAt((int)(l3 >> 52 & 0xFL));
            cArray[3] = string.charAt((int)(l3 >> 48 & 0xFL));
            cArray[4] = string.charAt((int)(l3 >> 44 & 0xFL));
            cArray[5] = string.charAt((int)(l3 >> 40 & 0xFL));
            cArray[6] = string.charAt((int)(l3 >> 36 & 0xFL));
            cArray[7] = string.charAt((int)(l3 >> 32 & 0xFL));
            cArray[8] = string.charAt((int)(l3 >> 28 & 0xFL));
            cArray[9] = string.charAt((int)(l3 >> 24 & 0xFL));
            cArray[10] = string.charAt((int)(l3 >> 20 & 0xFL));
            cArray[11] = string.charAt((int)(l3 >> 16 & 0xFL));
            cArray[12] = string.charAt((int)(l3 >> 12 & 0xFL));
            cArray[13] = string.charAt((int)(l3 >> 8 & 0xFL));
            cArray[14] = string.charAt((int)(l3 >> 4 & 0xFL));
            cArray[15] = string.charAt((int)(l3 & 0xFL));
            if (((nb$_c)object).\u00d800000()) {
                return f.super(cArray, bb.Object(Long.numberOfLeadingZeros(l2) >> 2, 15), 0, 2, null);
            }
            return f.super(cArray);
        }
        return o.o00000(l2, (nb$_c)object, string, 64);
    }

    public static /* synthetic */ String o00000(long l2, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.o00000(l2, nb2);
    }

    public static final long new(String string, nb nb2) {
        return o.\u00d400000(string, 0, string.length(), nb2);
    }

    public static /* synthetic */ long o00000(String string, nb nb2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.new(string, nb2);
    }

    public static final long \u00d400000(String string, int n2, int n3, nb nb2) {
        return o.new(string, n2, n3, nb2, 16);
    }

    public static /* synthetic */ long o00000(String string, int n2, int n3, nb nb2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            n2 = 0;
        }
        if ((n4 & 2) != 0) {
            n3 = string.length();
        }
        if ((n4 & 4) != 0) {
            nb2 = nb.\u00d600000.\u00d200000();
        }
        return o.\u00d400000(string, n2, n3, nb2);
    }

    private static final String o00000(long l2, nb$_c nb$_c, String string, int n2) {
        if (!((n2 & 3) == 0)) {
            String string2 = "Failed requirement.";
            throw new IllegalArgumentException(string2.toString());
        }
        long l3 = l2;
        int n3 = n2 >> 2;
        int n4 = nb$_c.null();
        int n5 = bb.\u00d200000(n4 - n3, 0);
        String string3 = nb$_c.\u00f500000();
        String string4 = nb$_c.String();
        boolean bl = nb$_c.\u00d800000();
        char[] cArray = new char[o.o00000((long)string3.length() + (long)n5 + (long)n3 + (long)string4.length())];
        int n6 = o.o00000(string3, cArray, 0);
        if (n5 > 0) {
            int n7 = n6;
            z.o00000(cArray, string.charAt(0), n7, n7 + n5);
            n6 += n5;
        }
        for (n5 = 0; n5 < n3; ++n5) {
            int n8 = (int)(l3 >> (n2 -= 4) & 0xFL);
            if (bl = bl && n8 == 0 && n2 >> 2 >= n4) continue;
            int n9 = n6;
            n6 = n9 + 1;
            cArray[n9] = string.charAt(n8);
        }
        if ((n6 = o.o00000(string4, cArray, n6)) == cArray.length) {
            return f.super(cArray);
        }
        return f.super(cArray, 0, n6, 1, null);
    }

    private static final int o00000(String string, char[] cArray, int n2) {
        switch (string.length()) {
            case 0: {
                break;
            }
            case 1: {
                cArray[n2] = string.charAt(0);
                break;
            }
            default: {
                String string2 = string;
                int n3 = string2.length();
                string2.getChars(0, n3, cArray, n2);
            }
        }
        return n2 + string.length();
    }

    private static final int o00000(String string, int n2, int n3, nb object, int n4) {
        kb.return.o00000(n2, n3, string.length());
        object = ((nb)object).\u00d500000();
        if (((nb$_c)object).\u00d500000()) {
            o.o00000(string, n2, n3, n4);
            return o.new(string, n2, n3);
        }
        String string2 = ((nb$_c)object).\u00f500000();
        String string3 = ((nb$_c)object).String();
        o.o00000(string, n2, n3, string2, string3, ((nb$_c)object).\u00d300000(), n4);
        return o.new(string, n2 + string2.length(), n3 - string3.length());
    }

    private static final long new(String string, int n2, int n3, nb object, int n4) {
        kb.return.o00000(n2, n3, string.length());
        object = ((nb)object).\u00d500000();
        if (((nb$_c)object).\u00d500000()) {
            o.o00000(string, n2, n3, n4);
            return o.\u00d300000(string, n2, n3);
        }
        String string2 = ((nb$_c)object).\u00f500000();
        String string3 = ((nb$_c)object).String();
        o.o00000(string, n2, n3, string2, string3, ((nb$_c)object).\u00d300000(), n4);
        return o.\u00d300000(string, n2 + string2.length(), n3 - string3.length());
    }

    private static final void o00000(String string, int n2, int n3, String string2, String string3, boolean bl, int n4) {
        int n5;
        int n6;
        if (n3 - n2 - string2.length() <= string3.length()) {
            o.o00000(string, n2, n3, string2, string3);
        }
        String string4 = string;
        int n7 = n2;
        int n8 = n3;
        boolean bl2 = bl;
        String string5 = "prefix";
        if (((CharSequence)string2).length() == 0) {
            n6 = n7;
        } else {
            n5 = ((CharSequence)string2).length();
            for (n2 = 0; n2 < n5; ++n2) {
                if (h.o00000(string2.charAt(n2), string4.charAt(n7 + n2), bl2)) continue;
                o.new(string4, n7, n8, string2, string5);
            }
            n6 = n7 + string2.length();
        }
        n2 = n6;
        int n9 = n3 - string3.length();
        String string6 = string;
        n8 = n9;
        int n10 = n3;
        String string7 = string3;
        boolean bl3 = bl;
        String string8 = "suffix";
        if (!(((CharSequence)string7).length() == 0)) {
            int n11 = ((CharSequence)string7).length();
            for (n5 = 0; n5 < n11; ++n5) {
                if (h.o00000(string7.charAt(n5), string6.charAt(n8 + n5), bl3)) continue;
                o.new(string6, n8, n10, string7, string8);
            }
            string7.length();
        }
        o.o00000(string, n2, n9, n4);
    }

    private static final void o00000(String string, int n2, int n3, int n4) {
        int n5 = n3 - n2;
        if (n5 <= 0) {
            o.o00000(string, n2, n3, "at least", 1);
            return;
        }
        if (n5 > n4) {
            int n6 = n2;
            o.o00000(string, n6, n6 + n5 - n4);
        }
    }

    private static final void o00000(String string, int n2, int n3) {
        while (n2 < n3) {
            if (string.charAt(n2) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + n2 + ", but was '" + string.charAt(n2) + "'.\nThe result won't fit the type being parsed.");
            }
            ++n2;
        }
    }

    private static final int new(String string, int n2, int n3) {
        int n4 = 0;
        while (n2 < n3) {
            int n5;
            char c2;
            String string2 = string;
            if ((c2 = string2.charAt(n5 = n2++)) >>> 8 != 0 || o.\u00d400000[c2] < 0) {
                int n6 = n5;
                String string3 = string2;
                o.new(string3, n6);
                throw new xc();
            }
            n4 = n4 << 4 | o.\u00d400000[c2];
        }
        return n4;
    }

    public static final int o00000(String string, int n2, int n3, b.o.e.f f2) {
        int n4 = 0;
        while (n2 < n3) {
            int n5;
            char c2;
            String string2 = string;
            if ((c2 = string2.charAt(n5 = n2++)) >>> 8 != 0 || o.\u00d400000[c2] < 0) {
                int n6 = n5;
                String string3 = string2;
                f2.o00000(string3, n6);
                throw new xc();
            }
            n4 = n4 << 4 | o.\u00d400000[c2];
        }
        return n4;
    }

    private static final long \u00d300000(String string, int n2, int n3) {
        long l2 = 0L;
        while (n2 < n3) {
            int n4;
            char c2;
            String string2 = string;
            if ((c2 = string2.charAt(n4 = n2++)) >>> 8 != 0 || o.super[c2] < 0L) {
                int n5 = n4;
                String string3 = string2;
                o.new(string3, n5);
                throw new xc();
            }
            l2 = l2 << 4 | o.super[c2];
        }
        return l2;
    }

    public static final long new(String string, int n2, int n3, b.o.e.f f2) {
        long l2 = 0L;
        while (n2 < n3) {
            int n4;
            char c2;
            String string2 = string;
            if ((c2 = string2.charAt(n4 = n2++)) >>> 8 != 0 || o.super[c2] < 0L) {
                int n5 = n4;
                String string3 = string2;
                f2.o00000(string3, n5);
                throw new xc();
            }
            l2 = l2 << 4 | o.super[c2];
        }
        return l2;
    }

    private static final int o00000(String string, int n2, int n3, String string2, boolean bl, String string3) {
        if (((CharSequence)string2).length() == 0) {
            return n2;
        }
        int n4 = ((CharSequence)string2).length();
        for (int i2 = 0; i2 < n4; ++i2) {
            if (h.o00000(string2.charAt(i2), string.charAt(n2 + i2), bl)) continue;
            o.new(string, n2, n3, string2, string3);
        }
        return n2 + string2.length();
    }

    private static final int new(String string, int n2, b.o.e.f f2) {
        char c2 = string.charAt(n2);
        if (c2 >>> 8 == 0 && o.\u00d400000[c2] >= 0) {
            return o.\u00d400000[c2];
        }
        f2.o00000(string, n2);
        throw new xc();
    }

    private static final long o00000(String string, int n2, b.o.e.f f2) {
        char c2 = string.charAt(n2);
        if (c2 >>> 8 == 0 && o.super[c2] >= 0L) {
            return o.super[c2];
        }
        f2.o00000(string, n2);
        throw new xc();
    }

    private static final void o00000(String string, int n2, int n3, String string2, int n4) {
        string = string.substring(n2, n3);
        throw new NumberFormatException("Expected " + string2 + ' ' + n4 + " hexadecimal digits at index " + n2 + ", but was \"" + string + "\" of length " + (n3 - n2));
    }

    private static final void new(String string, int n2, int n3, String string2, String string3) {
        n3 = bb.Object(n2 + string2.length(), n3);
        string = string.substring(n2, n3);
        throw new NumberFormatException("Expected " + string3 + " \"" + string2 + "\" at index " + n2 + ", but was " + string);
    }

    private static final void o00000(String string, int n2, int n3, String string2, String string3) {
        string = string.substring(n2, n3);
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + string2 + "\" and suffix \"" + string3 + "\", but was " + string);
    }

    private static final Void new(String string, int n2) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + n2 + ", but was " + string.charAt(n2));
    }

    static {
        int n2;
        char c2;
        int n3;
        int n4;
        int n5 = 0;
        Object[] objectArray = new int[256];
        while (n5 < 256) {
            n4 = n5++;
            objectArray[n4] = \u00d300000.charAt(n4 >> 4) << 8 | \u00d300000.charAt(n4 & 0xF);
        }
        \u00d200000 = objectArray;
        n5 = 0;
        objectArray = new int[256];
        while (n5 < 256) {
            n4 = n5++;
            objectArray[n4] = \u00d600000.charAt(n4 >> 4) << 8 | \u00d600000.charAt(n4 & 0xF);
        }
        o.class = objectArray;
        n5 = 0;
        objectArray = new int[256];
        while (n5 < 256) {
            n4 = n5++;
            objectArray[n4] = -1;
        }
        int[] nArray = objectArray;
        CharSequence charSequence = \u00d300000;
        int n6 = 0;
        for (n3 = 0; n3 < charSequence.length(); ++n3) {
            c2 = charSequence.charAt(n3);
            objectArray[c2] = n2 = n6++;
        }
        charSequence = \u00d600000;
        n6 = 0;
        for (n3 = 0; n3 < charSequence.length(); ++n3) {
            c2 = charSequence.charAt(n3);
            objectArray[c2] = n2 = n6++;
        }
        \u00d400000 = nArray;
        int n7 = 0;
        objectArray = new long[256];
        while (n7 < 256) {
            int n8 = n7++;
            objectArray[n8] = (int)-1L;
        }
        Object[] objectArray2 = objectArray;
        CharSequence charSequence2 = \u00d300000;
        n6 = 0;
        for (n3 = 0; n3 < charSequence2.length(); ++n3) {
            c2 = charSequence2.charAt(n3);
            n2 = n6++;
            objectArray[c2] = (int)((long)n2);
        }
        charSequence2 = \u00d600000;
        n6 = 0;
        for (n3 = 0; n3 < charSequence2.length(); ++n3) {
            c2 = charSequence2.charAt(n3);
            n2 = n6++;
            objectArray[c2] = (int)((long)n2);
        }
        super = objectArray2;
    }
}

