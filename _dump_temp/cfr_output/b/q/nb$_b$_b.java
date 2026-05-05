/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.f;
import b.q.nb$_b;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nb$_b$_b {
    private int \u00d200000 = nb$_b.\u00f500000.o00000().\u00d600000();
    private int o00000 = nb$_b.\u00f500000.o00000().o00000();
    private String \u00d500000 = nb$_b.\u00f500000.o00000().\u00d500000();
    private String \u00d600000 = nb$_b.\u00f500000.o00000().\u00d200000();
    private String \u00d300000 = nb$_b.\u00f500000.o00000().\u00d800000();
    private String String = nb$_b.\u00f500000.o00000().\u00d300000();

    public final int \u00d600000() {
        return this.\u00d200000;
    }

    public final void \u00d200000(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was ".concat(java.lang.String.valueOf(n2)));
        }
        this.\u00d200000 = n2;
    }

    public final int o00000() {
        return this.o00000;
    }

    public final void o00000(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was ".concat(java.lang.String.valueOf(n2)));
        }
        this.o00000 = n2;
    }

    public final String \u00d400000() {
        return this.\u00d500000;
    }

    public final void Object(String string) {
        this.\u00d500000 = string;
    }

    public final String \u00d200000() {
        return this.\u00d600000;
    }

    public final void \u00d400000(String string) {
        if (f.\u00d300000((CharSequence)string, '\n', false, 2, null) || f.\u00d300000((CharSequence)string, '\r', false, 2, null)) {
            throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was ".concat(java.lang.String.valueOf(string)));
        }
        this.\u00d600000 = string;
    }

    public final String void() {
        return this.\u00d300000;
    }

    public final void \u00d200000(String string) {
        if (f.\u00d300000((CharSequence)string, '\n', false, 2, null) || f.\u00d300000((CharSequence)string, '\r', false, 2, null)) {
            throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was ".concat(java.lang.String.valueOf(string)));
        }
        this.\u00d300000 = string;
    }

    public final String Object() {
        return this.String;
    }

    public final void o00000(String string) {
        if (f.\u00d300000((CharSequence)string, '\n', false, 2, null) || f.\u00d300000((CharSequence)string, '\r', false, 2, null)) {
            throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was ".concat(java.lang.String.valueOf(string)));
        }
        this.String = string;
    }

    public final nb$_b \u00d500000() {
        return new nb$_b(this.\u00d200000, this.o00000, this.\u00d500000, this.\u00d600000, this.\u00d300000, this.String);
    }
}

