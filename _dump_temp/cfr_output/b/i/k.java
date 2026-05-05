/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.q;
import b.i.s;
import b.i.s$_b;
import b.i.s$_c;
import b.i.v;
import b.o.d.fc;
import b.o.e.g;
import b.o.e.h;
import b.xc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class k {
    private static final long \u00f600000 = -3217862419201L;
    private static final long \u00d600000 = 3093527980800L;
    private static final long oO0000 = -31557014167219200L;
    private static final long void = 31556889864403199L;
    private static final int public = 146097;
    private static final int \u00f500000 = 719528;
    private static final int o00000 = 3600;
    private static final int OO0000 = 60;
    private static final int \u00d5O0000 = 24;
    private static final int \u00d400000 = 86400;
    public static final int float = 1000000000;
    private static final int \u00d500000 = 1000000;
    private static final int \u00f400000 = 1000;
    private static final int[] Object;
    private static final int[] \u00d200000;
    private static final int[] \u00d2O0000;
    private static final int[] \u00d4O0000;

    private static final boolean \u00d400000(v v2) {
        return v2.o00000(v.\u00d500000.\u00d400000()) <= 0;
    }

    public static /* synthetic */ void \u00d600000(v v2) {
    }

    private static final boolean o00000(v v2) {
        return v2.o00000(v.\u00d500000.super()) >= 0;
    }

    public static /* synthetic */ void \u00d200000(v v2) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static final s o00000(CharSequence charSequence) {
        q q2;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        CharSequence charSequence2 = charSequence;
        int n10 = 0;
        if (charSequence2.length() == 0) {
            return new s$_b("An empty string is not a valid Instant", charSequence);
        }
        int n11 = charSequence2.charAt(0);
        switch (n11) {
            case 43: 
            case 45: {
                ++n10;
                n9 = n11;
                break;
            }
            default: {
                n9 = 32;
            }
        }
        int n12 = n9;
        n11 = n10;
        int n13 = 0;
        while (n10 < charSequence2.length()) {
            n8 = charSequence2.charAt(n10);
            boolean bl = 48 <= n8 ? n8 < 58 : false;
            if (!bl) break;
            n13 = n13 * 10 + (charSequence2.charAt(n10) - 48);
            ++n10;
        }
        if ((n8 = n10 - n11) > 10) {
            return k.o00000(charSequence, "Expected at most 10 digits for the year number, got " + n8 + " digits");
        }
        if (n8 == 10 && fc.o00000((int)charSequence2.charAt(n11), 50) >= 0) {
            return k.o00000(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + n8 + " digits");
        }
        if (n8 < 4) {
            return k.o00000(charSequence, "The year number must be padded to 4 digits, got " + n8 + " digits");
        }
        if (n12 == 43 && n8 == 4) {
            return k.o00000(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (n12 == 32 && n8 != 4) {
            return k.o00000(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        int n14 = n12 = n12 == 45 ? -n13 : n13;
        if (charSequence2.length() < n10 + 16) {
            return k.o00000(charSequence, "The input string is too short");
        }
        Object object = k.o00000(charSequence, "'-'", n10, k::\u00d500000);
        if (object != null) {
            return (s)object;
        }
        object = k.o00000(charSequence, "'-'", n10 + 3, k::\u00d600000);
        if (object != null) {
            return (s)object;
        }
        object = k.o00000(charSequence, "'T' or 't'", n10 + 6, k::o00000);
        if (object != null) {
            return (s)object;
        }
        object = k.o00000(charSequence, "':'", n10 + 9, k::Object);
        if (object != null) {
            return (s)object;
        }
        object = k.o00000(charSequence, "':'", n10 + 12, k::\u00d400000);
        if (object != null) {
            return (s)object;
        }
        for (Object object2 : (Object)\u00d200000) {
            s$_b s$_b = k.o00000(charSequence, "an ASCII digit", n10 + object2, k::\u00d200000);
            if (s$_b == null) continue;
            return s$_b;
        }
        int n15 = k.Object(charSequence2, n10 + 1);
        n13 = k.Object(charSequence2, n10 + 4);
        n8 = k.Object(charSequence2, n10 + 7);
        int n16 = k.Object(charSequence2, n10 + 10);
        int n17 = k.Object(charSequence2, n10 + 13);
        if (charSequence2.charAt(n10 + 15) == '.') {
            n7 = 0;
            for (n10 = n6 = n10 + 16; n10 < charSequence2.length(); ++n10) {
                n5 = charSequence2.charAt(n10);
                boolean bl = 48 <= n5 ? n5 < 58 : false;
                if (!bl) break;
                n7 = n7 * 10 + (charSequence2.charAt(n10) - 48);
            }
            boolean bl = (n5 = n10 - n6) > 0 ? n5 < 10 : false;
            if (!bl) return k.o00000(charSequence, "1..9 digits are supported for the fraction of the second, got " + n5 + " digits");
            n4 = n7 * Object[9 - n5];
        } else {
            n10 += 15;
            n4 = n3 = 0;
        }
        if (n10 >= charSequence2.length()) {
            return k.o00000(charSequence, "The UTC offset at the end of the string is missing");
        }
        n7 = charSequence2.charAt(n10);
        switch (n7) {
            case 90: 
            case 122: {
                if (charSequence2.length() != n10 + 1) return k.o00000(charSequence, "Extra text after the instant at position " + (n10 + 1));
                n2 = 0;
                break;
            }
            case 43: 
            case 45: {
                int n18;
                int n19;
                n5 = charSequence2.length() - n10;
                if (n5 > 9) {
                    CharSequence charSequence3 = charSequence2;
                    int n20 = charSequence3.length();
                    return k.o00000(charSequence, "The UTC offset string \"" + k.o00000((CharSequence)((Object)charSequence3.subSequence(n10, n20)).toString(), 16) + "\" is too long");
                }
                if (n5 % 3 != 0) {
                    CharSequence charSequence4 = charSequence2;
                    int n21 = charSequence4.length();
                    return k.o00000(charSequence, "Invalid UTC offset string \"" + ((Object)charSequence4.subSequence(n10, n21)).toString() + '\"');
                }
                for (int n22 : \u00d2O0000) {
                    if (n10 + n22 >= charSequence2.length()) break;
                    if (charSequence2.charAt(n10 + n22) == ':') continue;
                    return k.o00000(charSequence, "Expected ':' at index " + (n10 + n22) + ", got '" + charSequence2.charAt(n10 + n22) + '\'');
                }
                for (int n22 : \u00d4O0000) {
                    if (n10 + n22 >= charSequence2.length()) break;
                    n19 = charSequence2.charAt(n10 + n22);
                    if (48 <= n19 ? n19 < 58 : false) continue;
                    return k.o00000(charSequence, "Expected an ASCII digit at index " + (n10 + n22) + ", got '" + charSequence2.charAt(n10 + n22) + '\'');
                }
                n6 = k.Object(charSequence2, n10 + 1);
                int n23 = n5 > 3 ? k.Object(charSequence2, n10 + 4) : 0;
                int n24 = n18 = n5 > 6 ? k.Object(charSequence2, n10 + 7) : 0;
                if (n23 > 59) {
                    return k.o00000(charSequence, "Expected offset-minute-of-hour in 0..59, got ".concat(String.valueOf(n23)));
                }
                if (n18 > 59) {
                    return k.o00000(charSequence, "Expected offset-second-of-minute in 0..59, got ".concat(String.valueOf(n18)));
                }
                if (n6 > 17 && (n6 != 18 || n23 != 0 || n18 != 0)) {
                    CharSequence charSequence5 = charSequence2;
                    n19 = charSequence5.length();
                    return k.o00000(charSequence, "Expected an offset in -18:00..+18:00, got " + ((Object)charSequence5.subSequence(n10, n19)).toString());
                }
                n2 = (n6 * 3600 + n23 * 60 + n18) * (n7 == 45 ? -1 : 1);
                break;
            }
            default: {
                return k.o00000(charSequence, "Expected the UTC offset at position " + n10 + ", got '" + (char)n7 + '\'');
            }
        }
        n6 = n2;
        if (!(n15 > 0 ? n15 < 13 : false)) {
            return k.o00000(charSequence, "Expected a month number in 1..12, got ".concat(String.valueOf(n15)));
        }
        if (!(n13 > 0 ? n13 <= k.o00000(n15, k.o00000(n12)) : false)) {
            return k.o00000(charSequence, "Expected a valid day-of-month for month " + n15 + " of year " + n12 + ", got " + n13);
        }
        if (n8 > 23) {
            return k.o00000(charSequence, "Expected hour in 0..23, got ".concat(String.valueOf(n8)));
        }
        if (n16 > 59) {
            return k.o00000(charSequence, "Expected minute-of-hour in 0..59, got ".concat(String.valueOf(n16)));
        }
        if (n17 > 59) {
            return k.o00000(charSequence, "Expected second-of-minute in 0..59, got ".concat(String.valueOf(n17)));
        }
        q q3 = new q(n12, n15, n13, n8, n16, n17, n3);
        n5 = n6;
        q q4 = q2 = q3;
        long l2 = q2.\u00d200000();
        long l3 = 365L * l2;
        l3 = l2 >= 0L ? (l3 += (l2 + 3L) / 4L - (l2 + 99L) / 100L + (l2 + 399L) / 400L) : (l3 -= l2 / -4L - l2 / -100L + l2 / -400L);
        l3 = l3 + (long)((367 * q4.\u00d600000() - 362) / 12) + (long)(q4.\u00d500000() - 1);
        if (q4.\u00d600000() > 2) {
            l3 += -1L;
            if (!k.o00000(q4.\u00d200000())) {
                l3 += -1L;
            }
        }
        long l4 = l3 - 719528L;
        int n25 = q2.\u00d300000() * 3600 + q2.o00000() * 60 + q2.String();
        long l5 = l4 * 86400L + (long)n25 - (long)n5;
        n25 = q3.\u00d800000();
        long l6 = l5;
        return new s$_c(l6, n25);
    }

    private static final String Object(v object) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        int n2 = ((q)(object = q.\u00f400000.o00000((v)object))).\u00d200000();
        if (Math.abs(n2) < 1000) {
            StringBuilder stringBuilder3 = new StringBuilder();
            if (n2 >= 0) {
                stringBuilder3.append(n2 + 10000).deleteCharAt(0);
            } else {
                stringBuilder3.append(n2 - 10000).deleteCharAt(1);
            }
            stringBuilder2.append((CharSequence)stringBuilder3);
        } else {
            if (n2 >= 10000) {
                stringBuilder2.append('+');
            }
            stringBuilder2.append(n2);
        }
        stringBuilder2.append('-');
        k.o00000(stringBuilder2, stringBuilder2, ((q)object).\u00d600000());
        stringBuilder2.append('-');
        k.o00000(stringBuilder2, stringBuilder2, ((q)object).\u00d500000());
        stringBuilder2.append('T');
        k.o00000(stringBuilder2, stringBuilder2, ((q)object).\u00d300000());
        stringBuilder2.append(':');
        k.o00000(stringBuilder2, stringBuilder2, ((q)object).o00000());
        stringBuilder2.append(':');
        k.o00000(stringBuilder2, stringBuilder2, ((q)object).String());
        if (((q)object).\u00d800000() != 0) {
            stringBuilder2.append('.');
            int n3 = 0;
            while (((q)object).\u00d800000() % Object[n3 + 1] == 0) {
                ++n3;
            }
            int n4 = n3;
            n3 = n4 - n4 % 3;
            int n5 = ((q)object).\u00d800000() / Object[n3];
            stringBuilder2.append(String.valueOf(n5 + Object[9 - n3]).substring(1));
        }
        stringBuilder2.append('Z');
        return stringBuilder.toString();
    }

    private static final long \u00d200000(long l2, long l3, h h2) {
        long l4 = l2 + l3;
        if ((l2 ^ l4) < 0L && (l2 ^ l3) >= 0L) {
            h2.newreturn();
            throw new xc();
        }
        return l4;
    }

    private static final long o00000(long l2, long l3, h h2) {
        if (l3 == 1L) {
            return l2;
        }
        if (l2 == 1L) {
            return l3;
        }
        if (l2 == 0L || l3 == 0L) {
            return 0L;
        }
        long l4 = l2 * l3;
        if (l4 / l3 != l2 || l2 == Long.MIN_VALUE && l3 == -1L || l3 == Long.MIN_VALUE && l2 == -1L) {
            h2.newreturn();
            throw new xc();
        }
        return l4;
    }

    public static final boolean o00000(int n2) {
        return (n2 & 3) == 0 && (n2 % 100 != 0 || n2 % 400 == 0);
    }

    private static final int o00000(int n2, boolean bl) {
        switch (n2) {
            case 2: {
                if (bl) {
                    return 29;
                }
                return 28;
            }
            case 4: 
            case 6: 
            case 9: 
            case 11: {
                return 30;
            }
        }
        return 31;
    }

    private static final String o00000(CharSequence charSequence, int n2) {
        if (charSequence.length() <= n2) {
            return ((Object)charSequence).toString();
        }
        return ((Object)charSequence.subSequence(0, n2)).toString() + "...";
    }

    private static final s$_b o00000(CharSequence charSequence, String string) {
        return new s$_b(string + " when parsing an Instant from \"" + k.o00000(charSequence, 64) + '\"', charSequence);
    }

    private static final s$_b o00000(CharSequence charSequence, String string, int n2, g g2) {
        char c2 = charSequence.charAt(n2);
        if (((Boolean)g2.\u00f800000(Character.valueOf(c2))).booleanValue()) {
            return null;
        }
        return k.o00000(charSequence, "Expected " + string + ", but got '" + c2 + "' at position " + n2);
    }

    private static final boolean \u00d500000(char c2) {
        return c2 == '-';
    }

    private static final boolean \u00d600000(char c2) {
        return c2 == '-';
    }

    private static final boolean o00000(char c2) {
        return c2 == 'T' || c2 == 't';
    }

    private static final boolean Object(char c2) {
        return c2 == ':';
    }

    private static final boolean \u00d400000(char c2) {
        return c2 == ':';
    }

    private static final boolean \u00d200000(char c2) {
        if ('0' <= c2) {
            return c2 < ':';
        }
        return false;
    }

    private static final int Object(CharSequence charSequence, int n2) {
        return (charSequence.charAt(n2) - 48) * 10 + (charSequence.charAt(n2 + 1) - 48);
    }

    private static final void o00000(Appendable appendable, StringBuilder stringBuilder, int n2) {
        if (n2 < 10) {
            appendable.append('0');
        }
        stringBuilder.append(n2);
    }

    public static final /* synthetic */ String \u00d500000(v v2) {
        return k.Object(v2);
    }

    public static final /* synthetic */ s \u00d200000(CharSequence charSequence) {
        return k.o00000(charSequence);
    }

    public static final /* synthetic */ String \u00d200000(CharSequence charSequence, int n2) {
        return k.o00000(charSequence, n2);
    }

    static {
        int[] nArray = new int[10];
        int[] nArray2 = nArray;
        nArray[0] = 1;
        nArray2[1] = 10;
        nArray2[2] = 100;
        nArray2[3] = 1000;
        nArray2[4] = 10000;
        nArray2[5] = 100000;
        nArray2[6] = 1000000;
        nArray2[7] = 10000000;
        nArray2[8] = 100000000;
        nArray2[9] = 1000000000;
        Object = nArray2;
        int[] nArray3 = new int[10];
        nArray2 = nArray3;
        nArray3[0] = 1;
        nArray2[1] = 2;
        nArray2[2] = 4;
        nArray2[3] = 5;
        nArray2[4] = 7;
        nArray2[5] = 8;
        nArray2[6] = 10;
        nArray2[7] = 11;
        nArray2[8] = 13;
        nArray2[9] = 14;
        \u00d200000 = nArray2;
        int[] nArray4 = new int[2];
        nArray2 = nArray4;
        nArray4[0] = 3;
        nArray2[1] = 6;
        \u00d2O0000 = nArray2;
        int[] nArray5 = new int[6];
        nArray2 = nArray5;
        nArray5[0] = 1;
        nArray2[1] = 2;
        nArray2[2] = 4;
        nArray2[3] = 5;
        nArray2[4] = 7;
        nArray2[5] = 8;
        \u00d4O0000 = nArray2;
    }
}

