/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import java.nio.charset.Charset;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class fb {
    public static final fb if = new fb();
    public static final Charset \u00d300000 = Charset.forName("UTF-8");
    public static final Charset return = Charset.forName("UTF-16");
    public static final Charset new = Charset.forName("UTF-16BE");
    public static final Charset \u00f500000 = Charset.forName("UTF-16LE");
    public static final Charset \u00d400000 = Charset.forName("US-ASCII");
    public static final Charset \u00d800000 = Charset.forName("ISO-8859-1");
    private static volatile Charset \u00f400000;
    private static volatile Charset \u00d500000;
    private static volatile Charset o00000;

    private fb() {
    }

    public final Charset o00000() {
        Charset charset = \u00f400000;
        if (charset == null) {
            Charset charset2;
            \u00f400000 = charset2 = Charset.forName("UTF-32");
            charset = charset2;
        }
        return charset;
    }

    public final Charset \u00d200000() {
        Charset charset = \u00d500000;
        if (charset == null) {
            Charset charset2;
            \u00d500000 = charset2 = Charset.forName("UTF-32LE");
            charset = charset2;
        }
        return charset;
    }

    public final Charset \u00d300000() {
        Charset charset = o00000;
        if (charset == null) {
            Charset charset2;
            o00000 = charset2 = Charset.forName("UTF-32BE");
            charset = charset2;
        }
        return charset;
    }
}

