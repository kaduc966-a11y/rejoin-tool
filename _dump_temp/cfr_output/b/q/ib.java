/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.bd;
import b.o.e.g;
import b.q.k;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class ib
extends k {
    private static final StringBuilder \u00d300000(StringBuilder stringBuilder, Object object) {
        return stringBuilder.append(object);
    }

    private static final String super(g g2) {
        StringBuilder stringBuilder = new StringBuilder();
        g2.\u00f800000(stringBuilder);
        return stringBuilder.toString();
    }

    private static final String super(int n2, g g2) {
        StringBuilder stringBuilder = new StringBuilder(n2);
        g2.\u00f800000(stringBuilder);
        return stringBuilder.toString();
    }

    public static final StringBuilder super(StringBuilder stringBuilder, String ... stringArray) {
        for (String string : stringArray) {
            stringBuilder.append(string);
        }
        return stringBuilder;
    }

    public static final StringBuilder super(StringBuilder stringBuilder, Object ... objectArray) {
        for (Object object : objectArray) {
            stringBuilder.append(object);
        }
        return stringBuilder;
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, char[] cArray, int n2, int n3) {
        throw new bd(null, 1, null);
    }

    private static final StringBuilder \u00d300000(StringBuilder stringBuilder) {
        return stringBuilder.append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, CharSequence charSequence) {
        return stringBuilder.append(charSequence).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, String string) {
        return stringBuilder.append(string).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, Object object) {
        return stringBuilder.append(object).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, char[] cArray) {
        return stringBuilder.append(cArray).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, char c2) {
        return stringBuilder.append(c2).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, boolean bl) {
        return stringBuilder.append(bl).append('\n');
    }
}

