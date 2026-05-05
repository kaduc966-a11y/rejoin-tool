/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.c.c.b;

import b.o.d.fc;
import b.o.d.z;
import b.t.c.b.b.c.b.b.k;
import b.t.c.b.b.c.b.b.o;
import b.t.c.b.b.c.c.b.e$_b;
import java.util.ArrayList;
import java.util.List;

public final class e
implements o {
    public static final e$_b publicsuper = new e$_b(null);
    private boolean \u00d8o0000;
    private final List \u00d6o0000 = new ArrayList();
    public static final k \u00f4o0000 = new k(z.\u00d200000(e.class));

    public final boolean \u00f4O0000() {
        return this.\u00d8o0000;
    }

    public final void o00000(boolean bl) {
        this.\u00d8o0000 = bl;
    }

    public final List \u00d8O0000() {
        return this.\u00d6o0000;
    }

    @Override
    public final k o00000() {
        return \u00f4o0000;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        Object object2 = object;
        if (!fc.o00000(this.getClass(), object2 != null ? object2.getClass() : null)) {
            return false;
        }
        e cfr_ignored_0 = (e)object;
        if (this.\u00d8o0000 != ((e)object).\u00d8o0000) {
            return false;
        }
        return fc.o00000((Object)this.\u00d6o0000, (Object)((e)object).\u00d6o0000);
    }

    public final int hashCode() {
        int n2 = Boolean.hashCode(this.\u00d8o0000);
        return 31 * n2 + ((Object)this.\u00d6o0000).hashCode();
    }
}

