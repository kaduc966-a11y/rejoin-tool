/*
 * Decompiled with CFR 0.152.
 */
package b.q;

import b.o.d.w;
import b.q.mb;

public final class mb$_b {
    private mb$_b() {
    }

    public final mb o00000(int n2) {
        int n3 = n2;
        boolean bl = n3 >= 0 ? n3 < 17 : false;
        if (bl) {
            return (mb)((Object)mb.o00000().get(n2));
        }
        boolean bl2 = 18 <= n3 ? n3 < 31 : false;
        if (bl2) {
            return (mb)((Object)mb.o00000().get(n2 - 1));
        }
        throw new IllegalArgumentException("Category #" + n2 + " is not defined.");
    }

    public /* synthetic */ mb$_b(w w2) {
        this();
    }
}

