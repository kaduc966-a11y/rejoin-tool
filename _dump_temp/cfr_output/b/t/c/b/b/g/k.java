/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.g;

import b.t.c.b.b.g.d;
import b.t.c.b.b.o.f.b;
import b.t.c.b.b.q.ic;
import b.t.c.b.b.q.jc;
import java.util.Collection;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
final class k
implements d {
    public static final k \u00d800000 = new k();
    private static final String \u00d600000 = "should not have varargs or parameters with default values";

    private k() {
    }

    @Override
    public final String o00000() {
        return \u00d600000;
    }

    @Override
    public final boolean new(ic iterator) {
        if (!((iterator = (Iterable)iterator.\u00f5\u00d8o000()) instanceof Collection) || !((Collection)((Object)iterator)).isEmpty()) {
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                jc jc2 = (jc)iterator.next();
                if (!b.o00000(jc2) && jc2.\u00d5O\u00d2000() == null) continue;
                return false;
            }
        }
        return true;
    }
}

