/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.nb$_b$_c;
import b.q.ob;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class nb$_b {
    public static final nb$_b$_c \u00f500000 = new nb$_b$_c(null);
    private final int \u00d500000;
    private final int return;
    private final String o00000;
    private final String \u00d300000;
    private final String new;
    private final String \u00f400000;
    private final boolean if;
    private final boolean \u00f800000;
    private final boolean \u00d800000;
    private static final nb$_b \u00d400000 = new nb$_b(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

    public nb$_b(int n2, int n3, String string, String string2, String string3, String string4) {
        this.\u00d500000 = n2;
        this.return = n3;
        this.o00000 = string;
        this.\u00d300000 = string2;
        this.new = string3;
        this.\u00f400000 = string4;
        this.if = this.\u00d500000 == Integer.MAX_VALUE && this.return == Integer.MAX_VALUE;
        this.\u00f800000 = ((CharSequence)this.new).length() == 0 && ((CharSequence)this.\u00f400000).length() == 0 && this.\u00d300000.length() <= 1;
        this.\u00d800000 = ob.\u00d200000(this.o00000) || ob.\u00d200000(this.\u00d300000) || ob.\u00d200000(this.new) || ob.\u00d200000(this.\u00f400000);
    }

    public final int \u00d600000() {
        return this.\u00d500000;
    }

    public final int o00000() {
        return this.return;
    }

    public final String \u00d500000() {
        return this.o00000;
    }

    public final String \u00d200000() {
        return this.\u00d300000;
    }

    public final String \u00d800000() {
        return this.new;
    }

    public final String \u00d300000() {
        return this.\u00f400000;
    }

    public final boolean \u00f600000() {
        return this.if;
    }

    public final boolean null() {
        return this.\u00f800000;
    }

    public final boolean String() {
        return this.\u00d800000;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append("BytesHexFormat(\n");
        this.o00000(stringBuilder2, "    ").append('\n');
        stringBuilder2.append(")");
        return stringBuilder.toString();
    }

    public final StringBuilder o00000(StringBuilder stringBuilder, String string) {
        stringBuilder.append(string).append("bytesPerLine = ").append(this.\u00d500000).append(",\n");
        stringBuilder.append(string).append("bytesPerGroup = ").append(this.return).append(",\n");
        stringBuilder.append(string).append("groupSeparator = \"").append(this.o00000).append("\",\n");
        stringBuilder.append(string).append("byteSeparator = \"").append(this.\u00d300000).append("\",\n");
        stringBuilder.append(string).append("bytePrefix = \"").append(this.new).append("\",\n");
        stringBuilder.append(string).append("byteSuffix = \"").append(this.\u00f400000).append("\"");
        return stringBuilder;
    }

    public static final /* synthetic */ nb$_b \u00f500000() {
        return \u00d400000;
    }
}

