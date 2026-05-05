/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.e.m;
import b.o.d.fc;
import b.q.eb;
import b.q.h;
import b.q.mb;
import java.util.Locale;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ab {
    public static final mb \u00d600000(char c2) {
        return mb.\u00f4O0000.o00000(Character.getType(c2));
    }

    private static final boolean \u00d200000(char c2) {
        return Character.isDefined(c2);
    }

    private static final boolean \u00f600000(char c2) {
        return Character.isLetter(c2);
    }

    private static final boolean \u00f6O0000(char c2) {
        return Character.isLetterOrDigit(c2);
    }

    private static final boolean \u00d500000(char c2) {
        return Character.isDigit(c2);
    }

    private static final boolean \u00f500000(char c2) {
        return Character.isIdentifierIgnorable(c2);
    }

    private static final boolean null(char c2) {
        return Character.isISOControl(c2);
    }

    private static final boolean \u00d6O0000(char c2) {
        return Character.isJavaIdentifierPart(c2);
    }

    private static final boolean \u00f5O0000(char c2) {
        return Character.isJavaIdentifierStart(c2);
    }

    public static final boolean for(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    private static final boolean \u00d3O0000(char c2) {
        return Character.isUpperCase(c2);
    }

    private static final boolean oO0000(char c2) {
        return Character.isLowerCase(c2);
    }

    private static final char \u00d5O0000(char c2) {
        return Character.toUpperCase(c2);
    }

    private static final char \u00f8O0000(char c2) {
        return Character.toUpperCase(c2);
    }

    private static final String \u00d8O0000(char c2) {
        return String.valueOf(c2).toUpperCase(Locale.ROOT);
    }

    public static final String \u00d200000(char c2, Locale locale) {
        return String.valueOf(c2).toUpperCase(locale);
    }

    private static final char \u00d300000(char c2) {
        return Character.toLowerCase(c2);
    }

    private static final char \u00d800000(char c2) {
        return Character.toLowerCase(c2);
    }

    private static final String newsuper(char c2) {
        return String.valueOf(c2).toLowerCase(Locale.ROOT);
    }

    public static final String o00000(char c2, Locale locale) {
        return String.valueOf(c2).toLowerCase(locale);
    }

    private static final boolean \u00f800000(char c2) {
        return Character.isTitleCase(c2);
    }

    private static final char private(char c2) {
        return Character.toTitleCase(c2);
    }

    private static final char \u00d2O0000(char c2) {
        return Character.toTitleCase(c2);
    }

    public static final String \u00d300000(char c2, Locale object) {
        if (((String)(object = h.\u00d200000(c2, (Locale)object))).length() > 1) {
            if (c2 == '\u0149') {
                return object;
            }
            c2 = ((String)object).charAt(0);
            object = ((String)object).substring(1).toLowerCase(Locale.ROOT);
            return c2 + (String)object;
        }
        if (!fc.o00000(object, (Object)String.valueOf(c2).toUpperCase(Locale.ROOT))) {
            return object;
        }
        return String.valueOf(Character.toTitleCase(c2));
    }

    public static final eb returnsuper(char c2) {
        return eb.float.o00000(Character.getDirectionality(c2));
    }

    private static final boolean String(char c2) {
        return Character.isHighSurrogate(c2);
    }

    private static final boolean o00000(char c2) {
        return Character.isLowSurrogate(c2);
    }

    public static final int o00000(char c2, int n2) {
        return Character.digit((int)c2, n2);
    }

    public static final int o00000(int n2) {
        if (!(2 <= n2 ? n2 < 37 : false)) {
            throw new IllegalArgumentException("radix " + n2 + " was not in valid range " + new m(2, 36));
        }
        return n2;
    }
}

