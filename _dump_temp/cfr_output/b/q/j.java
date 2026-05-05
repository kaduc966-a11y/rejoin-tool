/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.ab;
import b.q.h;
import b.q.q;

class j
extends ab {
    public static final int oo0000(char c2) {
        int n2 = h.o00000(c2, 10);
        if (n2 < 0) {
            throw new IllegalArgumentException("Char " + c2 + " is not a decimal digit");
        }
        return n2;
    }

    public static final int \u00d300000(char c2, int n2) {
        Integer n3 = h.\u00d200000(c2, n2);
        if (n3 != null) {
            return n3;
        }
        throw new IllegalArgumentException("Char " + c2 + " is not a digit in the given radix=" + n2);
    }

    public static final Integer \u00d2o0000(char c2) {
        Integer n2 = h.o00000(c2, 10);
        if (((Number)n2).intValue() >= 0) {
            return n2;
        }
        return null;
    }

    public static final Integer \u00d200000(char c2, int n2) {
        h.o00000(n2);
        Integer n3 = h.o00000(c2, n2);
        if (((Number)n3).intValue() >= 0) {
            return n3;
        }
        return null;
    }

    public static final char \u00d200000(int n2) {
        boolean bl = n2 >= 0 ? n2 < 10 : false;
        if (bl) {
            return (char)(48 + n2);
        }
        throw new IllegalArgumentException("Int " + n2 + " is not a decimal digit");
    }

    public static final char o00000(int n2, int n3) {
        if (!(2 <= n3 ? n3 < 37 : false)) {
            throw new IllegalArgumentException("Invalid radix: " + n3 + ". Valid radix values are in range 2..36");
        }
        if (n2 < 0 || n2 >= n3) {
            throw new IllegalArgumentException("Digit " + n2 + " does not represent a valid digit in radix " + n3);
        }
        if (n2 < 10) {
            return (char)(48 + n2);
        }
        return (char)((char)(65 + n2) - 10);
    }

    public static final String ifsuper(char c2) {
        return q.o00000(c2);
    }

    private static final String o00000(char c2, String string) {
        return c2 + string;
    }

    public static final boolean o00000(char c2, char c3, boolean bl) {
        if (c2 == c3) {
            return true;
        }
        if (!bl) {
            return false;
        }
        return (c2 = Character.toUpperCase(c2)) == (c3 = Character.toUpperCase(c3)) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
    }

    public static /* synthetic */ boolean o00000(char c2, char c3, boolean bl, int n2, Object object) {
        if ((n2 & 2) != 0) {
            bl = false;
        }
        return h.o00000(c2, c3, bl);
    }

    public static final boolean \u00d3o0000(char c2) {
        if ('\ud800' <= c2) {
            return c2 < '\ue000';
        }
        return false;
    }
}

