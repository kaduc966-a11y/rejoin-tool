/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.o.e.g;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_c$3
implements Comparator {
    final /* synthetic */ Comparator super;
    final /* synthetic */ g \u00d200000;

    public b$_c$3(Comparator comparator, g g2) {
        this.super = comparator;
        this.\u00d200000 = g2;
    }

    public final int compare(Object object, Object object2) {
        Comparator comparator = this.super;
        g g2 = this.\u00d200000;
        return comparator.compare(g2.\u00f800000(object), g2.\u00f800000(object2));
    }
}

