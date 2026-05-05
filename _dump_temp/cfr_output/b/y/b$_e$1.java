/*
 * Decompiled with CFR 0.152.
 */
package b.y;

import b.o.e.f;
import java.util.Comparator;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class b$_e$1
implements Comparator {
    final /* synthetic */ Comparator o00000;
    final /* synthetic */ f new;

    public b$_e$1(Comparator comparator, f f2) {
        this.o00000 = comparator;
        this.new = f2;
    }

    public final int compare(Object object, Object object2) {
        int n2 = this.o00000.compare(object, object2);
        if (n2 != 0) {
            return n2;
        }
        return ((Number)this.new.o00000(object, object2)).intValue();
    }
}

