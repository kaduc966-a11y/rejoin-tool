/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.e.g;
import b.q.f;
import b.q.h;
import b.q.ib;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class p
extends ib {
    private static final String super(byte by, int n2) {
        return Integer.toString(by, h.o00000(n2));
    }

    private static final String super(short s2, int n2) {
        return Integer.toString(s2, h.o00000(n2));
    }

    private static final String \u00d200000(int n2, int n3) {
        return Integer.toString(n2, h.o00000(n3));
    }

    private static final String super(long l2, int n2) {
        return Long.toString(l2, h.o00000(n2));
    }

    private static final boolean \u00d600000(String string) {
        return Boolean.parseBoolean(string);
    }

    private static final byte \u00d800000(String string) {
        return Byte.parseByte(string);
    }

    private static final byte \u00d300000(String string, int n2) {
        return Byte.parseByte(string, h.o00000(n2));
    }

    private static final short \u00d6O0000(String string) {
        return Short.parseShort(string);
    }

    private static final short \u00d600000(String string, int n2) {
        return Short.parseShort(string, h.o00000(n2));
    }

    private static final int \u00f4O0000(String string) {
        return Integer.parseInt(string);
    }

    private static final int super(String string, int n2) {
        return Integer.parseInt(string, h.o00000(n2));
    }

    private static final long \u00d2O0000(String string) {
        return Long.parseLong(string);
    }

    private static final long \u00d200000(String string, int n2) {
        return Long.parseLong(string, h.o00000(n2));
    }

    private static final float \u00f600000(String string) {
        return Float.parseFloat(string);
    }

    private static final double \u00d8O0000(String string) {
        return Double.parseDouble(string);
    }

    public static final Float int(String string) {
        try {
            string = p.do(string) ? Float.valueOf(Float.parseFloat(string)) : null;
        }
        catch (NumberFormatException numberFormatException) {
            string = null;
        }
        return string;
    }

    public static final Double \u00d4O0000(String string) {
        try {
            string = p.do(string) ? Double.valueOf(Double.parseDouble(string)) : null;
        }
        catch (NumberFormatException numberFormatException) {
            string = null;
        }
        return string;
    }

    private static final BigInteger \u00f400000(String string) {
        return new BigInteger(string);
    }

    private static final BigInteger \u00d400000(String string, int n2) {
        return new BigInteger(string, h.o00000(n2));
    }

    public static final BigInteger \u00d3O0000(String string) {
        return f.class(string, 10);
    }

    public static final BigInteger class(String string, int n2) {
        h.o00000(n2);
        int n3 = string.length();
        switch (n3) {
            case 0: {
                return null;
            }
            case 1: {
                if (h.o00000(string.charAt(0), n2) >= 0) break;
                return null;
            }
            default: {
                int n4;
                int n5 = n4 = string.charAt(0) == '-' ? 1 : 0;
                while (n4 < n3) {
                    if (h.o00000(string.charAt(n4), n2) < 0) {
                        return null;
                    }
                    ++n4;
                }
                break block0;
            }
        }
        return new BigInteger(string, h.o00000(n2));
    }

    private static final BigDecimal OO0000(String string) {
        return new BigDecimal(string);
    }

    private static final BigDecimal \u00d200000(String string, MathContext mathContext) {
        return new BigDecimal(string, mathContext);
    }

    public static final BigDecimal interface(String object) {
        try {
            object = p.\u00f800000((String)object) ? new BigDecimal((String)object) : null;
        }
        catch (NumberFormatException numberFormatException) {
            object = null;
        }
        return object;
    }

    public static final BigDecimal super(String object, MathContext mathContext) {
        try {
            object = p.\u00f800000((String)object) ? new BigDecimal((String)object, mathContext) : null;
        }
        catch (NumberFormatException numberFormatException) {
            object = null;
        }
        return object;
    }

    private static final Object super(String string, g g2) {
        try {
            string = p.do(string) ? g2.\u00f800000(string) : null;
        }
        catch (NumberFormatException numberFormatException) {
            string = null;
        }
        return string;
    }

    private static final Object \u00d200000(String string, g g2) {
        try {
            string = p.\u00f800000(string) ? g2.\u00f800000(string) : null;
        }
        catch (NumberFormatException numberFormatException) {
            string = null;
        }
        return string;
    }

    /*
     * Unable to fully structure code
     */
    private static final boolean do(String var0) {
        block28: {
            var2_1 = var0.length() - 1;
            var3_2 = var0;
            for (var4_4 = 0; var4_4 <= var2_1 && var3_2.charAt(var4_4) <= ' '; ++var4_4) {
            }
            var1_8 = var4_4;
            if (var1_8 > var2_1) {
                return false;
            }
            var3_2 = var0;
            for (var4_4 = var2_1; var4_4 > var1_8 && var3_2.charAt(var4_4) <= ' '; --var4_4) {
            }
            var2_1 = var4_4;
            if (var0.charAt(var1_8) == '+' || var0.charAt(var1_8) == '-') {
                ++var1_8;
            }
            if (var1_8 > var2_1) {
                return false;
            }
            var3_3 = false;
            if (var0.charAt(var1_8) == '0') {
                if (++var1_8 > var2_1) {
                    return true;
                }
                if ((var0.charAt(var1_8) | 32) == 120) {
                    var4_5 = var0;
                    var6_9 = ++var1_8;
                    var5_10 = var4_5;
                    for (var7_14 = var1_8; var7_14 <= var2_1 && (((var8_15 = var5_10.charAt(var7_14)) - 48 & 65535) < 10 != false || ((var8_15 | 32) - 97 & 65535) < 6 != false); ++var7_14) {
                    }
                    var1_8 = var7_14;
                    v0 = var5_11 = var6_9 != var1_8;
                    if (var1_8 > var2_1) {
                        v1 = -1;
                    } else {
                        var7_14 = 0;
                        if (var4_5.charAt(var1_8) == '.') {
                            var6_9 = ++var1_8;
                            var8_16 = var4_5;
                            for (var7_14 = var1_8; var7_14 <= var2_1; ++var7_14) {
                                v2 = var8_16.charAt(var7_14);
                                var1_8 = v2;
                                if (!((v2 - 48 & 65535) < 10 != false || ((var1_8 | 32) - 97 & 65535) < 6 != false)) break;
                            }
                            var7_14 = var6_9 != (var1_8 = var7_14) ? 1 : 0;
                        }
                        v1 = var1_8 = var5_11 == false && var7_14 == 0 ? -1 : var1_8;
                    }
                    if (v1 == -1 || var1_8 > var2_1) {
                        return false;
                    }
                    var3_3 = true;
                } else {
                    --var1_8;
                }
            }
            if (var3_3) break block28;
            var4_6 = var0;
            var6_9 = var1_8;
            var5_12 = var4_6;
            for (var7_14 = var1_8; var7_14 <= var2_1 && (var5_12.charAt(var7_14) - 48 & 65535) < 10; ++var7_14) {
            }
            var1_8 = var7_14;
            v3 = var5_11 = var6_9 != var1_8;
            if (var1_8 > var2_1) ** GOTO lbl-1000
            var7_14 = 0;
            if (var4_6.charAt(var1_8) == '.') {
                var6_9 = ++var1_8;
                var8_17 = var4_6;
                for (var7_14 = var1_8; var7_14 <= var2_1 && (var8_17.charAt(var7_14) - 48 & 65535) < 10; ++var7_14) {
                }
                var1_8 = var7_14;
                v4 = var7_14 = var6_9 != var1_8 ? 1 : 0;
            }
            if (!var5_11 && var7_14 == 0) {
                var7_14 = var2_1;
                v5 = (var7_14 == var1_8 + 3 - 1 ? "NaN" : (var8_18 = var7_14 == var1_8 + 8 - 1 ? "Infinity" : null)) == null ? -1 : (f.super((CharSequence)var4_6, var8_18, var1_8, false) == var1_8 ? var2_1 + 1 : -1);
            } else lbl-1000:
            // 2 sources

            {
                v5 = var1_8 = var1_8;
            }
            if (v5 == -1) {
                return false;
            }
            if (var1_8 > var2_1) {
                return true;
            }
        }
        if ((var4_7 = var0.charAt(var1_8++) | 32) != (var3_3 != false ? 112 : 101)) {
            return var3_3 == false && (var4_7 == 102 || var4_7 == 100) && var1_8 > var2_1;
        }
        if (var1_8 > var2_1) {
            return false;
        }
        if ((var0.charAt(var1_8) == '+' || var0.charAt(var1_8) == '-') && ++var1_8 > var2_1) {
            return false;
        }
        var5_13 = var0;
        while (var1_8 <= var2_1 && (var5_13.charAt(var1_8) - 48 & 65535) < 10) {
            ++var1_8;
        }
        if (var1_8 > var2_1) {
            return true;
        }
        if (var1_8 == var2_1) {
            var4_7 = var0.charAt(var1_8) | 32;
            return var4_7 == 102 || var4_7 == 100;
        }
        return false;
    }

    private static final boolean \u00f800000(String string) {
        int n2;
        if (((CharSequence)string).length() == 0) {
            return false;
        }
        int n3 = string.charAt(0) == '-' || string.charAt(0) == '+' ? 1 : 0;
        String string2 = string;
        for (n2 = n3; n2 < string2.length() && Character.isDigit(string2.charAt(n2)); ++n2) {
        }
        if (n2 == string.length()) {
            return n2 - n3 > 0;
        }
        if (string.charAt(n2) == '.') {
            if (++n2 == string.length()) {
                return n2 - n3 > 1;
            }
            string2 = string;
            while (n2 < string2.length() && Character.isDigit(string2.charAt(n2))) {
                ++n2;
            }
        }
        if (n2 == string.length()) {
            return true;
        }
        if (string.charAt(n2) != 'e' && string.charAt(n2) != 'E') {
            return false;
        }
        if (++n2 == string.length()) {
            return false;
        }
        if (string.charAt(n2) == '+' || string.charAt(n2) == '-') {
            ++n2;
        }
        if (n2 == string.length()) {
            return false;
        }
        string2 = string;
        while (n2 < string2.length() && Character.isDigit(string2.charAt(n2))) {
            ++n2;
        }
        return n2 == string.length();
    }

    private static final String super(int n2, int n3) {
        if (n3 == n2 + 3 - 1) {
            return "NaN";
        }
        if (n3 == n2 + 8 - 1) {
            return "Infinity";
        }
        return null;
    }

    private static final boolean \u00d300000(char c2) {
        return (c2 - 48 & 0xFFFF) < 10;
    }

    private static final boolean super(char c2) {
        return ((c2 | 0x20) - 97 & 0xFFFF) < 6;
    }

    private static final int \u00d200000(char c2) {
        return c2 | 0x20;
    }

    private static final int \u00d200000(String string, int n2, int n3, g g2) {
        while (n2 <= n3 && ((Boolean)g2.\u00f800000(Character.valueOf(string.charAt(n2)))).booleanValue()) {
            ++n2;
        }
        return n2;
    }

    private static final int super(String string, int n2, int n3, g g2) {
        while (n3 > n2 && ((Boolean)g2.\u00f800000(Character.valueOf(string.charAt(n3)))).booleanValue()) {
            --n3;
        }
        return n3;
    }

    private static final int super(String string, int n2, int n3, boolean bl, g g2) {
        int n4;
        boolean bl2;
        int n5;
        int n6 = n2;
        String string2 = string;
        for (n5 = n2; n5 <= n3 && ((Boolean)g2.\u00f800000(Character.valueOf(string2.charAt(n5)))).booleanValue(); ++n5) {
        }
        n2 = n5;
        boolean bl3 = bl2 = n6 != n2;
        if (n2 > n3) {
            if (bl) {
                return -1;
            }
            return n2;
        }
        n5 = 0;
        if (string.charAt(n2) == '.') {
            n6 = ++n2;
            String string3 = string;
            for (n4 = n2; n4 <= n3 && ((Boolean)g2.\u00f800000(Character.valueOf(string3.charAt(n4)))).booleanValue(); ++n4) {
            }
            n2 = n4;
            int n7 = n5 = n6 != n2 ? 1 : 0;
        }
        if (!bl2 && n5 == 0) {
            String string4;
            if (bl) {
                return -1;
            }
            n4 = n3;
            if ((n4 == n2 + 3 - 1 ? "NaN" : (string4 = n4 == n2 + 8 - 1 ? "Infinity" : null)) == null) {
                return -1;
            }
            if (f.super((CharSequence)string, string4, n2, false) == n2) {
                return n3 + 1;
            }
            return -1;
        }
        return n2;
    }
}

