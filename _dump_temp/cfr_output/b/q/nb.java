/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.nb$_b;
import b.q.nb$_c;
import b.q.nb$_e;

public final class nb {
    public static final nb$_e \u00d600000 = new nb$_e(null);
    private final boolean \u00d200000;
    private final nb$_b \u00d400000;
    private final nb$_c \u00d500000;
    private static final nb Object = new nb(false, nb$_b.\u00f500000.o00000(), nb$_c.\u00f400000.o00000());
    private static final nb o00000 = new nb(true, nb$_b.\u00f500000.o00000(), nb$_c.\u00f400000.o00000());

    public nb(boolean bl, nb$_b nb$_b, nb$_c nb$_c) {
        this.\u00d200000 = bl;
        this.\u00d400000 = nb$_b;
        this.\u00d500000 = nb$_c;
    }

    public final boolean \u00d200000() {
        return this.\u00d200000;
    }

    public final nb$_b o00000() {
        return this.\u00d400000;
    }

    public final nb$_c \u00d500000() {
        return this.\u00d500000;
    }

    public final String toString() {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        stringBuilder.append("HexFormat(\n");
        stringBuilder2.append("    upperCase = ").append(this.\u00d200000).append(",\n");
        stringBuilder2.append("    bytes = BytesHexFormat(\n");
        this.\u00d400000.o00000(stringBuilder2, "        ").append('\n');
        stringBuilder2.append("    ),\n");
        stringBuilder2.append("    number = NumberHexFormat(\n");
        this.\u00d500000.o00000(stringBuilder2, "        ").append('\n');
        stringBuilder2.append("    )\n");
        stringBuilder2.append(")");
        return stringBuilder.toString();
    }

    public static final /* synthetic */ nb \u00d400000() {
        return Object;
    }

    public static final /* synthetic */ nb Object() {
        return o00000;
    }
}

