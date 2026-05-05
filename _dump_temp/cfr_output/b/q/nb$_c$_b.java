/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.f;
import b.q.nb$_c;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nb$_c$_b {
    private String Object = nb$_c.\u00f400000.o00000().\u00f500000();
    private String \u00d400000 = nb$_c.\u00f400000.o00000().String();
    private boolean \u00d200000 = nb$_c.\u00f400000.o00000().\u00d800000();
    private int o00000 = nb$_c.\u00f400000.o00000().null();

    public final String \u00d600000() {
        return this.Object;
    }

    public final void \u00d200000(String string) {
        if (f.\u00d300000((CharSequence)string, '\n', false, 2, null) || f.\u00d300000((CharSequence)string, '\r', false, 2, null)) {
            throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was ".concat(String.valueOf(string)));
        }
        this.Object = string;
    }

    public final String \u00d300000() {
        return this.\u00d400000;
    }

    public final void super(String string) {
        if (f.\u00d300000((CharSequence)string, '\n', false, 2, null) || f.\u00d300000((CharSequence)string, '\r', false, 2, null)) {
            throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was ".concat(String.valueOf(string)));
        }
        this.\u00d400000 = string;
    }

    public final boolean \u00d400000() {
        return this.\u00d200000;
    }

    public final void super(boolean bl) {
        this.\u00d200000 = bl;
    }

    public final int class() {
        return this.o00000;
    }

    public final void super(int n2) {
        if (!(n2 > 0)) {
            String string = "Non-positive values are prohibited for minLength, but was ".concat(String.valueOf(n2));
            throw new IllegalArgumentException(string.toString());
        }
        this.o00000 = n2;
    }

    public static /* synthetic */ void \u00d200000() {
    }

    public final nb$_c super() {
        return new nb$_c(this.Object, this.\u00d400000, this.\u00d200000, this.o00000);
    }
}

