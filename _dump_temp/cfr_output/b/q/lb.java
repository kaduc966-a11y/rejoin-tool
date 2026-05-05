/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.d.fc;
import b.q.f;
import b.q.h;
import b.q.p;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class lb
extends p {
    public static final Byte Oo0000(String string) {
        return f.\u00d800000(string, 10);
    }

    public static final Byte \u00d800000(String string, int n2) {
        Integer n3 = f.int(string, n2);
        if (n3 == null) {
            return null;
        }
        int n4 = n3;
        if (n4 < -128 || n4 > 127) {
            return null;
        }
        return (byte)n4;
    }

    public static final Short \u00f6O0000(String string) {
        return f.\u00f400000(string, 10);
    }

    public static final Short \u00f400000(String string, int n2) {
        Integer n3 = f.int(string, n2);
        if (n3 == null) {
            return null;
        }
        int n4 = n3;
        if (n4 < Short.MIN_VALUE || n4 > Short.MAX_VALUE) {
            return null;
        }
        return (short)n4;
    }

    public static final Integer Objectsuper(String string) {
        return f.int(string, 10);
    }

    public static final Integer int(String string, int n2) {
        int n3;
        int n4;
        char c2;
        int n5;
        block15: {
            block14: {
                h.o00000(n2);
                n5 = string.length();
                if (n5 == 0) {
                    return null;
                }
                c2 = string.charAt(0);
                if (fc.o00000((int)c2, 48) >= 0) break block14;
                if (n5 == 1) {
                    return null;
                }
                n4 = 1;
                switch (c2) {
                    case '-': {
                        c2 = '\u0001';
                        n3 = Integer.MIN_VALUE;
                        break block15;
                    }
                    case '+': {
                        c2 = '\u0000';
                        n3 = -2147483647;
                        break block15;
                    }
                    default: {
                        return null;
                    }
                }
            }
            n4 = 0;
            c2 = '\u0000';
            n3 = -2147483647;
        }
        int n6 = -59652323;
        int n7 = 0;
        while (n4 < n5) {
            int n8 = h.o00000(string.charAt(n4), n2);
            if (n8 < 0) {
                return null;
            }
            if (n7 < n6) {
                if (n6 == -59652323) {
                    n6 = n3 / n2;
                    if (n7 < n6) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            if ((n7 *= n2) < n3 + n8) {
                return null;
            }
            n7 -= n8;
            ++n4;
        }
        if (c2 != '\u0000') {
            return n7;
        }
        return -n7;
    }

    public static final Long voidsuper(String string) {
        return f.\u00f600000(string, 10);
    }

    public static final Long \u00f600000(String string, int n2) {
        long l2;
        int n3;
        char c2;
        int n4;
        block15: {
            block14: {
                h.o00000(n2);
                n4 = string.length();
                if (n4 == 0) {
                    return null;
                }
                c2 = string.charAt(0);
                if (fc.o00000((int)c2, 48) >= 0) break block14;
                if (n4 == 1) {
                    return null;
                }
                n3 = 1;
                switch (c2) {
                    case '-': {
                        c2 = '\u0001';
                        l2 = Long.MIN_VALUE;
                        break block15;
                    }
                    case '+': {
                        c2 = '\u0000';
                        l2 = -9223372036854775807L;
                        break block15;
                    }
                    default: {
                        return null;
                    }
                }
            }
            n3 = 0;
            c2 = '\u0000';
            l2 = -9223372036854775807L;
        }
        long l3 = -256204778801521550L;
        long l4 = 0L;
        while (n3 < n4) {
            int n5 = h.o00000(string.charAt(n3), n2);
            if (n5 < 0) {
                return null;
            }
            if (l4 < l3) {
                if (l3 == -256204778801521550L) {
                    l3 = l2 / (long)n2;
                    if (l4 < l3) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            if ((l4 *= (long)n2) < l2 + (long)n5) {
                return null;
            }
            l4 -= (long)n5;
            ++n3;
        }
        if (c2 != '\u0000') {
            return l4;
        }
        return -l4;
    }

    public static final Void \u00f8O0000(String string) {
        throw new NumberFormatException("Invalid number format: '" + string + '\'');
    }
}

