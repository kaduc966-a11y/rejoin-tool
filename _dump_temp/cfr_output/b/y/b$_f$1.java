/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.o.e.g;
import b.y.f;
import java.util.Comparator;

public final class b$_f$1
implements Comparator {
    final /* synthetic */ Comparator o00000;
    final /* synthetic */ g \u00d200000;

    public b$_f$1(Comparator comparator, g g2) {
        this.o00000 = comparator;
        this.\u00d200000 = g2;
    }

    public final int compare(Object object, Object object2) {
        int n2 = this.o00000.compare(object, object2);
        if (n2 != 0) {
            return n2;
        }
        g g2 = this.\u00d200000;
        return f.super((Comparable)g2.\u00f800000(object), (Comparable)g2.\u00f800000(object2));
    }
}

