/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.q.f;
import b.q.l;
import b.q.y;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class k
extends y {
    private static final StringBuilder super(StringBuilder stringBuilder, byte by) {
        return stringBuilder.append(by);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, short s2) {
        return stringBuilder.append(s2);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, int n2, byte by) {
        return stringBuilder.insert(n2, by);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, int n2, short s2) {
        return stringBuilder.insert(n2, s2);
    }

    public static final StringBuilder super(StringBuilder stringBuilder) {
        stringBuilder.setLength(0);
        return stringBuilder;
    }

    private static final void super(StringBuilder stringBuilder, int n2, char c2) {
        stringBuilder.setCharAt(n2, c2);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, int n2, int n3, String string) {
        return stringBuilder.replace(n2, n3, string);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, int n2) {
        return stringBuilder.deleteCharAt(n2);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, int n2, int n3) {
        return stringBuilder.delete(n2, n3);
    }

    private static final void super(StringBuilder stringBuilder, char[] cArray, int n2, int n3, int n4) {
        stringBuilder.getChars(n3, n4, cArray, n2);
    }

    static /* synthetic */ void super(StringBuilder stringBuilder, char[] cArray, int n2, int n3, int n4, int n5, Object object) {
        if ((n5 & 2) != 0) {
            n2 = 0;
        }
        if ((n5 & 4) != 0) {
            n3 = 0;
        }
        if ((n5 & 8) != 0) {
            n4 = stringBuilder.length();
        }
        stringBuilder.getChars(n3, n4, cArray, n2);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, char[] cArray, int n2, int n3) {
        return stringBuilder.append(cArray, n2, n3 - n2);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, CharSequence charSequence, int n2, int n3) {
        return stringBuilder.append(charSequence, n2, n3);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, int n2, char[] cArray, int n3, int n4) {
        return stringBuilder.insert(n2, cArray, n3, n4 - n3);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, int n2, CharSequence charSequence, int n3, int n4) {
        return stringBuilder.insert(n2, charSequence, n3, n4);
    }

    private static final StringBuilder super(StringBuilder stringBuilder, StringBuffer stringBuffer) {
        return stringBuilder.append(stringBuffer).append('\n');
    }

    private static final StringBuilder super(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        return stringBuilder.append((CharSequence)stringBuilder2).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, int n2) {
        return stringBuilder.append(n2).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, short s2) {
        return stringBuilder.append(s2).append('\n');
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, byte by) {
        return stringBuilder.append(by).append('\n');
    }

    private static final StringBuilder super(StringBuilder stringBuilder, long l2) {
        return stringBuilder.append(l2).append('\n');
    }

    private static final StringBuilder super(StringBuilder stringBuilder, float f2) {
        return stringBuilder.append(f2).append('\n');
    }

    private static final StringBuilder super(StringBuilder stringBuilder, double d2) {
        return stringBuilder.append(d2).append('\n');
    }

    public static final Appendable \u00d200000(Appendable appendable) {
        return appendable.append(l.o00000);
    }

    private static final Appendable \u00d200000(Appendable appendable, CharSequence charSequence) {
        return f.\u00d200000(appendable.append(charSequence));
    }

    private static final Appendable \u00d200000(Appendable appendable, char c2) {
        return f.\u00d200000(appendable.append(c2));
    }

    public static final StringBuilder \u00d200000(StringBuilder stringBuilder) {
        return stringBuilder.append(l.o00000);
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, StringBuffer stringBuffer) {
        return f.\u00d200000(stringBuilder.append(stringBuffer));
    }

    private static final StringBuilder super(StringBuilder stringBuilder, CharSequence charSequence) {
        return f.\u00d200000(stringBuilder.append(charSequence));
    }

    private static final StringBuilder super(StringBuilder stringBuilder, String string) {
        return f.\u00d200000(stringBuilder.append(string));
    }

    private static final StringBuilder super(StringBuilder stringBuilder, Object object) {
        return f.\u00d200000(stringBuilder.append(object));
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, StringBuilder stringBuilder2) {
        return f.\u00d200000(stringBuilder.append((CharSequence)stringBuilder2));
    }

    private static final StringBuilder super(StringBuilder stringBuilder, char[] cArray) {
        return f.\u00d200000(stringBuilder.append(cArray));
    }

    private static final StringBuilder super(StringBuilder stringBuilder, char c2) {
        return f.\u00d200000(stringBuilder.append(c2));
    }

    private static final StringBuilder super(StringBuilder stringBuilder, boolean bl) {
        return f.\u00d200000(stringBuilder.append(bl));
    }

    private static final StringBuilder \u00d300000(StringBuilder stringBuilder, int n2) {
        return f.\u00d200000(stringBuilder.append(n2));
    }

    private static final StringBuilder \u00d300000(StringBuilder stringBuilder, short s2) {
        return f.\u00d200000(stringBuilder.append(s2));
    }

    private static final StringBuilder \u00d300000(StringBuilder stringBuilder, byte by) {
        return f.\u00d200000(stringBuilder.append(by));
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, long l2) {
        return f.\u00d200000(stringBuilder.append(l2));
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, float f2) {
        return f.\u00d200000(stringBuilder.append(f2));
    }

    private static final StringBuilder \u00d200000(StringBuilder stringBuilder, double d2) {
        return f.\u00d200000(stringBuilder.append(d2));
    }
}

