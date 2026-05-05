/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.o.e.g;
import java.util.Comparator;

public final class b$_f$2
implements Comparator {
    final /* synthetic */ Comparator \u00d200000;
    final /* synthetic */ Comparator o00000;
    final /* synthetic */ g Object;

    public b$_f$2(Comparator comparator, Comparator comparator2, g g2) {
        this.\u00d200000 = comparator;
        this.o00000 = comparator2;
        this.Object = g2;
    }

    public final int compare(Object object, Object object2) {
        int n2 = this.\u00d200000.compare(object, object2);
        if (n2 != 0) {
            return n2;
        }
        Comparator comparator = this.o00000;
        g g2 = this.Object;
        return comparator.compare(g2.\u00f800000(object), g2.\u00f800000(object2));
    }
}

