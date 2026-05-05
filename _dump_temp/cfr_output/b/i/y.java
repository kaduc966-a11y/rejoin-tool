/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.e.bb;
import b.f.e;
import b.i.ab;
import b.i.b;
import b.i.m;
import b.i.p;
import b.i.y$_b;
import b.o.e.h;
import b.q.f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class y {
    public static final int \u00f400000 = 1000000;
    public static final long \u00d400000 = 1000L;
    public static final long o00000 = 1000L;
    public static final long \u00f500000 = 4611686018426999999L;
    public static final long \u00d500000 = 0x3FFFFFFFFFFFFFFFL;
    private static final long float = 4611686018426L;
    public static final long OO0000 = 1000L;
    public static final long \u00d200000 = 60000L;
    public static final long void = 3600000L;
    public static final long \u00d600000 = 86400000L;
    private static final String \u00f600000 = "Infinity";
    private static final int Object = 15;

    public static final long o00000(int n2, m m2) {
        if (m2.compareTo((Enum)m.\u00d600000) <= 0) {
            return y.\u00d3O0000(p.super(n2, m2, m.\u00d300000));
        }
        return y.new((long)n2, m2);
    }

    public static final long new(long l2, m m2) {
        long l3 = p.super(4611686018426999999L, m.\u00d300000, m2);
        boolean bl = -l3 <= l2 ? l2 <= l3 : false;
        if (bl) {
            return y.\u00d3O0000(p.super(l2, m2, m.\u00d300000));
        }
        if (m2.compareTo((Enum)m.\u00f400000) >= 0) {
            return y.\u00f400000((long)e.new(l2) * p.super(Math.abs(bb.o00000(l2, -9223372036854775807L)), m2));
        }
        return y.\u00f400000(bb.o00000(p.\u00d200000(l2, m2, m.\u00f400000), -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }

    public static final long o00000(double d2, m m2) {
        double d3 = p.super(d2, m2, m.\u00d300000);
        if (!(!Double.isNaN(d3))) {
            String string = "Duration value cannot be NaN.";
            throw new IllegalArgumentException(string.toString());
        }
        long l2 = e.\u00f5O0000(d3);
        boolean bl = -4611686018426999999L <= l2 ? l2 < 4611686018427000000L : false;
        if (bl) {
            return y.\u00d3O0000(l2);
        }
        return y.oO0000(e.\u00f5O0000(p.super(d2, m2, m.\u00f400000)));
    }

    private static final long o00000(int n2, long l2) {
        return b.\u00d200000(l2, n2);
    }

    private static final long o00000(double d2, long l2) {
        return b.o00000(l2, d2);
    }

    private static final long o00000(String string, boolean bl, boolean bl2) {
        long l2;
        long l3;
        boolean bl3;
        if (((CharSequence)string).length() == 0) {
            String string2 = "The string is empty";
            if (bl2) {
                throw new IllegalArgumentException(string2);
            }
            return b.void.\u00d300000();
        }
        int n2 = 0;
        char bl32 = string.charAt(0);
        boolean bl4 = false;
        switch (bl32) {
            case '-': {
                bl4 = true;
            }
            case '+': {
                ++n2;
            }
        }
        boolean bl5 = bl3 = n2 > 0;
        if (string.length() <= n2) {
            String string3 = "No components";
            if (bl2) {
                throw new IllegalArgumentException(string3);
            }
            return b.void.\u00d300000();
        }
        if (string.charAt(n2) == 'P') {
            l3 = y.o00000(string, n2 + 1, bl2);
        } else {
            if (bl) {
                String string4 = "";
                if (bl2) {
                    throw new IllegalArgumentException(string4);
                }
                return b.void.\u00d300000();
            }
            l3 = l2 = f.super(string, n2, \u00f600000, 0, Math.max(string.length() - n2, 8), true) ? b.void.\u00d600000() : y.o00000(string, n2, bl3, bl2);
        }
        if (bl4 && !b.\u00d300000(l2, b.void.\u00d300000())) {
            return b.\u00f600000(l2);
        }
        return l2;
    }

    static /* synthetic */ long o00000(String string, boolean bl, boolean bl2, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl2 = true;
        }
        return y.o00000(string, bl, bl2);
    }

    private static final long o00000(String string, int n2, boolean bl) {
        if (n2 == string.length()) {
            String string2 = "";
            if (bl) {
                throw new IllegalArgumentException(string2);
            }
            return b.void.\u00d300000();
        }
        long l2 = 0L;
        long l3 = 0L;
        boolean bl2 = false;
        Object object = null;
        while (n2 < string.length()) {
            long l4;
            int n3;
            int n4;
            Object object2;
            int n5;
            int n6;
            block48: {
                long l5;
                long l6;
                block53: {
                    block52: {
                        int n7;
                        n6 = string.charAt(n2);
                        if (n6 == 84) {
                            if (bl2 || ++n2 == string.length()) {
                                String string3 = "";
                                if (bl) {
                                    throw new IllegalArgumentException(string3);
                                }
                                return b.void.\u00d300000();
                            }
                            bl2 = true;
                            continue;
                        }
                        n5 = n2;
                        object2 = ab.\u00d800000.\u00d200000();
                        String string4 = string;
                        int n8 = n2;
                        n4 = 1;
                        n2 = n8;
                        if (ab.Object((ab)object2)) {
                            switch (string4.charAt(n2)) {
                                case '-': {
                                    n4 = -1;
                                }
                                case '+': 
                            }
                        }
                        String string5 = string4;
                        for (n3 = ++n2; n3 < string5.length() && string5.charAt(n3) == '0'; ++n3) {
                        }
                        l6 = 0L;
                        for (n2 = n3; n2 < string4.length(); ++n2) {
                            block49: {
                                block51: {
                                    block50: {
                                        int n9;
                                        int n10;
                                        n8 = string4.charAt(n2);
                                        boolean bl3 = 48 <= n8 ? n8 < 58 : false;
                                        if (!bl3) break;
                                        n3 = n8 - 48;
                                        if (l6 <= ab.\u00d200000((ab)object2) && (l6 != ab.\u00d200000((ab)object2) || (long)n3 <= ab.\u00d400000((ab)object2))) break block49;
                                        String string6 = string4;
                                        for (n10 = n2; n10 < string6.length(); ++n10) {
                                            char c2 = string6.charAt(n10);
                                            boolean bl4 = '0' <= c2 ? c2 < ':' : false;
                                            if (!bl4) break;
                                        }
                                        if ((n2 = n10) == string.length()) break block50;
                                        switch (n6) {
                                            case 43: 
                                            case 45: {
                                                n9 = 1;
                                                break;
                                            }
                                            default: {
                                                n9 = 0;
                                            }
                                        }
                                        if (n2 != n5 + n9) break block51;
                                    }
                                    String string7 = "";
                                    if (bl) {
                                        throw new IllegalArgumentException(string7);
                                    }
                                    return b.void.\u00d300000();
                                }
                                n6 = n4;
                                l5 = ab.o00000((ab)object2);
                                break block48;
                            }
                            long l7 = l6;
                            l6 = (l7 << 3) + (l7 << 1) + (long)n3;
                        }
                        if (n2 == string.length()) break block52;
                        switch (n6) {
                            case 43: 
                            case 45: {
                                n7 = 1;
                                break;
                            }
                            default: {
                                n7 = 0;
                            }
                        }
                        if (n2 != n5 + n7) break block53;
                    }
                    String string8 = "";
                    if (bl) {
                        throw new IllegalArgumentException(string8);
                    }
                    return b.void.\u00d300000();
                }
                n6 = n4;
                l5 = l4 = l6;
            }
            if (string.charAt(n2) == '.') {
                int n11;
                int n12;
                int n13;
                object2 = string;
                int n14 = ++n2;
                Object object3 = object2;
                int n15 = Math.min(n3 + 6, ((String)object3).length());
                int n16 = 0;
                for (n13 = n3 = n14; n13 < n15; ++n13) {
                    char c3 = ((String)object3).charAt(n13);
                    boolean bl5 = '0' <= c3 ? c3 < ':' : false;
                    if (!bl5) break;
                    n14 = n16;
                    n16 = (n14 << 3) + (n14 << 1) + (c3 - 48);
                }
                int n17 = 6 - (n13 - n3);
                for (n14 = 0; n14 < n17; ++n14) {
                    n4 = n16;
                    n16 = (n4 << 3) + (n4 << 1);
                }
                n14 = n13;
                n5 = n16;
                Object object4 = object2;
                n16 = Math.min(n12 + 9, ((String)object4).length());
                n17 = 0;
                for (n15 = n12 = n14; n15 < n16; ++n15) {
                    n14 = ((String)object4).charAt(n15);
                    boolean bl6 = 48 <= n14 ? n14 < 58 : false;
                    if (!bl6) break;
                    n11 = n17;
                    n17 = (n11 << 3) + (n11 << 1) + (n14 - 48);
                }
                n14 = 9 - (n15 - n12);
                for (n11 = 0; n11 < n14; ++n11) {
                    n17 = (n17 << 3) + (n17 << 1);
                }
                n12 = n17;
                object3 = object2;
                for (n14 = n15; n14 < ((String)object3).length(); ++n14) {
                    n13 = ((String)object3).charAt(n14);
                    boolean bl7 = 48 <= n13 ? n13 < 58 : false;
                    if (!bl7) break;
                }
                if ((n16 = n14) == n2 || n16 == string.length() || string.charAt(n16) != 'S') {
                    string = "";
                    if (bl) {
                        throw new IllegalArgumentException(string);
                    }
                    return b.void.\u00d300000();
                }
                n2 = n16;
                long l8 = (long)n5 * 1000000000L + (long)n12;
                l3 = (long)n6 * y.o00000(l8, m.\u00d600000);
            }
            m m2 = y.o00000(string, n2);
            if (m2 == null) {
                String string9 = "Unknown duration unit short name: " + string.charAt(n2);
                if (bl) {
                    throw new IllegalArgumentException(string9);
                }
                return b.void.\u00d300000();
            }
            object2 = m2;
            if (object != null && ((Enum)object).compareTo((Enum)object2) <= 0) {
                String string10 = "Unexpected order of duration components";
                if (bl) {
                    throw new IllegalArgumentException(string10);
                }
                return b.void.\u00d300000();
            }
            object = object2;
            if (object2 == m.\u00f600000) {
                if (bl2) {
                    String string11 = "";
                    if (bl) {
                        throw new IllegalArgumentException(string11);
                    }
                    return b.void.\u00d300000();
                }
                l2 = (long)n6 * p.super(l4, (m)((Object)object2));
            } else {
                if (!bl2) {
                    String string12 = "";
                    if (bl) {
                        throw new IllegalArgumentException(string12);
                    }
                    return b.void.\u00d300000();
                }
                long l9 = y.new(l2, (long)n6 * p.super(l4, (m)((Object)object2)));
                if (l9 == 9223372036854759646L) {
                    String string13 = "";
                    if (bl) {
                        throw new IllegalArgumentException(string13);
                    }
                    return b.void.\u00d300000();
                }
                l2 = l9;
            }
            ++n2;
        }
        return b.\u00d200000(y.new(l2, m.\u00f400000), y.new(l3, m.\u00d300000));
    }

    private static final long o00000(String string, int n2, boolean bl, boolean bl2) {
        boolean bl3;
        int n3 = string.length();
        boolean bl4 = bl3 = !bl;
        if (bl && string.charAt(n2) == '(' && string.charAt(n3 - 1) == ')') {
            bl3 = true;
            if (++n2 == (n3 += -1)) {
                String string2 = "No components";
                if (bl2) {
                    throw new IllegalArgumentException(string2);
                }
                return b.void.\u00d300000();
            }
        }
        long l2 = 0L;
        long l3 = 0L;
        String string3 = null;
        boolean bl5 = true;
        while (n2 < n3) {
            long l4;
            int n4;
            int n5;
            String string4;
            int n6;
            int n7;
            String string5;
            if (!bl5 && bl3) {
                string5 = string;
                for (n7 = n2; n7 < string5.length() && string5.charAt(n7) == ' '; ++n7) {
                }
                n2 = n7;
            }
            bl5 = false;
            int n8 = n2;
            ab ab2 = ab.\u00d800000.o00000();
            String string6 = string;
            int n9 = n2;
            if (ab.Object(ab2)) {
                switch (string6.charAt(n9)) {
                    case '-': {
                        break;
                    }
                    case '+': {
                        ++n9;
                    }
                }
            }
            String string7 = string6;
            for (n6 = ++n9; n6 < string7.length() && string7.charAt(n6) == '0'; ++n6) {
            }
            long l5 = 0L;
            for (n9 = n6; n9 < string6.length(); ++n9) {
                char c2 = string6.charAt(n9);
                boolean bl6 = '0' <= c2 ? c2 < ':' : false;
                if (!bl6) break;
                n6 = c2 - 48;
                if (l5 > ab.\u00d200000(ab2) || l5 == ab.\u00d200000(ab2) && (long)n6 > ab.\u00d400000(ab2)) {
                    string4 = string6;
                    for (n6 = n9; n6 < string4.length(); ++n6) {
                        n5 = string4.charAt(n6);
                        boolean bl7 = 48 <= n5 ? n5 < 58 : false;
                        if (!bl7) break;
                    }
                    String string8 = "";
                    if (bl2) {
                        throw new IllegalArgumentException(string8);
                    }
                    return b.void.\u00d300000();
                }
                long l6 = l5;
                l5 = (l6 << 3) + (l6 << 1) + (long)n6;
            }
            if ((n2 = n9) == n8 || n2 == n3) {
                String string9 = "";
                if (bl2) {
                    throw new IllegalArgumentException(string9);
                }
                return b.void.\u00d300000();
            }
            long l7 = l5;
            n7 = string.charAt(n2) == '.' ? 1 : 0;
            if (n7 != 0) {
                int n10;
                int n11;
                int n12;
                int n13;
                n4 = n2++;
                String string10 = string;
                int n14 = n2;
                string4 = string10;
                n6 = Math.min(n8 + 6, string4.length());
                n5 = 0;
                for (n14 = n8 = n14; n14 < n6; ++n14) {
                    n13 = string4.charAt(n14);
                    boolean bl8 = 48 <= n13 ? n13 < 58 : false;
                    if (!bl8) break;
                    int n15 = n5;
                    n12 = n15;
                    n5 = (n15 << 3) + (n12 << 1) + (n13 - 48);
                }
                n13 = 6 - (n14 - n8);
                for (n12 = 0; n12 < n13; ++n12) {
                    int n16 = n5;
                    n8 = n16;
                    n5 = (n16 << 3) + (n8 << 1);
                }
                int n17 = n5;
                String string11 = string10;
                n5 = Math.min(n11 + 9, string11.length());
                n13 = 0;
                for (n6 = n11 = n14; n6 < n5; ++n6) {
                    n12 = string11.charAt(n6);
                    boolean bl9 = 48 <= n12 ? n12 < 58 : false;
                    if (!bl9) break;
                    n14 = n13;
                    n13 = (n14 << 3) + (n14 << 1) + (n12 - 48);
                }
                n12 = 9 - (n6 - n11);
                for (n14 = 0; n14 < n12; ++n14) {
                    int n18 = n13;
                    n13 = (n18 << 3) + (n18 << 1);
                }
                n14 = n6;
                n6 = n13;
                string4 = string10;
                for (n10 = n14; n10 < string4.length(); ++n10) {
                    n14 = string4.charAt(n10);
                    boolean bl10 = 48 <= n14 ? n14 < 58 : false;
                    if (!bl10) break;
                }
                if ((n8 = n10) == n2 || n8 == n3) {
                    string = "";
                    if (bl2) {
                        throw new IllegalArgumentException(string);
                    }
                    return b.void.\u00d300000();
                }
                n2 = n8;
                l4 = (long)n17 * 1000000000L + (long)n6;
            } else {
                n4 = -1;
                l4 = 0L;
            }
            if (y.new(string, n2) == null) {
                String string12 = "Unknown duration unit short name: " + string.charAt(n2);
                if (bl2) {
                    throw new IllegalArgumentException(string12);
                }
                return b.void.\u00d300000();
            }
            if (string3 != null && ((Enum)((Object)string3)).compareTo((Enum)((Object)string5)) <= 0) {
                String string13 = "Unexpected order of duration components";
                if (bl2) {
                    throw new IllegalArgumentException(string13);
                }
                return b.void.\u00d300000();
            }
            string3 = string5;
            switch (y$_b.o00000[((Enum)((Object)string5)).ordinal()]) {
                case 1: {
                    if ((l2 += l7 / 1000L) > 4611686018426L) break;
                    l3 = l7 % 1000L * 1000L;
                    break;
                }
                case 2: {
                    l2 += l7 / 1000000L;
                    l3 += l7 % 1000000L;
                    break;
                }
                default: {
                    l2 = y.new(l2, p.super(l7, (m)((Object)string5)));
                }
            }
            n2 += y.o00000((m)((Object)string5));
            if (n7 == 0) continue;
            if (n2 < n3) {
                String string14 = "Fractional component must be last";
                if (bl2) {
                    throw new IllegalArgumentException(string14);
                }
                return b.void.\u00d300000();
            }
            l3 += ((Enum)((Object)string5)).compareTo((Enum)m.int) >= 0 && n2 - n4 > 15 ? y.o00000(string, n4, n2 - y.o00000((m)((Object)string5)), (m)((Object)string5)) : y.o00000(l4, (m)((Object)string5));
        }
        return b.\u00d200000(y.new(l2, m.\u00f400000), y.new(l3, m.\u00d300000));
    }

    private static final long new(long l2, long l3) {
        long l4 = l2;
        if (l4 == 0x3FFFFFFFFFFFFFFFL || l4 == -4611686018427387903L) {
            l4 = l3;
            if (-4611686018427387903L < l4 && l4 < 0x3FFFFFFFFFFFFFFFL || (l2 ^ l3) >= 0L) {
                return l2;
            }
            return 9223372036854759646L;
        }
        l4 = l3;
        if (l4 == 0x3FFFFFFFFFFFFFFFL || l4 == -4611686018427387903L) {
            return l3;
        }
        return bb.o00000(l2 + l3, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL);
    }

    private static final boolean \u00f800000(long l2) {
        return l2 == 0x3FFFFFFFFFFFFFFFL || l2 == -4611686018427387903L;
    }

    private static final boolean return(long l2) {
        return -4611686018427387903L < l2 && l2 < 0x3FFFFFFFFFFFFFFFL;
    }

    private static final boolean \u00d300000(long l2, long l3) {
        return (l2 ^ l3) >= 0L;
    }

    private static final long o00000(String string, int n2, int n3, m m2) {
        return e.\u00f5O0000(Double.parseDouble(string.substring(n2, n3)) * (double)y.\u00d300000(m2));
    }

    private static final long o00000(long l2, m m2) {
        return e.\u00f5O0000((double)l2 * y.new(m2));
    }

    private static final long o00000(boolean bl, String string) {
        if (bl) {
            throw new IllegalArgumentException(string);
        }
        return b.void.\u00d300000();
    }

    static /* synthetic */ long o00000(boolean bl, String string, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string = "";
        }
        if (bl) {
            throw new IllegalArgumentException(string);
        }
        return b.void.\u00d300000();
    }

    private static final b o00000(long l2, h h2) {
        if (b.\u00d300000(l2, b.void.\u00d300000())) {
            return (b)h2.newreturn();
        }
        return b.for(l2);
    }

    private static final m new(String string, int n2) {
        char c2 = string.charAt(n2);
        char c3 = n2 < f.\u00d400000((CharSequence)string) ? string.charAt(n2 + 1) : (char)'\u0000';
        switch (c2) {
            case 'd': {
                return m.\u00f600000;
            }
            case 'h': {
                return m.\u00d800000;
            }
            case 's': {
                return m.\u00d600000;
            }
            case 'm': {
                if (c3 == 's') {
                    return m.\u00f400000;
                }
                return m.int;
            }
            case 'u': {
                if (c3 == 's') {
                    return m.\u00d200000;
                }
                return null;
            }
            case 'n': {
                if (c3 == 's') {
                    return m.\u00d300000;
                }
                return null;
            }
        }
        return null;
    }

    private static final m o00000(String string, int n2) {
        switch (string.charAt(n2)) {
            case 'D': {
                return m.\u00f600000;
            }
            case 'H': {
                return m.\u00d800000;
            }
            case 'M': {
                return m.int;
            }
            case 'S': {
                return m.\u00d600000;
            }
        }
        return null;
    }

    private static final double new(m m2) {
        switch (y$_b.o00000[m2.ordinal()]) {
            case 2: {
                return 1.0E-15;
            }
            case 1: {
                return 1.0E-12;
            }
            case 3: {
                return 1.0E-9;
            }
            case 4: {
                return 1.0E-6;
            }
            case 5: {
                return 6.0E-5;
            }
            case 6: {
                return 0.0036;
            }
            case 7: {
                return 0.0864;
            }
        }
        throw new IllegalStateException("Unknown unit: ".concat(String.valueOf((Object)m2)).toString());
    }

    private static /* synthetic */ void \u00d400000(m m2) {
    }

    private static final long \u00d300000(m m2) {
        switch (y$_b.o00000[m2.ordinal()]) {
            case 5: {
                return 60000000000L;
            }
            case 6: {
                return 3600000000000L;
            }
            case 7: {
                return 86400000000000L;
            }
        }
        throw new IllegalStateException(("Invalid unit: " + (Object)((Object)m2) + " for fallback fraction multiplier").toString());
    }

    private static final int o00000(m m2) {
        switch (y$_b.o00000[m2.ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                return 2;
            }
        }
        return 1;
    }

    private static final long \u00d500000(long l2) {
        return (l2 << 3) + (l2 << 1);
    }

    private static final int o00000(int n2) {
        return (n2 << 3) + (n2 << 1);
    }

    private static final long \u00d800000(long l2) {
        return l2 / 1000000L;
    }

    private static final long \u00f500000(long l2) {
        return l2 * 1000000L;
    }

    private static final long \u00d3O0000(long l2) {
        return b.void.\u00d3O0000(l2 << 1);
    }

    private static final long \u00f400000(long l2) {
        return b.void.\u00d3O0000((l2 << 1) + 1L);
    }

    private static final long new(long l2, int n2) {
        return b.void.\u00d3O0000((l2 << 1) + (long)n2);
    }

    private static final long \u00d300000(long l2) {
        boolean bl = -4611686018426999999L <= l2 ? l2 < 4611686018427000000L : false;
        if (bl) {
            return y.\u00d3O0000(l2);
        }
        return y.\u00f400000(y.\u00d800000(l2));
    }

    private static final long oO0000(long l2) {
        boolean bl = -4611686018426L <= l2 ? l2 < 4611686018427L : false;
        if (bl) {
            return y.\u00d3O0000(y.\u00f500000(l2));
        }
        return y.\u00f400000(bb.o00000(l2, -4611686018427387903L, 0x3FFFFFFFFFFFFFFFL));
    }

    public static final /* synthetic */ long new(String string, boolean bl, boolean bl2) {
        return y.o00000(string, bl, bl2);
    }

    public static final /* synthetic */ long o00000(long l2, int n2) {
        return y.new(l2, n2);
    }

    public static final /* synthetic */ long o00000(long l2) {
        return y.\u00d300000(l2);
    }

    public static final /* synthetic */ long o00000(long l2, long l3) {
        return y.new(l2, l3);
    }

    public static final /* synthetic */ long if(long l2) {
        return y.\u00f400000(l2);
    }

    public static final /* synthetic */ long \u00d400000(long l2) {
        return y.oO0000(l2);
    }

    public static final /* synthetic */ long while(long l2) {
        return y.\u00d800000(l2);
    }

    public static final /* synthetic */ long new(long l2) {
        return y.\u00f500000(l2);
    }

    public static final /* synthetic */ long OO0000(long l2) {
        return y.\u00d3O0000(l2);
    }
}

