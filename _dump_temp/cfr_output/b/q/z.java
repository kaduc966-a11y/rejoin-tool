/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.e.g;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class z {
    public static final Appendable super(Appendable appendable, CharSequence charSequence, int n2, int n3) {
        return appendable.append(charSequence, n2, n3);
    }

    public static final Appendable super(Appendable appendable, CharSequence ... charSequenceArray) {
        for (CharSequence charSequence : charSequenceArray) {
            appendable.append(charSequence);
        }
        return appendable;
    }

    private static final Appendable super(Appendable appendable) {
        return appendable.append('\n');
    }

    private static final Appendable super(Appendable appendable, CharSequence charSequence) {
        return appendable.append(charSequence).append('\n');
    }

    private static final Appendable super(Appendable appendable, char c2) {
        return appendable.append(c2).append('\n');
    }

    public static final void super(Appendable appendable, Object object, g g2) {
        g g3 = g2;
        if (g3 != null) {
            appendable.append((CharSequence)g3.\u00f800000(object));
            return;
        }
        Object object2 = object;
        if (object2 == null ? true : object2 instanceof CharSequence) {
            appendable.append((CharSequence)object);
            return;
        }
        if (object instanceof Character) {
            appendable.append(((Character)object).charValue());
            return;
        }
        appendable.append(object.toString());
    }
}

