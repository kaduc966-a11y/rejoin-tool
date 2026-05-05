/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.o.e.g;
import b.y.f;
import java.util.Comparator;

public final class b$_b$1
implements Comparator {
    final /* synthetic */ Comparator \u00d200000;
    final /* synthetic */ g o00000;

    public b$_b$1(Comparator comparator, g g2) {
        this.\u00d200000 = comparator;
        this.o00000 = g2;
    }

    public final int compare(Object object, Object object2) {
        int n2 = this.\u00d200000.compare(object, object2);
        if (n2 != 0) {
            return n2;
        }
        g g2 = this.o00000;
        return f.super((Comparable)g2.\u00f800000(object2), (Comparable)g2.\u00f800000(object));
    }
}

