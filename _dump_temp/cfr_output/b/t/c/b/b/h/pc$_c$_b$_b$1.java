/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.h;

import b.o.e.g;
import b.t.c.b.b.h.rc;
import b.y.f;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class pc$_c$_b$_b$1
implements Comparator {
    final /* synthetic */ g super;

    public pc$_c$_b$_b$1(g g2) {
        this.super = g2;
    }

    public final int compare(Object object, Object object2) {
        object = (rc)object;
        Comparable comparable = (Comparable)((Object)this.super.\u00f800000(object).toString());
        object = (rc)object2;
        object2 = comparable;
        return f.super((Comparable)object2, (Comparable)((Object)this.super.\u00f800000(object).toString()));
    }
}

