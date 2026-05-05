/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.bb;
import b.e.x;
import b.g.c;
import b.g.n;
import b.o.d.fc;
import b.o.e.g;
import b.q.f;
import b.q.gb;
import b.q.h;
import b.q.hb;
import b.q.kb;
import b.q.m$_b$_b$_b$1;
import b.q.m$_c$1;
import b.qb;
import b.s.ec;
import b.s.mc;
import b.s.z;
import b.yc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class m
extends hb {
    public static final CharSequence super(CharSequence charSequence, g g2) {
        int n2 = 0;
        int n3 = charSequence.length() - 1;
        boolean bl = false;
        while (n2 <= n3) {
            int n4 = !bl ? n2 : n3;
            n4 = ((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(n4)))).booleanValue() ? 1 : 0;
            if (!bl) {
                if (n4 == 0) {
                    bl = true;
                    continue;
                }
                ++n2;
                continue;
            }
            if (n4 == 0) break;
            --n3;
        }
        return charSequence.subSequence(n2, n3 + 1);
    }

    public static final String \u00d600000(String charSequence, g g2) {
        charSequence = charSequence;
        int n2 = 0;
        int n3 = charSequence.length() - 1;
        boolean bl = false;
        while (n2 <= n3) {
            int n4 = !bl ? n2 : n3;
            n4 = ((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(n4)))).booleanValue() ? 1 : 0;
            if (!bl) {
                if (n4 == 0) {
                    bl = true;
                    continue;
                }
                ++n2;
                continue;
            }
            if (n4 == 0) break;
            --n3;
        }
        return ((Object)charSequence.subSequence(n2, n3 + 1)).toString();
    }

    public static final CharSequence \u00d200000(CharSequence charSequence, g g2) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(i2)))).booleanValue()) continue;
            return charSequence.subSequence(i2, charSequence.length());
        }
        return "";
    }

    public static final String \u00d400000(String charSequence, g g2) {
        CharSequence charSequence2;
        block1: {
            charSequence = charSequence;
            int n2 = charSequence.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(i2)))).booleanValue()) continue;
                charSequence2 = charSequence.subSequence(i2, charSequence.length());
                break block1;
            }
            charSequence2 = "";
        }
        return ((Object)charSequence2).toString();
    }

    public static final CharSequence \u00d300000(CharSequence charSequence, g g2) {
        int n2 = charSequence.length() + -1;
        if (n2 >= 0) {
            do {
                int n3;
                if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(n3 = n2--)))).booleanValue()) continue;
                return charSequence.subSequence(0, n3 + 1);
            } while (n2 >= 0);
        }
        return "";
    }

    public static final String class(String charSequence, g g2) {
        CharSequence charSequence2;
        block2: {
            int n2 = (charSequence = (CharSequence)charSequence).length() + -1;
            if (n2 >= 0) {
                do {
                    int n3;
                    if (((Boolean)g2.\u00f800000(Character.valueOf(charSequence.charAt(n3 = n2--)))).booleanValue()) continue;
                    charSequence2 = charSequence.subSequence(0, n3 + 1);
                    break block2;
                } while (n2 >= 0);
            }
            charSequence2 = "";
        }
        return ((Object)charSequence2).toString();
    }

    public static final CharSequence \u00d200000(CharSequence charSequence, char ... cArray) {
        int n2 = 0;
        int n3 = charSequence.length() - 1;
        boolean bl = false;
        while (n2 <= n3) {
            int n4 = !bl ? n2 : n3;
            n4 = charSequence.charAt(n4);
            n4 = z.\u00d300000(cArray, (char)n4) ? 1 : 0;
            if (!bl) {
                if (n4 == 0) {
                    bl = true;
                    continue;
                }
                ++n2;
                continue;
            }
            if (n4 == 0) break;
            --n3;
        }
        return charSequence.subSequence(n2, n3 + 1);
    }

    public static final String super(String charSequence, char ... cArray) {
        charSequence = charSequence;
        int n2 = 0;
        int n3 = charSequence.length() - 1;
        boolean bl = false;
        while (n2 <= n3) {
            int n4 = !bl ? n2 : n3;
            n4 = charSequence.charAt(n4);
            n4 = z.\u00d300000(cArray, (char)n4) ? 1 : 0;
            if (!bl) {
                if (n4 == 0) {
                    bl = true;
                    continue;
                }
                ++n2;
                continue;
            }
            if (n4 == 0) break;
            --n3;
        }
        return ((Object)charSequence.subSequence(n2, n3 + 1)).toString();
    }

    public static final CharSequence \u00d300000(CharSequence charSequence, char ... cArray) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (z.\u00d300000(cArray, c2)) continue;
            return charSequence.subSequence(i2, charSequence.length());
        }
        return "";
    }

    public static final String \u00d200000(String charSequence, char ... cArray) {
        CharSequence charSequence2;
        block1: {
            charSequence = charSequence;
            int n2 = charSequence.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                char c2 = charSequence.charAt(i2);
                if (z.\u00d300000(cArray, c2)) continue;
                charSequence2 = charSequence.subSequence(i2, charSequence.length());
                break block1;
            }
            charSequence2 = "";
        }
        return ((Object)charSequence2).toString();
    }

    public static final CharSequence super(CharSequence charSequence, char ... cArray) {
        int n2 = charSequence.length() + -1;
        if (n2 >= 0) {
            do {
                int n3;
                char c2;
                if (z.\u00d300000(cArray, c2 = charSequence.charAt(n3 = n2--))) continue;
                return charSequence.subSequence(0, n3 + 1);
            } while (n2 >= 0);
        }
        return "";
    }

    public static final String \u00d300000(String charSequence, char ... cArray) {
        CharSequence charSequence2;
        block2: {
            int n2 = (charSequence = (CharSequence)charSequence).length() + -1;
            if (n2 >= 0) {
                do {
                    int n3;
                    char c2;
                    if (z.\u00d300000(cArray, c2 = charSequence.charAt(n3 = n2--))) continue;
                    charSequence2 = charSequence.subSequence(0, n3 + 1);
                    break block2;
                } while (n2 >= 0);
            }
            charSequence2 = "";
        }
        return ((Object)charSequence2).toString();
    }

    public static final CharSequence \u00f400000(CharSequence charSequence) {
        int n2 = 0;
        int n3 = charSequence.length() - 1;
        boolean bl = false;
        while (n2 <= n3) {
            int n4 = !bl ? n2 : n3;
            n4 = h.for(charSequence.charAt(n4)) ? 1 : 0;
            if (!bl) {
                if (n4 == 0) {
                    bl = true;
                    continue;
                }
                ++n2;
                continue;
            }
            if (n4 == 0) break;
            --n3;
        }
        return charSequence.subSequence(n2, n3 + 1);
    }

    private static final String O\u00d20000(String string) {
        return ((Object)f.\u00f400000(string)).toString();
    }

    public static final CharSequence OO0000(CharSequence charSequence) {
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (h.for(charSequence.charAt(i2))) continue;
            return charSequence.subSequence(i2, charSequence.length());
        }
        return "";
    }

    private static final String \u00d2\u00d20000(String string) {
        return ((Object)f.OO0000(string)).toString();
    }

    public static final CharSequence \u00d200000(CharSequence charSequence) {
        int n2 = charSequence.length() + -1;
        if (n2 >= 0) {
            do {
                int n3;
                if (h.for(charSequence.charAt(n3 = n2--))) continue;
                return charSequence.subSequence(0, n3 + 1);
            } while (n2 >= 0);
        }
        return "";
    }

    private static final String \u00d4\u00d20000(String string) {
        return ((Object)f.\u00d200000(string)).toString();
    }

    public static final CharSequence super(CharSequence charSequence, int n2, char c2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Desired length " + n2 + " is less than zero.");
        }
        if (n2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder stringBuilder = new StringBuilder(n2);
        int n3 = 1;
        if ((n2 -= charSequence.length()) > 0) {
            while (true) {
                stringBuilder.append(c2);
                if (n3 == n2) break;
                ++n3;
            }
        }
        stringBuilder.append(charSequence);
        return stringBuilder;
    }

    public static /* synthetic */ CharSequence super(CharSequence charSequence, int n2, char c2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            c2 = (char)32;
        }
        return f.super(charSequence, n2, c2);
    }

    public static final String super(String string, int n2, char c2) {
        return ((Object)f.super((CharSequence)string, n2, c2)).toString();
    }

    public static /* synthetic */ String \u00d200000(String string, int n2, char c2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            c2 = (char)32;
        }
        return f.super(string, n2, c2);
    }

    public static final CharSequence \u00d200000(CharSequence charSequence, int n2, char c2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("Desired length " + n2 + " is less than zero.");
        }
        if (n2 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder stringBuilder = new StringBuilder(n2);
        stringBuilder.append(charSequence);
        int n3 = 1;
        int n4 = n2 - charSequence.length();
        if (n4 > 0) {
            while (true) {
                stringBuilder.append(c2);
                if (n3 == n4) break;
                ++n3;
            }
        }
        return stringBuilder;
    }

    public static /* synthetic */ CharSequence \u00d200000(CharSequence charSequence, int n2, char c2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            c2 = (char)32;
        }
        return f.\u00d200000(charSequence, n2, c2);
    }

    public static final String \u00d200000(String string, int n2, char c2) {
        return ((Object)f.\u00d200000((CharSequence)string, n2, c2)).toString();
    }

    public static /* synthetic */ String super(String string, int n2, char c2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            c2 = (char)32;
        }
        return f.\u00d200000(string, n2, c2);
    }

    private static final boolean do(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static final boolean super(CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    private static final boolean \u00d300000(CharSequence charSequence) {
        return charSequence.length() > 0;
    }

    public static final boolean \u00f800000(CharSequence charSequence) {
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            if (h.for(charSequence.charAt(i2))) continue;
            return false;
        }
        return true;
    }

    private static final boolean \u00d2O0000(CharSequence charSequence) {
        return !f.\u00f800000(charSequence);
    }

    private static final boolean \u00d600000(CharSequence charSequence) {
        return charSequence == null || f.\u00f800000(charSequence);
    }

    public static final ec class(CharSequence charSequence) {
        return new m$_c$1(charSequence);
    }

    private static final String \u00d3\u00d20000(String string) {
        String string2 = string;
        if (string2 == null) {
            string2 = "";
        }
        return string2;
    }

    private static final Object super(CharSequence charSequence, b.o.e.h h2) {
        if (charSequence.length() == 0) {
            return h2.newreturn();
        }
        return charSequence;
    }

    private static final Object \u00d200000(CharSequence charSequence, b.o.e.h h2) {
        if (f.\u00f800000(charSequence)) {
            return h2.newreturn();
        }
        return charSequence;
    }

    public static final b.e.m int(CharSequence charSequence) {
        return new b.e.m(0, charSequence.length() - 1);
    }

    public static final int \u00d400000(CharSequence charSequence) {
        return charSequence.length() - 1;
    }

    public static final boolean \u00d200000(CharSequence charSequence, int n2) {
        return (n2 >= 0 ? n2 <= charSequence.length() - 2 : false) && Character.isHighSurrogate(charSequence.charAt(n2)) && Character.isLowSurrogate(charSequence.charAt(n2 + 1));
    }

    public static final String \u00d200000(String string, b.e.m m2) {
        int n2 = m2.\u00d5o0000();
        int n3 = m2.\u00d3o0000() + 1;
        return string.substring(n2, n3);
    }

    public static final CharSequence \u00d400000(CharSequence charSequence, b.e.m m2) {
        return charSequence.subSequence(m2.\u00d5o0000(), m2.\u00d3o0000() + 1);
    }

    private static final CharSequence \u00d600000(String string, int n2, int n3) {
        return string.subSequence(n2, n3);
    }

    private static final String super(CharSequence charSequence, int n2, int n3) {
        return ((Object)charSequence.subSequence(n2, n3)).toString();
    }

    static /* synthetic */ String super(CharSequence charSequence, int n2, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n3 = charSequence.length();
        }
        return ((Object)charSequence.subSequence(n2, n3)).toString();
    }

    public static final String super(CharSequence charSequence, b.e.m m2) {
        return ((Object)charSequence.subSequence(m2.\u00d5o0000(), m2.\u00d3o0000() + 1)).toString();
    }

    public static final String \u00d400000(String string, char c2, String string2) {
        int n2 = f.super((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string2;
        }
        return string.substring(0, c2);
    }

    public static /* synthetic */ String \u00d200000(String string, char c2, String string2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string2 = string;
        }
        return f.\u00d400000(string, c2, string2);
    }

    public static final String \u00d200000(String string, String string2, String string3) {
        int n2 = f.super((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string3;
        }
        return string.substring(0, n2);
    }

    public static /* synthetic */ String \u00d300000(String string, String string2, String string3, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string3 = string;
        }
        return f.\u00d200000(string, string2, string3);
    }

    public static final String \u00d200000(String string, char c2, String string2) {
        int n2 = f.super((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string2;
        }
        string2 = string;
        c2 = (char)(c2 + '\u0001');
        int n3 = string.length();
        return string2.substring(c2, n3);
    }

    public static /* synthetic */ String super(String string, char c2, String string2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string2 = string;
        }
        return f.\u00d200000(string, c2, string2);
    }

    public static final String class(String string, String string2, String string3) {
        int n2 = f.super((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string3;
        }
        string3 = string;
        int n3 = n2 + string2.length();
        int n4 = string.length();
        return string3.substring(n3, n4);
    }

    public static /* synthetic */ String class(String string, String string2, String string3, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string3 = string;
        }
        return f.class(string, string2, string3);
    }

    public static final String \u00d300000(String string, char c2, String string2) {
        int n2 = f.\u00d200000((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string2;
        }
        return string.substring(0, c2);
    }

    public static /* synthetic */ String \u00d300000(String string, char c2, String string2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string2 = string;
        }
        return f.\u00d300000(string, c2, string2);
    }

    public static final String \u00d300000(String string, String string2, String string3) {
        int n2 = f.\u00d200000((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string3;
        }
        return string.substring(0, n2);
    }

    public static /* synthetic */ String \u00d400000(String string, String string2, String string3, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string3 = string;
        }
        return f.\u00d300000(string, string2, string3);
    }

    public static final String super(String string, char c2, String string2) {
        int n2 = f.\u00d200000((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string2;
        }
        string2 = string;
        c2 = (char)(c2 + '\u0001');
        int n3 = string.length();
        return string2.substring(c2, n3);
    }

    public static /* synthetic */ String \u00d400000(String string, char c2, String string2, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string2 = string;
        }
        return f.super(string, c2, string2);
    }

    public static final String \u00d400000(String string, String string2, String string3) {
        int n2 = f.\u00d200000((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string3;
        }
        string3 = string;
        int n3 = n2 + string2.length();
        int n4 = string.length();
        return string3.substring(n3, n4);
    }

    public static /* synthetic */ String \u00d200000(String string, String string2, String string3, int n2, Object object) {
        if ((n2 & 2) != 0) {
            string3 = string;
        }
        return f.\u00d400000(string, string2, string3);
    }

    public static final CharSequence super(CharSequence charSequence, int n2, int n3, CharSequence charSequence2) {
        if (n3 < n2) {
            throw new IndexOutOfBoundsException("End index (" + n3 + ") is less than start index (" + n2 + ").");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(charSequence, 0, n2);
        stringBuilder.append(charSequence2);
        stringBuilder.append(charSequence, n3, charSequence.length());
        return stringBuilder;
    }

    private static final String super(String string, int n2, int n3, CharSequence charSequence) {
        return ((Object)f.super((CharSequence)string, n2, n3, charSequence)).toString();
    }

    public static final CharSequence super(CharSequence charSequence, b.e.m m2, CharSequence charSequence2) {
        return f.super(charSequence, (int)m2.\u00d5o0000(), m2.\u00d3o0000() + 1, charSequence2);
    }

    private static final String super(String string, b.e.m m2, CharSequence charSequence) {
        return ((Object)f.super((CharSequence)string, m2, charSequence)).toString();
    }

    public static final CharSequence \u00d200000(CharSequence charSequence, int n2, int n3) {
        if (n3 < n2) {
            throw new IndexOutOfBoundsException("End index (" + n3 + ") is less than start index (" + n2 + ").");
        }
        if (n3 == n2) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder stringBuilder = new StringBuilder(charSequence.length() - (n3 - n2));
        stringBuilder.append(charSequence, 0, n2);
        stringBuilder.append(charSequence, n3, charSequence.length());
        return stringBuilder;
    }

    private static final String class(String string, int n2, int n3) {
        return ((Object)f.\u00d200000((CharSequence)string, n2, n3)).toString();
    }

    public static final CharSequence \u00d200000(CharSequence charSequence, b.e.m m2) {
        return f.\u00d200000(charSequence, (int)m2.\u00d5o0000(), m2.\u00d3o0000() + 1);
    }

    private static final String super(String string, b.e.m m2) {
        return ((Object)f.\u00d200000((CharSequence)string, m2)).toString();
    }

    public static final CharSequence \u00d300000(CharSequence charSequence, CharSequence charSequence2) {
        if (f.\u00d200000(charSequence, charSequence2, false, 2, null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String \u00d300000(String string, CharSequence charSequence) {
        if (f.\u00d200000((CharSequence)string, charSequence, false, 2, null)) {
            int n2 = charSequence.length();
            return string.substring(n2);
        }
        return string;
    }

    public static final CharSequence \u00d200000(CharSequence charSequence, CharSequence charSequence2) {
        if (f.\u00d400000(charSequence, charSequence2, false, 2, null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String \u00d400000(String string, CharSequence charSequence) {
        if (f.\u00d400000((CharSequence)string, charSequence, false, 2, null)) {
            String string2 = string;
            int n2 = string.length() - charSequence.length();
            return string2.substring(0, n2);
        }
        return string;
    }

    public static final CharSequence super(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (charSequence.length() >= charSequence2.length() + charSequence3.length() && f.\u00d200000(charSequence, charSequence2, false, 2, null) && f.\u00d400000(charSequence, charSequence3, false, 2, null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    public static final String super(String string, CharSequence charSequence, CharSequence charSequence2) {
        if (string.length() >= charSequence.length() + charSequence2.length() && f.\u00d200000((CharSequence)string, charSequence, false, 2, null) && f.\u00d400000((CharSequence)string, charSequence2, false, 2, null)) {
            String string2 = string;
            int n2 = charSequence.length();
            int n3 = string.length() - charSequence2.length();
            return string2.substring(n2, n3);
        }
        return string;
    }

    public static final CharSequence class(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence2;
        return f.super(charSequence, charSequence3, charSequence3);
    }

    public static final String \u00d200000(String string, CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        return f.super(string, charSequence2, charSequence2);
    }

    public static final String super(String string, char c2, String string2, String string3) {
        int n2 = f.super((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string3;
        }
        return ((Object)f.super((CharSequence)string, 0, (int)c2, (CharSequence)string2)).toString();
    }

    public static /* synthetic */ String super(String string, char c2, String string2, String string3, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string3 = string;
        }
        return f.super(string, c2, string2, string3);
    }

    public static final String \u00d200000(String string, String string2, String string3, String string4) {
        int n2 = f.super((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string4;
        }
        return ((Object)f.super((CharSequence)string, 0, n2, (CharSequence)string3)).toString();
    }

    public static /* synthetic */ String super(String string, String string2, String string3, String string4, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string4 = string;
        }
        return f.\u00d200000(string, string2, string3, string4);
    }

    public static final String \u00d200000(String string, char c2, String string2, String string3) {
        int n2 = f.super((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string3;
        }
        string3 = string;
        c2 = (char)(c2 + '\u0001');
        int n3 = string.length();
        return ((Object)f.super((CharSequence)string3, (int)c2, n3, (CharSequence)string2)).toString();
    }

    public static /* synthetic */ String \u00d300000(String string, char c2, String string2, String string3, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string3 = string;
        }
        return f.\u00d200000(string, c2, string2, string3);
    }

    public static final String \u00d300000(String string, String string2, String string3, String string4) {
        int n2 = f.super((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string4;
        }
        string4 = string;
        int n3 = n2 + string2.length();
        int n4 = string.length();
        return ((Object)f.super((CharSequence)string4, n3, n4, (CharSequence)string3)).toString();
    }

    public static /* synthetic */ String \u00d400000(String string, String string2, String string3, String string4, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string4 = string;
        }
        return f.\u00d300000(string, string2, string3, string4);
    }

    public static final String super(String string, String string2, String string3, String string4) {
        int n2 = f.\u00d200000((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string4;
        }
        string4 = string;
        int n3 = n2 + string2.length();
        int n4 = string.length();
        return ((Object)f.super((CharSequence)string4, n3, n4, (CharSequence)string3)).toString();
    }

    public static /* synthetic */ String \u00d300000(String string, String string2, String string3, String string4, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string4 = string;
        }
        return f.super(string, string2, string3, string4);
    }

    public static final String \u00d300000(String string, char c2, String string2, String string3) {
        int n2 = f.\u00d200000((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string3;
        }
        string3 = string;
        c2 = (char)(c2 + '\u0001');
        int n3 = string.length();
        return ((Object)f.super((CharSequence)string3, (int)c2, n3, (CharSequence)string2)).toString();
    }

    public static /* synthetic */ String \u00d400000(String string, char c2, String string2, String string3, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string3 = string;
        }
        return f.\u00d300000(string, c2, string2, string3);
    }

    public static final String \u00d400000(String string, char c2, String string2, String string3) {
        int n2 = f.\u00d200000((CharSequence)string, c2, 0, false, 6, null);
        c2 = (char)n2;
        if (n2 == -1) {
            return string3;
        }
        return ((Object)f.super((CharSequence)string, 0, (int)c2, (CharSequence)string2)).toString();
    }

    public static /* synthetic */ String \u00d200000(String string, char c2, String string2, String string3, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string3 = string;
        }
        return f.\u00d400000(string, c2, string2, string3);
    }

    public static final String \u00d400000(String string, String string2, String string3, String string4) {
        int n2 = f.\u00d200000((CharSequence)string, string2, 0, false, 6, null);
        if (n2 == -1) {
            return string4;
        }
        return ((Object)f.super((CharSequence)string, 0, n2, (CharSequence)string3)).toString();
    }

    public static /* synthetic */ String \u00d200000(String string, String string2, String string3, String string4, int n2, Object object) {
        if ((n2 & 4) != 0) {
            string4 = string;
        }
        return f.\u00d400000(string, string2, string3, string4);
    }

    private static final String \u00d200000(CharSequence charSequence, kb kb2, String string) {
        return kb2.\u00d200000(charSequence, string);
    }

    private static final String super(CharSequence charSequence, kb kb2, g g2) {
        return kb2.super(charSequence, g2);
    }

    private static final String super(CharSequence charSequence, kb kb2, String string) {
        return kb2.super(charSequence, string);
    }

    private static final String \u00d300000(String string, g g2) {
        if (((CharSequence)string).length() > 0) {
            char c2 = ((Character)g2.\u00f800000(Character.valueOf(string.charAt(0)))).charValue();
            string = string.substring(1);
            return c2 + string;
        }
        return string;
    }

    private static final String \u00d800000(String string, g g2) {
        if (((CharSequence)string).length() > 0) {
            return g2.\u00f800000(Character.valueOf(string.charAt(0))) + string.substring(1);
        }
        return string;
    }

    private static final boolean \u00d200000(CharSequence charSequence, kb kb2) {
        return kb2.\u00d200000(charSequence);
    }

    public static final boolean \u00d200000(CharSequence charSequence, int n2, CharSequence charSequence2, int n3, int n4, boolean bl) {
        if (n3 < 0 || n2 < 0 || n2 > charSequence.length() - n4 || n3 > charSequence2.length() - n4) {
            return false;
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            if (h.o00000(charSequence.charAt(n2 + i2), charSequence2.charAt(n3 + i2), bl)) continue;
            return false;
        }
        return true;
    }

    public static final boolean super(CharSequence charSequence, char c2, boolean bl) {
        return charSequence.length() > 0 && h.o00000(charSequence.charAt(0), c2, bl);
    }

    public static /* synthetic */ boolean super(CharSequence charSequence, char c2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.super(charSequence, c2, bl);
    }

    public static final boolean \u00d300000(CharSequence charSequence, char c2, boolean bl) {
        if (charSequence.length() > 0) {
            CharSequence charSequence2 = charSequence;
            if (h.o00000(charSequence2.charAt(f.\u00d400000(charSequence2)), c2, bl)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean \u00d200000(CharSequence charSequence, char c2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d300000(charSequence, c2, bl);
    }

    public static final boolean class(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        if (!bl && charSequence instanceof String && charSequence2 instanceof String) {
            return f.\u00d300000((String)charSequence, (String)charSequence2, false, 2, null);
        }
        return f.\u00d200000(charSequence, 0, charSequence2, 0, charSequence2.length(), bl);
    }

    public static /* synthetic */ boolean \u00d200000(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.class(charSequence, charSequence2, bl);
    }

    public static final boolean super(CharSequence charSequence, CharSequence charSequence2, int n2, boolean bl) {
        if (!bl && charSequence instanceof String && charSequence2 instanceof String) {
            return f.super((String)charSequence, (String)charSequence2, n2, false, 4, null);
        }
        return f.\u00d200000(charSequence, n2, charSequence2, 0, charSequence2.length(), bl);
    }

    public static /* synthetic */ boolean super(CharSequence charSequence, CharSequence charSequence2, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.super(charSequence, charSequence2, n2, bl);
    }

    public static final boolean \u00d600000(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        if (!bl && charSequence instanceof String && charSequence2 instanceof String) {
            return f.\u00d400000((String)charSequence, (String)charSequence2, false, 2, null);
        }
        CharSequence charSequence3 = charSequence;
        return f.\u00d200000(charSequence3, charSequence3.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), bl);
    }

    public static /* synthetic */ boolean \u00d400000(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d600000(charSequence, charSequence2, bl);
    }

    public static final String \u00d300000(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        int n2;
        int n3 = Math.min(charSequence.length(), charSequence2.length());
        for (n2 = 0; n2 < n3 && h.o00000(charSequence.charAt(n2), charSequence2.charAt(n2), bl); ++n2) {
        }
        if (f.\u00d200000(charSequence, n2 - 1) || f.\u00d200000(charSequence2, n2 - 1)) {
            --n2;
        }
        return ((Object)charSequence.subSequence(0, n2)).toString();
    }

    public static /* synthetic */ String super(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d300000(charSequence, charSequence2, bl);
    }

    public static final String \u00d200000(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        int n2;
        int n3 = charSequence.length();
        int n4 = charSequence2.length();
        int n5 = Math.min(n3, n4);
        for (n2 = 0; n2 < n5 && h.o00000(charSequence.charAt(n3 - n2 - 1), charSequence2.charAt(n4 - n2 - 1), bl); ++n2) {
        }
        if (f.\u00d200000(charSequence, n3 - n2 - 1) || f.\u00d200000(charSequence2, n4 - n2 - 1)) {
            --n2;
        }
        return ((Object)charSequence.subSequence(n3 - n2, n3)).toString();
    }

    public static /* synthetic */ String class(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, charSequence2, bl);
    }

    public static final int super(CharSequence charSequence, char[] cArray, int n2, boolean bl) {
        if (!bl && cArray.length == 1 && charSequence instanceof String) {
            char c2 = z.\u00d3O0000(cArray);
            return ((String)charSequence).indexOf(c2, n2);
        }
        int n3 = bb.\u00d200000(n2, 0);
        if (n3 <= (n2 = f.\u00d400000(charSequence))) {
            while (true) {
                boolean bl2;
                block5: {
                    char c3 = charSequence.charAt(n3);
                    char[] cArray2 = cArray;
                    int n4 = cArray2.length;
                    for (int i2 = 0; i2 < n4; ++i2) {
                        if (!h.o00000(cArray2[i2], c3, bl)) continue;
                        bl2 = true;
                        break block5;
                    }
                    bl2 = false;
                }
                if (bl2) {
                    return n3;
                }
                if (n3 == n2) break;
                ++n3;
            }
        }
        return -1;
    }

    public static /* synthetic */ int \u00d200000(CharSequence charSequence, char[] cArray, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.super(charSequence, cArray, n2, bl);
    }

    public static final int \u00d200000(CharSequence charSequence, char[] cArray, int n2, boolean bl) {
        if (!bl && cArray.length == 1 && charSequence instanceof String) {
            char c2 = z.\u00d3O0000(cArray);
            return ((String)charSequence).lastIndexOf(c2, n2);
        }
        for (int i2 = bb.Object(n2, f.\u00d400000(charSequence)); i2 >= 0; --i2) {
            boolean bl2;
            block3: {
                n2 = charSequence.charAt(i2);
                char[] cArray2 = cArray;
                int n3 = cArray2.length;
                for (int i3 = 0; i3 < n3; ++i3) {
                    if (!h.o00000(cArray2[i3], (char)n2, bl)) continue;
                    bl2 = true;
                    break block3;
                }
                bl2 = false;
            }
            if (!bl2) continue;
            return i2;
        }
        return -1;
    }

    public static /* synthetic */ int super(CharSequence charSequence, char[] cArray, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = f.\u00d400000(charSequence);
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, cArray, n2, bl);
    }

    private static final int super(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl, boolean n4) {
        x x2;
        x x3 = x2 = n4 == 0 ? (x)new b.e.m(bb.\u00d200000(n2, 0), bb.Object(n3, charSequence.length())) : bb.o00000(bb.Object(n2, f.\u00d400000(charSequence)), bb.\u00d200000(n3, 0));
        if (charSequence instanceof String && charSequence2 instanceof String) {
            n3 = x2.\u00f8O0000();
            n4 = x2.oo0000();
            int n5 = x2.Oo0000();
            if (n5 > 0 && n3 <= n4 || n5 < 0 && n4 <= n3) {
                while (true) {
                    if (f.super((String)charSequence2, 0, (String)charSequence, n3, ((String)charSequence2).length(), bl)) {
                        return n3;
                    }
                    if (n3 != n4) {
                        n3 += n5;
                        continue;
                    }
                    break;
                }
            }
        } else {
            n3 = x2.\u00f8O0000();
            n4 = x2.oo0000();
            int n6 = x2.Oo0000();
            if (n6 > 0 && n3 <= n4 || n6 < 0 && n4 <= n3) {
                while (true) {
                    if (f.\u00d200000(charSequence2, 0, charSequence, n3, charSequence2.length(), bl)) {
                        return n3;
                    }
                    if (n3 == n4) break;
                    n3 += n6;
                }
            }
        }
        return -1;
    }

    static /* synthetic */ int super(CharSequence charSequence, CharSequence charSequence2, int n2, int n3, boolean bl, boolean bl2, int n4, Object object) {
        if ((n4 & 0x10) != 0) {
            bl2 = false;
        }
        return m.super(charSequence, charSequence2, n2, n3, bl, bl2);
    }

    private static final qb super(CharSequence charSequence, Collection collection, int n2, boolean bl, boolean n3) {
        x x2;
        if (!bl && collection.size() == 1) {
            String string = (String)mc.thisObject(collection);
            n2 = n3 == 0 ? f.super(charSequence, string, n2, false, 4, null) : f.\u00d200000(charSequence, string, n2, false, 4, null);
            if (n2 < 0) {
                return null;
            }
            return yc.o00000(n2, string);
        }
        x x3 = x2 = n3 == 0 ? (x)new b.e.m(bb.\u00d200000(n2, 0), charSequence.length()) : bb.o00000(bb.Object(n2, f.\u00d400000(charSequence)), 0);
        if (charSequence instanceof String) {
            n2 = x2.\u00f8O0000();
            n3 = x2.oo0000();
            int n4 = x2.Oo0000();
            if (n4 > 0 && n2 <= n3 || n4 < 0 && n3 <= n2) {
                while (true) {
                    Object v1;
                    block13: {
                        for (Object t2 : (Iterable)collection) {
                            String string = (String)t2;
                            if (!f.super(string, 0, (String)charSequence, n2, string.length(), bl)) continue;
                            v1 = t2;
                            break block13;
                        }
                        v1 = null;
                    }
                    String string = v1;
                    if (string != null) {
                        return yc.o00000(n2, string);
                    }
                    if (n2 != n3) {
                        n2 += n4;
                        continue;
                    }
                    break;
                }
            }
        } else {
            n2 = x2.\u00f8O0000();
            n3 = x2.oo0000();
            int n5 = x2.Oo0000();
            if (n5 > 0 && n2 <= n3 || n5 < 0 && n3 <= n2) {
                while (true) {
                    Object v2;
                    block15: {
                        for (Object t3 : (Iterable)collection) {
                            String string = (String)t3;
                            if (!f.\u00d200000((CharSequence)string, 0, charSequence, n2, string.length(), bl)) continue;
                            v2 = t3;
                            break block15;
                        }
                        v2 = null;
                    }
                    String string = v2;
                    if (string != null) {
                        return yc.o00000(n2, string);
                    }
                    if (n2 == n3) break;
                    n2 += n5;
                }
            }
        }
        return null;
    }

    public static final qb \u00d200000(CharSequence charSequence, Collection collection, int n2, boolean bl) {
        return m.super(charSequence, collection, n2, bl, false);
    }

    public static /* synthetic */ qb \u00d200000(CharSequence charSequence, Collection collection, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, collection, n2, bl);
    }

    public static final qb super(CharSequence charSequence, Collection collection, int n2, boolean bl) {
        return m.super(charSequence, collection, n2, bl, true);
    }

    public static /* synthetic */ qb super(CharSequence charSequence, Collection collection, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = f.\u00d400000(charSequence);
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.super(charSequence, collection, n2, bl);
    }

    public static final int \u00d300000(CharSequence charSequence, Collection collection, int n2, boolean bl) {
        qb qb2 = m.super(charSequence, collection, n2, bl, false);
        if (qb2 != null) {
            return ((Number)qb2.new()).intValue();
        }
        return -1;
    }

    public static /* synthetic */ int \u00d400000(CharSequence charSequence, Collection collection, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.\u00d300000(charSequence, collection, n2, bl);
    }

    public static final int \u00d400000(CharSequence charSequence, Collection collection, int n2, boolean bl) {
        qb qb2 = m.super(charSequence, collection, n2, bl, true);
        if (qb2 != null) {
            return ((Number)qb2.new()).intValue();
        }
        return -1;
    }

    public static /* synthetic */ int \u00d300000(CharSequence charSequence, Collection collection, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = f.\u00d400000(charSequence);
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.\u00d400000(charSequence, collection, n2, bl);
    }

    public static final int super(CharSequence object, char c2, int n2, boolean bl) {
        if (bl || !(object instanceof String)) {
            CharSequence charSequence = object;
            char[] cArray = new char[1];
            object = cArray;
            cArray[0] = c2;
            return f.super(charSequence, (char[])object, n2, bl);
        }
        return ((String)object).indexOf(c2, n2);
    }

    public static /* synthetic */ int super(CharSequence charSequence, char c2, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.super(charSequence, c2, n2, bl);
    }

    public static final int super(CharSequence charSequence, String string, int n2, boolean bl) {
        if (bl || !(charSequence instanceof String)) {
            return m.super(charSequence, (CharSequence)string, n2, charSequence.length(), bl, false, 16, null);
        }
        return ((String)charSequence).indexOf(string, n2);
    }

    public static /* synthetic */ int super(CharSequence charSequence, String string, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.super(charSequence, string, n2, bl);
    }

    public static final int \u00d200000(CharSequence object, char c2, int n2, boolean bl) {
        if (bl || !(object instanceof String)) {
            CharSequence charSequence = object;
            char[] cArray = new char[1];
            object = cArray;
            cArray[0] = c2;
            return f.\u00d200000(charSequence, (char[])object, n2, bl);
        }
        return ((String)object).lastIndexOf(c2, n2);
    }

    public static /* synthetic */ int \u00d200000(CharSequence charSequence, char c2, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = f.\u00d400000(charSequence);
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, c2, n2, bl);
    }

    public static final int \u00d200000(CharSequence charSequence, String string, int n2, boolean bl) {
        if (bl || !(charSequence instanceof String)) {
            return m.super(charSequence, (CharSequence)string, n2, 0, bl, true);
        }
        return ((String)charSequence).lastIndexOf(string, n2);
    }

    public static /* synthetic */ int \u00d200000(CharSequence charSequence, String string, int n2, boolean bl, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = f.\u00d400000(charSequence);
        }
        if ((n3 & 4) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, string, n2, bl);
    }

    public static final boolean \u00d400000(CharSequence charSequence, CharSequence charSequence2, boolean bl) {
        if (charSequence2 instanceof String) {
            return f.super(charSequence, (String)charSequence2, 0, bl, 2, null) >= 0;
        }
        return m.super(charSequence, charSequence2, 0, charSequence.length(), bl, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean \u00d300000(CharSequence charSequence, CharSequence charSequence2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d400000(charSequence, charSequence2, bl);
    }

    public static final boolean \u00d200000(CharSequence charSequence, char c2, boolean bl) {
        return f.super(charSequence, c2, 0, bl, 2, null) >= 0;
    }

    public static /* synthetic */ boolean \u00d300000(CharSequence charSequence, char c2, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return f.\u00d200000(charSequence, c2, bl);
    }

    private static final boolean super(CharSequence charSequence, kb kb2) {
        return kb2.super(charSequence);
    }

    private static final n super(CharSequence charSequence, char[] cArray, int n2, boolean bl, int n3) {
        f.super(n3);
        return new gb(charSequence, n2, n3, (arg_0, arg_1) -> m.super(cArray, bl, arg_0, arg_1));
    }

    static /* synthetic */ n super(CharSequence charSequence, char[] cArray, int n2, boolean bl, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        if ((n4 & 8) != 0) {
            n3 = 0;
        }
        return m.super(charSequence, cArray, n2, bl, n3);
    }

    private static final n super(CharSequence charSequence, String[] object, int n2, boolean bl, int n3) {
        f.super(n3);
        object = z.\u00d500000(object);
        return new gb(charSequence, n2, n3, (arg_0, arg_1) -> m.super((List)object, bl, arg_0, arg_1));
    }

    static /* synthetic */ n super(CharSequence charSequence, String[] stringArray, int n2, boolean bl, int n3, int n4, Object object) {
        if ((n4 & 2) != 0) {
            n2 = 0;
        }
        if ((n4 & 4) != 0) {
            bl = false;
        }
        if ((n4 & 8) != 0) {
            n3 = 0;
        }
        return m.super(charSequence, stringArray, n2, bl, n3);
    }

    public static final void super(int n2) {
        if (!(n2 >= 0)) {
            String string = "Limit must be non-negative, but was ".concat(String.valueOf(n2));
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final n \u00d200000(CharSequence charSequence, String[] stringArray, boolean bl, int n2) {
        return c.\u00f5\u00d30000(m.super(charSequence, stringArray, 0, bl, n2, 2, null), arg_0 -> m.class(charSequence, arg_0));
    }

    public static /* synthetic */ n \u00d200000(CharSequence charSequence, String[] stringArray, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            bl = false;
        }
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        return f.\u00d200000(charSequence, stringArray, bl, n2);
    }

    public static final List super(CharSequence charSequence, String[] object, boolean bl, int n2) {
        Object object2;
        if (((String[])object).length == 1 && !(((CharSequence)(object2 = object[0])).length() == 0)) {
            return m.super(charSequence, (String)object2, bl, n2);
        }
        object = object2 = c.ifsuper(m.super(charSequence, (String[])object, 0, bl, n2, 2, null));
        Collection collection = new ArrayList(mc.o00000((Iterable)object2, 10));
        object = object.iterator();
        while (object.hasNext()) {
            Object object3 = object.next();
            object3 = (b.e.m)object3;
            object2 = collection;
            object2.add(f.super(charSequence, object3));
        }
        return (List)collection;
    }

    public static /* synthetic */ List super(CharSequence charSequence, String[] stringArray, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            bl = false;
        }
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        return f.super(charSequence, stringArray, bl, n2);
    }

    public static final n super(CharSequence charSequence, char[] cArray, boolean bl, int n2) {
        return c.\u00f5\u00d30000(m.super(charSequence, cArray, 0, bl, n2, 2, null), arg_0 -> m.\u00d300000(charSequence, arg_0));
    }

    public static /* synthetic */ n \u00d200000(CharSequence charSequence, char[] cArray, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            bl = false;
        }
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        return f.super(charSequence, cArray, bl, n2);
    }

    public static final List \u00d200000(CharSequence charSequence, char[] object, boolean bl, int n2) {
        if (((char[])object).length == 1) {
            return m.super(charSequence, String.valueOf(object[0]), bl, n2);
        }
        Iterable iterable = c.ifsuper(m.super(charSequence, (char[])object, 0, bl, n2, 2, null));
        object = iterable;
        Object object2 = iterable;
        object = new ArrayList(mc.o00000((Iterable)object, 10));
        object2 = object2.iterator();
        while (object2.hasNext()) {
            Object object3 = object2.next();
            object3 = (b.e.m)object3;
            Object object4 = object;
            object4.add(f.super(charSequence, object3));
        }
        return (List)object;
    }

    public static /* synthetic */ List super(CharSequence charSequence, char[] cArray, boolean bl, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            bl = false;
        }
        if ((n3 & 4) != 0) {
            n2 = 0;
        }
        return f.\u00d200000(charSequence, cArray, bl, n2);
    }

    private static final List super(CharSequence charSequence, String string, boolean bl, int n2) {
        f.super(n2);
        int n3 = 0;
        int n4 = f.super(charSequence, string, 0, bl);
        if (n4 == -1 || n2 == 1) {
            return mc.o00000(((Object)charSequence).toString());
        }
        boolean bl2 = n2 > 0;
        ArrayList<String> arrayList = new ArrayList<String>(bl2 ? bb.Object(n2, 10) : 10);
        do {
            arrayList.add(((Object)charSequence.subSequence(n3, n4)).toString());
            n3 = n4 + string.length();
        } while ((!bl2 || arrayList.size() != n2 - 1) && (n4 = f.super(charSequence, string, n3, bl)) != -1);
        arrayList.add(((Object)charSequence.subSequence(n3, charSequence.length())).toString());
        return arrayList;
    }

    private static final List \u00d200000(CharSequence charSequence, kb kb2, int n2) {
        return kb2.super(charSequence, n2);
    }

    static /* synthetic */ List super(CharSequence charSequence, kb kb2, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return kb2.super(charSequence, n2);
    }

    private static final n super(CharSequence charSequence, kb kb2, int n2) {
        return kb2.\u00d300000(charSequence, n2);
    }

    static /* synthetic */ n \u00d200000(CharSequence charSequence, kb kb2, int n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = 0;
        }
        return kb2.\u00d300000(charSequence, n2);
    }

    public static final n \u00d800000(CharSequence charSequence) {
        return new m$_b$_b$_b$1(charSequence);
    }

    public static final List \u00f600000(CharSequence charSequence) {
        return c.\u00d6o0000(f.\u00d800000(charSequence));
    }

    public static final boolean \u00d400000(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return f.\u00d400000((String)charSequence, (String)charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (h.o00000(charSequence.charAt(i2), charSequence2.charAt(i2), true)) continue;
            return false;
        }
        return true;
    }

    public static final boolean \u00d600000(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return fc.o00000((Object)charSequence, (Object)charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int n2 = charSequence.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            if (charSequence.charAt(i2) == charSequence2.charAt(i2)) continue;
            return false;
        }
        return true;
    }

    public static final boolean supernew(String string) {
        String string2 = string;
        if (fc.o00000((Object)string2, (Object)"true")) {
            return true;
        }
        if (fc.o00000((Object)string2, (Object)"false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: ".concat(String.valueOf(string)));
    }

    public static final Boolean \u00f8o0000(String string) {
        if (fc.o00000((Object)string, (Object)"true")) {
            return Boolean.TRUE;
        }
        if (fc.o00000((Object)string, (Object)"false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final int super(String string, int n2, g g2) {
        while (n2 < string.length() && ((Boolean)g2.\u00f800000(Character.valueOf(string.charAt(n2)))).booleanValue()) {
            ++n2;
        }
        return n2;
    }

    private static final qb super(char[] cArray, boolean bl, CharSequence charSequence, int n2) {
        int n3 = f.super(charSequence, cArray, n2, bl);
        if (n3 < 0) {
            return null;
        }
        return yc.o00000(n3, 1);
    }

    private static final qb super(List object, boolean bl, CharSequence charSequence, int n2) {
        qb qb2 = m.super(charSequence, (Collection)object, n2, bl, false);
        if (qb2 != null) {
            object = qb2;
            return yc.o00000(qb2.new(), ((String)((qb)object).o00000()).length());
        }
        return null;
    }

    private static final String class(CharSequence charSequence, b.e.m m2) {
        return f.super(charSequence, m2);
    }

    private static final String \u00d300000(CharSequence charSequence, b.e.m m2) {
        return f.super(charSequence, m2);
    }
}

