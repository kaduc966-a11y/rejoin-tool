/*
 * Decompiled with CFR 0.152.
 */
package b.i;

import b.i.q;
import b.i.v;
import b.o.d.w;

public final class q$_b {
    private q$_b() {
    }

    public final q o00000(v v2) {
        long l2;
        long l3;
        long l4;
        long l5;
        long l6 = l5 = v2.\u00d500000();
        long l7 = l5 / 86400L;
        if ((l6 ^ 0x15180L) < 0L && l7 * 86400L != l6) {
            l7 += -1L;
        }
        long l8 = l7;
        long l9 = l4 = l5 % 86400L;
        int n2 = (int)(l4 + (0x15180L & ((l4 ^ 0x15180L) & (l9 | -l9)) >> 63));
        long l10 = l8 + 719528L - 60L;
        long l11 = 0L;
        if (l10 < 0L) {
            l3 = (l10 + 1L) / 146097L - 1L;
            l11 = l3 * 400L;
            l10 += -l3 * 146097L;
        }
        if ((l2 = l10 - (365L * (l3 = (400L * l10 + 591L) / 146097L) + l3 / 4L - l3 / 100L + l3 / 400L)) < 0L) {
            l2 = l10 - (365L * (l3 += -1L) + l3 / 4L - l3 / 100L + l3 / 400L);
        }
        int n3 = (int)l2;
        int n4 = (n3 * 5 + 2) / 153;
        int n5 = (n4 + 2) % 12 + 1;
        n3 = n3 - (n4 * 306 + 5) / 10 + 1;
        int n6 = (int)((l3 += l11) + (long)(n4 / 10));
        int n7 = n2 / 3600;
        int n8 = n2 - n7 * 3600;
        int n9 = n8 / 60;
        int n10 = n8 - n9 * 60;
        return new q(n6, n5, n3, n7, n9, n10, v2.String());
    }

    public /* synthetic */ q$_b(w w2) {
        this();
    }
}

