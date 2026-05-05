/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g.c;

import b.q.f;
import java.util.Locale;

public final class b {
    public static final String o00000(String string, boolean bl) {
        Object v0;
        block6: {
            if (((CharSequence)string).length() == 0 || !b.o00000(string, 0, bl)) {
                return string;
            }
            if (string.length() == 1 || !b.o00000(string, 1, bl)) {
                if (bl) {
                    return b.Object(string);
                }
                String string2 = string;
                if (((CharSequence)string2).length() > 0) {
                    char c2 = Character.toLowerCase(string2.charAt(0));
                    string2 = string2.substring(1);
                    return c2 + string2;
                }
                return string2;
            }
            for (Object t2 : (Iterable)f.int((CharSequence)string)) {
                int n2 = ((Number)t2).intValue();
                if (!(!b.o00000(string, n2, bl))) continue;
                v0 = t2;
                break block6;
            }
            v0 = null;
        }
        Integer n3 = v0;
        if (n3 == null) {
            return b.\u00d200000(string, bl);
        }
        int n4 = n3 - 1;
        return b.\u00d200000(string.substring(0, n4), bl) + string.substring(n4);
    }

    private static final boolean o00000(String string, int n2, boolean bl) {
        char c2 = string.charAt(n2);
        if (bl) {
            if ('A' <= c2) {
                return c2 < '[';
            }
            return false;
        }
        return Character.isUpperCase(c2);
    }

    private static final String \u00d200000(String string, boolean bl) {
        if (bl) {
            return b.\u00d200000(string);
        }
        return string.toLowerCase(Locale.ROOT);
    }

    public static final String o00000(String string) {
        if (((CharSequence)string).length() == 0) {
            return string;
        }
        char c2 = string.charAt(0);
        boolean bl = 'a' <= c2 ? c2 < '{' : false;
        if (bl) {
            StringBuilder stringBuilder;
            int n2 = string.length();
            StringBuilder stringBuilder2 = stringBuilder = new StringBuilder(n2);
            stringBuilder.append(Character.toUpperCase(c2));
            stringBuilder2.append(string, 1, string.length());
            return stringBuilder.toString();
        }
        return string;
    }

    public static final String Object(String string) {
        if (((CharSequence)string).length() == 0) {
            return string;
        }
        char c2 = string.charAt(0);
        boolean bl = 'A' <= c2 ? c2 < '[' : false;
        if (bl) {
            c2 = Character.toLowerCase(c2);
            string = string.substring(1);
            return c2 + string;
        }
        return string;
    }

    public static final String \u00d200000(String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length());
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string.charAt(i2);
            stringBuilder.append(('A' <= c2 ? c2 < '[' : false) ? Character.toLowerCase(c2) : c2);
        }
        return stringBuilder.toString();
    }
}

