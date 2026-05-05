/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import java.util.Locale;

public final class q {
    public static final String o00000(char c2) {
        String string = String.valueOf(c2).toUpperCase(Locale.ROOT);
        if (string.length() > 1) {
            if (c2 == '\u0149') {
                return string;
            }
            c2 = string.charAt(0);
            string = string.substring(1).toLowerCase(Locale.ROOT);
            return c2 + string;
        }
        return String.valueOf(Character.toTitleCase(c2));
    }
}

