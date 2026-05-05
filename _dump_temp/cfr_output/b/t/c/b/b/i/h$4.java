/*
 * Decompiled with CFR 0.152.
 */
package b.t.c.b.b.i;

import b.t.c.b.b.i.h;
import b.t.c.b.b.i.h$_l;
import b.t.c.b.b.i.h$_m;

class h$4
extends h$_m {
    final /* synthetic */ Object \u00f8\u00d8O000;
    final /* synthetic */ h ifwhile;

    h$4(h h2, h h3, b.o.e.h h4, Object object) {
        this.ifwhile = h2;
        this.\u00f8\u00d8O000 = object;
        super(h3, h4);
    }

    @Override
    protected h$_l \u00d400000(boolean bl) {
        h$_l h$_l = h$_l.o00000(this.\u00f8\u00d8O000);
        if (h$_l == null) {
            h$4.\u00d3\u00d20000(0);
        }
        return h$_l;
    }

    private static /* synthetic */ void \u00d3\u00d20000(int n2) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
    }
}

