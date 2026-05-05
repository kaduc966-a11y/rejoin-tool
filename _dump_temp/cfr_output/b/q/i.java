/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.e.g;
import b.q.f;
import b.q.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
class i
extends m {
    private static final char \u00d300000(CharSequence charSequence, int n2) {
        return charSequence.charAt(n2);
    }

    public static final SortedSet interface(CharSequence charSequence) {
        return (SortedSet)f.super(charSequence, new TreeSet());
    }

    public static final /* synthetic */ Character \u00d4O0000(CharSequence charSequence) {
        return f.\u00f8O0000(charSequence);
    }

    public static final /* synthetic */ Character class(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = f.\u00d400000(charSequence);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    char c3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(n3)))) < 0) {
                        c2 = c3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return Character.valueOf(c2);
    }

    public static final /* synthetic */ Character \u00d200000(CharSequence charSequence, Comparator comparator) {
        return f.class(charSequence, comparator);
    }

    public static final /* synthetic */ Character \u00d3O0000(CharSequence charSequence) {
        return f.Objectsuper(charSequence);
    }

    public static final /* synthetic */ Character \u00d600000(CharSequence charSequence, g g2) {
        if (charSequence.length() == 0) {
            return null;
        }
        char c2 = charSequence.charAt(0);
        int n2 = f.\u00d400000(charSequence);
        if (n2 != 0) {
            Comparable comparable = (Comparable)g2.\u00f800000(Character.valueOf(c2));
            int n3 = 1;
            if (n2 > 0) {
                while (true) {
                    char c3;
                    Comparable comparable2;
                    if (comparable.compareTo(comparable2 = (Comparable)g2.\u00f800000(Character.valueOf(c3 = charSequence.charAt(n3)))) > 0) {
                        c2 = c3;
                        comparable = comparable2;
                    }
                    if (n3 == n2) break;
                    ++n3;
                }
            }
        }
        return Character.valueOf(c2);
    }

    public static final /* synthetic */ Character super(CharSequence charSequence, Comparator comparator) {
        return f.\u00d300000(charSequence, comparator);
    }

    private static final BigDecimal \u00d400000(CharSequence charSequence, g g2) {
        BigDecimal bigDecimal = BigDecimal.valueOf(0L);
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            bigDecimal = bigDecimal.add((BigDecimal)g2.\u00f800000(Character.valueOf(c2)));
        }
        return bigDecimal;
    }

    private static final BigInteger \u00d800000(CharSequence charSequence, g g2) {
        BigInteger bigInteger = BigInteger.valueOf(0L);
        for (int i2 = 0; i2 < charSequence.length(); ++i2) {
            char c2 = charSequence.charAt(i2);
            bigInteger = bigInteger.add((BigInteger)g2.\u00f800000(Character.valueOf(c2)));
        }
        return bigInteger;
    }
}

