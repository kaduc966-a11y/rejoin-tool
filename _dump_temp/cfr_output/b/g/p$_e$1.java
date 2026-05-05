/*
 * Decompiled with CFR 0.152.
 */
package b.g;

import b.g.c;
import b.g.n;
import b.o.d.fc;
import b.o.d.sb$_h;
import java.util.Iterator;

public final class p$_e$1
implements n {
    final /* synthetic */ n \u00d8o0000;
    final /* synthetic */ Object \u00f4o0000;

    p$_e$1(n n2, Object object) {
        this.\u00d8o0000 = n2;
        this.\u00f4o0000 = object;
    }

    @Override
    public final Iterator o00000() {
        sb$_h sb$_h = new sb$_h();
        return c.nullnew(this.\u00d8o0000, arg_0 -> p$_e$1.o00000(sb$_h, this.\u00f4o0000, arg_0)).o00000();
    }

    private static final boolean o00000(sb$_h sb$_h, Object object, Object object2) {
        if (!sb$_h.o00000 && fc.o00000(object2, object)) {
            sb$_h.o00000 = true;
            return false;
        }
        return true;
    }
}

