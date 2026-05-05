/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.ab$_b;
import b.o.e.e;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class ab {
    public static final ab$_b \u00d800000 = new ab$_b(null);
    private final long \u00d300000;
    private final boolean return;
    private final long \u00d400000;
    private final long \u00d500000;
    private static final ab new = new ab(0x3FFFFFFFFFFFFFFFL, true);
    private static final ab o00000 = new ab(Long.MAX_VALUE, false);

    private ab(long l2, boolean bl) {
        this.\u00d300000 = l2;
        this.return = bl;
        this.\u00d400000 = this.\u00d300000 / 10L;
        this.\u00d500000 = this.\u00d300000 % 10L;
    }

    public final long o00000(String string, int n2, e e2) {
        int n3;
        int n4 = 1;
        if (this.return) {
            switch (string.charAt(n2)) {
                case '-': {
                    n4 = -1;
                }
                case '+': {
                    ++n2;
                }
            }
        }
        String string2 = string;
        for (n3 = n2; n3 < string2.length() && string2.charAt(n3) == '0'; ++n3) {
        }
        long l2 = 0L;
        for (n2 = n3; n2 < string.length(); ++n2) {
            n3 = string.charAt(n2);
            boolean bl = 48 <= n3 ? n3 < 58 : false;
            if (!bl) break;
            if (l2 > this.\u00d400000 || l2 == this.\u00d400000 && (long)(n3 -= 48) > this.\u00d500000) {
                int n5;
                String string3 = string;
                for (n5 = n2; n5 < string3.length(); ++n5) {
                    n2 = string3.charAt(n5);
                    boolean bl2 = 48 <= n2 ? n2 < 58 : false;
                    if (!bl2) break;
                }
                n2 = n5;
                e2.o00000(n2, n4, Boolean.TRUE);
                return this.\u00d300000;
            }
            long l3 = l2;
            l2 = (l3 << 3) + (l3 << 1) + (long)n3;
        }
        e2.o00000(n2, n4, Boolean.FALSE);
        return l2;
    }

    public static final /* synthetic */ ab \u00d200000() {
        return new;
    }

    public static final /* synthetic */ ab o00000() {
        return o00000;
    }
}

