/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.q;

import b.t.c.b.b.q.bc;
import b.t.c.b.b.q.m;
import b.t.c.b.b.q.p;
import b.t.c.b.b.q.u;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class gb {
    private static final u o00000 = new u("InvalidModuleNotifier");

    public static final void super(bc bc2) {
        m m2 = (m)bc2.o00000(o00000);
        if (m2 != null) {
            m2.o00000(bc2);
            return;
        }
        throw new p("Accessing invalid module descriptor ".concat(String.valueOf(bc2)));
    }
}

