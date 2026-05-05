/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.ac;
import b.dd;
import b.jc;
import b.lc;
import b.o.d.fc;
import b.q.f;
import b.q.h;
import b.xc;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class cb {
    public static final String o00000(byte by, int n2) {
        return Integer.toString(by & 0xFF, h.o00000(n2));
    }

    public static final String o00000(short s2, int n2) {
        return Integer.toString(s2 & 0xFFFF, h.o00000(n2));
    }

    public static final String o00000(int n2, int n3) {
        n3 = h.o00000(n3);
        return jc.super((long)n2 & 0xFFFFFFFFL, n3);
    }

    public static final String o00000(long l2, int n2) {
        return jc.super(l2, h.o00000(n2));
    }

    public static final byte \u00d300000(String string) {
        lc lc2 = cb.\u00d800000(string);
        if (lc2 != null) {
            return lc2.super();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final byte \u00d500000(String string, int n2) {
        lc lc2 = cb.\u00f400000(string, n2);
        if (lc2 != null) {
            return lc2.super();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final short new(String string) {
        dd dd2 = cb.\u00d500000(string);
        if (dd2 != null) {
            return dd2.o00000();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final short \u00d800000(String string, int n2) {
        dd dd2 = cb.return(string, n2);
        if (dd2 != null) {
            return dd2.o00000();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final int \u00d400000(String string) {
        ac ac2 = cb.return(string);
        if (ac2 != null) {
            return ac2.o00000();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final int \u00d400000(String string, int n2) {
        ac ac2 = cb.new(string, n2);
        if (ac2 != null) {
            return ac2.o00000();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final long \u00f400000(String string) {
        b.f f2 = cb.o00000(string);
        if (f2 != null) {
            return f2.super();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final long o00000(String string, int n2) {
        b.f f2 = cb.\u00d300000(string, n2);
        if (f2 != null) {
            return f2.super();
        }
        f.\u00f8O0000(string);
        throw new xc();
    }

    public static final lc \u00d800000(String string) {
        return cb.\u00f400000(string, 10);
    }

    public static final lc \u00f400000(String string, int n2) {
        ac ac2 = cb.new(string, n2);
        if (ac2 == null) {
            return null;
        }
        int n3 = ac2.o00000();
        if (Integer.compareUnsigned(n3, ac.\u00d500000(255)) > 0) {
            return null;
        }
        return lc.\u00d6O0000(lc.super((byte)n3));
    }

    public static final dd \u00d500000(String string) {
        return cb.return(string, 10);
    }

    public static final dd return(String string, int n2) {
        ac ac2 = cb.new(string, n2);
        if (ac2 == null) {
            return null;
        }
        int n3 = ac2.o00000();
        if (Integer.compareUnsigned(n3, ac.\u00d500000(65535)) > 0) {
            return null;
        }
        return dd.\u00d6O0000(dd.\u00d2O0000((short)n3));
    }

    public static final ac return(String string) {
        return cb.new(string, 10);
    }

    public static final ac new(String string, int n2) {
        h.o00000(n2);
        int n3 = string.length();
        if (n3 == 0) {
            return null;
        }
        int n4 = string.charAt(0);
        if (fc.o00000(n4, 48) < 0) {
            if (n3 == 1 || n4 != 43) {
                return null;
            }
            n4 = 1;
        } else {
            n4 = 0;
        }
        int n5 = 0x71C71C7;
        int n6 = ac.\u00d500000(n2);
        int n7 = 0;
        while (n4 < n3) {
            int n8 = h.o00000(string.charAt(n4), n2);
            if (n8 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(n7, n5) > 0) {
                if (n5 == 0x71C71C7) {
                    n5 = Integer.divideUnsigned(-1, n6);
                    if (Integer.compareUnsigned(n7, n5) > 0) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            int n9 = n7 = ac.\u00d500000(n7 * n6);
            if (Integer.compareUnsigned(n7 = ac.\u00d500000(n7 + ac.\u00d500000(n8)), n9) < 0) {
                return null;
            }
            ++n4;
        }
        return ac.return(n7);
    }

    public static final b.f o00000(String string) {
        return cb.\u00d300000(string, 10);
    }

    public static final b.f \u00d300000(String string, int n2) {
        h.o00000(n2);
        int n3 = string.length();
        if (n3 == 0) {
            return null;
        }
        int n4 = string.charAt(0);
        if (fc.o00000(n4, 48) < 0) {
            if (n3 == 1 || n4 != 43) {
                return null;
            }
            n4 = 1;
        } else {
            n4 = 0;
        }
        long l2 = 0x71C71C71C71C71CL;
        long l3 = b.f.super(n2);
        long l4 = 0L;
        while (n4 < n3) {
            int n5 = h.o00000(string.charAt(n4), n2);
            if (n5 < 0) {
                return null;
            }
            if (Long.compareUnsigned(l4, l2) > 0) {
                if (l2 == 0x71C71C71C71C71CL) {
                    l2 = Long.divideUnsigned(-1L, l3);
                    if (Long.compareUnsigned(l4, l2) > 0) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            long l5 = l4 = b.f.super(l4 * l3);
            if (Long.compareUnsigned(l4 = b.f.super(l4 + b.f.super((long)(n5 = ac.\u00d500000(n5)) & 0xFFFFFFFFL)), l5) < 0) {
                return null;
            }
            ++n4;
        }
        return b.f.\u00d4O0000(l4);
    }
}

