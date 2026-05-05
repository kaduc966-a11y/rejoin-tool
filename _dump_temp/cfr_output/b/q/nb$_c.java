/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.nb$_c$_c;
import b.q.ob;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nb$_c {
    public static final nb$_c$_c \u00f400000 = new nb$_c$_c(null);
    private final String \u00d400000;
    private final String \u00f500000;
    private final boolean void;
    private final int \u00d200000;
    private final boolean \u00d600000;
    private final boolean o00000;
    private final boolean \u00d500000;
    private static final nb$_c Object = new nb$_c("", "", false, 1);

    public nb$_c(String string, String string2, boolean bl, int n2) {
        this.\u00d400000 = string;
        this.\u00f500000 = string2;
        this.void = bl;
        this.\u00d200000 = n2;
        this.\u00d600000 = ((CharSequence)this.\u00d400000).length() == 0 && ((CharSequence)this.\u00f500000).length() == 0;
        this.o00000 = this.\u00d600000 && this.\u00d200000 == 1;
        this.\u00d500000 = ob.\u00d200000(this.\u00d400000) || ob.\u00d200000(this.\u00f500000);
    }

    public final String \u00f500000() {
        return this.\u00d400000;
    }

    public final String String() {
        return this.\u00f500000;
    }

    public final boolean \u00d800000() {
        return this.void;
    }

    public final int null() {
        return this.\u00d200000;
    }

    public static /* synthetic */ void \u00d200000() {
    }

    public final boolean \u00d500000() {
        return this.\u00d600000;
    }

    public final boolean o00000() {
        return this.o00000;
    }

    public final boolean \u00d300000() {
        return this.\u00d500000;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append("NumberHexFormat(\n");
        this.o00000(stringBuilder2, "    ").append('\n');
        stringBuilder2.append(")");
        return stringBuilder.toString();
    }

    public final StringBuilder o00000(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("prefix = \"").append(this.\u00d400000).append("\",\n");
        stringBuilder.append(string).append("suffix = \"").append(this.\u00f500000).append("\",\n");
        stringBuilder.append(string).append("removeLeadingZeros = ").append(this.void).append(',').append('\n');
        stringBuilder.append(string).append("minLength = ").append(this.\u00d200000);
        return stringBuilder;
    }

    public static final /* synthetic */ nb$_c \u00d600000() {
        return Object;
    }
}

